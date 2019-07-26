## DevOpsProjet

# Première étape

La première chose à faire est de créé un container Jenkins, pour ça on va utiliser la commande:

`$ docker run -p 8080:8080 --name jenkins jenkins/jenkins:lts`

on va ensuite installé docker dans ce même container en se connectant en bash.

# Deuxième étape 

*je n'ai pas réussi cette étape, je vais expliquer comment je pense qu'elle devrait marcher.*

On va créer les pipelines, une pour chaque branche, pour ca on utilise l'interface de Jenkins. sur notre pipeline on va lui donner 
le lien git du projet et la branche qu'il doit utiliser. Grace au fichier jenkinsfile il va pouvoir remplir les paramètres qu'il a besoin et 
avoir les différentes commandes qu'il va executer pour le build du job. le fichier comporte un trigger qui va permetre de renseigner a la papeline de ce
lancer tous les heures. 

# Trosième étape 

Le start.sh va permetre de lancer le service des trois branche. Il va aller clone le git et lancer les containers des trois branches. Chaque version est sur un port http 
différent: 

>Version_1 -> port: 8080
>Version_2 -> port: 8081
>Version_3 -> port: 8082


