```mermaid
sequenceDiagram
    Game->>Menu: Debut du tour
    Menu-->>Game: Afficher la position de Player
    Game->>Dés: Lancer le Dés
    Dés-->>Game: Player avance
    Menu->>Board: Afficher la Case correspondante
    Board-->>Game: Conséquence du choix
    Game->>Menu: Fin du  tour
```