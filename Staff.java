package federation_football;

import java.sql.Date;

public final class Staff extends Personne {
	private String _fonction;
	private String _biographie;
	private int _salaire;
	
	
	////////// CONSTRUCTEURS /////////////
	
	public Staff() {}
	
	public Staff(String nom, String prenom, String adresse, String mail, String telephone, String type,
			Date dateNaissance, Date dateRecrutement, Club club, String fonction, String biographie, int salaire) {
		
		super(nom, prenom, adresse, mail, telephone, type, dateNaissance, dateRecrutement, club);
		_fonction = fonction;
		_biographie = biographie;
		_salaire = salaire;
	}
	
	
	////////// GETTERS /////////////
	
	public String getPoste() {
		return _fonction;
	}
	
	public String getNumero() {
		return _biographie;
	}
	
	public int getEquipe() {
		return _salaire;
	}
	
	
	////////// SETTERS /////////////
	
	public void setPoste(String fonction) {
		_fonction = fonction;
	}
	
	public void setNumero(String biographie) {
		_biographie = biographie;
	}
	
	public void setEquipe(int salaire) {
		_salaire = salaire;
	}
	
	
	////////// METHODS /////////////
	
	@Override
	protected void afficher() {
		System.out.println("-----Staff-----");
		super.afficher();
		System.out.println("Fonction : " + _fonction);
		System.out.println("Biographie : " + _biographie);
		System.out.println("Salaire : " + _salaire);
	}
	
	public String toString() {
		return _id + " | " + _nom + " | " + _prenom + " | " + _adresse + " | " + _mail + " | " 
				+ _telephone + " | " + _dateNaissance + " | " + _dateRecrutement + " | " + _club + " | "
				+ _fonction + " | " + _biographie + " | " + _salaire;
	}
	
}
