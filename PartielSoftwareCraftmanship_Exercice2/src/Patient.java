import java.util.List;

public class Patient implements Personne {
	private int id;
	private String nom;
	private String prenom;
	private int globulesBlancs;
	private boolean enRechute;
    private boolean enProtocoleGamma;
    private List<String> marqueursGenetiques;
    
	public Patient(int id,String nom,String prenom,int globulesBlancs, boolean enRechute, boolean enProtocoleGamma, List<String> marqueursGenetiques) 
	{
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.globulesBlancs = globulesBlancs;
        this.enRechute = enRechute;
        this.enProtocoleGamma = enProtocoleGamma;
        this.marqueursGenetiques = marqueursGenetiques;
	}
	
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public String getPrenom() {
		return prenom;
	}


	public boolean isEnRechute() {
		return enRechute;
	}


	public void setEnRechute(boolean enRechute) {
		this.enRechute = enRechute;
	}
	
	public int getGlobulesBlancs() {
		return globulesBlancs;
	}

	public boolean isEnProtocoleGamma() {
		return enProtocoleGamma;
	}
	
	public List<String> getMarqueursGenetiques() {
		return marqueursGenetiques;
	}
}
