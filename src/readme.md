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
Consumer est une interface fonctionnelle qui accepte une seule entrée et ne renvoie aucune sortie

## Interface Supplier
Supplier est une interface simple qui indique que cette implémentation est un fournisseur de résultats. Cette interface, cependant, n'applique aucune restriction dont l'implémentation fournisseur a besoin pour renvoyer un résultat différent à chaque appel.<br/>
Le fournisseur n'a qu'une seule méthode get() et n'a pas d'autres méthodes par défaut et statiques.

## Interface Predicate
Une interface Predicate représente une fonction à valeur booléenne d'un argument. Ceci est principalement utilisé pour filtrer les données d'un flux Java. La méthode de filtrage d'un flux accepte un prédicat pour filtrer les données et renvoyer un nouveau flux satisfaisant le prédicat. Un prédicat a une méthode test () qui accepte un argument et renvoie une valeur booléenne.

## Interface Function
Une interface Function est plus générique qui prend un argument et produit un résultat. Cela a une méthode abstraite unique (SAM) qui accepte un argument de type T et produit un résultat de type R. L'un des cas d'utilisation courants de cette interface est la méthode Stream.map.

## Stream
C’est une séquence d’éléments sur laquelle on peut effectuer un groupe d’opérations de manière séquentielle ou parallèle.

<br/>

## GENERICS

T could not be a primitive type but wrapper or object. Wrapper: int -> Integer & float -> Float...

## Java Boxing vs Unboxing

1. Boxing: Converting primitive datatype to object.
2. Unboxing: Converting object (wrapper) to primitive datatype.


## Transient vs Volatile
Transcient: une variable d'instance est marquée comme transitoire pour indiquer à la JVM d'ignorer la variable particulière lors de la sérialisation de l'objet qui la contient. Ce modificateur est inclus dans l'instruction qui crée la variable, précédant la classe ou le type de données de la variable.

Volatile: le modificateur volatile est utilisé pour indiquer à la JVM qu'un thread accédant à la variable doit toujours fusionner sa propre copie privée de la variable avec la copie principale en mémoire.

