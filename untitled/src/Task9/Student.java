package Task9;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        if (averageMark >= 1 && averageMark <= 5) {
            this.averageMark = averageMark;
        } else {
            System.out.println("Оцінка має бути від 1 до 5");
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public double getScholarship() {
        double sumOfScholarship = Double.NaN;
        if (averageMark == 5) {
            sumOfScholarship = 2000;
        } else {
            sumOfScholarship = 1900;
        }
        return sumOfScholarship;
    }
}
