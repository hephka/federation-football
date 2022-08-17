package federation_football;

import java.util.ArrayList;

public final class Equipe {
	private int _ref = 0;
	private String _type, _niveauLigue;
	private Club _club;
	private ArrayList<Joueur> _joueurs;
	private ArrayList<Match> _matchs;
	private static int _count = 1;
	
	
	////////// CONSTRUCTEURS /////////////
	
	public Equipe() {}
	
	public Equipe(String type, String niveauLigue, Club club) {
		_ref = _count++;
		_type = type;
		_niveauLigue = niveauLigue;
		_club = club;
		club.ajouterEquipe(this);
		_joueurs = new ArrayList<Joueur>();
		_matchs = new ArrayList<Match>();
	}
	
	public Equipe(Equipe equipe) {
		_ref = equipe._ref;
		_type = equipe._type;
		_niveauLigue = equipe._niveauLigue;
		_club = equipe._club;
		_joueurs = equipe._joueurs;
		_matchs = equipe._matchs;
	}
	
	
	////////// GETTERS /////////////
	
	public int getRef() {
		return _ref;
	}
	
	public String getType() {
		return _type;
	}
	
	public String getNiveauLigue() {
		return _niveauLigue;
	}
	
	public Club getClub() {
		return _club;
	}
	
	
	////////// SETTERS /////////////
	
	public void setType(String type) {
		_type = type;
	}
	
	public void setNiveauLigue(String niveauLigue) {
		_niveauLigue = niveauLigue;
	}
	
	
	////////// METHODS /////////////
	
	public void ajouterJoueur(Joueur joueur) {
		_joueurs.add(joueur);
	}
	
	public void supprimerJoueur(Joueur joueur) {
		_joueurs.remove(joueur);
	}
	
	public int nombreJoueurs() {
		return _joueurs.size();
	}
	
	public void afficherJoueurs() {
		System.out.println("Liste des joueurs (" + nombreJoueurs() + ") : ");
		for(Joueur joueur : _joueurs) {
			System.out.println(" 	" + joueur);
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
		System.out.println("Nom : " + _type);
		System.out.println("Saison : " + _niveauLigue);
		System.out.println("Type  : " + _club);
		afficherJoueurs();
		afficherMatchs();
	}
	
	@Override
	public String toString() {
		return _ref + " | " + _type + " | " + _niveauLigue + " | " + _club;
	}
	
}
