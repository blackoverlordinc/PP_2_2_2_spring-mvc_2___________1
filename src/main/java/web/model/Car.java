package web.model;

public class Car {
    private String modelCar;
    private int yearCar;
    private String colorCar;

    public Car(String modelCar, int yearCar, String colorCar) {
        this.modelCar = modelCar;
        this.yearCar = yearCar;
        this.colorCar = colorCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", yearCar=" + yearCar +
                ", colorCar='" + colorCar + '\'' +
                '}';
    }
}
