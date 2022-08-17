package federation_football;

import java.sql.Date;
import java.sql.Time;

public final class Match {
	private int _ref = 0, _scoreEquipeLocale, _scoreEquipeVisiteuse;
	private String _arbitre;
	private Date _date;
	private Time _heure;
	private boolean _statut = false;
	private Equipe _equipeLocale, _equipeVisiteuse, _vainqueur;
	private Competition _competition;
	private static int _count = 1;
	
	
	////////// CONSTRUCTEURS /////////////
	
	public Match() {}
	
	public Match(String arbitre, Date date, Time heure, Equipe equipeLocale, Equipe equipeVisiteuse, Competition competition) {
		_ref = _count++;
		_arbitre = arbitre;
		_date = date;
		_heure = heure;
		_equipeLocale = equipeLocale;
		equipeLocale.ajouterMatch(this);
		_equipeVisiteuse = equipeVisiteuse;
		equipeVisiteuse.ajouterMatch(this);
		_competition = competition;
		competition.ajouterMatch(this);
	}
	
	public Match(Match match) {
		_ref = match._ref;
		_arbitre = match._arbitre;
		_date = match._date;
		_heure = match._heure;
		_equipeLocale = match._equipeLocale;
		_equipeVisiteuse = match._equipeVisiteuse;
		_competition = match._competition;
	}
	
	
	////////// GETTERS /////////////
	
	public int getRef() {
		return _ref;
	}
	
	public String getArbitre() {
		return _arbitre;
	}
	
	public Date getDate() {
		return _date;
	}
	
	public Time getHeure() {
		return _heure;
	}
	
	public boolean getStatut() {
		return _statut;
	}
	
	public Equipe getEquipeDomicile() {
		return _equipeLocale;
	}
	
	public Equipe getEquipeExterieur() {
		return _equipeVisiteuse;
	}
	
	public Competition getCompetition() {
		return _competition;
	}
	
	public int getResultatEquipeDomicile() {
		return _scoreEquipeLocale;
	}
	
	public int getResultatEquipeExterieur() {
		return _scoreEquipeVisiteuse;
	}
	
	public Equipe getVainqueur() {
		return _vainqueur;
	}
	
	
	////////// SETTERS /////////////
	
	public void setArbitre(String arbitre) {
		_arbitre = arbitre;
	}
	
	public void setDate(Date date) {
		_date = date;
	}
	
	public void setHeure(Time heure) {
		_heure = heure;
	}
	
	public void setStatut(boolean statut) {
		_statut = statut;
	}
	
	public void setEquipeExterieur(Equipe equipeExterieur) {
		_equipeVisiteuse = equipeExterieur;
	}
	
	public void setEquipeDomicile(Equipe equipeDomicile) {
		_equipeLocale = equipeDomicile;
	}
	
	public void setCompetition(Competition competition) {
		_competition = competition;
	}
	
	public void setResultatEquipeDomicile(int resultatEquipeDomicile) {
		_scoreEquipeLocale = resultatEquipeDomicile;
	}
	
	public void setResultatEquipeExterieur(int resultatEquipeExterieur) {
		_scoreEquipeVisiteuse = resultatEquipeExterieur;
	}
	
	public void setVainqueur(Equipe vainqueur) {
		_vainqueur = vainqueur;
	}
	
	
	////////// METHODS /////////////
	
	public void afficher() {
		System.out.println("Référence : " + _ref);
		System.out.println("Arbitre : " + _arbitre);
		System.out.println("Date : " + _date);
		System.out.println("Time : " + _heure);
		System.out.println("Equipe locale  : " + _equipeLocale.getClub().getNom());
		System.out.println("Equipe visiteuse  : " + _equipeVisiteuse.getClub().getNom());
		System.out.println("Competition  : " + _competition.getNom());
		System.out.println("Statut  : " + (_statut == true ? "Terminé" : "A venir"));
		if(_statut == true) {
			System.out.println("Résultat :	" + _equipeLocale.getClub().getNom() + " " + _scoreEquipeLocale 
					+ " : " + _scoreEquipeVisiteuse + " " + _equipeVisiteuse.getClub().getNom());
			System.out.println("Vainqueur : " + _vainqueur.getClub().getNom());
		}
	}
	
	@Override
	public String toString() {
		return _ref + " | " + _arbitre + " | " + _date + " | " + _equipeLocale + " | " + _equipeVisiteuse + " | " + _competition + " | " + _statut;
	}
}
