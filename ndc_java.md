# Cours de Java

## Introduction à Java

Java est un langage de programmation orienté objet largement utilisé, réputé pour sa portabilité et sa fiabilité. Il a été développé par Sun Microsystems (maintenant Oracle Corporation) et est désormais largement utilisé dans divers domaines tels que le développement d'applications web, mobiles et d'entreprise.

### Caractéristiques de Java :

- **Portabilité** : Les programmes Java peuvent être exécutés sur n'importe quelle plate-forme compatible Java sans nécessiter de modifications.
- **Sécurité** : Java offre un environnement sécurisé en utilisant un modèle de sécurité basé sur des classes sandbox.
- **Performance** : Grâce à la compilation JIT (Just-In-Time), les programmes Java peuvent atteindre des performances élevées.
- **Orienté objet** : Java est entièrement orienté objet, ce qui signifie que tout est un objet avec des méthodes et des champs.
- **Robustesse** : La gestion automatique de la mémoire, le contrôle des erreurs par des exceptions et le système de typage fort rendent Java robuste.

## Structure d'un Programme Java

Un programme Java est généralement constitué de plusieurs éléments :

- **Package** : Un moyen d'organiser les classes en groupes logiques.
- **Classe** : Une structure fondamentale d'un programme Java, contenant des champs (variables) et des méthodes (fonctions).
- **Méthodes** : Les actions que les objets de la classe peuvent effectuer.
- **Variables** : Des conteneurs pour stocker des données.
- **Expressions et Instructions** : Les instructions sont des actions exécutées par le programme, tandis que les expressions produisent une valeur.
- **Commentaires** : Des annotations dans le code pour expliquer son fonctionnement.

## Les Bases de Java

### Variables et Types de Données

Java est un langage fortement typé, ce qui signifie que chaque variable doit être déclarée avec un type spécifique.

```java
int age = 25;
String nom = "Jean";
double taille = 1.75;
```

# Types de données courants en Java :

- **Entiers** : byte, short, int, long
- **Décimaux** : float, double
- **Caractères** : char
- **Booléens** : boolean

# Opérateurs

Java prend en charge différents types d'opérateurs :

- **Arithmétiques** : +, -, *, /, %
- **Logiques** : && (ET logique), || (OU logique), ! (NON logique)
- **Comparaison** : ==, !=, >, <, >=, <=
- **Affectation** : =, +=, -=, *=, /=, %=
- **Incrémentation et Décrémentation** : ++, --

# Structures de Contrôle

Java propose diverses structures de contrôle pour contrôler le flux d'exécution du programme :

```java
if (condition) {
    // Code à exécuter si la condition est vraie
} else {
    // Code à exécuter si la condition est fausse
}
```
# Tableaux

Les tableaux en Java sont utilisés pour stocker plusieurs valeurs de même type sous un seul nom.

```java
int[] nombres = {1, 2, 3, 4, 5};
```

# Méthodes

Une méthode en Java est une collection d'instructions qui effectuent une tâche spécifique.

```java
public int additionner(int a, int b) {
    return a + b;
}
```

# Classes et Objets

En Java, tout est un objet. Une classe est un modèle à partir duquel des objets sont créés.

```java
public class Personne {
    String nom;
    int age;
    
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}
```

# Méthodes de Classe et d'Instance

- **Méthodes de Classe (Statiques)** : Associées à la classe elle-même, pas à une instance spécifique.
- **Méthodes d'Instance** : Associées à des instances spécifiques de la classe.

```java
public static void afficherMessage() {
    System.out.println("Bonjour !");
}

public void afficherDetails() {
    System.out.println("Nom: " + this.nom + ", Age: " + this.age);
}
```

# Conclusion

Java est un langage polyvalent et puissant qui est largement utilisé dans l'industrie du logiciel pour développer une grande variété d'applications. Sa robustesse, sa portabilité et sa facilité d'utilisation en font un choix populaire pour les développeurs du monde entier.

