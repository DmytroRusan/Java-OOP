package Task11;

public abstract class Surgeon implements Doctor {
    private MedicalTools[] medicalTools;


    enum MedicalTools {
        SCALPELS, FORCEPS, SCISSORS, RETRACTORS, CLAMPS;
    }

    public void doAnOperation(MedicalTools someMedicalInstrument) {
        for (int i = 0; i < MedicalTools.values().length; i++) {
            if (someMedicalInstrument == MedicalTools.values()[i]) {
                System.out.println("Операція успішна");
                return;
            }
        }
        System.out.println("Операцію зробити неможливо");
    }

}
