package federation_football;

import java.util.ArrayList;

public final class Club {
	private int _ref = 0, _anneeFondation;
	private String _nom, _adresseSiege, _adresseEntrainement, _mail, _telephone, _siteWeb;
	private ArrayList<Personne> _personnes;
	private ArrayList<Competition> _competitions;
	private ArrayList<Equipe> _equipes;
	private static int _count = 1;
	
	
	////////// CONSTRUCTEURS /////////////
	
	public Club() {}
	
	public Club(String nom, String adresseSiege, String adresseEntrainement, String mail, String telephone, int anneeFondation, String siteWeb) {
		_ref = _count++;
		_nom = nom;
		_adresseSiege = adresseSiege;
		_adresseEntrainement = adresseEntrainement;
		_mail = mail;
		_telephone = telephone;
		_anneeFondation = anneeFondation;
		_siteWeb = siteWeb;
		_personnes = new ArrayList<Personne>();
		_competitions = new ArrayList<Competition>();
		_equipes = new ArrayList<Equipe>();
	}
	
	public Club(Club club) {
		_nom = club._nom;
		_adresseSiege = club._adresseSiege;
		_adresseEntrainement = club._adresseEntrainement;
		_mail = club._mail;
		_telephone = club._telephone;
		_anneeFondation = club._anneeFondation;
		_siteWeb = club._siteWeb;
		_personnes = club._personnes;
		_competitions = club._competitions;
		_equipes = club._equipes;
	}
	
	
	////////// GETTERS /////////////
	
	public int getRef() {
		return _ref;
	}
	
	public String getNom() {
		return _nom;
	}
	
	public String getAdresseSiege() {
		return _adresseSiege;
	}
	
	public String getAdresseEntrainement() {
		return _adresseEntrainement;
	}
	
	public String getMail() {
		return _mail;
	}
	
	public String getTelephone() {
		return _telephone;
	}
	
	public int getAnneeFondation() {
		return _anneeFondation;
	}
	
	public String getSiteWeb() {
		return _siteWeb;
	}
	
	
	////////// SETTERS /////////////
	
	public void setNom(String nom) {
		_nom = nom;
	}
	
	public void setAdresseSiege(String adresseSiege) {
		_adresseSiege = adresseSiege;
	}
	
	public void setAdresseEntrainement(String adresseEntrainement) {
		_adresseEntrainement = adresseEntrainement;
	}
	
	public void setMail(String mail) {
		_mail = mail;
	}
	
	public void setTelephone(String telephone) {
		_telephone = telephone;
	}
	
	public void setAnneeFondation(int anneeFondation) {
		_anneeFondation = anneeFondation;
	}
	
	public void setSiteWeb(String siteWeb) {
		_siteWeb = siteWeb;
	}
	
	////////// METHODS /////////////
	
	public void ajouterPersonne(Personne personnes) {
		_personnes.add(personnes);
	}
	
	public void supprimerPersonne(Personne personnes) {
		_personnes.remove(personnes);
	}
	
	public int nombrePersonnes() {
		return _personnes.size();
	}
	
	private void afficherPersonnes() {
		System.out.println("Liste des personnes (" + nombrePersonnes() + "): ");
		for(Personne personne : _personnes) {
			System.out.println("      " + personne);
		}
	}
	
	public void ajouterCompetition(Competition competitions) {
		_competitions.add(competitions);
	}
	
	public void supprimerCompetition(Competition competitions) {
		_competitions.remove(competitions);
	}
	
	public int nombreCompetitions() {
		return _competitions.size();
	}
	
	private void afficherCompetitions() {
		System.out.println("Liste des compétitions (" + nombreCompetitions() + ") : ");
		for(Competition competition : _competitions) {
			System.out.println("      " + competition);
		}
	}
	
	public void ajouterEquipe(Equipe equipe) {
		_equipes.add(equipe);
	}
	
	public void supprimerEquipe(Equipe equipe) {
		_equipes.remove(equipe);
	}
	
	public int nombreEquipes() {
		return _equipes.size();
	}
	
	private void afficherEquipes() {
		System.out.println("Liste des équipes (" + nombreEquipes() + ") : ");
		for(Equipe equipe : _equipes) {
			System.out.println("      " + equipe);
		}
	}
	
	public void afficher() {
		System.out.println("Référence : " + _ref);
		System.out.println("Nom : " + _nom);
		System.out.println("Adresse du club : " + _adresseSiege);
		System.out.println("Adresse du centre d'entrainement  : " + _adresseEntrainement);
		System.out.println("Mail  : " + _mail);
		System.out.println("Telephone  : " + _telephone);
		System.out.println("Année de fondation  : " + _anneeFondation);
		System.out.println("Site web  : " + _siteWeb);
		afficherPersonnes();
		afficherCompetitions();
		afficherEquipes();
	}
	
	@Override
	public String toString() {
		return _ref + " | " + _nom + " | " + _adresseSiege + " | " + _adresseEntrainement + " | " 
			+ _mail + " | " + _telephone + " | " + _anneeFondation + " | " + _siteWeb;
	}
	
}
