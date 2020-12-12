# Application console de chronomètre (possibilité d'avoir plusieurs chrono en même temps).
## Problèmatique
Pour créer un chronomètre, vous devez utiliser une boucle.
Et pour obtenir un deuxième chronomètre, vous devez attendre la fin du boucle du premier chronomètre.
Donc on ne peut pas avoir plusieurs chronomètre en même temps par cette méthode.

## Solution proposée
#### Pour execuetr plusieurs chronomètres en même temps dans java, nous pouvons utiliser une classe déjà construite en Java appelé Thread.
Un thread est une unité d'exécution faisant partie d'un programme. Cette unité fonctionne de façon autonome et parallèlement à d'autres threads. Le principal avantage des threads est de pouvoir répartir différents traitements d'un même programme en plusieurs unités distinctes pour permettre leurs exécutions "simultanées".

## Démonstration

#### On va créer une classe Chrono qui hérite du Thread, par la suite vous devez écrire le code du chrono dans le corps d'une methode overriden appelé run(), finalement vous devez créer un objet du classe Chrono et le démarrer par "objet.start();"
#### Pour créer un autre chronomètre, créez simplement un autre objet et exécutez-le.
## Chrono obj1 = new Chrono();
## Chrono obj2 = new Chrono();
## obj1.start();
## obj2.start();
