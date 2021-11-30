package homework7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car implements Comparable<Car> {
    protected String model = ""; //Модель авто
    private final Date dateOfManufacture; // Дата выпуска
    protected String sDate;
    protected double price; // Стоимость авто
    protected double averageFuelConsumption; // Средний расход топлива л/100 км
    private final int maxSpeed; // Максимальная скорость км/ч
    protected CarColors color; //Цвет авто


    Car(String sDate, double price, double averageFuelConsumption, int maxSpeed, CarColors color) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.dateOfManufacture = dateFormat.parse(sDate);
        this.sDate = sDate;
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public CarColors getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(Car car) {

        double afc1 = getAverageFuelConsumption();
        double afc2 = car.getAverageFuelConsumption();
        String sAfc1 = String.valueOf(afc1);
        String sAfc2 = String.valueOf(afc2);
        return sAfc1.compareTo(sAfc2);
    }

    public String getsDate() {
        return sDate;
    }

    public String toString() {
        return "";
    }


}