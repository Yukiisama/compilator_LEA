# compilator_LEA

Le projet consiste à analyser ce langage impératif et à le traduire en code intermédiaire.
Dans une seconde partie, qui sera donnée dans environ dix jours, nous dirons comment générer
le code pour une machine Y86.



Travail à réaliser
1. Un analyseur lexical du langage Léa. Outre que cet analyseur doit reconnaı̂tre l’ensemble des
tokens utilisés pour l’analyse syntaxique, il devra aussi reconnaı̂tre et encoder correctement :
— Les commentaires de type C (/* */)
— Les commentaires de type C++ (//)
— Les littéraux integer codés en décimal et en hexadécimal (i.e. 0x1CFE)
— Les chaı̂nes de caractères écrites entre ".
Cet analyseur lexical conservera le numéro de ligne, le numéro de colonne pour d’éventuels
messages d’erreur.
2. Compléter l’analyseur syntaxique pour le langage Léa.
Cette fonction teste que le texte est bien engendré par la grammaire de Léa et envoie un
message d’erreur précis dans le cas contraire.
3. Un analyseur sémantique pour Léa
Chaque expression doit avoir un type bien formé : l’analyseur sémantique envoie un message
explicite en cas de mauvaise formation d’un type, et construit le typage des expressions dans
le cas contraire.
L’analyseur construit une table de symboles pour
— Les définitions de types
— Les variables globales
— Les fonctions et les procédures
— Les variables locales
4. Un compilateur de Léa vers le code intermédiaire