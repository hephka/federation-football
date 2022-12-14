# Gestion d'une fédération de football

## Introdution

Cette application en ligne de commande est développée en Java.
Ce travail est effecté dans le cadre de ma formation de concepteur web supervisé par mon formateur : Mr Essadik.
J'ai choisi de représenter une fédération de football car ce sport me passonne depuis petit, ce qui m'a aidé a travaillé en dehors de mes heures de formation.

Le projet représente vulgairement une fédération de football, le but étant de montrer mes compétences acquises au cours de mon premier mois de formation, et non de resrtucturer la fédération française de football.


## Modélisation

### Diagramme de classe

Pour illustrer ce à quoi devrait ressembler le programme j'ai modélisé les classes de notre système ainsi que leurs objets à l'aide d'un diagramme de classe. Ceci va nous permettre de décrire le système en visualisant les différents types d’objets au sein d’un système et les types de relations statiques qui existent entre eux. Il illustre également les opérations et les attributs des classes.

<img width="679" alt="DC_Federation_Football" src="https://user-images.githubusercontent.com/65901064/184361172-d6564055-8fba-4cc5-904c-3545b1ad8d21.png">

### Classes et objets

Dans notre cas nous avons les classes "Club", "Equipe", "Competition", "Match", "Personne", "Joueur" et "Staff".
Chaque classe possède ses propres attributs et méthodes.
Nous nous servirons de ses classes pour instancier nos objets.

### Attributs

Nos attributs une visibilité ("-" : private, "+" : public, "#" : protected), un nom (ref, nom, adresse...) et un type (Integer, String, Boolean...).

Nous remarquons que l'attribut "count" de nos classes est souligné. C'est un attribut de classe, il garde une valeur partagée par toutes les instances de la classe.

Il existe aussi les attributs dérivés précédés d'un "/" qui peuvent être calculés à partir d'autres attributs. Ici nous aurions pu ajouter un attribut "dateCourante" dans "Personne" pour écrire un attribut dérivé "/ age : Integer" qui aurait été le calcul d'une opération entre "dateNaissance" et "dateCourante".

### Méthodes

Les méthodes décrivent les éléments individuels d'un comportement que l'on peut invoquer.
Ce sont des fonctions qui peuvent prendre des valeurs en entrée et modifier les attributs ou produire des résultats.

Les méthodes possèdent, comme les attributs, une visibilité, et peuvent également être des méthodes de classe. Si nous voulions créer une méthode "getCount()" elle serait soulignée tout comme l'attribut "count".

Une méthode est dite abstraite lorsqu'on connaît sa signature, mais pas la manière dont elle peut être réalisée. 
Dans notre cas la classe "Personne" est abstraite car une "Personne" est soit un Joueur soit un "Staff". On ne peut instancier une classe abstraite.

### Interfaces

L’interface permet de regrouper un ensemble de propriétés et d'opérations assurant un service cohérent. Elle n'est pas visible dans notre diagramme de classe, c'est notre "Start.java", là où va s'exécuter notre "main".
Par définition toutes les méthodes d’une interface sont abstraites.

### Associations

Une association est une relation entre deux classes (association binaire) ou plus (association n-aire), qui décrit les connexions structurelles entre leurs instances. Elle indique donc qu'il peut y avoir des liens entre des instances des classes associées.

Notre diagramme est assez simple, nous n'utilisons que des associations binaires. Nous reviendrons sur d'autres concepts d'associations comme l'association n-aire, les dépendances, et la navigabilité dans un autre projet.

Dans une association binaire, la multiplicité sur la terminaison cible contraint le nombre d'objets de la classe cible pouvant être associés à un seul objet donné de la classe source ("1", "\*"...).
Ici une compétition peut contenir plusieurs clubs et à l'inverse un club peut participer à plusieurs compétitions, d'où la cardinalité "\*" de chaque côté de l'association.

Une classe-association possède les caractéristiques des associations et des classes : elle se connecte à deux ou plusieurs classes et possède également des attributs et des opérations.
Nous n'en utilisons pas dans ce projet mais si vous voulions aller plus loin nous pourrions créer une classe association "DetailsMatch" entre "Match" et "Equipe" ou entre "Match" et "Joueur" qui nous permettrait de récupérer les statistiques de ces derniers durant un match.

Pour compléter nous avons aussi l'agrégation, la composition, et l'association. Elles peuvent être visibles dans le diagramme de classe mais j'ai fait le choix de ne pas utiliser ces signes distinctifs, l'important étant de comprendre son fonctionnement.

### Héritage

L'héritage permet de définir les relations sous- Classe/Super-Classe. Il symbolise la relation “est un” / “is a”.
Nous constatons bien dans notre fédération qu'un "Joueur" est une "Personne" tout comme un "Staff".
Les sous-Classes hériteront de tout les attributs et de toutes les méthodes de la super-Classe.


## Programmation


## Conclusion
