package homework8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeFilms {

    public Deque<Film> getDeque() {
        return deque;
    }

    private final Deque<Film> deque = new ArrayDeque<>();

    public void addToDeque(Film films) {
        deque.add(films);
    }

}
