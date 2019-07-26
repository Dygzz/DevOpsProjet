#!/bin/bash

git clone https://github.com/Dygzz/DevOpsProjet.git

cd DevOpsProjet
# lancement de la première version
git checkout Version_1
docker-compose up

# lancement de la deuxième version 
git checkout Version_2
docker-compose up

#lancement de la troisième version
git checkout Version_3
docker-compose up 