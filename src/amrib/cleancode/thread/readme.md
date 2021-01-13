## Process
1. Un programme en cours d’exécution s’appelle un processus.
2. La communication entre deux processus est coûteuse et limitée.
3. Le multitâche basé sur les processus permet à un ordinateur d’exécuter deux ou plusieurs programmes simultanément (en meme temps), Ex: (run antivirus while playing music).
4. Chaque processus a son espace d’adressage distinct.
5. Les processus sont des tâche lourde.	
6. Vous travaillez sur un éditeur de texte, il fait référence à l’exécution d’un processus.

## Thread
1. Un thread est une petite partie d’un processus.
2. La communication entre deux threads est moins coûteuse que celle du processus.
3. Le multitâche basé sur les threads permet à un programme unique d’exécuter deux threads ou plus simultanément.
4. Tous les threads d’un processus partagent le même espace d’adressage que celui d’un processus.
5. Les threads sont des tâches légères.
6. Vous imprimez un fichier à partir d’un éditeur de texte tout en travaillant dessus, ce qui ressemble à l’exécution d’un thread dans le processus.
7. Thread Schudler: It decides which thread to run and how long

## Concurrency
## Thread Safe
1. Le code thread-safe est un code qui fonctionnera même si de nombreux threads l'exécutent simultanément.
2. Un morceau de code est thread-safe s'il ne manipule que les structures de données partagées de manière à garantir une exécution sûre par plusieurs threads en même temps.