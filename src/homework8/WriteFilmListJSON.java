package homework8;
import org.json.JSONObject;

import javax.naming.StringRefAddr;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFilmListJSON {

    public static void main(String[] args) {
        WriteFilmListJSON film = new WriteFilmListJSON();
        film.writeFilmListJSON("film1","Action", "Die Hard",1988,4.8 );
    }

    public void writeFilmListJSON(String filmNum,  String valueGenre,  String valueName,
             int valueYear, double valueRating) {
        String keyGenre = "genre", keyName = "name", keyYear = "year", keyRating = "rating";

        FileWriter fileWriter = null;
        JSONObject main = new JSONObject();
        JSONObject filmNumber = new JSONObject();
        filmNumber.put(keyGenre,String.valueOf(valueGenre));
        filmNumber.put(keyName,String.valueOf(valueName));
        filmNumber.put(keyYear,String.valueOf(valueYear));
        filmNumber.put(keyRating,String.valueOf(valueRating));
        main.put(filmNum, filmNumber);

        try {
            fileWriter = new FileWriter("src/homework8/data/filmData.json");
            fileWriter.write(main.toString());
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
}
