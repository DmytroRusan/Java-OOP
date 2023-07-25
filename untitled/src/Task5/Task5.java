package Task5;

public class Task5 {
    public static void main(String[] args) {
        Human human = new Human("Adolf", 30, "Male", 100);
        System.out.println("Ім’я людини: " + human.getName());
        System.out.println("Вік людини: " + human.getAge());
        System.out.println("Стать: " + human.getGender());
        System.out.println("Вага людини: " + human.getWeight());

        human.setName("Albert");
        System.out.println("Нове ім’я людини: " + human.getName());

        System.out.println();

        Student student = new Student("Anna", 20, "Female", 50, "Java OOP", 1);
        System.out.println("Курс навчання: " + student.getCourse());
        System.out.println("Рік навчання: " + student.getYearOfStudy());

        student.setCourse("Java Pro");
        student.setYearOfStudy(2);

        System.out.println("Новий курс навчання: " + student.getCourse());
        System.out.println("Новий рік навчання: " + student.getYearOfStudy());

    }
}
