public class BuilderPatternInJava {

    public static void main(String[] args) {

        //help me create a class for builder pattern in java

        Car car = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setYear(2023)
                .setColor("Blue")
                .build();

        System.out.println(car);
    }
}

// Car class using Builder Pattern
class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    // Builder Class
    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private String color;

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
