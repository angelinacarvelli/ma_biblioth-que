# Ma bibliothèque — Base de données PostgreSQL

Projet de base de données **PostgreSQL** (`mabibliotheque`) contenant la table `livres` et un script d'initialisation (`init.sql`)[cite: 7, 13, 14].

## Structure du projet

```text
Ma bibliothèque/
├── init.sql     # Création de la table `livres` et insertion des livres au démarrage
└── README.md    # Documentation du projet

dans powershell terminal
& "C:\Program Files\PostgreSQL\17\bin\psql.exe" -h 127.0.0.1 -U postgres -d mabibliotheque

SELECT COUNT(*) FROM livres;
SELECT id, titre, auteur, annee_parution, image FROM livres ORDER BY id;