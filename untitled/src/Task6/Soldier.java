package Task6;

public class Soldier extends Human {
    private boolean hasHighEducation;

    public Soldier(String name, int age, double height, double weight, boolean hasHighEducation) {
        super(name, age, height, weight);
        this.hasHighEducation = hasHighEducation;
    }

    @Override
    public double getCoefficient() {
        double Q = Double.NaN;
        if (hasHighEducation) {
            Q = 2 * getHeight() * getWeight();
        } else {
            Q = 0.5 * getHeight() * getWeight();
        }
        return Q;
    }


}
