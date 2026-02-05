# Level 4: Writing & Calling Return Methods (With Parameters) - Opgaver

## Indhold

- [ ] [Del A: Simple Beregninger](#del-a-simple-beregninger)
- [ ] [Del B: Forskellige Typer](#del-b-forskellige-typer)
- [ ] [Del C: Boolean Metoder](#del-c-boolean-metoder)
- [ ] [Del D: String Metoder](#del-d-string-metoder)
- [ ] [Del E: Array Metoder](#del-e-array-metoder)
- [ ] [Del F: Kombinerede Opgaver](#del-f-kombinerede-opgaver)

---

## Del A: Simple Beregninger

### Opgave 4.1: Læg to tal sammen
**Opgave:**
Skriv metode `add(int a, int b)` der returnerer summen af de to tal. Test med `add(5, 3)` og `add(10, 20)`.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. **Skriv metoden:** Return type er `int`, to parametre af type `int`:
   ```java
   int add(int a, int b) {
       return a + b;
   }
   ```

2. **Kald metoden og gem værdien:**
   ```java
   int result = add(5, 3);
   ```

3. **Print resultatet:**
   ```java
   System.out.println(result);
   ```
</details>

<details>
<summary>Se svar</summary>

```java
int add(int a, int b) {
    return a + b;
}

void main() {
    int sum1 = add(5, 3);
    int sum2 = add(10, 20);
    System.out.println("5 + 3 = " + sum1);
    System.out.println("10 + 20 = " + sum2);
}
// Output:
// 5 + 3 = 8
// 10 + 20 = 30
```
</details>

---

### Opgave 4.2: Træk fra
**Opgave:**
Skriv metode `subtract(int a, int b)` der returnerer a minus b.

<details>
<summary>Se svar</summary>

```java
int subtract(int a, int b) {
    return a - b;
}

void main() {
    int result = subtract(10, 3);
    System.out.println("10 - 3 = " + result);
}
// Output: 10 - 3 = 7
```
</details>

---

### Opgave 4.3: Gang to tal
**Opgave:**
Skriv metode `multiply(int a, int b)` der returnerer produktet.

<details>
<summary>Se svar</summary>

```java
int multiply(int a, int b) {
    return a * b;
}

void main() {
    int result = multiply(6, 7);
    System.out.println("6 * 7 = " + result);
}
// Output: 6 * 7 = 42
```
</details>

---

### Opgave 4.4: Kvadrat
**Opgave:**
Skriv metode `square(int n)` der returnerer n ganget med sig selv (n²).

<details>
<summary>Se svar</summary>

```java
int square(int n) {
    return n * n;
}

void main() {
    System.out.println("3² = " + square(3));
    System.out.println("5² = " + square(5));
    System.out.println("10² = " + square(10));
}
// Output:
// 3² = 9
// 5² = 25
// 10² = 100
```
</details>

---

### Opgave 4.5: Fordoble
**Opgave:**
Skriv metode `double(int n)` der returnerer n ganget med 2.

<details>
<summary>Se svar</summary>

```java
int doubleIt(int n) {
    return n * 2;
}

void main() {
    System.out.println(doubleIt(5));
    System.out.println(doubleIt(25));
}
// Output:
// 10
// 50
```
</details>

---

### Opgave 4.6: Hvad printer dette?
**Opgave:**
Hvad bliver output?
```java
int triple(int n) {
    return n * 3;
}

void main() {
    int a = triple(4);
    int b = triple(a);
    System.out.println(b);
}
```

<details>
<summary>Se svar</summary>

```
36
```

**Forklaring:**
1. `triple(4)` returnerer 12, så a = 12
2. `triple(12)` returnerer 36, så b = 36
</details>

---

### Opgave 4.7: Rektangel areal
**Opgave:**
Skriv metode `calculateArea(int width, int height)` der returnerer arealet.

<details>
<summary>Se svar</summary>

```java
int calculateArea(int width, int height) {
    return width * height;
}

void main() {
    int area = calculateArea(8, 5);
    System.out.println("Area: " + area);
}
// Output: Area: 40
```
</details>

---

### Opgave 4.8: Brug return værdi i beregning
**Opgave:**
Brug `square()` fra opgave 4.4. Beregn summen af 3² og 4² (skal give 25).

<details>
<summary>Se svar</summary>

```java
int square(int n) {
    return n * n;
}

void main() {
    int sumOfSquares = square(3) + square(4);
    System.out.println("3² + 4² = " + sumOfSquares);
}
// Output: 3² + 4² = 25
```
</details>

---

## Del B: Forskellige Typer

### Opgave 4.9: double parameter og return
**Opgave:**
Skriv metode `half(double n)` der returnerer n divideret med 2.

<details>
<summary>Se svar</summary>

```java
double half(double n) {
    return n / 2;
}

void main() {
    System.out.println(half(10.0));
    System.out.println(half(7.0));
}
// Output:
// 5.0
// 3.5
```
</details>

---

### Opgave 4.10: Celsius til Fahrenheit
**Opgave:**
Skriv metode `toFahrenheit(double celsius)` der konverterer og returnerer temperaturen. Formel: celsius * 9/5 + 32

<details>
<summary>Se svar</summary>

```java
double toFahrenheit(double celsius) {
    return celsius * 9 / 5 + 32;
}

void main() {
    System.out.println("0°C = " + toFahrenheit(0) + "°F");
    System.out.println("100°C = " + toFahrenheit(100) + "°F");
    System.out.println("25°C = " + toFahrenheit(25) + "°F");
}
// Output:
// 0°C = 32.0°F
// 100°C = 212.0°F
// 25°C = 77.0°F
```
</details>

---

### Opgave 4.11: Fahrenheit til Celsius
**Opgave:**
Skriv metode `toCelsius(double fahrenheit)` der konverterer den anden vej. Formel: (fahrenheit - 32) * 5/9

<details>
<summary>Se svar</summary>

```java
double toCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

void main() {
    System.out.println("32°F = " + toCelsius(32) + "°C");
    System.out.println("212°F = " + toCelsius(212) + "°C");
}
// Output:
// 32°F = 0.0°C
// 212°F = 100.0°C
```
</details>

---

### Opgave 4.12: Procent beregning
**Opgave:**
Skriv metode `percentage(double value, double total)` der returnerer hvor mange procent value er af total.

<details>
<summary>Se svar</summary>

```java
double percentage(double value, double total) {
    return (value / total) * 100;
}

void main() {
    System.out.println(percentage(25, 100) + "%");
    System.out.println(percentage(3, 4) + "%");
}
// Output:
// 25.0%
// 75.0%
```
</details>

---

### Opgave 4.13: Find største
**Opgave:**
Skriv metode `max(int a, int b)` der returnerer det største af de to tal.

<details>
<summary>Se svar</summary>

```java
int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

void main() {
    System.out.println("max(10, 5) = " + max(10, 5));
    System.out.println("max(3, 8) = " + max(3, 8));
    System.out.println("max(7, 7) = " + max(7, 7));
}
// Output:
// max(10, 5) = 10
// max(3, 8) = 8
// max(7, 7) = 7
```
</details>

---

### Opgave 4.14: Find mindste
**Opgave:**
Skriv metode `min(int a, int b)` der returnerer det mindste af de to tal.

<details>
<summary>Se svar</summary>

```java
int min(int a, int b) {
    if (a < b) {
        return a;
    } else {
        return b;
    }
}

void main() {
    System.out.println("min(10, 5) = " + min(10, 5));
    System.out.println("min(3, 8) = " + min(3, 8));
}
// Output:
// min(10, 5) = 5
// min(3, 8) = 3
```
</details>

---

### Opgave 4.15: Absolut værdi
**Opgave:**
Skriv metode `abs(int n)` der returnerer den absolutte værdi (altid positiv).

<details>
<summary>Se svar</summary>

```java
int abs(int n) {
    if (n < 0) {
        return -n;
    } else {
        return n;
    }
}

void main() {
    System.out.println("abs(10) = " + abs(10));
    System.out.println("abs(-10) = " + abs(-10));
    System.out.println("abs(0) = " + abs(0));
}
// Output:
// abs(10) = 10
// abs(-10) = 10
// abs(0) = 0
```
</details>

---

### Opgave 4.16: Potens
**Opgave:**
Skriv metode `power(int base, int exponent)` der returnerer base opløftet i exponent. Brug et loop.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Start med result = 1
2. Gang result med base, exponent antal gange
3. Returner result

Eksempel: power(2, 3) = 2 * 2 * 2 = 8
</details>

<details>
<summary>Se svar</summary>

```java
int power(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
        result = result * base;
    }
    return result;
}

void main() {
    System.out.println("2^3 = " + power(2, 3));
    System.out.println("5^2 = " + power(5, 2));
    System.out.println("10^4 = " + power(10, 4));
}
// Output:
// 2^3 = 8
// 5^2 = 25
// 10^4 = 10000
```
</details>

---

## Del C: Boolean Metoder

### Opgave 4.17: isPositive
**Opgave:**
Skriv metode `isPositive(int n)` der returnerer `true` hvis n er større end 0.

<details>
<summary>Se svar</summary>

```java
boolean isPositive(int n) {
    return n > 0;
}

void main() {
    System.out.println("isPositive(5) = " + isPositive(5));
    System.out.println("isPositive(-3) = " + isPositive(-3));
    System.out.println("isPositive(0) = " + isPositive(0));
}
// Output:
// isPositive(5) = true
// isPositive(-3) = false
// isPositive(0) = false
```
</details>

---

### Opgave 4.18: isEven
**Opgave:**
Skriv metode `isEven(int n)` der returnerer `true` hvis n er et lige tal.

<details>
<summary>Se svar</summary>

```java
boolean isEven(int n) {
    return n % 2 == 0;
}

void main() {
    System.out.println("isEven(4) = " + isEven(4));
    System.out.println("isEven(7) = " + isEven(7));
}
// Output:
// isEven(4) = true
// isEven(7) = false
```
</details>

---

### Opgave 4.19: isAdult
**Opgave:**
Skriv metode `isAdult(int age)` der returnerer `true` hvis age er 18 eller over.

<details>
<summary>Se svar</summary>

```java
boolean isAdult(int age) {
    return age >= 18;
}

void main() {
    System.out.println("isAdult(20) = " + isAdult(20));
    System.out.println("isAdult(15) = " + isAdult(15));
    System.out.println("isAdult(18) = " + isAdult(18));
}
// Output:
// isAdult(20) = true
// isAdult(15) = false
// isAdult(18) = true
```
</details>

---

### Opgave 4.20: Brug boolean i if-statement
**Opgave:**
Brug `isAdult()` fra 4.19 i et program der tjekker om en person må købe øl.

<details>
<summary>Se svar</summary>

```java
boolean isAdult(int age) {
    return age >= 18;
}

void main() {
    int customerAge = 16;
    
    if (isAdult(customerAge)) {
        System.out.println("Sale approved");
    } else {
        System.out.println("Sale denied - too young");
    }
}
// Output: Sale denied - too young
```
</details>

---

### Opgave 4.21: isInRange
**Opgave:**
Skriv metode `isInRange(int value, int min, int max)` der returnerer `true` hvis value er mellem min og max (inklusiv).

<details>
<summary>Se svar</summary>

```java
boolean isInRange(int value, int min, int max) {
    return value >= min && value <= max;
}

void main() {
    System.out.println(isInRange(5, 1, 10));   // true
    System.out.println(isInRange(15, 1, 10));  // false
    System.out.println(isInRange(1, 1, 10));   // true (edge case)
}
// Output:
// true
// false
// true
```
</details>

---

### Opgave 4.22: isValidScore
**Opgave:**
Skriv metode `isValidScore(int score)` der returnerer `true` hvis score er mellem 0 og 100 (inklusiv).

<details>
<summary>Se svar</summary>

```java
boolean isValidScore(int score) {
    return score >= 0 && score <= 100;
}

void main() {
    System.out.println(isValidScore(85));   // true
    System.out.println(isValidScore(-5));   // false
    System.out.println(isValidScore(150));  // false
}
// Output:
// true
// false
// false
```
</details>

---

### Opgave 4.23: isDivisibleBy
**Opgave:**
Skriv metode `isDivisibleBy(int number, int divisor)` der returnerer `true` hvis number er deleligt med divisor.

<details>
<summary>Se svar</summary>

```java
boolean isDivisibleBy(int number, int divisor) {
    return number % divisor == 0;
}

void main() {
    System.out.println(isDivisibleBy(10, 5));  // true
    System.out.println(isDivisibleBy(10, 3));  // false
    System.out.println(isDivisibleBy(12, 4));  // true
}
// Output:
// true
// false
// true
```
</details>

---

### Opgave 4.24: canAfford
**Opgave:**
Skriv metode `canAfford(double price, double money)` der returnerer `true` hvis money er nok til at betale price.

<details>
<summary>Se svar</summary>

```java
boolean canAfford(double price, double money) {
    return money >= price;
}

void main() {
    System.out.println(canAfford(50.0, 100.0));  // true
    System.out.println(canAfford(150.0, 100.0)); // false
    System.out.println(canAfford(100.0, 100.0)); // true (præcis nok)
}
// Output:
// true
// false
// true
```
</details>

---

## Del D: String Metoder

### Opgave 4.25: Lav en hilsen
**Opgave:**
Skriv metode `greet(String name)` der returnerer "Hello, [name]!".

<details>
<summary>Se svar</summary>

```java
String greet(String name) {
    return "Hello, " + name + "!";
}

void main() {
    String greeting = greet("Anna");
    System.out.println(greeting);
    System.out.println(greet("Mikkel"));
}
// Output:
// Hello, Anna!
// Hello, Mikkel!
```
</details>

---

### Opgave 4.26: Fuldt navn
**Opgave:**
Skriv metode `fullName(String firstName, String lastName)` der returnerer "[firstName] [lastName]".

<details>
<summary>Se svar</summary>

```java
String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
}

void main() {
    String name = fullName("Anna", "Jensen");
    System.out.println(name);
}
// Output: Anna Jensen
```
</details>

---

### Opgave 4.27: Tilføj udråbstegn
**Opgave:**
Skriv metode `exclaim(String text)` der returnerer teksten med et udråbstegn til sidst.

<details>
<summary>Se svar</summary>

```java
String exclaim(String text) {
    return text + "!";
}

void main() {
    System.out.println(exclaim("Hello"));
    System.out.println(exclaim("Wow"));
}
// Output:
// Hello!
// Wow!
```
</details>

---

### Opgave 4.28: Store bogstaver
**Opgave:**
Skriv metode `shout(String text)` der returnerer teksten med store bogstaver.

<details>
<summary>Se svar</summary>

```java
String shout(String text) {
    return text.toUpperCase();
}

void main() {
    String loud = shout("hello");
    System.out.println(loud);
}
// Output: HELLO
```
</details>

---

### Opgave 4.29: Gentag tekst
**Opgave:**
Skriv metode `repeat(String text, int times)` der returnerer teksten gentaget. 
- `repeat("Ha", 3)` returnerer "HaHaHa"

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Start med en tom String: `String result = "";`
2. Brug et loop der kører `times` gange
3. I hver iteration, tilføj `text` til `result`
4. Returner `result`
</details>

<details>
<summary>Se svar</summary>

```java
String repeat(String text, int times) {
    String result = "";
    for (int i = 0; i < times; i++) {
        result = result + text;
    }
    return result;
}

void main() {
    System.out.println(repeat("Ha", 3));
    System.out.println(repeat("*", 5));
    System.out.println(repeat("Go! ", 2));
}
// Output:
// HaHaHa
// *****
// Go! Go! 
```
</details>

---

### Opgave 4.30: Få længde
**Opgave:**
Skriv metode `getLength(String text)` der returnerer længden af teksten.

<details>
<summary>Se svar</summary>

```java
int getLength(String text) {
    return text.length();
}

void main() {
    System.out.println(getLength("Hello"));
    System.out.println(getLength(""));
    System.out.println(getLength("Java Programming"));
}
// Output:
// 5
// 0
// 16
```
</details>

---

### Opgave 4.31: Få første bogstav
**Opgave:**
Skriv metode `getFirstChar(String text)` der returnerer det første tegn.

<details>
<summary>Se svar</summary>

```java
char getFirstChar(String text) {
    return text.charAt(0);
}

void main() {
    System.out.println(getFirstChar("Hello"));
    System.out.println(getFirstChar("World"));
}
// Output:
// H
// W
```
</details>

---

### Opgave 4.32: Karakterbeskrivelse
**Opgave:**
Skriv metode `getGrade(int score)` der returnerer karakteren som tekst:
- 90+ → "A"
- 80-89 → "B"  
- 70-79 → "C"
- 60-69 → "D"
- Under 60 → "F"

<details>
<summary>Se svar</summary>

```java
String getGrade(int score) {
    if (score >= 90) {
        return "A";
    } else if (score >= 80) {
        return "B";
    } else if (score >= 70) {
        return "C";
    } else if (score >= 60) {
        return "D";
    } else {
        return "F";
    }
}

void main() {
    System.out.println("95 → " + getGrade(95));
    System.out.println("82 → " + getGrade(82));
    System.out.println("71 → " + getGrade(71));
    System.out.println("55 → " + getGrade(55));
}
// Output:
// 95 → A
// 82 → B
// 71 → C
// 55 → F
```
</details>

---

## Del E: Array Metoder

### Opgave 4.33: Sum af array
**Opgave:**
Skriv metode `sum(int[] numbers)` der returnerer summen af alle tal i arrayet.

<details>
<summary>Se svar</summary>

```java
int sum(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
        total = total + numbers[i];
    }
    return total;
}

void main() {
    int[] data = {10, 20, 30, 40};
    int result = sum(data);
    System.out.println("Sum: " + result);
}
// Output: Sum: 100
```
</details>

---

### Opgave 4.34: Gennemsnit af array
**Opgave:**
Skriv metode `average(int[] numbers)` der returnerer gennemsnittet som double.

<details>
<summary>Se svar</summary>

```java
double average(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
        total = total + numbers[i];
    }
    return (double) total / numbers.length;
}

void main() {
    int[] data = {10, 20, 30, 40};
    double avg = average(data);
    System.out.println("Average: " + avg);
}
// Output: Average: 25.0
```
</details>

---

### Opgave 4.35: Find max i array
**Opgave:**
Skriv metode `findMax(int[] numbers)` der returnerer det største tal i arrayet.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Antag at første element er størst: `int max = numbers[0];`
2. Loop gennem resten af arrayet (start ved index 1)
3. Hvis du finder et tal der er større end max, opdater max
4. Returner max til sidst
</details>

<details>
<summary>Se svar</summary>

```java
int findMax(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}

void main() {
    int[] data = {23, 45, 12, 67, 34};
    System.out.println("Max: " + findMax(data));
}
// Output: Max: 67
```
</details>

---

### Opgave 4.36: Find min i array
**Opgave:**
Skriv metode `findMin(int[] numbers)` der returnerer det mindste tal i arrayet.

<details>
<summary>Se svar</summary>

```java
int findMin(int[] numbers) {
    int min = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
    }
    return min;
}

void main() {
    int[] data = {23, 45, 12, 67, 34};
    System.out.println("Min: " + findMin(data));
}
// Output: Min: 12
```
</details>

---

### Opgave 4.37: Tæl forekomster
**Opgave:**
Skriv metode `count(int[] numbers, int target)` der tæller hvor mange gange target forekommer i arrayet.

<details>
<summary>Se svar</summary>

```java
int count(int[] numbers, int target) {
    int counter = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            counter++;
        }
    }
    return counter;
}

void main() {
    int[] data = {1, 2, 3, 2, 4, 2, 5};
    System.out.println("Count of 2: " + count(data, 2));
    System.out.println("Count of 9: " + count(data, 9));
}
// Output:
// Count of 2: 3
// Count of 9: 0
```
</details>

---

### Opgave 4.38: Indeholder element
**Opgave:**
Skriv metode `contains(int[] numbers, int target)` der returnerer `true` hvis target findes i arrayet.

<details>
<summary>Se svar</summary>

```java
boolean contains(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            return true;
        }
    }
    return false;
}

void main() {
    int[] data = {10, 20, 30, 40, 50};
    System.out.println(contains(data, 30));  // true
    System.out.println(contains(data, 99));  // false
}
// Output:
// true
// false
```
</details>

---

### Opgave 4.39: Find index
**Opgave:**
Skriv metode `indexOf(int[] numbers, int target)` der returnerer index hvor target findes, eller -1 hvis ikke fundet.

<details>
<summary>Se svar</summary>

```java
int indexOf(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            return i;
        }
    }
    return -1;
}

void main() {
    int[] data = {10, 20, 30, 40, 50};
    System.out.println(indexOf(data, 30));  // 2
    System.out.println(indexOf(data, 99));  // -1
}
// Output:
// 2
// -1
```
</details>

---

### Opgave 4.40: Tæl positive
**Opgave:**
Skriv metode `countPositive(int[] numbers)` der returnerer antal positive tal (> 0) i arrayet.

<details>
<summary>Se svar</summary>

```java
int countPositive(int[] numbers) {
    int counter = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > 0) {
            counter++;
        }
    }
    return counter;
}

void main() {
    int[] data = {-3, 5, 0, -1, 8, 2, -4};
    System.out.println("Positive: " + countPositive(data));
}
// Output: Positive: 3
```
</details>

---

## Del F: Kombinerede Opgaver

### Opgave 4.41: Pris med rabat
**Opgave:**
Skriv metode `applyDiscount(double price, int discountPercent)` der returnerer prisen efter rabatten er trukket fra.
- `applyDiscount(100.0, 20)` skal returnere 80.0

<details>
<summary>Se svar</summary>

```java
double applyDiscount(double price, int discountPercent) {
    double discount = price * discountPercent / 100;
    return price - discount;
}

void main() {
    System.out.println(applyDiscount(100.0, 20));
    System.out.println(applyDiscount(50.0, 10));
}
// Output:
// 80.0
// 45.0
```
</details>

---

### Opgave 4.42: Metode kalder metode
**Opgave:**
Skriv `calculateTax(double price)` der returnerer 25% af prisen, og `calculateTotal(double price)` der returnerer pris + moms ved at kalde calculateTax.

<details>
<summary>Se svar</summary>

```java
double calculateTax(double price) {
    return price * 0.25;
}

double calculateTotal(double price) {
    return price + calculateTax(price);
}

void main() {
    double price = 100.0;
    System.out.println("Price: " + price);
    System.out.println("Tax: " + calculateTax(price));
    System.out.println("Total: " + calculateTotal(price));
}
// Output:
// Price: 100.0
// Tax: 25.0
// Total: 125.0
```
</details>

---

### Opgave 4.43: BMI beregner
**Opgave:**
Skriv metode `calculateBMI(double weightKg, double heightM)` der returnerer BMI (vægt / højde²).

<details>
<summary>Se svar</summary>

```java
double calculateBMI(double weightKg, double heightM) {
    return weightKg / (heightM * heightM);
}

void main() {
    double bmi = calculateBMI(70.0, 1.75);
    System.out.println("BMI: " + bmi);
}
// Output: BMI: 22.857142857142858
```
</details>

---

### Opgave 4.44: Range af tal
**Opgave:**
Brug `findMax()` og `findMin()` fra tidligere opgaver til at skrive `getRange(int[] numbers)` der returnerer forskellen mellem max og min.

<details>
<summary>Se svar</summary>

```java
int findMax(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}

int findMin(int[] numbers) {
    int min = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
    }
    return min;
}

int getRange(int[] numbers) {
    return findMax(numbers) - findMin(numbers);
}

void main() {
    int[] data = {5, 23, 12, 45, 8};
    System.out.println("Range: " + getRange(data));
}
// Output: Range: 40
```
</details>

---

### Opgave 4.45: Password validator
**Opgave:**
Skriv disse metoder:
- `isLongEnough(String password, int minLength)` - returnerer true hvis password har mindst minLength tegn
- `hasDigit(String text)` - returnerer true hvis text indeholder mindst ét ciffer (0-9)
- `isValidPassword(String password)` - returnerer true hvis password er mindst 8 tegn OG indeholder et ciffer

<details>
<summary>💡 Hint til hasDigit</summary>

Loop gennem alle tegn i teksten med `text.charAt(i)`. Et tegn er et ciffer hvis det er mellem '0' og '9'.
</details>

<details>
<summary>Se svar</summary>

```java
boolean isLongEnough(String password, int minLength) {
    return password.length() >= minLength;
}

boolean hasDigit(String text) {
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        if (c >= '0' && c <= '9') {
            return true;
        }
    }
    return false;
}

boolean isValidPassword(String password) {
    return isLongEnough(password, 8) && hasDigit(password);
}

void main() {
    System.out.println(isValidPassword("abc"));         // false (for kort)
    System.out.println(isValidPassword("abcdefgh"));    // false (ingen tal)
    System.out.println(isValidPassword("abcdef1"));     // false (for kort)
    System.out.println(isValidPassword("abcdefg1"));    // true
}
// Output:
// false
// false
// false
// true
```
</details>

---

### Opgave 4.46: Initialer
**Opgave:**
Skriv metode `getInitials(String firstName, String lastName)` der returnerer initialerne som store bogstaver.
- `getInitials("anna", "jensen")` skal returnere "AJ"

<details>
<summary>Se svar</summary>

```java
String getInitials(String firstName, String lastName) {
    char first = firstName.charAt(0);
    char last = lastName.charAt(0);
    String initials = ("" + first + last).toUpperCase();
    return initials;
}

void main() {
    System.out.println(getInitials("anna", "jensen"));
    System.out.println(getInitials("Mikkel", "Hansen"));
}
// Output:
// AJ
// MH
```
</details>

---

### Opgave 4.47: Clamp værdi
**Opgave:**
Skriv metode `clamp(int value, int min, int max)` der returnerer:
- `min` hvis value er mindre end min
- `max` hvis value er større end max
- ellers `value`

Dette bruges ofte i spil til at holde værdier inden for et gyldigt interval.

<details>
<summary>Se svar</summary>

```java
int clamp(int value, int min, int max) {
    if (value < min) {
        return min;
    } else if (value > max) {
        return max;
    } else {
        return value;
    }
}

void main() {
    System.out.println(clamp(5, 0, 10));    // 5 (inden for range)
    System.out.println(clamp(-5, 0, 10));   // 0 (under min)
    System.out.println(clamp(15, 0, 10));   // 10 (over max)
}
// Output:
// 5
// 0
// 10
```
</details>

---

### Opgave 4.48: Komplet statistik
**Opgave:**
Skriv et program med disse metoder:
- `sum(int[] numbers)` - returnerer summen
- `average(int[] numbers)` - returnerer gennemsnittet
- `findMax(int[] numbers)` - returnerer største
- `findMin(int[] numbers)` - returnerer mindste
- `getRange(int[] numbers)` - returnerer max - min

Test alle metoder med arrayet `{12, 45, 23, 67, 34, 89, 21}`.

<details>
<summary>Se svar</summary>

```java
int sum(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
        total = total + numbers[i];
    }
    return total;
}

double average(int[] numbers) {
    return (double) sum(numbers) / numbers.length;
}

int findMax(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}

int findMin(int[] numbers) {
    int min = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
    }
    return min;
}

int getRange(int[] numbers) {
    return findMax(numbers) - findMin(numbers);
}

void main() {
    int[] data = {12, 45, 23, 67, 34, 89, 21};
    
    System.out.println("=== Statistics ===");
    System.out.println("Sum: " + sum(data));
    System.out.println("Average: " + average(data));
    System.out.println("Max: " + findMax(data));
    System.out.println("Min: " + findMin(data));
    System.out.println("Range: " + getRange(data));
}
// Output:
// === Statistics ===
// Sum: 291
// Average: 41.57142857142857
// Max: 89
// Min: 12
// Range: 77
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem de 4 typer metoder du nu kender?
2. Hvornår bruger du void vs return?
3. Hvornår bruger du parametre vs ingen parametre?
4. Hvordan kan en metode kalde en anden metode?
5. Hvorfor er det smart at bygge små metoder der kan kombineres?
6. Hvad betyder det at en metode er "genbrugelig"?
7. Hvordan hjælper parametre med at gøre metoder fleksible?
8. Hvorfor skal alle paths i en metode have et return statement?
