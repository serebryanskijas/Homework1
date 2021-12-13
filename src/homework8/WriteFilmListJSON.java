package homework8;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFilmListJSON {

    public static void main(String[] args) {
        WriteFilmListJSON film = new WriteFilmListJSON();
        film.writeFilmListJSON("Action", "Die Hard", 1988, 4.8);
        WriteFilmListJSON film2 = new WriteFilmListJSON();
        film2.writeFilmListJSON("Comedy", "The Breakfast Club", 1985, 4.5);
        //film.readFilmListJSON();
    }

    public void writeFilmListJSON(String valueGenre, String valueName, int valueYear, double valueRating) {
        String keyGenre = "genre", keyName = "name", keyYear = "year", keyRating = "rating";
        int filmNumber = 0;
        FileWriter fileWriter = null;

        JSONObject main = new JSONObject();
        for (filmNumber = 1; filmNumber < 3; filmNumber++) {
        JSONObject filmNum = new JSONObject();

        filmNum.put(keyGenre, valueGenre);
        filmNum.put(keyName, valueName);
        filmNum.put(keyYear, valueYear);
        filmNum.put(keyRating, valueRating);

            main.put(Integer.toString(filmNumber), filmNum);
        }


        try {
            fileWriter = new FileWriter("src/homework8/data/filmData.json");
            fileWriter.write(main.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                assert fileWriter != null;
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
            JSONArray movies = obj.getJSONArray("movie");
            for (int i = 0; i < movies.length(); i++) {
                JSONObject movie = movies.getJSONObject(i);
                System.out.printf("Movie: <%s> %s, %d with rating is - %.1f \n", movie.getString("genre"),
                        movie.getString("name"), movie.getInt("year"), movie.getDouble("rating"));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
