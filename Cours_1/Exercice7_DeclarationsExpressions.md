# Exercice 7

## Soit les déclarations suivantes :

```java
byte b ;
short p ;
char c ;
int n ;
float x ;
```

## Parmi les expressions suivantes, lesquelles sont incorrectes et pourquoi ?

### *Instruction 1*

```java
c = c + 1;
```

Incorrecte car c est de type char, et lorsqu'on ajoute `1` à un char, cela convertit automatiquement `c` en `int` avant l'addition. Donc, `c + 1` devient un `int`, ce qui ne peut pas être assigné à `c` sans conversion explicite.

### *Instruction 2*

```java
c++;
```

Incorrecte car l'opérateur d'incrémentation `++` n'est pas applicable aux types `char`. Il peut être utilisé avec des types numériques seulement.

### Instruction 3

```java
c += 3;
```

### *Instruction 4*

```java
b += c;
```

Incorrecte car les opérateurs d'assignation composée, tels que `+=`, convertissent automatiquement le résultat en type de la variable de gauche. Dans ce cas, b est de type `byte` et c est de type `char`, et la conversion d'un `char` en `byte` peut entraîner une perte de données.

### Instruction 5

```java
p += b;
```

### *Instruction 6*

```java
p = p + b;
```

Incorrecte car le résultat de l'addition `p + b` est un `int`, et il ne peut pas être assigné à `p` sans conversion explicite car `p` est de type `short`.

### Instruction 7

```java
n += x;
```

### *Instruction 8*

```java
n = n + x;
```

Incorrecte car le résultat de l'addition `n + x` est un `float`, et il ne peut pas être assigné à `n` sans conversion explicite car `n` est de type `int`.

### Instruction 9

```java
x++;
```
