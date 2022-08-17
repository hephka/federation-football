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

### Prise en main

Pour faciliter la prise en main de l'application j'ai écrit ces quelques lignes dans le "main" pour ne pas partir d'un programme vierge.

<img width="1127" alt="support1" src="https://user-images.githubusercontent.com/65901064/185021271-127a5eb5-3988-4ad7-88cc-d98e435e08d1.png">

Vous n'avez plus qu'à lancer le programme afin d'intéragir avec ce dernier en utilisant les lignes de commandes.

<img width="250" alt="support2" src="https://user-images.githubusercontent.com/65901064/185021792-50312126-2bd8-4f87-b5fc-6353e90152d0.png">

### Classes

<img width="241" alt="Capture d’écran 2022-08-17 à 11 36 03" src="https://user-images.githubusercontent.com/65901064/185087549-a440d8e4-a1d7-4508-9007-967e2c20267d.png">


### Variables

<img width="313" alt="Capture d’écran 2022-08-17 à 11 39 29" src="https://user-images.githubusercontent.com/65901064/185087709-2976e8fe-f74e-47ba-a329-d0996d692cba.png">


### Constructeurs

<img width="488" alt="Capture d’écran 2022-08-17 à 11 39 37" src="https://user-images.githubusercontent.com/65901064/185087760-5090ca31-5f2c-45fb-85f7-f4459f6f5b04.png">


### Getters/Setters

<img width="290" alt="Capture d’écran 2022-08-17 à 11 39 45" src="https://user-images.githubusercontent.com/65901064/185087802-ceaac083-92f8-465e-af4d-5a3246ab9523.png">

<img width="290" alt="Capture d’écran 2022-08-17 à 11 39 45" src="https://user-images.githubusercontent.com/65901064/185087962-d83a512f-77d5-43fe-a7fb-b30f77b81499.png">


### Méthodes (classes)

<img width="563" alt="Capture d’écran 2022-08-17 à 11 48 37" src="https://user-images.githubusercontent.com/65901064/185089217-8bad5e5b-2234-4d08-ac76-0cd376fbf4c5.png">


### Executable

<img width="242" alt="Capture d’écran 2022-08-17 à 12 28 33" src="https://user-images.githubusercontent.com/65901064/185098017-07206314-d6e2-4270-9238-fddeff0d797b.png">


<img width="652" alt="Capture d’écran 2022-08-17 à 12 03 54" src="https://user-images.githubusercontent.com/65901064/185093681-21ad17fd-0b82-4ceb-b823-545da3781a54.png">


<img width="473" alt="Capture d’écran 2022-08-17 à 12 04 02" src="https://user-images.githubusercontent.com/65901064/185093805-a701f63c-b26c-422e-b4ec-30a5eff732df.png">


<img width="600" alt="Capture d’écran 2022-08-17 à 12 04 58" src="https://user-images.githubusercontent.com/65901064/185093868-09b07706-f6f0-4142-a4c1-5bba90b1b6d1.png">


<img width="544" alt="Capture d’écran 2022-08-17 à 12 05 49" src="https://user-images.githubusercontent.com/65901064/185093573-9f40c3d6-e280-4d4b-8a63-1f823f0b584b.png">


<img width="353" alt="Capture d’écran 2022-08-17 à 12 06 01" src="https://user-images.githubusercontent.com/65901064/185094384-ec41de7f-39ef-4a7e-bba0-0e01008bd9bd.png">


<img width="597" alt="Capture d’écran 2022-08-17 à 12 23 13" src="https://user-images.githubusercontent.com/65901064/185098150-758d0ade-4459-4f4c-a692-239d6c8856cc.png">


<img width="597" alt="Capture d’écran 2022-08-17 à 12 23 13" src="https://user-images.githubusercontent.com/65901064/185098280-dbb393ca-1676-4daa-87ac-b5d0f2723513.png">


<img width="546" alt="Capture d’écran 2022-08-17 à 12 23 30" src="https://user-images.githubusercontent.com/65901064/185098408-6f36ea6e-dd77-4217-82a7-a63fe44f4768.png">


<img width="728" alt="Capture d’écran 2022-08-17 à 12 25 12" src="https://user-images.githubusercontent.com/65901064/185099516-d8b3a869-aa2f-4fe8-a00a-df2741727535.png">


<img width="477" alt="Capture d’écran 2022-08-17 à 12 23 52" src="https://user-images.githubusercontent.com/65901064/185098577-8f65a196-b200-4c35-a3c8-39da762cc7e7.png">


<img width="623" alt="Capture d’écran 2022-08-17 à 12 24 06" src="https://user-images.githubusercontent.com/65901064/185098633-4f07f867-1bc6-4a00-87ec-395da46eba44.png">


<img width="818" alt="Capture d’écran 2022-08-17 à 12 38 41" src="https://user-images.githubusercontent.com/65901064/185099171-b58ce25f-95b8-411e-8724-da321398dbf0.png">


<img width="874" alt="Capture d’écran 2022-08-17 à 12 26 41" src="https://user-images.githubusercontent.com/65901064/185099231-05ff4f8f-0ef6-4650-98c6-b2556554bcc3.png">



## Conclusion
