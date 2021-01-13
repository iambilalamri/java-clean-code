## Process
1. Un programme en cours d�ex�cution s�appelle un processus.
2. La communication entre deux processus est co�teuse et limit�e.
3. Le multit�che bas� sur les processus permet � un ordinateur d�ex�cuter deux ou plusieurs programmes simultan�ment (en meme temps), Ex: (run antivirus while playing music).
4. Chaque processus a son espace d�adressage distinct.
5. Les processus sont des t�che lourde.	
6. Vous travaillez sur un �diteur de texte, il fait r�f�rence � l�ex�cution d�un processus.

## Thread
1. Un thread est une petite partie d�un processus.
2. La communication entre deux threads est moins co�teuse que celle du processus.
3. Le multit�che bas� sur les threads permet � un programme unique d�ex�cuter deux threads ou plus simultan�ment.
4. Tous les threads d�un processus partagent le m�me espace d�adressage que celui d�un processus.
5. Les threads sont des t�ches l�g�res.
6. Vous imprimez un fichier � partir d�un �diteur de texte tout en travaillant dessus, ce qui ressemble � l�ex�cution d�un thread dans le processus.
7. Thread Schudler: It decides which thread to run and how long

## Concurrency
## Thread Safe
1. Le code thread-safe est un code qui fonctionnera m�me si de nombreux threads l'ex�cutent simultan�ment.
2. Un morceau de code est thread-safe s'il ne manipule que les structures de donn�es partag�es de mani�re � garantir une ex�cution s�re par plusieurs threads en m�me temps.