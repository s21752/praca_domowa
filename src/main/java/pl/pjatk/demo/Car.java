package pl.pjatk.demo;

public class Car {

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;

    public Car() {}
    public Car(String model) {
        setModel(model);
    }
}
