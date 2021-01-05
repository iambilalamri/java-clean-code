## Exceptions

Une exception est une erreur produite durant l'ex�cution de votre programme. S�mantiquement parlant.<br/>
La chose la plus importante � comprendre c'est qu'en cas de d�clenchement d'exception (d'erreur) le programme passe dans un mode d'ex�cution particulier : il faut qu'il trouve un gestionnaire d'erreur (un bloc d'instruction try / catch)

1. Handling exception
2. Custom exception
3. Chaining exception

## Checked vs Unchecked vs Error

## Exception Hierarchy
Java.lang.Object -> Throwable -> (Exception, Error)
1. Exception (checked) -> RuntimeException (unchecked) -> NullPointerException<br/>
2. Error	