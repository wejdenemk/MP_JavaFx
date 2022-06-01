package application.entities;


public class Entreprise {
	String nomE;
	double Salaire;
	public String getNomE() {
		return nomE;
	}
	public void setNomE(String nomE) {
		this.nomE = nomE;
	}
	public double getSalaire() {
		return Salaire;
	}
	public void setSalaire(double salaire) {
		Salaire = salaire;
	}
	
	public Entreprise(String nomE) {
		super();
		this.nomE = nomE;
	}
	public Entreprise(String nomE, double salaire) {
		super();
		this.nomE = nomE;
		Salaire = salaire;
	}  
 
}
