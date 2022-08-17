package federation_football;

import java.sql.Date;

public abstract class Personne {
	protected int _id = 0;
	protected String _nom, _prenom, _adresse, _mail, _telephone, _type;
	protected Date _dateNaissance, _dateRecrutement;
	protected Club _club;
	private static int _count = 1;
	
	
	////////// CONSTRUCTEURS /////////////
	
	public Personne() {}
	
	public Personne(String nom, String prenom, String adresse, String mail, String telephone, String type, Date dateNaissance, Date dateRecrutement, Club club) {
		_id = _count++;
		_nom = nom;
		_prenom = prenom;
		_adresse = adresse;
		_mail = mail;
		_telephone = telephone;
		_dateNaissance = dateNaissance;
		_dateRecrutement = dateRecrutement;
		_type = type;
		_club = club;
		club.ajouterPersonne(this);
	}
	
	public Personne(Personne personne) {
		_id = personne._id;
		_nom = personne._nom;
		_prenom = personne._prenom;
		_adresse = personne._adresse;
		_mail = personne._mail;
		_telephone = personne._telephone;
		_dateNaissance = personne._dateNaissance;
		_dateRecrutement = personne._dateRecrutement;
		_type = personne._type;
		_club = personne._club;
	}
	
	
	////////// GETTERS /////////////
	
	public int getId() {
		return _id;
	}
	
	public String getNom() {
		return _nom;
	}
	
	public String getPrenom() {
		return _prenom;
	}
	
	public String getAdresse() {
		return _adresse;
	}
	
	public String getMail() {
		return _mail;
	}
	
	public String getTelephone() {
		return _telephone;
	}
	
	public String getType() {
		return _type;
	}
	
	public Date getDateNaissance() {
		return _dateNaissance;
	}
	
	public Date getDateRecrutement() {
		return _dateRecrutement;
	}
	
	public Club getClub() {
		return _club;
	}
	
	
	////////// SETTERS /////////////
	
	public void setNom(String nom) {
		_nom = nom;
	}
	
	public void setPrenom(String prenom) {
		_prenom = prenom;
	}
	
	public void setAdresse(String adresse) {
		_adresse = adresse;
	}
	
	public void setMail(String mail) {
		_mail = mail;
	}
	
	public void setTelephone(String telephone) {
		_telephone = telephone;
	}
	
	public void setType(String type) {
		_type = type;
	}
	
	public void setDateNaissance(Date dateNaissance) {
		_dateNaissance = dateNaissance;
	}
	
	public void setDateRecrutement(Date dateRecrutement) {
		_dateRecrutement = dateRecrutement;
	}
	
	public void setClub(Club club) {
		_club = club;
	}
	
	
	////////// METHODS /////////////
	
	protected void afficher() {
		System.out.println("Identifiant : " + _id);
		System.out.println("Nom : " + _nom);
		System.out.println("Prénom : " + _prenom);
		System.out.println("Adresse  : " + _adresse);
		System.out.println("Mail  : " + _mail);
		System.out.println("Telephone  : " + _telephone);
		System.out.println("Type  : " + _type);
		System.out.println("Date de naissance  : " + _dateNaissance);
		System.out.println("Date de recrutement  : " + _dateRecrutement);
		System.out.println("Club  : " + _club);
	}
	
	@Override
	public String toString() {
		return _id + " | " + _nom + " | " + _prenom + " | " + _adresse + " | " + _mail + " | " 
			+ _telephone + " | " + _type + " | " + _dateNaissance + " | " + _dateRecrutement + " | " + _club;
	}
	
}
