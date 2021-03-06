package homework7;

import java.text.ParseException;

enum RenaultModels {
    SYMBOL, SCENIC, LOGAN, KADJAR, MEGANE
}

public class Renault extends Car {

    private RenaultModels model;

    Renault(String sDate, double price, double averageFuelConsumption, RenaultModels model, int maxSpeed,
            CarColors color) throws ParseException {
        super(sDate, price, averageFuelConsumption, maxSpeed, color);
        this.brand = "Renault";
        this.model = model;
    }

    public RenaultModels getModel() {
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
