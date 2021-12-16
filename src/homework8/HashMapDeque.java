package homework8;

import java.util.*;
import java.util.Set;

public class HashMapDeque {

    public static void main(String[] args) {
        //Создание коллекций типа Deque
        DequeFilms filmAction = new DequeFilms();
        DequeFilms filmComedy = new DequeFilms();
        DequeFilms filmThriller = new DequeFilms();
        //Заполнение коллекций данными
        filmAction.addToDeque(new Film("Action", "Die Hard", 1988, 4.8));
        filmComedy.addToDeque(new Film("Comedy", "Mask", 1994, 4.7));
        filmThriller.addToDeque(new Film("Thriller", "Queen", 1987, 4.6));
        filmAction.addToDeque(new Film("Action", "Rembo", 1998, 4.5));
        filmComedy.addToDeque(new Film("Comedy", "Home alone", 1989, 4.9));
        filmAction.addToDeque(new Film("Action", "Cobra", 1990, 5.0));
        filmThriller.addToDeque(new Film("Thriller", "Run", 1991, 3.7));
        filmAction.addToDeque(new Film("Action", "Mountain", 1988, 3.8));
        filmComedy.addToDeque(new Film("Comedy", "Mutant girls", 1989, 3.9));
        filmThriller.addToDeque(new Film("Thriller", "I find you", 1992, 4.0));
        filmAction.addToDeque(new Film("Action", "Galaxy strangers", 2001, 4.2));
        //Помещение коллекций Deque в коллекцию HashMap
        HashMap<Integer, Deque<Film>> map = new HashMap<>();
        map.put(1, filmAction.getDeque());
        map.put(2, filmComedy.getDeque());
        map.put(3, filmThriller.getDeque());
        //Вывод в консоль содержание HashMap
        printHashmap(map);
    }

    public static void printHashmap(HashMap map) {
        Set<Map.Entry<Integer, Deque<Film>>> set = map.entrySet();
        for (Map.Entry<Integer, Deque<Film>> integerDequeEntry : set) {
            System.out.println("\nCollection № " + integerDequeEntry.getKey() + " with films: ");
            for (Film film : integerDequeEntry.getValue()) {
                film.printAllCollectionDeque();//метод вывода описан в классе Film
            }
        }
    }

}
