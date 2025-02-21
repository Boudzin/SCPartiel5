import java.time.DayOfWeek;

public class MoteurValidation {
    public boolean validerPrescription(Patient patient, Prescription prescription, Stock stock) {
        
        if (prescription.medicament.equals("X")) {
            if (patient.isEnProtocoleGamma()) {
                if (patient.getGlobulesBlancs() < 1500 && !patient.isEnRechute()) {
                    return false;
                }
            } else if (patient.getGlobulesBlancs() < 2000) {
                return false;
            }
        }
        
        if (prescription.medicamentsAssocies.contains("Y") && prescription.medicamentsAssocies.contains("Z")) {
            if (!patient.getMarqueursGenetiques().contains("BRCA1")) {
                if (!(prescription.date.getDayOfWeek() == DayOfWeek.WEDNESDAY)) {
                    return false;
                }
            }
        }
        
        boolean weekEnd = prescription.date.getDayOfWeek() == DayOfWeek.SATURDAY || prescription.date.getDayOfWeek() == DayOfWeek.SUNDAY;
        if (!stock.verifierStock(prescription.medicament, prescription.quantite, weekEnd)) {
            return false;
        }
        
        return true;
    }
}