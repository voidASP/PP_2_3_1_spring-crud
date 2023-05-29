package web.model;

public class Car {
    private String type;
    private String model;
    private int price;

    public Car(String type, String model, int price) {
        this.type = type;
        this.model = model;
        this.price = price;
    }

    public Car() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
