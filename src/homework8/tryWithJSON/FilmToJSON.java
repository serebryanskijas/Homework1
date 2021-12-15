package homework8.tryWithJSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework8.Films;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilmToJSON {

    public final StringWriter writer = new StringWriter();

    private final FileWriter fileWriter = new FileWriter("src/homework8/data/filmData.json", true);

    public static ObjectMapper mapper = new ObjectMapper(); //это объект Jackson, который выполняет сериализацию

    public FilmToJSON() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        ArrayList list = new ArrayList();
        Films film1 = new Films( "Die Hard", 1988, 4.8);
        Films film2 = new Films( "Mask", 1994, 4.9);
        list.add(film1);
        list.add(film2);
        FilmToJSON film = new FilmToJSON();
        //film.filmToJSON(list);
        film.readFilmListJSON();

    }

    public void filmToJSON(ArrayList list) throws IOException {

        mapper.writeValue(writer, list); // сама сериализация: 1-куда, 2-что
        String result = writer.toString(); //преобразовываем все записанное во StringWriter в строку
        //System.out.println(result);
        try {
            fileWriter.write(result + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void readFilmListJSON() throws IOException {
        List<Films> filmsList = new ArrayList<>();
        try {
            FileReader file = new FileReader("src/homework8/data/filmData.json");
            String sb = new String(Files.readAllBytes(Paths.get("src/homework8/data/filmData.json")));
            /*JSONTokener token = new JSONTokener(file);
            JSONArray obj = new JSONArray(token);*/
            StringReader reader = new StringReader(sb);
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<Map<String, Object>> myObjects = mapper.readValue(sb, ArrayList.class);
            filmsList = new ArrayList<>();
            for (Map<String, Object> map : myObjects) {
                filmsList.add(toObject(map));
            }

            //System.out.printf("Movie: <%s> %s, %d with rating is - %.1f \n", movies.getString("genre"),
            // movies.getString("name"), movies.getInt("year"), movies.getDouble("rating"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private Films toObject(Map<String, Object> map) {
        return new Films(((String) map.get("name")), ((Integer) map.get("year")),
                ((Double) map.get("rating")));
    }

}
