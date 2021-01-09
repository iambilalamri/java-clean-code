### SECTION OF COLLECTIONS
## Interfaces
1. Iterable
2. Collection
3. List & Queue & Set

## Classes
1. ArrayList
2. PriorityQueue
3. Hashset
4. LinkedList

## Interface Consumer
Consumer est une interface fonctionnelle qui accepte une seule entr�e et ne renvoie aucune sortie

## Interface Supplier
Supplier est une interface simple qui indique que cette impl�mentation est un fournisseur de r�sultats. Cette interface, cependant, n'applique aucune restriction dont l'impl�mentation fournisseur a besoin pour renvoyer un r�sultat diff�rent � chaque appel.<br/>
Le fournisseur n'a qu'une seule m�thode get() et n'a pas d'autres m�thodes par d�faut et statiques.

## Interface Predicate
Une interface Predicate repr�sente une fonction � valeur bool�enne d'un argument. Ceci est principalement utilis� pour filtrer les donn�es d'un flux Java. La m�thode de filtrage d'un flux accepte un pr�dicat pour filtrer les donn�es et renvoyer un nouveau flux satisfaisant le pr�dicat. Un pr�dicat a une m�thode test () qui accepte un argument et renvoie une valeur bool�enne.

## Interface Function
Une interface Function est plus g�n�rique qui prend un argument et produit un r�sultat. Cela a une m�thode abstraite unique (SAM) qui accepte un argument de type T et produit un r�sultat de type R. L'un des cas d'utilisation courants de cette interface est la m�thode Stream.map.

## Stream
C�est une s�quence d��l�ments sur laquelle on peut effectuer un groupe d�op�rations de mani�re s�quentielle ou parall�le.

<br/>

## GENERICS

T could not be a primitive type but wrapper or object. Wrapper: int -> Integer & float -> Float...

## Java Boxing vs Unboxing

1. Boxing: Converting primitive datatype to object.
2. Unboxing: Converting object (wrapper) to primitive datatype.


## Transient vs Volatile
Transcient: une variable d'instance est marqu�e comme transitoire pour indiquer � la JVM d'ignorer la variable particuli�re lors de la s�rialisation de l'objet qui la contient. Ce modificateur est inclus dans l'instruction qui cr�e la variable, pr�c�dant la classe ou le type de donn�es de la variable.

Volatile: le modificateur volatile est utilis� pour indiquer � la JVM qu'un thread acc�dant � la variable doit toujours fusionner sa propre copie priv�e de la variable avec la copie principale en m�moire.

