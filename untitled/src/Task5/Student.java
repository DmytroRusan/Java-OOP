package Task5;

public class Student extends Human {
    private String course;
    private int yearOfStudy;

    public Student(String name, int age, String gender, double weight, String course, int yearOfStudy) {
        super(name, age, gender, weight);
        this.course = course;
        this.yearOfStudy = yearOfStudy;
    }

    public String getCourse() {
        return course;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYearOfStudy(int yearOfStudy) {
        if (yearOfStudy > 0) {
            this.yearOfStudy = yearOfStudy;
        } else {
            System.out.println("Ваш рік навчання не може бути нулем, або менше нуля");
        }
    }


}
