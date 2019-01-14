# puissance4
Le but de ce mini projet est de développer un jeu de type Puissance 4 en mode texte pour deux joueurs.
Un squelette de code est donné juste pour vous aider à démarrer. Il contient
l'affichage du jeu en mode texte et est fourni.

## GIT
Toute la gestion du code source se fait à travers GIT, en utilisant le dépot associé
à la classroom GitHub. Les commits doivent se faire régulièrement et contenir un
message de commit pertinent.

### Branches
Le rendu final devra avoir au moins 3 branches
* master qui contient la version finale du logiciel
* bug qui contient une version où une grosse partie des tests unitaires échoue
* experimental qui contient des fonctionnalités expérimentales (voir après)

## Maven
Le logiciel devra se compiler avec Maven. Il faudra donc restructurer le code
existant très rapidement.
La configuration Maven devra aussi permettre de construire un jar executable.  

## Tests Unitaires
Toutes les classes/méthodes doivent être testées avec JUnit, sauf bien sur les méthodes
évidentes comme get/set.

## Fonctionnalités attendues
Une classe Demo devra exécuter une partie du début à la fin (victoire ou nulle) avec deux joueurs
non humains. La taille du plateau de jeu sera donné en paramètre.
Une partie se déroule en boucle comme suit :
* Le jeu est affiché
* Un des deux joueurs choisit une colonne (indiquez laquelle) aléatoirement
* Le jeu est affiché
* L'autre joueur fait pareil
Le jeu se termine quand un joueur a aligné 4 pions (horizontalement, verticalement ou en diagonal) ou quand il n'est plus possible de jouer.

## Fonctionnalités expérimentales
Au moins deux des fonctionnalités suivantes devront être implémentées dans la branche _experimental_
* Jeu entre humains en utilisant le clavier pour entrer une colonne à partir de 0.
* Variante du jeu où il faut aligner *N* jetons au lieu de 4. Le nombre *N* est donné optionnellement en paramètre au démarrage.
* Jeu automatique plus intelligent où chaque joueur applique une stratégie.

## Evaluation
L'évaluation portera avant tout sur l'utilisation des outils comme GIT, Maven et JUnit.
Le jeu lui-même ne fait pas partie de l'évaluation.
