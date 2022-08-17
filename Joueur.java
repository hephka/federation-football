package federation_football;

import java.sql.Date;

public final class Joueur extends Personne {
	private String _poste;
	private int _numero;
	private Equipe _equipe;
	
	
	////////// CONSTRUCTEURS /////////////
	
	public Joueur() {}
	
	public Joueur(String nom, String prenom, String adresse, String mail, String telephone, String type,
			Date dateNaissance, Date dateRecrutement, Club club, String poste, int numero, Equipe equipe) {
		
		super(nom, prenom, adresse, mail, telephone, type, dateNaissance, dateRecrutement, club);
		_poste = poste;
		_numero = numero;
		_equipe = equipe;
	}
	
	
	////////// GETTERS /////////////
	
	public String getPoste() {
		return _poste;
	}
	
	public int getNumero() {
		return _numero;
	}
	
	public Equipe getEquipe() {
		return _equipe;
	}
	
	
	////////// SETTERS /////////////
	
	public void setPoste(String poste) {
		_poste = poste;
	}
	
	public void setNumero(int numero) {
		_numero = numero;
	}
	
	public void setEquipe(Equipe equipe) {
		_equipe = equipe;
	}
	
	
	////////// METHODS /////////////
	
	@Override
	protected void afficher() {
		System.out.println("-----Joueur-----");
		super.afficher();
		System.out.println("Poste : " + _poste);
		System.out.println("Numéro : " + _numero);
		System.out.println("Equipe : " + _equipe);
	}
	
	public String toString() {
		return _id + " | " + _nom + " | " + _prenom + " | " + _adresse + " | " + _mail + " | " 
				+ _telephone + " | " + _dateNaissance + " | " + _dateRecrutement + " | " + _club + " | "
				+ _poste + " | " + _numero + " | " + _equipe;
	}
	
}
