# Cours de Programmation orientée-objet - Semaine 1, Cours 1


## Contenu du cours


### Structure d'un programme en Java
**Fichier** : <*MonProgramme.java*>
```java
// Le "package" est le chemin d'accès vers le fichier
package com.atoudeft;

// Remarque: Le nom de la classe est exactement le même que le nom du fichier Java
public class MonProgramme {
    public static void main(String[] args) {
        // Donnees
        // Traitements
    }
}
```


### Données
Une donnée peut être **simple** (**primitive**) :
- Âge d'une personne : `26` => Nombre entier.
- Prix d'une banane : `0.67` => Nombre réel.
- Catégorie d'un permis de conduire : `B` => Caractère.
- Dossier d'instription complet : `Vrai` (ou `Faux`) => Booléen.

Une donnée peut être **composée** :
- Liste des notes obtenues par un groupe à un examen : `[63.2, 82.1, 79.0, 55.6]` => Tableau de Nombres réels.
- Nom d'une personne : `"Annie Dupont"` => Chaîne de Caractères.
- Compte bancaire `numéro de compte, titulaire, solde, ...` => Enregistrement/Objet.


#### Déclarations, Identificateurs, Types de données
Types de données primitifs du langage Java :

| Type | Taille en mémoire | Plage de valeurs |
|:----:|:-----------------:|:----------------:|
| byte | 1 octet | -128 à 127 |
| short | 2 octets | -32768 à 32767 |
| **`int`** | **`4 octets`** | **`-2147483648 à 2147483647`** |
| long | 8 octets | ± 9223372036854775808 |
| float | 4 octets | ± 3.40282347e+38 |
| **`double`** | **`8 octets`** | **`± 1.79769313486231570e+308`** |
| **`char`** | **`2 octets`** | **`Caractère Unicode`** |
| **`boolean`** | - | **`true`**/**`false`** |


#### Déclarations, Identificateurs, Types de données
Déclarations en Java :
* Synthaxe : **`type`**`identificateur;`
    * Le *type* est le [type de la donnée](#déclarations-identificateurs-types-de-données).
    * L'identificateur est le nom qu'on donne à la variable.
    * On termine la déclaration par un `;`.

* Exemples :
    * ```java
        float prixBananes;
      ```
    * ```java
        int age;
      ```
    * ```java
        boolean dossierComplet;
      ```
    * ```java
        char categoriePermis;
      ```

On peut aussi déclarer plusieurs données de même type d’un coup.
* Exemples :
    * ```java
        float noteIntra, noteFinal, moyenne;
      ```
    * ```java
        int ageMinimum, nombreEtudiants;
      ```

Initialisation : *fournir une valeur à la donnée à sa déclaration*.
* Exemples :
    * ```java
        int age = 26, nombreEtudiants, indice=1;
      ```
    * ```java
        float prixBanane = 0.67;
      ```
    * ```java
        boolean dossierComplet = false;
      ```

Il existe des règles à respecter dans le choix des identificateurs :
1. Le langage Java est sensible à la case des caractères, c-à-d la distinction entre les majuscules des minuscules. Ainsi, l’identificateur `prix` est différent de l’identificateur `Prix`.
2. L’identificateur doit commencer par une lettre (`a..z`, `A..Z`) ou le caractère de soulignement (`_`). L’identificateur doit être composé que de : 
    * lettres de l’alphabet,
    * chiffres 
    * caractères de soulignement
    - ***pas d’espaces ou de caractères spéciaux et éviter les caractères accentués!***
4. L’identificateur ne doit pas être un mot réservé du langage.
5. L’identificateur doit être unique (on ne peut pas avoir 2 identificateurs identiques dans la même portée).

<ins>Mots réservés</ins> du langage Java :
| | | | | |
| --- | --- | --- | --- | --- |
| `abstract` | `continue` | `for` | `new` | `switch` |
| `assert` | `default` | `goto` | `package` | `synchronized` |
| `boolean` | `do` | `if` | `private` | `this` |
| `break` | `double` | `implements` | `protected` | `throw` |
| `byte` | `else` | `import` | `public` | `throws` |
| `case` | `enum` | `instanceof` | `return` | `transient` |
| `catch` | `extends` | `int` | `short` | `try` |
| `char` | `final` | `interface` | `static` | `void` |
| `class` | `finally` | `long` | `strictfp` | `volatile` | 
| `const` | `float` | `native` | `super` | `while` |

**Remarque** : `goto` et `const` sont réservés mais pas utilisés.
