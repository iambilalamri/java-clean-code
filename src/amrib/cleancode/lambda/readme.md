### Section Of Collections
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