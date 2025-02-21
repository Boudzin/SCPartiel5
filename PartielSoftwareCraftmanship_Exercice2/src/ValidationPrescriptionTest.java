import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ValidationPrescriptionTest {
    public static void main(String[] args) {
        Patient patient = new Patient(1,"Lethellier","Hugo", 1800, false, true, List.of("BRCA1"));
        
        Prescription prescription = new Prescription("Dafalgan", 2, LocalDate.now(), List.of("Y", "Z"));
        
        Stock stock = new Stock(Map.of(
            "Dafalgan", 10,
            "Efferalgan", 5,
            "Diclofenac", 5,
            "Flector", 10
        ));
        
        MoteurValidation moteur = new MoteurValidation();
        
        boolean valide = moteur.validerPrescription(patient, prescription, stock);
        System.out.println("Prescription valide ? " + valide);
    }
}