package homework7;

import java.text.ParseException;

enum BMWModels {
    M3, M5, X3, X5, Z4
}

public class BMW extends Car {

    private BMWModels model;

    BMW(String sDate, double price, double averageFuelConsumption, BMWModels model, int maxSpeed,
            CarColors color) throws ParseException {
        super(sDate, price, averageFuelConsumption, maxSpeed, color);
        this.brand = "BMW";
        this.model = model;
    }

    public BMWModels getModel() {
        return model;
    }

    public String toString() {
        String result = String.format("[Car: %s,  model: %s, color: %s," +
                        "\ndate of manufacture:%s, price:%f, average:%f," +
                        "speed:%d]%n",
                getBrand(), getModel().toString(), getColor().toString(),
                getsDate(), getPrice(), getAverageFuelConsumption(), getSpeed());
        return result;
    }
}
