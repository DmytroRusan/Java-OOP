package Task9;

public class Task9 {
    public static void main(String[] args) {
        Student student1 = new Student("Boris", "Johnson", "Economic", 5.0);
        Student student2 = new Student("Pablo", "Escobar", "Chemical technologist", 4.0);
        Aspirant aspirant1 = new Aspirant("Margaret", "Thatcher", "Automation Engeneering", 5.0);
        Aspirant aspirant2 = new Aspirant("Sasha", "Grey", "acting skills", 3.0);
        Student[] student = {student1, student2, aspirant1, aspirant2};
        System.out.println(student[0].getScholarship());
        System.out.println(student[1].getScholarship());
        System.out.println(student[2].getScholarship());
        System.out.println(student[3].getScholarship());
    }
}
