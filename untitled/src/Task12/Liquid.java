package Task12;

public abstract class Liquid implements Drinkable {
    private boolean isAlcohol;
    private double alcoholByVolume;

    public Liquid(double alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
        isAlcohol = alcoholByVolume > 0;

    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public double getAlcoholByVolume() {
        return alcoholByVolume;
    }
}
