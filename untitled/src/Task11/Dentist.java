package Task11;

public class Dentist extends Surgeon {


    @Override
    public void cure(String organ) {
        if (organ.equals("tooth") || organ.equals("teeth")) {
            doAnOperation(MedicalTools.SCISSORS);
        } else {
            System.out.println("Лікування неможливе");
        }
    }
}
