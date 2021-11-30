package homework7;
/*10. Таксопарк. Определить иерархию легковых автомобилей. Создать таксо-
        парк. Подсчитать стоимость автопарка. Провести сортировку автомобилей
        парка по расходу топлива. Найти автомобиль в компании, соответствую-
        щий заданному диапазону параметров скорости.*/
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaxiStation {
    public static void main(String[] args) throws ParseException {
        Garage garage = new Garage();
        garage.addCar(new Renault("12.10.2010",8500.005, 6.5,RenaultModels.SCENIC, 110, CarColors.GRAY));
        garage.addCar(new Renault("13.11.2011",9500.005, 6.0,RenaultModels.LOGAN, 100, CarColors.GREEN));
        garage.addCar(new Renault("14.12.2012",10500.005, 5.5,RenaultModels.MEGANE, 90, CarColors.WHITE));
        garage.addCar(new Renault("15.01.2013",11500.005, 5.0,RenaultModels.KADJAR, 80, CarColors.BLACK));
        garage.addCar(new BMW("12.10.2010",12500.005, 13.5,BMWModels.X5, 140, CarColors.GRAY));
        garage.addCar(new BMW("13.11.2011",13500.005, 12.0,BMWModels.M5, 130, CarColors.GREEN));
        garage.addCar(new BMW("14.12.2012",14500.005, 11.5,BMWModels.X3, 120, CarColors.WHITE));
        garage.addCar(new BMW("15.01.2013",15500.005, 10.0,BMWModels.M3, 110, CarColors.BLACK));
        garage.addCar(new Audi("12.10.2010",10999.99, 9.5,AudiModels.Q7, 135, CarColors.GRAY));
        garage.addCar(new Audi("13.11.2011",11999.99, 8.0,AudiModels.Q5, 125, CarColors.GREEN));
        garage.addCar(new Audi("14.12.2012",12999.99, 7.5,AudiModels.TT, 115, CarColors.WHITE));
        garage.addCar(new Audi("15.01.2013",13999.99, 6.0,AudiModels.A4, 95, CarColors.BLACK));

        System.out.println("\nСтоимость всех автомобилей автопарка: "+garage.getPrice()+" $\n");
        garage.sort();
        System.out.println("--------------Сортировка по расходу топлива--------------");
        System.out.println(garage);
        System.out.println("\n--------------Отбор по заданной скорости--------------\n");
        ArrayList<Car> carBetweenSpeed = garage.getCarsBetweenSpeed(109,119);
        for (Car car:carBetweenSpeed)
            System.out.println(car.toString());
    }
}

class Garage {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public double getPrice() {
        double sum = 0;
        for (Car car : cars)
            sum += car.getPrice();
        return sum;
    }

    public void sort() {
        Collections.sort(cars);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Garage: \n");
        for (Car car : cars) {
            String sCar = car.toString();
            stringBuilder.append(sCar);
        }
        return stringBuilder.toString();
    }

    public ArrayList<Car> getCarsBetweenSpeed(int minSpeed, int maxSpeed) {
        ArrayList<Car> carsBetweenSpeed = new ArrayList<>();
        for (Car car : cars)
            if (car.getSpeed() >= minSpeed && car.getSpeed() <= maxSpeed)
                carsBetweenSpeed.add(car);
        return carsBetweenSpeed;
    }
}