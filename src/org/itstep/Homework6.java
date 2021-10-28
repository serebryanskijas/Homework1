package org.itstep;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Homework6 {
    /*10. Train: Пункт назначения, Номер поезда, Время отправления, Число мест
        (общих, купе, плацкарт, люкс).
        Создать массив объектов. Вывести:
        a) список поездов, следующих до заданного пункта назначения;
        b) список поездов, следующих до заданного пункта назначения и отправ
        ляющихся после заданного часа;
        c) список поездов, отправляющихся до заданного пункта назначения
        и имеющих общие места.*/
    public static void main(String[] args) throws ParseException {
        List<Train> trains = new ArrayList<Train>();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm");

        Train train = new Train("Minsk", "1-М", timeFormat.parse("06:10"), 20, 10, 6, 4);
        trains.add(train);
        train = new Train("Brest", "1-Б", timeFormat.parse("07:20"), 20, 10, 6, 4);
        trains.add(train);
        train = new Train("Vitebsk", "1-В", timeFormat.parse("12:40"), 20, 10, 6, 4);
        trains.add(train);
        train = new Train("Grodno", "1-Г", timeFormat.parse("19:50"), 20, 10, 6, 4);
        trains.add(train);

        train = new Train("Minsk", "2-М", timeFormat.parse("09:10"), 60, 40);
        trains.add(train);
        train = new Train("Brest", "2-Б", timeFormat.parse("10:20"), 60, 40);
        trains.add(train);
        train = new Train("Vitebsk", "2-В", timeFormat.parse("15:40"), 60, 40);
        trains.add(train);
        train = new Train("Grodno", "2-Г", timeFormat.parse("22:50"), 60, 40);
        trains.add(train);

        train = new Train("Minsk", "3-М", timeFormat.parse("12:10"), 40);
        trains.add(train);
        train = new Train("Brest", "3-Б", timeFormat.parse("13:20"), 40);
        trains.add(train);
        train = new Train("Vitebsk", "3-В", timeFormat.parse("18:40"), 40);
        trains.add(train);
        train = new Train("Grodno", "1-Г", timeFormat.parse("01:50"), 40);
        trains.add(train);

        train = new Train("Minsk", timeFormat.parse("12:00"), 30);
        trains.add(train);


        System.out.println("\n--------------a) список поездов, следующих до заданного пункта назначения---------------");
        for (Train trainTemp : trains) {
            if (trainTemp.getDestination().equals("Minsk"))
                System.out.println(trainTemp);
        }

        System.out.println("\n--------------b) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа---------------");
        String sTime = "11:00";
        Date time = timeFormat.parse(sTime);
        for (Train trainTemp : trains) {
            if (trainTemp.getDestination().equals("Grodno") && trainTemp.getTimeStart().after(time))
                System.out.println(trainTemp);
        }

        System.out.println("\n--------------c) cписок поездов, отправляющихся до заданного пункта назначения и имеющих общие места---------------");
        for (Train trainTemp : trains) {
            if (trainTemp.getDestination().equals("Vitebsk") && trainTemp.getNumberOfSeatGen() != 0)
                System.out.println(trainTemp);
        }
    }
}

class Train {
    private String destination;
    private String trainNumber;
    private Date timeStart;
    private int numberOfSeatGen;
    private int numberOfSeatPlats;
    private int numberOfSeatCoupe;
    private int numberOfSeatLux;

    public Train(String destination, String trainNumber, Date timeStart, int numberOfSeatGen, int numberOfSeatPlats, int numberOfSeatCoupe, int numberOfSeatLux) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.timeStart = timeStart;
        this.numberOfSeatGen = numberOfSeatGen;
        this.numberOfSeatPlats = numberOfSeatPlats;
        this.numberOfSeatCoupe = numberOfSeatCoupe;
        this.numberOfSeatLux = numberOfSeatLux;
    }

    public Train(String destination, String trainNumber, Date timeStart, int numberOfSeatPlats, int numberOfSeatCoupe) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.timeStart = timeStart;
        this.numberOfSeatPlats = numberOfSeatPlats;
        this.numberOfSeatCoupe = numberOfSeatCoupe;
    }

    public Train(String destination, String trainNumber, Date timeStart, int numberOfSeatGen) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.timeStart = timeStart;
        this.numberOfSeatGen = numberOfSeatGen;
    }

    public Train(String destination, Date timeStart, int numberOfSeatLux) {
        this.destination = destination;
        this.timeStart = timeStart;
        this.numberOfSeatLux = numberOfSeatLux;
    }

    public String toString() {
        DateFormat timeF = new SimpleDateFormat("HH:mm");
        String time;
        if (timeStart != null)
            time = timeF.format(timeStart);
        else time = "";
        String result = String.format("Пункт назначения: %s, Время отправления: %s, ",
                destination, time);
        if (trainNumber != null)
            result = result.concat(String.format("Номер поезда: %s, ", trainNumber));
        if (numberOfSeatGen != 0)
            result = result.concat(String.format("Количество общих мест: %d, ", numberOfSeatGen));
        if (numberOfSeatPlats != 0 && numberOfSeatCoupe != 0)
            result = result.concat(String.format("Количество плацкартных мест: %d, Количество мест Купе: %d, ", numberOfSeatPlats, numberOfSeatCoupe));
        if (numberOfSeatLux != 0)
            result = result.concat(String.format("Количество ЛЮКС мест - %d;", numberOfSeatLux));

        return result;
    }

    public String getDestination() {
        return destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public int getNumberOfSeatGen() {
        return numberOfSeatGen;
    }

    public int getNumberOfSeatPlats() {
        return numberOfSeatPlats;
    }

    public int getNumberOfSeatCoupe() {
        return numberOfSeatCoupe;
    }

    public int getNumberOfSeatLux() {
        return numberOfSeatLux;
    }
}