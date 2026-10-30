# Achat — architecture microservices

Projet initial Spring Boot migré vers des services autonomes. Le code historique est conservé dans `legacy/achat`.

## Architecture

| Service | Port local | Responsabilité |
|---|---:|---|
| ms-api-gateway | 8080 | Entrée HTTP / routage |
| ms-platform | 8761 | Eureka service discovery |
| ms-product-service | 8081 | Produits, catégories, stocks |
| ms-supplier-service | 8082 | Fournisseurs, secteurs d'activité |
| ms-invoice-service | 8083 | Factures, détails, règlements |
| ms-auth-service | 8084 | Opérateurs |

Les références entre domaines sont stockées sous forme d'identifiants (`fournisseurId`, `produitId`, etc.) : aucune relation JPA inter-service. Chaque domaine possède son propre schéma MySQL.

## Démarrer rapidement

Prérequis : Docker Desktop + Docker Compose. À la racine :

```bash
docker compose up --build -d
```

- Gateway : http://localhost:8080
- Eureka : http://localhost:8761
- Actuator health : `/actuator/health` sur chaque service

## API

Les ressources suivent les endpoints REST :

- `GET/POST /products/api/produit` ; `GET/PUT/DELETE /products/api/produit/{id}`
- `GET/POST /products/api/categorieproduit` et `/products/api/stock`
- `GET/POST /suppliers/api/fournisseur` et `/suppliers/api/secteuractivite`
- `GET/POST /invoices/api/facture`, `/invoices/api/detailfacture`, `/invoices/api/reglement`
- `GET/POST /auth/api/operateur`

Exemple :
```bash
curl http://localhost:8080/products/api/produit
```

## Branches Git (alignées sur le workflow demandé)

`dev`, `feature/ms-api-gateway`, `feature/ms-auth-service`, `feature/ms-docker-compose`, `feature/ms-invoice-service`, `feature/ms-platform`, `feature/ms-product-service`, `feature/ms-supplier-service`, `prod`, `refactor/remove-monolith`, `test`.

## Notes de migration

- Le monolithe original est préservé dans `legacy/achat` pour référence et comparaison.
- Les services exposent des API REST CRUD et utilisent des bases séparées.
- Les relations entre services doivent être résolues via API/IDs ; les opérations métier distribuées (ex. validation facture + réservation stock) nécessitent ensuite des appels REST ou une orchestration événementielle.
- Avant production : ajouter authentification JWT, validation DTO, migrations Flyway, tests d'intégration, secrets externes et politiques CORS adaptées.
