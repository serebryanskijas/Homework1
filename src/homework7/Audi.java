package homework7;

import java.text.ParseException;

enum AudiModels {
    A4, A6, Q5, Q7, TT
}

public class Audi extends Car {

    private AudiModels model;

    Audi(String sDate, double price, double averageFuelConsumption, AudiModels model, int maxSpeed,
            CarColors color) throws ParseException {
        super(sDate, price, averageFuelConsumption, maxSpeed, color);
        this.brand = "Audi";
        this.model = model;
    }

    public AudiModels getModel() {
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
