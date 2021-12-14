package homework8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeFilms {

    public Deque<Films> getDeque() {
        return deque;
    }

    private final Deque<Films> deque = new ArrayDeque<Films>(1200);

    public static void main(String[] args) {
        DequeFilms film = new DequeFilms();
        film.addToDeque(new Films("Action", "Die Hard", 1988, 4.8));
        film.addToDeque(new Films("Comedy", "Mask", 1994, 4.7));
        film.addToDeque(new Films("Thriller", "Queen", 1987, 4.6));
        film.addToDeque(new Films("Action", "Rembo", 1998, 4.5));
        film.addToDeque(new Films("Comedy", "Home alone", 1989, 4.9));
        film.addToDeque(new Films("Action", "Cobra", 1990, 5.0));
        film.addToDeque(new Films("Thriller", "Run", 1991, 3.7));
        film.addToDeque(new Films("Action", "Mountain", 1988, 3.8));
        film.addToDeque(new Films("Comedy", "Mutant girls", 1989, 3.9));
        film.addToDeque(new Films("Thriller", "I find you", 1992, 4.0));
        film.addToDeque(new Films("Action", "Galaxy strangers", 2001, 4.2));
        //film.printAllCollectionDeque(film);
        film.printGenreCollectionDeque(film, "Comedy");
    }


    public void addToDeque(Films films){
       deque.add(films);
   }

   public void printAllCollectionDeque(DequeFilms dequeName){
       Films current = null;
       while((current = dequeName.deque.poll())!= null) {
           System.out.printf("Movie: <%s> %s, %d with rating is - %.1f \n",current.getGenre(),current.getName(),
                   current.getYear(),current.getRating());
       }


   }

    public void printGenreCollectionDeque(DequeFilms dequeName, String genre) {

        for (Films film:dequeName.deque) {
            if (film.getGenre().equals(genre)) {
                System.out.printf("Movie: <%s> %s, %d with rating is - %.1f \n", film.getGenre(), film.getName(),
                        film.getYear(), film.getRating());
            }
        }

    }
}
