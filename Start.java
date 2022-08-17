package federation_football;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Start {
	private static ArrayList<Club> _clubs = new ArrayList<Club>();
	private static ArrayList<Personne> _personnes = new ArrayList<Personne>();
	private static ArrayList<Equipe> _equipes = new ArrayList<Equipe>();
	private static ArrayList<Competition> _competitions = new ArrayList<Competition>();
	private static ArrayList<Match> _matchs = new ArrayList<Match>();
	
	
	///// METHODES D'AFFICHAGE DES MENUS /////

	public static int menuPrincipal() {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("1- Gérer les clubs");
		System.out.println("2- Gérer les personnes");
		System.out.println("3- Gérer les équipes");
		System.out.println("4- Gérer les compétitions");
		System.out.println("5- Gérer les matchs");
		System.out.println("6- Quitter");
		System.out.println("Votre choix ?");
		return s.nextInt();
	}
	
	public static int menuClub() {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("1- Liste des clubs");
		System.out.println("2- Chercher un club");
		System.out.println("3- Ajout d'un club");
		System.out.println("4- Supprimer un club");
		System.out.println("5- Afficher le nombre de clubs");
		System.out.println("6- Revenir au menu principal");
		System.out.println("7- Quitter");
		System.out.println("Votre choix ?");
		return s.nextInt();
	}
	
	public static int menuPersonne() {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("1- Liste des personnes");
		System.out.println("2- Chercher une personne");
		System.out.println("3- Ajouter une personne");
		System.out.println("4- Supprimer une personne");
		System.out.println("5- Afficher le nombre de personnes");
		System.out.println("6- Revenir au menu principal");
		System.out.println("7- Quitter");
		System.out.println("Votre choix ?");
		return s.nextInt();
	}
	
	public static int menuEquipe() {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("1- Liste des équipes");
		System.out.println("2- Chercher une équipe");
		System.out.println("3- Ajouter une équipe");
		System.out.println("4- Supprimer une équipe");
		System.out.println("5- Afficher le nombre d'équipes");
		System.out.println("6- Revenir au menu principal");
		System.out.println("7- Quitter");
		System.out.println("Votre choix ?");
		return s.nextInt();
	}
	
	public static int menuCompetition() {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("1- Liste des compétitions");
		System.out.println("2- Chercher une compétition");
		System.out.println("3- Ajouter une compétition");
		System.out.println("4- Supprimer une compétition");
		System.out.println("5- Afficher le nombre de compétitions");
		System.out.println("6- Ajouter un club dans une compétition");
		System.out.println("7- Revenir au menu principal");
		System.out.println("8- Quitter");
		System.out.println("Votre choix ?");
		return s.nextInt();
	}
	
	public static int menuMatch() {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("1- Liste des matchs");
		System.out.println("2- Chercher un match");
		System.out.println("3- Ajouter un match");
		System.out.println("4- Supprimer un match");
		System.out.println("5- Reporter un match");
		System.out.println("6- Enregistrer le résultat d'un match");
		System.out.println("7- Revenir au menu principal");
		System.out.println("8- Quitter");
		System.out.println("Votre choix ?");
		return s.nextInt();
	}
	
	
	///// METHODES D'ADMINISTRATION DES MENUS /////
	
	public static void demarrer() {
		int reponse;
		do {
			reponse = menuPrincipal();
			switch(reponse) {
			case 1 : 
				switchMenuClub();
				break;
			case 2 :
				switchMenuPersonne();
				break;
			case 3 :
				switchMenuEquipe();
				break;
			case 4 :
				switchMenuCompetition();
				break;
			case 5 :
				switchMenuMatch();
				break;
			case 6 :
				System.out.println("Merci d'avoir utiliser notre application");
				System.exit(0);
			default :
				System.out.println("La fonctionnalité demandée n'existe pas");
				break;
			}
		} while(reponse != 6);
	}
	
	public static void switchMenuClub() {
		int reponseClub;
		Club club;
		do {
			reponseClub = menuClub();
			switch (reponseClub) {
			case 1 : 
				afficherListeClubs();
				break;
			case 2 :
				club = chercherClub();
				if(club == null) System.out.println("Le club n'existe pas");
				else System.out.println(club);
				break;
			case 3 :
				ajouterClub();
				break;
			case 4 :
				club = chercherClub();
				if(club == null) System.out.println("Le club n'existe pas");
				else {
					supprimerClub(club);
					System.out.println("Le club a été supprimé");
				}
				break;
			case 5 : 
				afficherNombreClubs();
				break;
			case 6 : 
				demarrer();
				break;
			case 7 :
				System.out.println("Merci d'avoir utiliser notre application");
				System.exit(0);
			default:
				System.out.println("La fonctionnalité demandée n'existe pas");
				break;
			}
		} while (reponseClub != 7);
	}
	
	public static void switchMenuPersonne() {
		int reponsePersonne;
		Personne personne;
		do {
			reponsePersonne = menuPersonne();
			switch (reponsePersonne) {
			case 1 : 
				afficherListePersonnes();
				break;
			case 2 :
				personne = chercherPersonne();
				if(personne == null) System.out.println("La personne n'existe pas");
				else System.out.println(personne);
				break;
			case 3 :
				ajouterPersonne();
				break;
			case 4 :
				personne = chercherPersonne();
				if(personne == null) System.out.println("La personne n'existe pas");
				else {
					supprimerPersonne(personne);
					System.out.println("La personne a été supprimée");
				}
				break;
			case 5 : 
				afficherNombrePersonnes();
				break;
			case 6 : 
				demarrer();
				break;
			case 7 :
				System.out.println("Merci d'avoir utiliser notre application");
				System.exit(0);
			default:
				System.out.println("La fonctionnalité demandée n'existe pas");
				break;
			}
		} while (reponsePersonne != 7);
	}
	
	public static void switchMenuEquipe() {
		int reponseEquipe;
		Equipe equipe;
		do {
			reponseEquipe = menuEquipe();
			switch (reponseEquipe) {
			case 1 : 
				afficherListeEquipes();
				break;
			case 2 :
				equipe = chercherEquipe();
				if(equipe == null) System.out.println("L'équipe n'existe pas");
				else System.out.println(equipe);
				break;
			case 3 :
				ajouterEquipe();
				break;
			case 4 :
				equipe = chercherEquipe();
				if(equipe == null) System.out.println("L'équipe n'existe pas");
				else {
					supprimerEquipe(equipe);
					System.out.println("L'équipe a été supprimée");
				}
				break;
			case 5 : 
				afficherNombreEquipes();
				break;
			case 6 : 
				demarrer();
				break;
			case 7 :
				System.out.println("Merci d'avoir utiliser notre application");
				System.exit(0);
			default:
				System.out.println("La fonctionnalité demandée n'existe pas");
				break;
			}
		} while (reponseEquipe != 7);
	}
	
	public static void switchMenuCompetition() {
		int reponseCompetition;
		Competition competition;
		do {
			reponseCompetition = menuCompetition();
			switch (reponseCompetition) {
			case 1 : 
				afficherListeCompetitions();
				break;
			case 2 :
				competition = chercherCompetition();
				if(competition == null) System.out.println("La compétition n'existe pas");
				else System.out.println(competition);
				break;
			case 3 :
				ajouterCompetition();
				break;
			case 4 :
				competition = chercherCompetition();
				if(competition == null) System.out.println("La compétition n'existe pas");
				else {
					supprimerCompetition(competition);
					System.out.println("La compétition a été supprimé");
				}
				break;
			case 5 : 
				afficherNombreCompetitions();
				break;
			case 6 : 
				ajouterClubDansCompetition();
				break;
			case 7 : 
				demarrer();
				break;
			case 8 :
				System.out.println("Merci d'avoir utiliser notre application");
				System.exit(0);
			default:
				System.out.println("La fonctionnalité demandée n'existe pas");
				break;
			}
		} while (reponseCompetition != 8);
	}
	
	public static void switchMenuMatch() {
		int reponseMatch;
		Match match;
		do {
			reponseMatch = menuMatch();
			switch (reponseMatch) {
			case 1 : 
				afficherListeMatchs();
				break;
			case 2 :
				match = chercherMatch();
				if(match == null) System.out.println("Le match n'existe pas");
				else System.out.println(match);
				break;
			case 3 :
				ajouterMatch();
				break;
			case 4 :
				match = chercherMatch();
				if(match == null) System.out.println("Le match n'existe pas");
				else {
					supprimerMatch(match);
					System.out.println("Le match a été supprimé");
				}
				break;
			case 5 :
				match = chercherMatch();
				if(match == null) System.out.println("Le match n'existe pas");
				else if(match.getStatut() == true) System.out.println("Ce match a déjà été joué");
				else {
					reporterMatch(match);
					System.out.println("Le match a été reporté");
				}
				break;
			case 6 :
				match = chercherMatch();
				if(match == null) System.out.println("Ce match n'existe pas");
				else {
					enregistrerResultatMatch(match);
					System.out.println("Le résultat a été enregistré");	
				}
				break;
			case 7 : 
				demarrer();
				break;
			case 8 :
				System.out.println("Merci d'avoir utiliser notre application");
				System.exit(0);
			default:
				System.out.println("La fonctionnalité demandée n'existe pas");
				break;
			}
		} while (reponseMatch != 8);
	}
	
	
	///// CLUBS /////
	
	// Méthode pour afficher la liste des clubs -- > (switchMenuClub)
	public static void afficherListeClubs() {
		System.out.println("");
		System.out.println("La liste des clubs : ");
		for(Club club : _clubs) {
			club.afficher();
			System.out.println("---------------------");
		}
		if(_clubs.size() == 0) System.out.println("Pas de club à afficher");
	}
	
	// Méthode pour ajouter un club -- > (switchMenuClub)
	public static void ajouterClub() {
		String nom, adresseSiege, adresseEntrainement, mail, telephone, siteWeb;
		int anneeFondation;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez donner les informations du club : ");
		
		
		System.out.println("Nom : ");
		nom = s.nextLine();
		
		System.out.println("Adresse du siège : ");
		adresseSiege = s.nextLine();
		
		System.out.println("Adresse de l'entrainement : ");
		adresseEntrainement = s.nextLine();
		
		System.out.println("Mail : ");
		mail = s.nextLine();
		
		System.out.println("Téléphone : ");
		telephone = s.nextLine();
		
		System.out.println("Site web : ");
		siteWeb = s.nextLine();
		
		System.out.println("Année de fondation : ");
		anneeFondation = Integer.parseInt(s.nextLine());
		
		_clubs.add(new Club(nom, adresseSiege, adresseEntrainement, mail, telephone, anneeFondation, siteWeb));
		System.out.println(nom + "a été ajouté à la liste des clubs");
	}
	
	// Méthode de recherche d'un club -- > (switchMenuClub)
	public static Club chercherClub() {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Donner le numéro de référence du club :");
		num = s.nextInt();
		
		for(Club club : _clubs) {
			if(num == club.getRef()) {
				return club;
			}
		}
		return null;
	}
	
	// Méthode pour supprimer un club -- > (switchMenuClub)
	public static void supprimerClub(Club club) {
		_clubs.remove(club);
	}	
	
	// Méthode pour afficher le nombre des clubs -- > (switchMenuClub)
	public static void afficherNombreClubs() {
		System.out.println("Le nombre actuel des clubs est " + _clubs.size());
	}
	
	
	///// PERSONNES /////
	
	// Méthode pour afficher la liste des personnes -- > (switchMenuPersonne)
	public static void afficherListePersonnes() {
		System.out.println("");
		System.out.println("La liste des personnes : ");
		for(Personne personne : _personnes) {
			personne.afficher();
			System.out.println("---------------------");
		}
		if(_personnes.size() == 0) System.out.println("Pas de personne à afficher");
	}
	
	// Méthode pour ajouter une personne -- > (switchMenuPersonne)
	public static void ajouterPersonne() {
		String nom, prenom, adresse, mail, telephone, type, fonction, biographie, poste;
		int salaire, numero;
		Date dateNaissance, dateRecrutement;
		Club club;
		Equipe equipe;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez donner les informations de la personne : ");
		
		
		System.out.println("Nom : ");
		nom = s.nextLine();
		
		System.out.println("Prénom : ");
		prenom = s.nextLine();
		
		System.out.println("Adresse : ");
		adresse = s.nextLine();
		
		System.out.println("Mail : ");
		mail = s.nextLine();
		
		System.out.println("Téléphone : ");
		telephone = s.nextLine();
		
		do {
			System.out.println("Type : (joueur / staff)");
			type = s.nextLine();
		} while(!(type.toLowerCase().equals("joueur") || type.toLowerCase().equals("staff")));
		
		System.out.println("Date de naissance : ");
		dateNaissance = Date.valueOf(s.nextLine());
		
		System.out.println("Date de recrutement : ");
		dateRecrutement = Date.valueOf(s.nextLine());
		
		club = chercherClub();
		if(club == null) {
			System.out.println("Ce club n'existe pas");
			return;
		}
		
		switch (type) {
		case "staff" :
			System.out.println("Fonction : ");
			fonction = s.nextLine();
			
			System.out.println("Biographie : ");
			biographie = s.nextLine();
			
			System.out.println("Salaire : ");
			salaire = Integer.parseInt(s.nextLine());
			
			_personnes.add(new Staff(nom, prenom, adresse, mail, telephone, type, dateNaissance, dateRecrutement, club, fonction, biographie, salaire));
			break;
		case "joueur" :
			System.out.println("Poste : ");
			poste = s.nextLine();
			
			System.out.println("Numéro : ");
			numero = Integer.parseInt(s.nextLine());
			
			equipe = chercherEquipe();
			if(equipe == null) {
				System.out.println("Cette équipe n'existe pas");
				return;
			}
			
			_personnes.add(new Joueur(nom, prenom, adresse, mail, telephone, type, dateNaissance, dateRecrutement, club, poste, numero, equipe));
			break;
		default :
			System.out.println("Le type n'est pas reconnu");
			break;
		}
		System.out.println("Le " + type + " " + prenom + " " + nom + " a été ajouté à la liste des personnes");
	}
	
	// Méthode pour rechercher une personne -- > (switchMenuPersonne)
	public static Personne chercherPersonne() {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Donner le numéro d'identifiant de la personne :");
		num = s.nextInt();
		
		for(Personne personne : _personnes) {
			if(num == personne.getId()) {
				return personne;
			}
		}
		return null;
	}
	
	// Méthode pour supprimer une personne -- > (switchMenuPersonne)
	public static void supprimerPersonne(Personne personne) {
		_personnes.remove(personne);
	}	
	
	// Méthode pour afficher le nombre des personnes -- > (switchMenuPersonne)
	public static void afficherNombrePersonnes() {
		System.out.println("Le nombre actuel des personnes est " + _personnes.size());
	}
	
	
	///// EQUIPES /////
	
	// Méthode pour afficher la liste des équipes -- > (switchMenuEquipe)
	public static void afficherListeEquipes() {
		System.out.println("");
		System.out.println("La liste des équipes : ");
		for(Equipe equipe : _equipes) {
			equipe.afficher();
			System.out.println("---------------------");
		}
		if(_personnes.size() == 0) System.out.println("Pas d'équipe à afficher");
	}
	
	// Méthode pour rechercher une équipe -- > (switchMenuEquipe)
	public static Equipe chercherEquipe() {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Donner le numéro de référence de l'équipe :");
		num = s.nextInt();
		
		for(Equipe equipe : _equipes) {
			if(num == equipe.getRef()) {
				return equipe;
			}
		}
		return null;
	}
	
	// Méthode pour ajouter une équipe -- > (switchMenuEquipe)
	public static void ajouterEquipe() {
		String type, niveauLigue;
		Club club;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez donner les informations de l'équipe : ");
		
		
		System.out.println("Type : ");
		type = s.nextLine();
		
		System.out.println("Niveau de ligue : ");
		niveauLigue = s.nextLine();
		
		club = chercherClub();
		if(club == null) {
			System.out.println("Ce club n'existe pas");
			return;
		}
		
		_equipes.add(new Equipe(type, niveauLigue, club));
		System.out.println("L'équipe a été ajouté");
	}
	
	// Méthode pour supprimer une équipe -- > (switchMenuEquipe)
	public static void supprimerEquipe(Equipe equipe) {
		_equipes.remove(equipe);
	}	
	
	// Méthode pour afficher le nombre d'équipes -- > (switchMenuEquipe)
	public static void afficherNombreEquipes() {
		System.out.println("Le nombre actuel des équipes est " + _equipes.size());
	}
	
	
	///// COMPETITIONS /////
	
	// Méthode pour afficher la liste des compétitions -- > (switchMenuCompetition)
	public static void afficherListeCompetitions() {
		System.out.println("");
		System.out.println("La liste des compétitions : ");
		for(Competition competition : _competitions) {
			competition.afficher();
			System.out.println("---------------------");
		}
		if(_competitions.size() == 0) System.out.println("Pas de compétition à afficher");
	}
	
	// Méthode pour rechercher une compétition -- > (switchMenuCompetition)
	public static Competition chercherCompetition() {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Donner le numéro de référence de la compétition :");
		num = s.nextInt();
		
		for(Competition competition : _competitions) {
			if(num == competition.getRef()) {
				return competition;
			}
		}
		return null;
	}
	
	// Méthode pour ajouter une compétition -- > (switchMenuCompetition)
	public static void ajouterCompetition() {
		String nom, saison, type;
		int nombreEquipesAttendues, nombreEquipesQualifiees;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez donner les informations de la compétition : ");
		
		System.out.println("Nom : ");
		nom = s.nextLine();
		
		System.out.println("Saison : ");
		saison = s.nextLine();
		
		do {
			System.out.println("Type : (championnat / coupe)");
			type = s.nextLine();
		} while(!(type.toLowerCase().equals("championnat") || type.toLowerCase().equals("coupe")));
		
		System.out.println("Nombre d'équipes attendues : ");
		nombreEquipesAttendues = Integer.parseInt(s.nextLine());
		
		Competition competition = new Competition(nom, saison, type, nombreEquipesAttendues);
		_competitions.add(competition);
		
		System.out.println("Nombre d'équipes déjà qualifiées : ");
		nombreEquipesQualifiees = Integer.parseInt(s.nextLine());
		
		for(int i = 1; i <= nombreEquipesQualifiees; i++) {
			System.out.println("--- Club " + i + " ---");
			Club club = chercherClub();
			if(club == null) System.out.println("Le club n'existe pas");
			else competition.ajouterClub(club);
		}
		
		System.out.println("La compétition a été ajouté");
	}
	
	// Méthode pour ajouter un club dans une compétition -- > (switchMenuCompetition)
	public static void ajouterClubDansCompetition() {
		Competition competition;
		Club club;
		
		competition = chercherCompetition();
		if(competition == null) {
			System.out.println("Cette compétition n'existe pas");
			return;
		}
		
		club = chercherClub();
		if(club == null) {
			System.out.println("Ce club n'existe pas");
			return;
		}
		
		competition.ajouterClub(club);
		
		System.out.println("Le club a été ajouté à la compétition");
	}
	
	// Méthode pour supprimer une compétition -- > (switchMenuCompetition)
	public static void supprimerCompetition(Competition competition) {
		_competitions.remove(competition);
	}	
	
	// Méthode pour afficher le nombre d'équipes -- > (switchMenuCompetition)
	public static void afficherNombreCompetitions() {
		System.out.println("Le nombre actuel des compétitions est " + _competitions.size());
	}
	
	// Méthode pour supprimer un club dans une compétition -- > (switchMenuCompetition)
	public static void supprimerClubDansCompetition() {
		// TODO
	}
	
	
	///// MATCHS /////
	
	// Méthode pour afficher la liste des matchs -- > (switchMenuMatch)
	public static void afficherListeMatchs() {
		System.out.println("");
		System.out.println("La liste des matchs : ");
		for(Match match : _matchs) {
			match.afficher();
			System.out.println("---------------------");
		}
		if(_matchs.size() == 0) System.out.println("Pas de match à afficher");
	}
	
	// Méthode pour rechercher un match -- > (switchMenuMatch)
	public static Match chercherMatch() {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Donner le numéro de référence du match :");
		num = s.nextInt();
		
		for(Match match : _matchs) {
			if(num == match.getRef()) {
				return match;
			}
		}
		return null;
	}
	
	// Méthode pour ajouter un match -- > (switchMenuMatch)
	public static void ajouterMatch() {
		String arbitre;
		Date date;
		Time heure;
		Equipe equipeLocale, equipeVisiteuse;
		Competition competition;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez donner les informations du match : ");
		
		System.out.println("Arbitre : ");
		arbitre = s.nextLine();
		
		System.out.println("Date : ");
		date = Date.valueOf(s.nextLine());
		
		System.out.println("Heure : ");
		heure = Time.valueOf(s.nextLine());
		
		System.out.println("-- Locaux --");
		equipeLocale = chercherEquipe();
		if(equipeLocale == null) {
			System.out.println("Cette équipe n'existe pas");
			return;
		}
		
		System.out.println("-- Visiteurs --");
		equipeVisiteuse = chercherEquipe();
		if(equipeVisiteuse == null) {
			System.out.println("Cette équipe n'existe pas");
			return;
		}
		
		competition = chercherCompetition();
		if(competition == null) {
			System.out.println("Cette compétition n'existe pas");
			return;
		}
		
		_matchs.add(new Match(arbitre, date, heure, equipeLocale, equipeVisiteuse, competition));
	}
	
	// Méthode pour supprimer un match -- > (switchMenuMatch)
	public static void supprimerMatch(Match match) {
		_matchs.remove(match);
	}
	
	// Méthode pour reporter un match -- > (switchMenuMatch)
	public static void reporterMatch(Match match) {
		Date date;
		Time heure;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez remplir les informations : ");
		
		do {
			System.out.println("Date : ");
			date = Date.valueOf(s.nextLine());
			if(date.before(match.getDate())) System.out.println("Donnez une date postérieure à la date initiale");
		} while(date.before(match.getDate()));
		
		System.out.println("Heure : ");
		heure = Time.valueOf(s.nextLine());
		
		match.setDate(date);
		match.setHeure(heure);
	}

	// Méthode pour enregistrer le résultat d'un match -- > (switchMenuMatch)
	public static void enregistrerResultatMatch(Match match) {
		Equipe equipeLocale, equipeVisiteuse, vainqueur;
		int scoreEquipeLocale, scoreEquipeVisiteuse;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez remplir les informations : ");
		
		equipeLocale = match.getEquipeDomicile();
		equipeVisiteuse = match.getEquipeExterieur();
		
		System.out.println("Score de l'équipe locale : ");
		scoreEquipeLocale = Integer.parseInt(s.nextLine());
		
		System.out.println("Score de l'équipe visiteuse : ");
		scoreEquipeVisiteuse = Integer.parseInt(s.nextLine());
		
		if(match.getCompetition().getType().toLowerCase().equals("coupe")) {
			System.out.println("Equipe qualifiée : (" + equipeLocale.getRef() + " / " + equipeVisiteuse.getRef() + ")");
			vainqueur = chercherEquipe();
			if(vainqueur != equipeLocale && vainqueur != equipeVisiteuse) {
				System.out.println("Mauvais choix d'équipe");
				return;
			}
			match.setVainqueur(vainqueur);
		}
		
		match.setResultatEquipeDomicile(scoreEquipeLocale);
		match.setResultatEquipeExterieur(scoreEquipeVisiteuse);
		match.setStatut(true);
		
		System.out.println(equipeLocale.getClub().getNom() + " " + scoreEquipeLocale + " : " + scoreEquipeVisiteuse + " " + equipeVisiteuse.getClub().getNom());
	}
	
	
	
	
	///// MAIN /////
	
	public static void main(String[] args) {
		Club asse = new Club("AS Saint-Etienne", "14 Rue Paul et Pierre Guichard, 42000 Saint-Étienne", "589 Rue de Verdun, 42580 L'Etrat", "secretariat.club@asse.fr", "04 77 92 31 70", 1933, "https://www.asse.fr");
		Club psg = new Club("Paris Saint Germain", "24 rue du Commandant Guilbaud, 75016 Paris", "Avenue du Président John Fitzgerald Kennedy, 76100 Saint-Germain-en-Laye", "recrutement@psg.fr", "01 47 43 71 71", 1970, "https://www.psg.fr");
		_clubs.add(asse);
		_clubs.add(psg);
		
		Competition ligue1 = new Competition("Ligue 1", "2022/2023", "Championnat", 20);
		Competition coupeDeFrance = new Competition("Coupe de France", "2022/2023", "Coupe", 5888);
		_competitions.add(ligue1);
		_competitions.add(coupeDeFrance);
		
		psg.ajouterCompetition(ligue1);
		psg.ajouterCompetition(coupeDeFrance);
		asse.ajouterCompetition(ligue1);
		
		ligue1.ajouterClub(psg);
		ligue1.ajouterClub(asse);

		Equipe asse1 = new Equipe("Equipe première", "Ligue 1", asse);
		Equipe psg1 = new Equipe("Equipe première", "Ligue 1", psg);
		_equipes.add(asse1);
		_equipes.add(psg1);
		
		Personne messi = new Joueur("Messi", "Lionel", "55 rue du Faubourg Saint-Honoré, 75008 Paris", "leomessi@outlook.fr", "07 54 13 87 55", "joueur", Date.valueOf("1987-06-24"), Date.valueOf("2021-07-11"), psg, "Attaquant droit", 10, psg1);
		Personne franck = new Joueur("Thevenin", "Franck", "2 Hauts de Marcouville, 95300 Pontoise", "franckt@hotmail.com", "07 54 91 92 05", "joueur", Date.valueOf("1990-10-23"), Date.valueOf("2022-07-24"), psg, "Buteur", 9, psg1);
		Personne zidane = new Staff("Zinedine", "Zidane", "1 rue de la Victoire, 13006 Marseille", "zinedinez@gmail.com", "06 24 17 13 05", "staff", Date.valueOf("1972-06-23"), Date.valueOf("2022-07-13"), psg, "Entraineur", "Marseillais venu prendre une LDC avec le PSG après avoir tout gagné dans sa carrière", 200000);
		_personnes.add(messi);
		_personnes.add(franck);
		_personnes.add(zidane);

		Match finaleCoupeDeFrance = new Match("Clément Turpin", Date.valueOf("2022-08-14"), Time.valueOf("21:000:00"), asse1, psg1, coupeDeFrance);
		_matchs.add(finaleCoupeDeFrance);
		
		demarrer();
	}

}
