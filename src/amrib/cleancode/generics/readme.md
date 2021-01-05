## Remark
T could not be a primitive type but wrapper or object. Wrapper: int -> Integer & float -> Float...

## Java Boxing vs Unboxing

1. Boxing: Converting primitive datatype to object.
2. Unboxing: Converting object (wrapper) to primitive datatype.


## Transient vs Volatile
Transcient: une variable d'instance est marqu�e comme transitoire pour indiquer � la JVM d'ignorer la variable particuli�re lors de la s�rialisation de l'objet qui la contient. Ce modificateur est inclus dans l'instruction qui cr�e la variable, pr�c�dant la classe ou le type de donn�es de la variable.

Volatile: le modificateur volatile est utilis� pour indiquer � la JVM qu'un thread acc�dant � la variable doit toujours fusionner sa propre copie priv�e de la variable avec la copie principale en m�moire.