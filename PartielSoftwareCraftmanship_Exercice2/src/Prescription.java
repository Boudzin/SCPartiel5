import java.time.LocalDate;
import java.util.List;

public class Prescription {
    String medicament;
    int quantite;
    LocalDate date;
    List<String> medicamentsAssocies;
    
    public Prescription(String medicament, int quantite, LocalDate date, List<String> medicamentsAssocies) 
    {
        this.medicament = medicament;
        this.quantite = quantite;
        this.date = date;
        this.medicamentsAssocies = medicamentsAssocies;
    }
}