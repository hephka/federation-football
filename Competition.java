package federation_football;

import java.util.ArrayList;

public final class Competition {
	private int _ref = 0, _nombreEquipe;
	private String _nom, _saison, _type;
	private ArrayList<Club> _clubs;
	private ArrayList<Match> _matchs;
	private static int _count = 1;

	
	////////// CONSTRUCTEURS /////////////
	
	public Competition() {}
	
	public Competition(String nom, String saison, String type, int nombreEquipe) {
		_ref = _count++;
		_nom = nom;
		_saison = saison;
		_type = type;
		_nombreEquipe = nombreEquipe;
		_clubs = new ArrayList<Club>();
		_matchs = new ArrayList<Match>();
	}
	
	public Competition(Competition competition) {
		_ref = competition._ref;
		_nom = competition._nom;
		_saison = competition._saison;
		_type = competition._type;
		_nombreEquipe = competition._nombreEquipe;
		_clubs = competition._clubs;
		_matchs = competition._matchs;
	}
	
	
	////////// GETTERS /////////////
	
	public int getRef() {
		return _ref;
	}
	
	public String getNom() {
		return _nom;
	}
	
	public String getSaison() {
		return _saison;
	}
	
	public String getType() {
		return _type;
	}
	
	public int getNombreEquipe() {
		return _nombreEquipe;
	}
	
	
	////////// SETTERS /////////////
	
	public void setNom(String nom) {
		_nom = nom;
	}
	
	public void setSaison(String saison) {
		_saison = saison;
	}
	
	public void setType(String type) {
		_type = type;
	}
	
	public void setMail(int nombreEquipe) {
		_nombreEquipe = nombreEquipe;
	}
	
	
	////////// METHODS /////////////
	
	public void ajouterClub(Club club) {
		_clubs.add(club);
	}
	
	public void supprimerClub(Club club) {
		_clubs.remove(club);
	}
	
	public int nombreClubs() {
		return _clubs.size();
	}
	
	public void afficherClubs() {
		System.out.println("Liste des clubs (" + nombreClubs() + ") : ");
		for(Club club : _clubs) {
			System.out.println(" 	" + club);
		}
	}
	
	public void ajouterMatch(Match match) {
		_matchs.add(match);
	}
	
	public void supprimerMatch(Match match) {
		_matchs.remove(match);
	}
	
	public int nombreMatchs() {
		return _matchs.size();
	}
	
	public void afficherMatchs() {
		System.out.println("Liste des matchs (" + nombreMatchs() + ") : ");
		for(Match match : _matchs) {
			System.out.println(" 	" + match);
		}
	}
	
	public void afficher() {
		System.out.println("Référence : " + _ref);
		System.out.println("Nom : " + _nom);
		System.out.println("Saison : " + _saison);
		System.out.println("Type  : " + _type);
		System.out.println("Nombre d'équipes attendues  : " + _nombreEquipe);
		afficherClubs();
		afficherMatchs();
	}
	
	@Override
	public String toString() {
		return _ref + " | " + _nom + " | " + _saison + " | " + _type + " | " + _nombreEquipe;
	}
	
}
