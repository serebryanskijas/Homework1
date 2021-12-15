package homework8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeFilms {

    public Deque<Films> getDeque() {
        return deque;
    }

    private final Deque<Films> deque = new ArrayDeque<Films>(1200);

    public void addToDeque(Films films) {
        deque.add(films);
    }

    public void printAllCollectionDeque(DequeFilms dequeName) {
        Films current = null;
        while ((current = dequeName.deque.poll()) != null) {
            System.out.printf("Movie: <%s> %s, %d with rating is - %.1f \n", current.getGenre(), current.getName(),
                    current.getYear(), current.getRating());
        }

    }

    public void printGenreCollectionDeque(DequeFilms dequeName, String genre) {

        for (Films film : dequeName.deque) {
            if (film.getGenre().equals(genre)) {
                System.out.printf("Movie: <%s> %s, %d with rating is - %.1f \n", film.getGenre(), film.getName(),
                        film.getYear(), film.getRating());
            }
        }

    }

}
