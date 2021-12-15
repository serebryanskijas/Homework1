package homework8;

import java.util.Deque;
import java.util.HashMap;

public class HashMapDeque {

    private final HashMap<Integer, Deque<Films>> map = new HashMap<>();

    public static void main(String[] args) {
        DequeFilms filmAction = new DequeFilms();
        DequeFilms filmComedy = new DequeFilms();
        DequeFilms filmThriller = new DequeFilms();
        filmAction.addToDeque(new Films("Action", "Die Hard", 1988, 4.8));
        filmComedy.addToDeque(new Films("Comedy", "Mask", 1994, 4.7));
        filmThriller.addToDeque(new Films("Thriller", "Queen", 1987, 4.6));
        filmAction.addToDeque(new Films("Action", "Rembo", 1998, 4.5));
        filmComedy.addToDeque(new Films("Comedy", "Home alone", 1989, 4.9));
        filmAction.addToDeque(new Films("Action", "Cobra", 1990, 5.0));
        filmThriller.addToDeque(new Films("Thriller", "Run", 1991, 3.7));
        filmAction.addToDeque(new Films("Action", "Mountain", 1988, 3.8));
        filmComedy.addToDeque(new Films("Comedy", "Mutant girls", 1989, 3.9));
        filmThriller.addToDeque(new Films("Thriller", "I find you", 1992, 4.0));
        filmAction.addToDeque(new Films("Action", "Galaxy strangers", 2001, 4.2));
        //film.printAllCollectionDeque(film);
        filmComedy.printGenreCollectionDeque(filmComedy, "Comedy");



        HashMapDeque mapDeque = new HashMapDeque();


        mapDeque.addToMap(1, filmAction.getDeque());


        System.out.println(mapDeque);

    }
    public void addToMap(int key,Deque films){
        map.put(key, films);
    }
}
