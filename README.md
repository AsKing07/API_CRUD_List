# API_CRUD_List

## Description

Ce projet est une API (Application Programming Interface) qui permet de gérer une liste de produits. L'API offre des fonctionnalités pour créer, lire, mettre à jour et supprimer des produits de la liste.

## Prérequis

Avant de commencer, assurez-vous d'avoir effectué les étapes suivantes :

1. Avoir installé Wamp Server (ou tout autre serveur de base de données MySQL).
2. Avoir créé une base de données dans Wamp Server avec le même nom que celui renseigné dans le fichier `application.properties` (ici "tp").
3. Modifier les informations d'accès à la base de données dans le fichier `application.properties` avec vos propres informations.

## Installation et exécution de l'API

1. Cloner le projet à partir du dépôt GitHub.
2. Assurez-vous que le serveur Wamp est en cours d'exécution.
3. Exécutez l'API en utilisant un IDE compatible avec Java et Spring Boot, tel que Spring Tool Suite (STS).
4. L'API sera accessible à l'adresse `http://localhost:8080/produitApp/`.

## Endpoints de l'API

- `GET /produitApp/read`: Récupérer la liste de tous les produits.
- `POST /produitApp/create`: Créer un nouveau produit en spécifiant les détails dans le corps de la requête (format JSON).
- `PUT /produitApp/update/{id}`: Mettre à jour les informations d'un produit existant en spécifiant l'ID du produit dans l'URL et les nouvelles informations dans le corps de la requête (format JSON).
- `DELETE /produitApp/delete/{id}`: Supprimer un produit en spécifiant l'ID du produit dans l'URL.

## Exemple d'utilisation

1. Ouvrez Postman (ou tout autre outil de test d'API).
2. Exécutez la requête `GET http://localhost:8080/produitApp/read` pour récupérer la liste des produits (étant vide au départ).
3. Exécutez la requête `POST http://localhost:8080/produitApp/create` avec le corps de la requête pour créer un nouveau produit :
   ```
   {
       "nom": "Produit A",
       "prix": 100,
       "description": "Description du produit A",
       "devise": "EUR",
       "taxe": 10,
       "date_expiration": "2023-12-31",
       "fournisseur": "Fournisseur A"
   }
   ```
4. Vous pouvez maintenant utiliser les autres requêtes de l'API pour mettre à jour, supprimer ou ajouter d'autres produits.

## Remarque importante

Avant d'exécuter l'API pour la première fois, veuillez suivre les étapes suivantes :

1. Dans le fichier `application.properties`, modifiez la valeur de la propriété `spring.jpa.hibernate.ddl-auto` de "update" à "create-drop".
2. Exécutez l'API une fois pour créer les tables de la base de données.
3. Après la première exécution, rétablissez la valeur de la propriété `spring.jpa.hibernate.ddl-auto` à "update" dans le fichier `application.properties`.
   Cela est nécessaire, sinon à chaque fois que vous allez exécuter le projet, la table sera supprimée puis recréée à neuf, donc vide.
