/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int quantityPlace;
    private String nameFirstPilot;
    private String nameSecondPilot;

    private Plane(PlaneBuilder builder) {
        this.color = builder.color;
        this.model = builder.model;
        this.nameFirstPilot = builder.nameFirstPilot;
        this.nameSecondPilot = builder.nameSecondPilot;
        this.quantityPlace = builder.quantityPlace;
    }

    @Override
    public String toString() {
        return "Plane --" + "model = " + model + "\n"
                + "color = " + color + "\n"
                + "quantityPlace = " + quantityPlace + "\n"
                + "nameFirstPilot = " + nameFirstPilot + "\n"
                + "nameSecondPilot = " + nameSecondPilot + "\n";
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getQuantityPlace() {
        return quantityPlace;
    }

    public String getNameFirstPilot() {
        return nameFirstPilot;
    }

    public String getNameSecondPilot() {
        return nameSecondPilot;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int quantityPlace;
        private String nameFirstPilot;
        private String nameSecondPilot;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setQuantityPlace(int quantityPlace) {
            this.quantityPlace = quantityPlace;
            return this;
        }

        public PlaneBuilder setNameFirstPilot(String nameFirstPilot) {
            this.nameFirstPilot = nameFirstPilot;
            return this;
        }

        public PlaneBuilder setNameSecondPilot(String nameSecondPilot) {
            this.nameSecondPilot = nameSecondPilot;
            return this;
        }

        public Plane build() {
            return new Plane(this);

        }
    }
}
