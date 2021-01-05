## Remark
T could not be a primitive type but wrapper or object. Wrapper: int -> Integer & float -> Float...

## Java Boxing vs Unboxing

1. Boxing: Converting primitive datatype to object.
2. Unboxing: Converting object (wrapper) to primitive datatype.


## Transient vs Volatile
Transcient: une variable d'instance est marquée comme transitoire pour indiquer à la JVM d'ignorer la variable particulière lors de la sérialisation de l'objet qui la contient. Ce modificateur est inclus dans l'instruction qui crée la variable, précédant la classe ou le type de données de la variable.

Volatile: le modificateur volatile est utilisé pour indiquer à la JVM qu'un thread accédant à la variable doit toujours fusionner sa propre copie privée de la variable avec la copie principale en mémoire.