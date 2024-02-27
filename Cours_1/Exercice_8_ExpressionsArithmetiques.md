```md
# Exercice 8

## En considérant les déclarations suivantes :

```java
byte b1 = 10, b2 = 20;
short p = 200;
int n = 500;
long q = 100;
float x = 2.5f;
double y = 5.25;
```

## Donner le type et la valeur des expressions arithmétiques suivantes :

### 1

```java
b1 + b2;
```

- Type: `int`
- Valeur: `30`

### 2

```java
p + b1;
```

- Type: `int`
- Valeur: `210`

### 3

```java
b1 * b2;
```

- Type: `int`
- Valeur: `200`

### 4

```java
q + p * (b1 + b2);
```

- Type: `long`
- Valeur: `4600`

### 5

```java
x + q * n;
```

- Type: `float`
- Valeur: `125002.5`

### 6

```java
b1 * q / x;
```

- Type: `float`
- Valeur: `80.0`

### 7

```java
b1 * q * 2. / x;
```

- Type: `double`
- Valeur: `80.0`

### 8

```java
b1 * q * 2.f / x;
```

- Type: `float`
- Valeur: `80.0`
