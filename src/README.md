# Backend - Java (Spring Boot)

## Introduction

Ce projet backend est développé en **Java** avec le framework **Spring Boot**. Il expose des API REST permettant de gérer des transactions (ajouter, supprimer, modifier) et de fournir des informations sur les utilisateurs ou les soldes.

---

## Prérequis

Avant de démarrer l'application backend, vous devez avoir installé les outils suivants :

- **Java 17 ou supérieur** (recommandé)
  - Vérifiez votre version de Java avec la commande suivante :
    ```bash
    java -version
    ```

- **Maven** (ou **Gradle**, selon votre gestionnaire de dépendances)
  - Vérifiez l'installation de Maven avec :
    ```bash
    mvn -v
    ```

- **IDE** comme **IntelliJ IDEA** ou **Eclipse** pour la gestion du code source (facultatif mais recommandé).

---

## Installation

### Étape 1 : Cloner le Repository

Clonez le projet depuis votre dépôt Git :

git clone https://votre-repository-url.git
cd nom_du_projet
Étape 2 : Installer les Dépendances
Si vous utilisez Maven, vous pouvez télécharger les dépendances via la commande suivante :mvn install
Si vous utilisez Gradle, exécutez :gradle build
Les dépendances nécessaires seront alors téléchargées et installées.

Étape 3 : Configurer le fichier application.properties
Le fichier application.properties contient les configurations de votre application. Vous devez vérifier ou ajuster certains paramètres comme l'URL de la base de données ou les configurations de sécurité.

Localisez le fichier src/main/resources/application.properties.
Modifiez les configurations de la base de données, si nécessaire (ex. pour utiliser une base de données locale comme H2, MySQL, PostgreSQL, etc.).
Exemple pour une base de données MySQL :

properties
Copier le code
spring.datasource.url=jdbc:mysql://localhost:3306/nom_de_la_base
spring.datasource.username=utilisateur
spring.datasource.password=motdepasse
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Démarrer l'application
Démarrer avec Maven
Si vous utilisez Maven, vous pouvez démarrer le backend avec la commande suivante :mvn spring-boot:run

Cela va démarrer votre application Spring Boot en mode développement et l'exposer sur le port par défaut 8080.

Démarrer avec Gradle
Si vous utilisez Gradle, exécutez la commande suivante :
gradle bootRun
L'application sera alors disponible sur le même port (8080 par défaut).



Dépendances
Le projet utilise plusieurs dépendances pour faciliter le développement :

Spring Boot : Framework Java pour construire des applications web et des API REST.
Spring Data JPA : Pour l'intégration avec les bases de données relationnelles.
Spring Security : Pour sécuriser l'accès à l'API (facultatif).
MySQL/PostgreSQL : Système de gestion de base de données (si utilisé).
H2 : Base de données en mémoire (utilisée pour le développement local).
Lombok : Pour réduire le boilerplate code dans les entités (getters, setters, etc.).
Commandes
Voici quelques commandes utiles pour gérer le backend :

Démarrer l'application :

mvn spring-boot:run
Générer le fichier JAR pour la production :

mvn clean package
Cette commande crée un fichier JAR dans le dossier target/, qui peut être déployé sur un serveur.

API
Endpoints disponibles :
GET /api/transactions

Récupère la liste de toutes les transactions.
POST /api/transactions

Ajoute une nouvelle transaction.
PUT /api/transactions/{id}

Met à jour une transaction existante.
DELETE /api/transactions/{id}

Supprime une transaction.
Pour plus de détails sur les paramètres et les réponses, consultez la documentation des API dans le code source.

