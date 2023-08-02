package Task9;

public class Aspirant extends Student {
    private boolean hasScientificWork = true;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public double getScholarship() {
        double sumOfScholarship = Double.NaN;
        if (getAverageMark() == 5) {
            sumOfScholarship = 2500;
        } else {
            sumOfScholarship = 2200;
        }
        return sumOfScholarship;
    }
}
