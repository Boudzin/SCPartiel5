import java.util.Map;

public class Stock {
    private Map<String, Integer> disponibilites;
    
    public Stock(Map<String, Integer> disponibilites) {
        this.disponibilites = disponibilites;
    }
    
    public boolean verifierStock(String medicament, int quantite, boolean weekEnd) {
        int margeSecurite = weekEnd ? (int) Math.ceil(quantite * 1.2) : quantite;
        return disponibilites.getOrDefault(medicament, 0) >= (margeSecurite + 3);
    }
    
    
}