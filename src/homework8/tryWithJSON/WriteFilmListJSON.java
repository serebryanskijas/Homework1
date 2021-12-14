package homework8.tryWithJSON;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFilmListJSON {

    private final JSONObject main = new JSONObject();

    public int count = 0;

    private final FileWriter fileWriter = new FileWriter("src/homework8/data/filmData.json", true);

    ;

    public WriteFilmListJSON() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        WriteFilmListJSON film = new WriteFilmListJSON();
        film.writeFilmListJSON("Action", "Die Hard", 1988, 4.8);
        WriteFilmListJSON film2 = new WriteFilmListJSON();
        film2.writeFilmListJSON("Comedy", "The Breakfast Club", 1985, 4.5);
        // film.readFilmListJSON();
    }

    public void writeFilmListJSON(String valueGenre, String valueName, int valueYear, double valueRating) {
        count++;
        String keyGenre = "genre", keyName = "name", keyYear = "year", keyRating = "rating";
        JSONObject filmNum = new JSONObject();
        filmNum.put(keyGenre, valueGenre);
        filmNum.put(keyName, valueName);
        filmNum.put(keyYear, valueYear);
        filmNum.put(keyRating, valueRating);
        main.put(Integer.toString(count), filmNum);

        try {
            fileWriter.write(main.toString() + "\n");
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

    public void readFilmListJSON() {
        try {

            FileReader file = new FileReader("src/homework8/data/filmData.json");
            JSONTokener token = new JSONTokener(file);
            JSONObject obj = new JSONObject(token);
            for (int i = 0; i < 1000; i++) {
                if (obj.has(Integer.toString(i))) {
                    JSONObject movies = obj.getJSONObject(Integer.toString(i));
                    System.out.printf("Movie: <%s> %s, %d with rating is - %.1f \n", movies.getString("genre"),
                            movies.getString("name"), movies.getInt("year"), movies.getDouble("rating"));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
