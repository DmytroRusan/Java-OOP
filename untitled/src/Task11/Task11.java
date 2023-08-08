package Task11;

public class Task11 {
    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        dentist.cure("brain");
        dentist.doAnOperation(Surgeon.MedicalTools.FORCEPS);
        dentist.cure("teeth");

    }
}
