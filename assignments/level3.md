# Level 3: Writing & Calling Return Methods (No Parameters) - Opgaver

## Indhold

- [ ] [Del A: Simple Return Methods](#del-a-simple-return-methods)
- [ ] [Del B: Gem og Brug Return Værdien](#del-b-gem-og-brug-return-værdien)
- [ ] [Del C: Return med Beregninger](#del-c-return-med-beregninger)
- [ ] [Del D: Boolean Return Methods](#del-d-boolean-return-methods)
- [ ] [Del E: Return Metoder Kalder Hinanden](#del-e-return-metoder-kalder-hinanden)
- [ ] [Del F: Combining Concepts](#del-f-combining-concepts)

---

## Del A: Simple Return Methods

### Opgave 3.1: Din første return metode
**Opgave:**
Skriv en metode `getNumber()` der returnerer tallet 42. Kald metoden, gem værdien i en variabel, og print variablen.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. **Skriv metoden:** I stedet for `void` skriver du `int` (fordi du returnerer et heltal):
   ```java
   int getNumber() {
       return 42;
   }
   ```

2. **Kald metoden og gem værdien:** I main, lav en variabel der fanger værdien:
   ```java
   int result = getNumber();
   ```

3. **Print variablen:**
   ```java
   System.out.println(result);
   ```
</details>

<details>
<summary>Se svar</summary>

```java
int getNumber() {
    return 42;
}

void main() {
    int result = getNumber();
    System.out.println(result);
}
// Output: 42
```
</details>

---

### Opgave 3.2: Return en String
**Opgave:**
Skriv en metode `getMessage()` der returnerer teksten "Hello, World!". Gem værdien i en variabel og print den.

<details>
<summary>Se svar</summary>

```java
String getMessage() {
    return "Hello, World!";
}

void main() {
    String message = getMessage();
    System.out.println(message);
}
// Output: Hello, World!
```
</details>

---

### Opgave 3.3: Return en double
**Opgave:**
Skriv en metode `getPrice()` der returnerer 29.95. Gem værdien og print "Price: " efterfulgt af værdien.

<details>
<summary>Se svar</summary>

```java
double getPrice() {
    return 29.95;
}

void main() {
    double price = getPrice();
    System.out.println("Price: " + price);
}
// Output: Price: 29.95
```
</details>

---

### Opgave 3.4: Return en boolean
**Opgave:**
Skriv en metode `isReady()` der returnerer `true`. Gem værdien og print "Ready: " efterfulgt af værdien.

<details>
<summary>Se svar</summary>

```java
boolean isReady() {
    return true;
}

void main() {
    boolean ready = isReady();
    System.out.println("Ready: " + ready);
}
// Output: Ready: true
```
</details>

---

### Opgave 3.5: Hvad printer dette?
**Opgave:**
Hvad bliver output af dette program?
```java
int getLuckyNumber() {
    return 7;
}

void main() {
    int x = getLuckyNumber();
    System.out.println(x);
    System.out.println(x);
}
```

<details>
<summary>Se svar</summary>

```
7
7
```

**Forklaring:** `getLuckyNumber()` returnerer 7, som gemmes i `x`. Derefter kan vi bruge `x` så mange gange vi vil - værdien er gemt.
</details>

---

### Opgave 3.6: Return en char
**Opgave:**
Skriv en metode `getGrade()` der returnerer karakteren 'A'. Gem værdien og print "Grade: " efterfulgt af karakteren.

<details>
<summary>Se svar</summary>

```java
char getGrade() {
    return 'A';
}

void main() {
    char grade = getGrade();
    System.out.println("Grade: " + grade);
}
// Output: Grade: A
```
</details>

---

### Opgave 3.7: Find fejlen
**Opgave:**
Denne kode har en fejl. Hvad er problemet, og hvordan fikser du det?
```java
int getAge() {
    return 25;
}

void main() {
    getAge();
    System.out.println("Done");
}
```

<details>
<summary>Se svar</summary>

**Problemet:** `getAge()` returnerer 25, men vi bruger ikke værdien til noget! Den bliver bare smidt væk.

**Fikset version:**
```java
int getAge() {
    return 25;
}

void main() {
    int age = getAge();  // Gem værdien!
    System.out.println("Age: " + age);
    System.out.println("Done");
}
```
</details>

---

### Opgave 3.8: Flere return metoder
**Opgave:**
Skriv tre metoder:
- `getAppName()` der returnerer "My App"
- `getVersion()` der returnerer 1
- `getAuthor()` der returnerer "Anna"

Kald alle tre i main og print resultaterne.

<details>
<summary>Se svar</summary>

```java
String getAppName() {
    return "My App";
}

int getVersion() {
    return 1;
}

String getAuthor() {
    return "Anna";
}

void main() {
    String name = getAppName();
    int version = getVersion();
    String author = getAuthor();
    
    System.out.println("App: " + name);
    System.out.println("Version: " + version);
    System.out.println("Author: " + author);
}
// Output:
// App: My App
// Version: 1
// Author: Anna
```
</details>

---

## Del B: Gem og Brug Return Værdien

### Opgave 3.9: Brug værdien to gange
**Opgave:**
Skriv `getNumber()` der returnerer 10. I main: gem værdien i en variabel, og print variablen to gange med forskellig tekst foran.

<details>
<summary>Se svar</summary>

```java
int getNumber() {
    return 10;
}

void main() {
    int num = getNumber();
    System.out.println("First: " + num);
    System.out.println("Second: " + num);
}
// Output:
// First: 10
// Second: 10
```
</details>

---

### Opgave 3.10: Læg noget til return værdien
**Opgave:**
Skriv `getBaseValue()` der returnerer 100. I main: gem værdien, læg 50 til den, og print resultatet.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Skriv metoden der returnerer 100
2. I main, gem værdien: `int base = getBaseValue();`
3. Lav en ny variabel med 50 lagt til: `int result = base + 50;`
4. Print result
</details>

<details>
<summary>Se svar</summary>

```java
int getBaseValue() {
    return 100;
}

void main() {
    int base = getBaseValue();
    int result = base + 50;
    System.out.println("Result: " + result);
}
// Output: Result: 150
```
</details>

---

### Opgave 3.11: Gang return værdien
**Opgave:**
Skriv `getMultiplier()` der returnerer 5. I main: gem værdien, gang den med 4, og print resultatet.

<details>
<summary>Se svar</summary>

```java
int getMultiplier() {
    return 5;
}

void main() {
    int mult = getMultiplier();
    int result = mult * 4;
    System.out.println("Result: " + result);
}
// Output: Result: 20
```
</details>

---

### Opgave 3.12: Hvad printer dette?
**Opgave:**
Hvad bliver output?
```java
int getValue() {
    return 20;
}

void main() {
    int a = getValue();
    int b = getValue();
    int sum = a + b;
    System.out.println(sum);
}
```

<details>
<summary>Se svar</summary>

```
40
```

**Forklaring:** `getValue()` returnerer 20 begge gange. a = 20, b = 20, sum = 40.
</details>

---

### Opgave 3.13: Beregn med flere return værdier
**Opgave:**
Skriv `getWidth()` der returnerer 8 og `getHeight()` der returnerer 5. I main: gem begge værdier, beregn arealet (bredde * højde), og print det.

<details>
<summary>Se svar</summary>

```java
int getWidth() {
    return 8;
}

int getHeight() {
    return 5;
}

void main() {
    int width = getWidth();
    int height = getHeight();
    int area = width * height;
    System.out.println("Area: " + area);
}
// Output: Area: 40
```
</details>

---

### Opgave 3.14: Flere beregninger med samme værdi
**Opgave:**
Skriv `getRadius()` der returnerer 10. I main: gem værdien, og beregn både diameter (radius * 2) og omkreds (2 * 3.14 * radius). Print begge.

<details>
<summary>Se svar</summary>

```java
int getRadius() {
    return 10;
}

void main() {
    int radius = getRadius();
    int diameter = radius * 2;
    double circumference = 2 * 3.14 * radius;
    
    System.out.println("Diameter: " + diameter);
    System.out.println("Circumference: " + circumference);
}
// Output:
// Diameter: 20
// Circumference: 62.8
```
</details>

---

### Opgave 3.15: Byg en sætning
**Opgave:**
Skriv `getName()` der returnerer "Java" og `getType()` der returnerer "language". I main: gem begge værdier og byg sætningen "[name] is a programming [type]" og print den.

<details>
<summary>Se svar</summary>

```java
String getName() {
    return "Java";
}

String getType() {
    return "language";
}

void main() {
    String name = getName();
    String type = getType();
    String sentence = name + " is a programming " + type;
    System.out.println(sentence);
}
// Output: Java is a programming language
```
</details>

---

### Opgave 3.16: Pris med moms
**Opgave:**
Skriv `getPrice()` der returnerer 80.0. I main: gem værdien, beregn moms (25%), beregn total (pris + moms), og print alle tre værdier.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Skriv metoden der returnerer 80.0
2. Gem værdien: `double price = getPrice();`
3. Beregn moms: `double tax = price * 0.25;`
4. Beregn total: `double total = price + tax;`
5. Print alle tre
</details>

<details>
<summary>Se svar</summary>

```java
double getPrice() {
    return 80.0;
}

void main() {
    double price = getPrice();
    double tax = price * 0.25;
    double total = price + tax;
    
    System.out.println("Price: " + price);
    System.out.println("Tax: " + tax);
    System.out.println("Total: " + total);
}
// Output:
// Price: 80.0
// Tax: 20.0
// Total: 100.0
```
</details>

---

## Del C: Return med Beregninger

### Opgave 3.17: Returner en beregnet værdi
**Opgave:**
Lav variablerne `int a = 10` og `int b = 3` øverst (udenfor main). Skriv metode `getSum()` der returnerer summen af a og b.

<details>
<summary>Se svar</summary>

```java
int a = 10;
int b = 3;

int getSum() {
    return a + b;
}

void main() {
    int sum = getSum();
    System.out.println("Sum: " + sum);
}
// Output: Sum: 13
```
</details>

---

### Opgave 3.18: Returner difference
**Opgave:**
Brug samme variabler som 3.17. Skriv `getDifference()` der returnerer a minus b.

<details>
<summary>Se svar</summary>

```java
int a = 10;
int b = 3;

int getDifference() {
    return a - b;
}

void main() {
    int diff = getDifference();
    System.out.println("Difference: " + diff);
}
// Output: Difference: 7
```
</details>

---

### Opgave 3.19: Returner produkt
**Opgave:**
Lav variabler `int width = 12` og `int height = 4`. Skriv `getArea()` der returnerer arealet.

<details>
<summary>Se svar</summary>

```java
int width = 12;
int height = 4;

int getArea() {
    return width * height;
}

void main() {
    int area = getArea();
    System.out.println("Area: " + area);
}
// Output: Area: 48
```
</details>

---

### Opgave 3.20: Returner gennemsnit
**Opgave:**
Lav variabler `int score1 = 80`, `int score2 = 90`, `int score3 = 70`. Skriv `getAverage()` der returnerer gennemsnittet som en double.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Læg de tre scores sammen
2. Divider med 3.0 (ikke 3, så du får en double)
3. Returner resultatet
</details>

<details>
<summary>Se svar</summary>

```java
int score1 = 80;
int score2 = 90;
int score3 = 70;

double getAverage() {
    return (score1 + score2 + score3) / 3.0;
}

void main() {
    double avg = getAverage();
    System.out.println("Average: " + avg);
}
// Output: Average: 80.0
```
</details>

---

### Opgave 3.21: Hvad returnerer metoden?
**Opgave:**
Hvad returnerer `getMystery()` og hvad printer programmet?
```java
int x = 5;
int y = 3;

int getMystery() {
    return x * y + 2;
}

void main() {
    int result = getMystery();
    System.out.println(result);
}
```

<details>
<summary>Se svar</summary>

**Metoden returnerer:** 17

**Beregning:** 5 * 3 + 2 = 15 + 2 = 17

**Output:**
```
17
```
</details>

---

### Opgave 3.22: Cirkel areal
**Opgave:**
Lav variabel `int radius = 7`. Skriv `getCircleArea()` der returnerer arealet (3.14 * radius * radius).

<details>
<summary>Se svar</summary>

```java
int radius = 7;

double getCircleArea() {
    return 3.14 * radius * radius;
}

void main() {
    double area = getCircleArea();
    System.out.println("Circle area: " + area);
}
// Output: Circle area: 153.86
```
</details>

---

### Opgave 3.23: Temperatur konvertering
**Opgave:**
Lav variabel `double celsius = 25.0`. Skriv `getFahrenheit()` der returnerer temperaturen i Fahrenheit (celsius * 9/5 + 32).

<details>
<summary>Se svar</summary>

```java
double celsius = 25.0;

double getFahrenheit() {
    return celsius * 9 / 5 + 32;
}

void main() {
    double fahrenheit = getFahrenheit();
    System.out.println(celsius + "C = " + fahrenheit + "F");
}
// Output: 25.0C = 77.0F
```
</details>

---

### Opgave 3.24: Returner fra array
**Opgave:**
Lav array `int[] numbers = {5, 10, 15, 20, 25}`. Skriv `getFirst()` der returnerer det første element og `getLast()` der returnerer det sidste element.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {5, 10, 15, 20, 25};

int getFirst() {
    return numbers[0];
}

int getLast() {
    return numbers[numbers.length - 1];
}

void main() {
    int first = getFirst();
    int last = getLast();
    System.out.println("First: " + first);
    System.out.println("Last: " + last);
}
// Output:
// First: 5
// Last: 25
```
</details>

---

## Del D: Boolean Return Methods

### Opgave 3.25: Simple boolean return
**Opgave:**
Lav variabel `int age = 20`. Skriv `isAdult()` der returnerer `true` hvis age er 18 eller over, ellers `false`.

<details>
<summary>Se svar</summary>

```java
int age = 20;

boolean isAdult() {
    return age >= 18;
}

void main() {
    boolean adult = isAdult();
    System.out.println("Is adult: " + adult);
}
// Output: Is adult: true
```
</details>

---

### Opgave 3.26: Boolean i if-statement
**Opgave:**
Brug `isAdult()` fra 3.25 i et if-statement der printer "Can vote" eller "Cannot vote".

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Kald `isAdult()` - den returnerer true eller false
2. Brug resultatet direkte i en if: `if (isAdult()) { ... }`
3. Eller gem først: `boolean adult = isAdult(); if (adult) { ... }`
</details>

<details>
<summary>Se svar</summary>

```java
int age = 20;

boolean isAdult() {
    return age >= 18;
}

void main() {
    if (isAdult()) {
        System.out.println("Can vote");
    } else {
        System.out.println("Cannot vote");
    }
}
// Output: Can vote
```
</details>

---

### Opgave 3.27: isPositive
**Opgave:**
Lav variabel `int number = -5`. Skriv `isPositive()` der returnerer `true` hvis number er større end 0.

<details>
<summary>Se svar</summary>

```java
int number = -5;

boolean isPositive() {
    return number > 0;
}

void main() {
    boolean positive = isPositive();
    System.out.println("Is positive: " + positive);
}
// Output: Is positive: false
```
</details>

---

### Opgave 3.28: isEmpty
**Opgave:**
Lav variabel `String text = ""`. Skriv `isEmpty()` der returnerer `true` hvis text har længde 0.

<details>
<summary>Se svar</summary>

```java
String text = "";

boolean isEmpty() {
    return text.length() == 0;
}

void main() {
    boolean empty = isEmpty();
    System.out.println("Is empty: " + empty);
}
// Output: Is empty: true
```
</details>

---

### Opgave 3.29: isGameOver
**Opgave:**
Lav variabel `int lives = 0`. Skriv `isGameOver()` der returnerer `true` hvis lives er 0 eller mindre. Brug den i et if-statement til at printe "GAME OVER" eller "Keep playing".

<details>
<summary>Se svar</summary>

```java
int lives = 0;

boolean isGameOver() {
    return lives <= 0;
}

void main() {
    if (isGameOver()) {
        System.out.println("GAME OVER");
    } else {
        System.out.println("Keep playing");
    }
}
// Output: GAME OVER
```
</details>

---

### Opgave 3.30: isEven
**Opgave:**
Lav variabel `int value = 42`. Skriv `isEven()` der returnerer `true` hvis value er et lige tal (brug `% 2 == 0`).

<details>
<summary>Se svar</summary>

```java
int value = 42;

boolean isEven() {
    return value % 2 == 0;
}

void main() {
    boolean even = isEven();
    System.out.println(value + " is even: " + even);
}
// Output: 42 is even: true
```
</details>

---

### Opgave 3.31: hasPassingGrade
**Opgave:**
Lav variabel `int score = 65`. Skriv `hasPassingGrade()` der returnerer `true` hvis score er 50 eller over. Brug den til at printe "Passed!" eller "Failed!".

<details>
<summary>Se svar</summary>

```java
int score = 65;

boolean hasPassingGrade() {
    return score >= 50;
}

void main() {
    if (hasPassingGrade()) {
        System.out.println("Passed!");
    } else {
        System.out.println("Failed!");
    }
}
// Output: Passed!
```
</details>

---

### Opgave 3.32: Kombiner to boolean metoder
**Opgave:**
Lav variabler `int age = 25` og `boolean hasLicense = true`. Skriv `isAdult()` og `canDrive()`. canDrive skal returnere true kun hvis personen er voksen OG har kørekort.

<details>
<summary>Se svar</summary>

```java
int age = 25;
boolean hasLicense = true;

boolean isAdult() {
    return age >= 18;
}

boolean canDrive() {
    return isAdult() && hasLicense;
}

void main() {
    System.out.println("Is adult: " + isAdult());
    System.out.println("Can drive: " + canDrive());
}
// Output:
// Is adult: true
// Can drive: true
```
</details>

---

## Del E: Return Metoder Kalder Hinanden

### Opgave 3.33: En metode kalder en anden
**Opgave:**
Skriv `getBasePrice()` der returnerer 100. Skriv `getPriceWithTax()` der kalder getBasePrice(), lægger 25% til, og returnerer resultatet.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Skriv `getBasePrice()` først
2. I `getPriceWithTax()`:
   - Kald `getBasePrice()` og gem værdien
   - Beregn tax (25%)
   - Returner base + tax
</details>

<details>
<summary>Se svar</summary>

```java
int getBasePrice() {
    return 100;
}

int getPriceWithTax() {
    int base = getBasePrice();
    int tax = base / 4;  // 25%
    return base + tax;
}

void main() {
    System.out.println("Base: " + getBasePrice());
    System.out.println("With tax: " + getPriceWithTax());
}
// Output:
// Base: 100
// With tax: 125
```
</details>

---

### Opgave 3.34: Kæde af beregninger
**Opgave:**
Skriv tre metoder:
- `getLength()` returnerer 10
- `getWidth()` returnerer 5  
- `getArea()` kalder de to andre og returnerer arealet

<details>
<summary>Se svar</summary>

```java
int getLength() {
    return 10;
}

int getWidth() {
    return 5;
}

int getArea() {
    int length = getLength();
    int width = getWidth();
    return length * width;
}

void main() {
    System.out.println("Length: " + getLength());
    System.out.println("Width: " + getWidth());
    System.out.println("Area: " + getArea());
}
// Output:
// Length: 10
// Width: 5
// Area: 50
```
</details>

---

### Opgave 3.35: Sum og gennemsnit
**Opgave:**
Lav array `int[] scores = {70, 80, 90}`. Skriv `getSum()` der returnerer summen og `getAverage()` der kalder getSum() og returnerer gennemsnittet.

<details>
<summary>Se svar</summary>

```java
int[] scores = {70, 80, 90};

int getSum() {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
        sum = sum + scores[i];
    }
    return sum;
}

double getAverage() {
    int sum = getSum();
    return (double) sum / scores.length;
}

void main() {
    System.out.println("Sum: " + getSum());
    System.out.println("Average: " + getAverage());
}
// Output:
// Sum: 240
// Average: 80.0
```
</details>

---

### Opgave 3.36: Perimeter bruger andre metoder
**Opgave:**
Skriv `getLength()` der returnerer 15 og `getWidth()` der returnerer 8. Skriv `getPerimeter()` der bruger begge til at beregne omkredsen (2 * length + 2 * width).

<details>
<summary>Se svar</summary>

```java
int getLength() {
    return 15;
}

int getWidth() {
    return 8;
}

int getPerimeter() {
    int length = getLength();
    int width = getWidth();
    return 2 * length + 2 * width;
}

void main() {
    System.out.println("Perimeter: " + getPerimeter());
}
// Output: Perimeter: 46
```
</details>

---

### Opgave 3.37: Conditional return
**Opgave:**
Lav variabel `int score = 75`. Skriv `getGrade()` der returnerer:
- "A" hvis score >= 90
- "B" hvis score >= 80
- "C" hvis score >= 70
- "F" ellers

<details>
<summary>Se svar</summary>

```java
int score = 75;

String getGrade() {
    if (score >= 90) {
        return "A";
    } else if (score >= 80) {
        return "B";
    } else if (score >= 70) {
        return "C";
    } else {
        return "F";
    }
}

void main() {
    String grade = getGrade();
    System.out.println("Score: " + score + " = Grade: " + grade);
}
// Output: Score: 75 = Grade: C
```
</details>

---

### Opgave 3.38: getStatus baseret på boolean
**Opgave:**
Lav variabel `boolean online = true`. Skriv `getStatus()` der returnerer "Online" hvis online er true, ellers "Offline".

<details>
<summary>Se svar</summary>

```java
boolean online = true;

String getStatus() {
    if (online) {
        return "Online";
    } else {
        return "Offline";
    }
}

void main() {
    String status = getStatus();
    System.out.println("Status: " + status);
}
// Output: Status: Online
```
</details>

---

### Opgave 3.39: Max værdi
**Opgave:**
Lav variabler `int a = 15` og `int b = 23`. Skriv `getMax()` der returnerer den største af de to.

<details>
<summary>Se svar</summary>

```java
int a = 15;
int b = 23;

int getMax() {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

void main() {
    int max = getMax();
    System.out.println("Max: " + max);
}
// Output: Max: 23
```
</details>

---

### Opgave 3.40: Absolut værdi
**Opgave:**
Lav variabel `int number = -42`. Skriv `getAbsolute()` der returnerer den absolutte værdi (altid positiv).

<details>
<summary>Se svar</summary>

```java
int number = -42;

int getAbsolute() {
    if (number < 0) {
        return -number;
    } else {
        return number;
    }
}

void main() {
    int absolute = getAbsolute();
    System.out.println("Absolute of " + number + " is " + absolute);
}
// Output: Absolute of -42 is 42
```
</details>

---

## Del F: Combining Concepts

### Opgave 3.41: Komplet pris-beregner
**Opgave:**
Lav variabel `double itemPrice = 200.0`. Skriv:
- `getPrice()` der returnerer prisen
- `getTaxAmount()` der beregner 25% moms
- `getTotal()` der returnerer pris + moms

I main: print alle tre værdier.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. `getPrice()` returnerer bare itemPrice
2. `getTaxAmount()` kalder getPrice() og ganger med 0.25
3. `getTotal()` kalder getPrice() og getTaxAmount() og lægger dem sammen
4. I main, kald alle tre og print
</details>

<details>
<summary>Se svar</summary>

```java
double itemPrice = 200.0;

double getPrice() {
    return itemPrice;
}

double getTaxAmount() {
    return getPrice() * 0.25;
}

double getTotal() {
    return getPrice() + getTaxAmount();
}

void main() {
    System.out.println("Price: " + getPrice());
    System.out.println("Tax: " + getTaxAmount());
    System.out.println("Total: " + getTotal());
}
// Output:
// Price: 200.0
// Tax: 50.0
// Total: 250.0
```
</details>

---

### Opgave 3.42: Array statistik
**Opgave:**
Lav array `int[] data = {12, 45, 23, 67, 34}`. Skriv:
- `getCount()` der returnerer antal elementer
- `getSum()` der returnerer summen
- `getAverage()` der bruger de andre til at returnere gennemsnittet

<details>
<summary>Se svar</summary>

```java
int[] data = {12, 45, 23, 67, 34};

int getCount() {
    return data.length;
}

int getSum() {
    int sum = 0;
    for (int i = 0; i < data.length; i++) {
        sum = sum + data[i];
    }
    return sum;
}

double getAverage() {
    return (double) getSum() / getCount();
}

void main() {
    System.out.println("Count: " + getCount());
    System.out.println("Sum: " + getSum());
    System.out.println("Average: " + getAverage());
}
// Output:
// Count: 5
// Sum: 181
// Average: 36.2
```
</details>

---

### Opgave 3.43: Find max i array
**Opgave:**
Brug samme array som 3.42. Skriv `getMax()` der finder og returnerer det største tal i arrayet.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. Start med at antage det første element er størst: `int max = data[0];`
2. Loop gennem resten af arrayet
3. Hvis du finder et større tal, opdater max
4. Til sidst, returner max
</details>

<details>
<summary>Se svar</summary>

```java
int[] data = {12, 45, 23, 67, 34};

int getMax() {
    int max = data[0];
    for (int i = 1; i < data.length; i++) {
        if (data[i] > max) {
            max = data[i];
        }
    }
    return max;
}

void main() {
    int max = getMax();
    System.out.println("Max: " + max);
}
// Output: Max: 67
```
</details>

---

### Opgave 3.44: Spiller status
**Opgave:**
Lav variabler: `String playerName = "Hero"`, `int health = 75`, `int maxHealth = 100`. Skriv:
- `getName()` returnerer navnet
- `getHealth()` returnerer health
- `getHealthPercent()` returnerer health som procent af maxHealth
- `isAlive()` returnerer true hvis health > 0

<details>
<summary>Se svar</summary>

```java
String playerName = "Hero";
int health = 75;
int maxHealth = 100;

String getName() {
    return playerName;
}

int getHealth() {
    return health;
}

int getHealthPercent() {
    return (health * 100) / maxHealth;
}

boolean isAlive() {
    return health > 0;
}

void main() {
    System.out.println("Player: " + getName());
    System.out.println("Health: " + getHealth() + "/" + maxHealth);
    System.out.println("Health %: " + getHealthPercent() + "%");
    System.out.println("Alive: " + isAlive());
}
// Output:
// Player: Hero
// Health: 75/100
// Health %: 75%
// Alive: true
```
</details>

---

### Opgave 3.45: Navn formatter
**Opgave:**
Lav variabler: `String firstName = "anna"`, `String lastName = "jensen"`. Skriv:
- `getFirstName()` returnerer firstName
- `getLastName()` returnerer lastName
- `getFullName()` returnerer "[firstName] [lastName]"
- `getInitials()` returnerer de to første bogstaver som store bogstaver (f.eks. "AJ")

<details>
<summary>💡 Hint til getInitials</summary>

- Brug `.charAt(0)` til at få første bogstav
- Brug `.toUpperCase()` på en String, eller cast char til String først
- Du kan bygge en String sådan: `"" + char1 + char2`
</details>

<details>
<summary>Se svar</summary>

```java
String firstName = "anna";
String lastName = "jensen";

String getFirstName() {
    return firstName;
}

String getLastName() {
    return lastName;
}

String getFullName() {
    return firstName + " " + lastName;
}

String getInitials() {
    char first = firstName.charAt(0);
    char last = lastName.charAt(0);
    String initials = ("" + first + last).toUpperCase();
    return initials;
}

void main() {
    System.out.println("First: " + getFirstName());
    System.out.println("Last: " + getLastName());
    System.out.println("Full: " + getFullName());
    System.out.println("Initials: " + getInitials());
}
// Output:
// First: anna
// Last: jensen
// Full: anna jensen
// Initials: AJ
```
</details>

---

### Opgave 3.46: Dag-type checker
**Opgave:**
Lav variabel `int dayNumber = 6` (1=mandag, 7=søndag). Skriv:
- `getDayNumber()` returnerer dayNumber
- `isWeekend()` returnerer true hvis det er lørdag (6) eller søndag (7)
- `getDayType()` returnerer "Weekend" eller "Weekday"

<details>
<summary>Se svar</summary>

```java
int dayNumber = 6;

int getDayNumber() {
    return dayNumber;
}

boolean isWeekend() {
    return dayNumber == 6 || dayNumber == 7;
}

String getDayType() {
    if (isWeekend()) {
        return "Weekend";
    } else {
        return "Weekday";
    }
}

void main() {
    System.out.println("Day: " + getDayNumber());
    System.out.println("Is weekend: " + isWeekend());
    System.out.println("Type: " + getDayType());
}
// Output:
// Day: 6
// Is weekend: true
// Type: Weekend
```
</details>

---

### Opgave 3.47: Temperatur analyzer
**Opgave:**
Lav variabel `double tempCelsius = 28.5`. Skriv:
- `getCelsius()` returnerer temperaturen
- `getFahrenheit()` konverterer og returnerer (C * 9/5 + 32)
- `isHot()` returnerer true hvis over 25°C
- `isFreezing()` returnerer true hvis under 0°C
- `getDescription()` returnerer "Hot", "Cold", "Freezing", eller "Nice"

<details>
<summary>Se svar</summary>

```java
double tempCelsius = 28.5;

double getCelsius() {
    return tempCelsius;
}

double getFahrenheit() {
    return tempCelsius * 9 / 5 + 32;
}

boolean isHot() {
    return tempCelsius > 25;
}

boolean isFreezing() {
    return tempCelsius < 0;
}

String getDescription() {
    if (isFreezing()) {
        return "Freezing";
    } else if (tempCelsius < 10) {
        return "Cold";
    } else if (isHot()) {
        return "Hot";
    } else {
        return "Nice";
    }
}

void main() {
    System.out.println("Celsius: " + getCelsius());
    System.out.println("Fahrenheit: " + getFahrenheit());
    System.out.println("Is hot: " + isHot());
    System.out.println("Is freezing: " + isFreezing());
    System.out.println("Description: " + getDescription());
}
// Output:
// Celsius: 28.5
// Fahrenheit: 83.3
// Is hot: true
// Is freezing: false
// Description: Hot
```
</details>

---

### Opgave 3.48: Bank konto
**Opgave:**
Lav variabler: `String accountHolder = "Anna"`, `double balance = 1500.50`, `double withdrawLimit = 500.0`. Skriv:
- `getHolder()` returnerer kontohaver
- `getBalance()` returnerer saldo
- `getWithdrawLimit()` returnerer hæve-grænsen
- `isRich()` returnerer true hvis balance > 10000
- `canWithdraw()` returnerer true hvis balance >= withdrawLimit

I main: brug alle metoderne og print en kontooversigt.

<details>
<summary>Se svar</summary>

```java
String accountHolder = "Anna";
double balance = 1500.50;
double withdrawLimit = 500.0;

String getHolder() {
    return accountHolder;
}

double getBalance() {
    return balance;
}

double getWithdrawLimit() {
    return withdrawLimit;
}

boolean isRich() {
    return balance > 10000;
}

boolean canWithdraw() {
    return balance >= withdrawLimit;
}

void main() {
    System.out.println("=== Account Overview ===");
    System.out.println("Holder: " + getHolder());
    System.out.println("Balance: " + getBalance() + " kr");
    System.out.println("Withdraw limit: " + getWithdrawLimit() + " kr");
    System.out.println("Is rich: " + isRich());
    System.out.println("Can withdraw: " + canWithdraw());
}
// Output:
// === Account Overview ===
// Holder: Anna
// Balance: 1500.5 kr
// Withdraw limit: 500.0 kr
// Is rich: false
// Can withdraw: true
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem en void metode og en return metode?
2. Hvorfor er det vigtigt at gemme return værdien i en variabel?
3. Hvad sker der hvis du kalder en return metode uden at bruge værdien?
4. Hvordan kan du bruge en return værdi i en beregning?
5. Hvornår er det smart at lade én return metode kalde en anden?
6. Hvordan fungerer boolean return metoder i if-statements?
7. Hvad betyder det at "alle paths skal returnere"?
8. Hvornår skal du bruge void vs return?
