# Level 2: Writing & Calling Void Methods (With Parameters) - Opgaver

## Indhold

- [ ] [Del A: Single Parameter Basics](#del-a-single-parameter-basics)
- [ ] [Del B: Different Data Types](#del-b-different-data-types)
- [ ] [Del C: Multiple Parameters](#del-c-multiple-parameters)
- [ ] [Del D: Parameters with Logic](#del-d-parameters-with-logic)
- [ ] [Del E: Parameters with Loops](#del-e-parameters-with-loops)
- [ ] [Del F: Combining Concepts](#del-f-combining-concepts)

---

## Del A: Single Parameter Basics

### Opgave 2.1: Din første parameter
**Opgave:**
Skriv en metode `printName(String name)` der printer "Name: " efterfulgt af det navn der sendes ind. Kald den med dit eget navn.

<details>
<summary>Se svar</summary>

```java
void printName(String name) {
    System.out.println("Name: " + name);
}

void main() {
    printName("Anna");
}
// Output: Name: Anna
```
</details>

---

### Opgave 2.2: Kald med forskellige værdier
**Opgave:**
Brug `printName()` fra opgave 2.1. Kald den 3 gange med 3 forskellige navne.

<details>
<summary>Se svar</summary>

```java
void printName(String name) {
    System.out.println("Name: " + name);
}

void main() {
    printName("Anna");
    printName("Mikkel");
    printName("Sofie");
}
// Output:
// Name: Anna
// Name: Mikkel
// Name: Sofie
```
</details>

---

### Opgave 2.3: Greeting metode
**Opgave:**
Skriv metode `greet(String name)` der printer "Hello, [name]!". Test med mindst 2 navne.

<details>
<summary>Se svar</summary>

```java
void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

void main() {
    greet("Anna");
    greet("Mikkel");
}
// Output:
// Hello, Anna!
// Hello, Mikkel!
```
</details>

---

### Opgave 2.4: Brug variabel som argument
**Opgave:**
Lav en variabel `String myName = "Dit navn"`. Kald `greet()` metoden med variablen som argument.

<details>
<summary>Se svar</summary>

```java
void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

void main() {
    String myName = "Anna";
    greet(myName);
}
// Output: Hello, Anna!
```
</details>

---

### Opgave 2.5: Print message
**Opgave:**
Skriv metode `printMessage(String message)` der printer beskeden omgivet af stjerner: `*** [message] ***`.

<details>
<summary>Se svar</summary>

```java
void printMessage(String message) {
    System.out.println("*** " + message + " ***");
}

void main() {
    printMessage("Hello");
    printMessage("Important!");
}
// Output:
// *** Hello ***
// *** Important! ***
```
</details>

---

### Opgave 2.6: Hvad printer dette?
**Opgave:**
Hvad bliver output af dette program?
```java
void announce(String text) {
    System.out.println(">>> " + text + " <<<");
}

void main() {
    announce("Start");
    announce("Middle");
    announce("End");
}
```

<details>
<summary>Se svar</summary>

```
>>> Start <<<
>>> Middle <<<
>>> End <<<
```

Metoden kaldes 3 gange med forskellige argumenter.
</details>

---

### Opgave 2.7: Shout metode
**Opgave:**
Skriv metode `shout(String text)` der printer teksten med store bogstaver. Brug `.toUpperCase()`.

<details>
<summary>Se svar</summary>

```java
void shout(String text) {
    System.out.println(text.toUpperCase());
}

void main() {
    shout("hello");
    shout("this is important");
}
// Output:
// HELLO
// THIS IS IMPORTANT
```
</details>

---

### Opgave 2.8: Whisper metode
**Opgave:**
Skriv metode `whisper(String text)` der printer teksten med små bogstaver. Brug `.toLowerCase()`.

<details>
<summary>Se svar</summary>

```java
void whisper(String text) {
    System.out.println(text.toLowerCase());
}

void main() {
    whisper("HELLO");
    whisper("STOP SHOUTING");
}
// Output:
// hello
// stop shouting
```
</details>

---

## Del B: Different Data Types

### Opgave 2.9: int parameter
**Opgave:**
Skriv metode `printNumber(int number)` der printer "Number: " efterfulgt af tallet. Test med værdier 10, 42, og 100.

<details>
<summary>Se svar</summary>

```java
void printNumber(int number) {
    System.out.println("Number: " + number);
}

void main() {
    printNumber(10);
    printNumber(42);
    printNumber(100);
}
// Output:
// Number: 10
// Number: 42
// Number: 100
```
</details>

---

### Opgave 2.10: double parameter
**Opgave:**
Skriv metode `printPrice(double price)` der printer "Price: " efterfulgt af prisen og " kr". Test med 29.95 og 149.00.

<details>
<summary>Se svar</summary>

```java
void printPrice(double price) {
    System.out.println("Price: " + price + " kr");
}

void main() {
    printPrice(29.95);
    printPrice(149.00);
}
// Output:
// Price: 29.95 kr
// Price: 149.0 kr
```
</details>

---

### Opgave 2.11: boolean parameter
**Opgave:**
Skriv metode `printStatus(boolean active)` der printer "Active: " efterfulgt af værdien. Test med true og false.

<details>
<summary>Se svar</summary>

```java
void printStatus(boolean active) {
    System.out.println("Active: " + active);
}

void main() {
    printStatus(true);
    printStatus(false);
}
// Output:
// Active: true
// Active: false
```
</details>

---

### Opgave 2.12: char parameter
**Opgave:**
Skriv metode `printGrade(char grade)` der printer "Grade: " efterfulgt af karakteren. Test med 'A', 'B', og 'C'.

<details>
<summary>Se svar</summary>

```java
void printGrade(char grade) {
    System.out.println("Grade: " + grade);
}

void main() {
    printGrade('A');
    printGrade('B');
    printGrade('C');
}
// Output:
// Grade: A
// Grade: B
// Grade: C
```
</details>

---

### Opgave 2.13: Variabel til int parameter
**Opgave:**
Lav variabel `int score = 85`. Skriv metode `printScore(int points)` der printer scoren. Kald metoden med variablen.

<details>
<summary>Se svar</summary>

```java
void printScore(int points) {
    System.out.println("Score: " + points + " points");
}

void main() {
    int score = 85;
    printScore(score);
}
// Output: Score: 85 points
```
</details>

---

### Opgave 2.14: Expression som argument
**Opgave:**
Brug `printNumber(int number)` fra opgave 2.9. Kald den med expressions: `5 + 3`, `10 * 2`, og `100 / 4`.

<details>
<summary>Se svar</summary>

```java
void printNumber(int number) {
    System.out.println("Number: " + number);
}

void main() {
    printNumber(5 + 3);
    printNumber(10 * 2);
    printNumber(100 / 4);
}
// Output:
// Number: 8
// Number: 20
// Number: 25
```
</details>

---

### Opgave 2.15: Print temperature
**Opgave:**
Skriv metode `printTemperature(double temp)` der printer temperaturen efterfulgt af " C".

<details>
<summary>Se svar</summary>

```java
void printTemperature(double temp) {
    System.out.println("Temperature: " + temp + " C");
}

void main() {
    printTemperature(20.5);
    printTemperature(-5.0);
    printTemperature(37.2);
}
// Output:
// Temperature: 20.5 C
// Temperature: -5.0 C
// Temperature: 37.2 C
```
</details>

---

### Opgave 2.16: Print percentage
**Opgave:**
Skriv metode `printPercentage(int percent)` der printer tallet efterfulgt af "%".

<details>
<summary>Se svar</summary>

```java
void printPercentage(int percent) {
    System.out.println(percent + "%");
}

void main() {
    printPercentage(50);
    printPercentage(100);
    printPercentage(75);
}
// Output:
// 50%
// 100%
// 75%
```
</details>

---

## Del C: Multiple Parameters

### Opgave 2.17: To String parametre
**Opgave:**
Skriv metode `printFullName(String firstName, String lastName)` der printer fornavn og efternavn med et mellemrum imellem.

<details>
<summary>Se svar</summary>

```java
void printFullName(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
}

void main() {
    printFullName("Anna", "Jensen");
    printFullName("Mikkel", "Hansen");
}
// Output:
// Anna Jensen
// Mikkel Hansen
```
</details>

---

### Opgave 2.18: String og int parametre
**Opgave:**
Skriv metode `printPerson(String name, int age)` der printer "[name] is [age] years old".

<details>
<summary>Se svar</summary>

```java
void printPerson(String name, int age) {
    System.out.println(name + " is " + age + " years old");
}

void main() {
    printPerson("Anna", 25);
    printPerson("Mikkel", 30);
}
// Output:
// Anna is 25 years old
// Mikkel is 30 years old
```
</details>

---

### Opgave 2.19: Tre parametre
**Opgave:**
Skriv metode `printProduct(String name, double price, int quantity)` der printer alle tre informationer på separate linjer.

<details>
<summary>Se svar</summary>

```java
void printProduct(String name, double price, int quantity) {
    System.out.println("Product: " + name);
    System.out.println("Price: " + price + " kr");
    System.out.println("Quantity: " + quantity);
}

void main() {
    printProduct("Milk", 12.50, 2);
    printProduct("Bread", 25.00, 1);
}
```
</details>

---

### Opgave 2.20: Hvad sker der? (rækkefølge)
**Opgave:**
Hvad printer dette? Eller giver det fejl?
```java
void showInfo(String name, int value) {
    System.out.println(name + " = " + value);
}

void main() {
    showInfo("Score", 100);
    showInfo("Lives", 3);
}
```

<details>
<summary>Se svar</summary>

```
Score = 100
Lives = 3
```

Argumenterne matcher parametre i rækkefølge: String til name, int til value.
</details>

---

### Opgave 2.21: Labeled value
**Opgave:**
Skriv metode `printLabeled(String label, String value)` der printer "[label]: [value]".

<details>
<summary>Se svar</summary>

```java
void printLabeled(String label, String value) {
    System.out.println(label + ": " + value);
}

void main() {
    printLabeled("Name", "Anna");
    printLabeled("City", "Copenhagen");
    printLabeled("Country", "Denmark");
}
// Output:
// Name: Anna
// City: Copenhagen
// Country: Denmark
```
</details>

---

### Opgave 2.22: Print rectangle dimensions
**Opgave:**
Skriv metode `printRectangle(int width, int height)` der printer "Rectangle: [width] x [height]".

<details>
<summary>Se svar</summary>

```java
void printRectangle(int width, int height) {
    System.out.println("Rectangle: " + width + " x " + height);
}

void main() {
    printRectangle(10, 5);
    printRectangle(20, 8);
}
// Output:
// Rectangle: 10 x 5
// Rectangle: 20 x 8
```
</details>

---

### Opgave 2.23: Print coordinates
**Opgave:**
Skriv metode `printCoordinates(int x, int y)` der printer koordinaterne i formatet "(x, y)".

<details>
<summary>Se svar</summary>

```java
void printCoordinates(int x, int y) {
    System.out.println("(" + x + ", " + y + ")");
}

void main() {
    printCoordinates(0, 0);
    printCoordinates(10, 20);
    printCoordinates(-5, 15);
}
// Output:
// (0, 0)
// (10, 20)
// (-5, 15)
```
</details>

---

### Opgave 2.24: Print range
**Opgave:**
Skriv metode `printRange(int min, int max)` der printer "Range: [min] to [max]".

<details>
<summary>Se svar</summary>

```java
void printRange(int min, int max) {
    System.out.println("Range: " + min + " to " + max);
}

void main() {
    printRange(1, 10);
    printRange(0, 100);
}
// Output:
// Range: 1 to 10
// Range: 0 to 100
```
</details>

---

## Del D: Parameters with Logic

### Opgave 2.25: Check positive
**Opgave:**
Skriv metode `printIfPositive(int number)` der KUN printer tallet hvis det er positivt (> 0).

<details>
<summary>Se svar</summary>

```java
void printIfPositive(int number) {
    if (number > 0) {
        System.out.println(number);
    }
}

void main() {
    printIfPositive(10);   // Printer 10
    printIfPositive(-5);   // Printer intet
    printIfPositive(0);    // Printer intet
}
// Output:
// 10
```
</details>

---

### Opgave 2.26: Check even or odd
**Opgave:**
Skriv metode `printEvenOdd(int number)` der printer om tallet er lige ("even") eller ulige ("odd").

<details>
<summary>Se svar</summary>

```java
void printEvenOdd(int number) {
    if (number % 2 == 0) {
        System.out.println(number + " is even");
    } else {
        System.out.println(number + " is odd");
    }
}

void main() {
    printEvenOdd(4);
    printEvenOdd(7);
    printEvenOdd(10);
}
// Output:
// 4 is even
// 7 is odd
// 10 is even
```
</details>

---

### Opgave 2.27: Age category
**Opgave:**
Skriv metode `printAgeCategory(int age)` der printer:
- "Child" hvis alderen er under 13
- "Teenager" hvis alderen er 13-19
- "Adult" hvis alderen er 20 eller over

<details>
<summary>Se svar</summary>

```java
void printAgeCategory(int age) {
    if (age < 13) {
        System.out.println("Child");
    } else if (age < 20) {
        System.out.println("Teenager");
    } else {
        System.out.println("Adult");
    }
}

void main() {
    printAgeCategory(8);
    printAgeCategory(15);
    printAgeCategory(25);
}
// Output:
// Child
// Teenager
// Adult
```
</details>

---

### Opgave 2.28: Grade to text
**Opgave:**
Skriv metode `printGradeText(int score)` der printer:
- "Excellent" hvis score er 90 eller over
- "Good" hvis score er 70 eller over
- "Pass" hvis score er 50 eller over
- "Fail" ellers

<details>
<summary>Se svar</summary>

```java
void printGradeText(int score) {
    if (score >= 90) {
        System.out.println("Excellent");
    } else if (score >= 70) {
        System.out.println("Good");
    } else if (score >= 50) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }
}

void main() {
    printGradeText(95);
    printGradeText(75);
    printGradeText(55);
    printGradeText(30);
}
// Output:
// Excellent
// Good
// Pass
// Fail
```
</details>

---

### Opgave 2.29: Boolean conditional
**Opgave:**
Skriv metode `printActiveStatus(boolean active)` der printer "Status: ACTIVE" eller "Status: INACTIVE" afhængig af værdien.

<details>
<summary>Se svar</summary>

```java
void printActiveStatus(boolean active) {
    if (active) {
        System.out.println("Status: ACTIVE");
    } else {
        System.out.println("Status: INACTIVE");
    }
}

void main() {
    printActiveStatus(true);
    printActiveStatus(false);
}
// Output:
// Status: ACTIVE
// Status: INACTIVE
```
</details>

---

### Opgave 2.30: Print sign
**Opgave:**
Skriv metode `printSign(int number)` der printer om tallet er "positive", "negative", eller "zero".

<details>
<summary>Se svar</summary>

```java
void printSign(int number) {
    if (number > 0) {
        System.out.println(number + " is positive");
    } else if (number < 0) {
        System.out.println(number + " is negative");
    } else {
        System.out.println(number + " is zero");
    }
}

void main() {
    printSign(10);
    printSign(-5);
    printSign(0);
}
// Output:
// 10 is positive
// -5 is negative
// 0 is zero
```
</details>

---

### Opgave 2.31: Compare two numbers
**Opgave:**
Skriv metode `printLarger(int a, int b)` der printer det største af de to tal (eller "They are equal" hvis de er ens).

<details>
<summary>Se svar</summary>

```java
void printLarger(int a, int b) {
    if (a > b) {
        System.out.println(a);
    } else if (b > a) {
        System.out.println(b);
    } else {
        System.out.println("They are equal: " + a);
    }
}

void main() {
    printLarger(10, 5);
    printLarger(3, 8);
    printLarger(7, 7);
}
// Output:
// 10
// 8
// They are equal: 7
```
</details>

---

### Opgave 2.32: Print absolute
**Opgave:**
Skriv metode `printAbsolute(int number)` der printer den absolutte værdi (tallet uden fortegn, altså altid positivt).

<details>
<summary>Se svar</summary>

```java
void printAbsolute(int number) {
    if (number < 0) {
        System.out.println(-number);
    } else {
        System.out.println(number);
    }
}

void main() {
    printAbsolute(10);
    printAbsolute(-10);
    printAbsolute(0);
}
// Output:
// 10
// 10
// 0
```
</details>

---

## Del E: Parameters with Loops

### Opgave 2.33: Print stars
**Opgave:**
Skriv metode `printStars(int count)` der printer stjerner på én linje. Parameteren bestemmer hvor mange stjerner.
- `printStars(3)` → `***`
- `printStars(5)` → `*****`

<details>
<summary>Se svar</summary>

```java
void printStars(int count) {
    for (int i = 0; i < count; i++) {
        System.out.print("*");
    }
    System.out.println();
}

void main() {
    printStars(3);
    printStars(5);
    printStars(10);
}
// Output:
// ***
// *****
// **********
```
</details>

---

### Opgave 2.34: Print character n times
**Opgave:**
Skriv metode `printChar(char c, int count)` der printer et tegn flere gange på én linje. Første parameter er tegnet, anden parameter bestemmer hvor mange gange.
- `printChar('*', 5)` → `*****`
- `printChar('-', 3)` → `---`

<details>
<summary>Se svar</summary>

```java
void printChar(char c, int count) {
    for (int i = 0; i < count; i++) {
        System.out.print(c);
    }
    System.out.println();
}

void main() {
    printChar('*', 5);
    printChar('-', 10);
    printChar('#', 3);
}
// Output:
// *****
// ----------
// ###
```
</details>

---

### Opgave 2.35: Print countdown
**Opgave:**
Skriv metode `printCountdown(int start)` der printer en nedtælling fra starttallet ned til 1.
- `printCountdown(3)` printer: 3, 2, 1 (på separate linjer)

<details>
<summary>Se svar</summary>

```java
void printCountdown(int start) {
    for (int i = start; i >= 1; i--) {
        System.out.println(i);
    }
}

void main() {
    printCountdown(5);
}
// Output:
// 5
// 4
// 3
// 2
// 1
```
</details>

---

### Opgave 2.36: Print range of numbers
**Opgave:**
Skriv metode `printNumberRange(int from, int to)` der printer alle tal i et interval. Første parameter er starttallet, anden parameter er sluttallet (begge inklusiv).
- `printNumberRange(1, 3)` printer: 1, 2, 3 (på separate linjer)

<details>
<summary>Se svar</summary>

```java
void printNumberRange(int from, int to) {
    for (int i = from; i <= to; i++) {
        System.out.println(i);
    }
}

void main() {
    printNumberRange(1, 5);
    System.out.println("---");
    printNumberRange(10, 15);
}
// Output:
// 1
// 2
// 3
// 4
// 5
// ---
// 10
// 11
// 12
// 13
// 14
// 15
```
</details>

---

### Opgave 2.37: Print repeated message
**Opgave:**
Skriv metode `printRepeated(String message, int times)` der printer en besked flere gange. Første parameter er beskeden, anden parameter bestemmer hvor mange gentagelser.
- `printRepeated("Hi", 3)` printer "Hi" tre gange (på separate linjer)

<details>
<summary>Se svar</summary>

```java
void printRepeated(String message, int times) {
    for (int i = 0; i < times; i++) {
        System.out.println(message);
    }
}

void main() {
    printRepeated("Hello!", 3);
}
// Output:
// Hello!
// Hello!
// Hello!
```
</details>

---

### Opgave 2.38: Print square
**Opgave:**
Skriv metode `printSquare(int size)` der printer et kvadrat af stjerner. Parameteren bestemmer størrelsen (både bredde og højde).
- `printSquare(3)` printer et 3x3 kvadrat af stjerner

<details>
<summary>💡 Trin-for-trin guide</summary>

1. **Forstå opgaven:** Du skal printe et kvadrat. Hvis size er 3, skal du printe 3 rækker med 3 stjerner i hver.

2. **Ydre loop:** Start med et loop der kører én gang per række:
   ```java
   for (int row = 0; row < size; row++) {
       // Her skal vi printe én række
   }
   ```

3. **Indre loop:** Inde i det ydre loop, lav et nyt loop der printer stjerner:
   ```java
   for (int col = 0; col < size; col++) {
       System.out.print("*");
   }
   ```

4. **Ny linje:** Efter det indre loop, print en tom linje så næste række starter på en ny linje:
   ```java
   System.out.println();
   ```

5. **Sæt det sammen:** Kombinér alle delene i metoden.
</details>

<details>
<summary>Se svar</summary>

```java
void printSquare(int size) {
    for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

void main() {
    printSquare(3);
    System.out.println();
    printSquare(5);
}
// Output:
// ***
// ***
// ***
//
// *****
// *****
// *****
// *****
// *****
```
</details>

---

### Opgave 2.39: Print triangle
**Opgave:**
Skriv metode `printTriangle(int height)` der printer en trekant af stjerner. Parameteren bestemmer højden. Første række har 1 stjerne, anden række har 2 stjerner, osv.
- `printTriangle(4)` printer en trekant med 4 rækker

<details>
<summary>💡 Trin-for-trin guide</summary>

1. **Forstå mønsteret:** 
   - Række 1: 1 stjerne
   - Række 2: 2 stjerner
   - Række 3: 3 stjerner
   - Række N: N stjerner

2. **Ydre loop:** Lav et loop fra 1 til height (inklusiv):
   ```java
   for (int row = 1; row <= height; row++) {
       // row fortæller os hvilket rækkenummer vi er på
   }
   ```

3. **Indre loop:** For hver række, print lige så mange stjerner som rækkenummeret:
   ```java
   for (int star = 0; star < row; star++) {
       System.out.print("*");
   }
   ```

4. **Ny linje:** Efter stjernerne, gå til næste linje.
</details>

<details>
<summary>Se svar</summary>

```java
void printTriangle(int height) {
    for (int row = 1; row <= height; row++) {
        for (int star = 0; star < row; star++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

void main() {
    printTriangle(4);
}
// Output:
// *
// **
// ***
// ****
```
</details>

---

### Opgave 2.40: Print multiplication table row
**Opgave:**
Skriv metode `printTableRow(int number)` der printer gangetabellen for et tal (fra 1 til 10). Parameteren er det tal, der skal ganges.
- `printTableRow(5)` printer: "5 x 1 = 5", "5 x 2 = 10", ... "5 x 10 = 50"

<details>
<summary>Se svar</summary>

```java
void printTableRow(int number) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    }
}

void main() {
    printTableRow(5);
}
// Output:
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// ... etc
```
</details>

---

## Del F: Combining Concepts

### Opgave 2.41: Method kalder method med parameter
**Opgave:**
Skriv to metoder:
1. `printDivider(int length)` - printer en linje af bindestreger. Parameteren bestemmer længden.
2. `printSection(String title, int width)` - printer en sektion med titel. Den skal kalde printDivider før og efter titlen.

<details>
<summary>💡 Trin-for-trin guide</summary>

1. **Lav printDivider først:** Denne metode skal bare printe bindestreger i et loop, ligesom printStars.

2. **Lav printSection:** Denne metode skal:
   - Kalde `printDivider(width)`
   - Printe titlen
   - Kalde `printDivider(width)` igen

3. **Test det:** Kald printSection fra main og se om det virker.
</details>

<details>
<summary>Se svar</summary>

```java
void printDivider(int length) {
    for (int i = 0; i < length; i++) {
        System.out.print("-");
    }
    System.out.println();
}

void printSection(String title, int width) {
    printDivider(width);
    System.out.println(title);
    printDivider(width);
}

void main() {
    printSection("Introduction", 20);
    System.out.println("Content here...");
    printSection("Conclusion", 20);
}
// Output:
// --------------------
// Introduction
// --------------------
// Content here...
// --------------------
// Conclusion
// --------------------
```
</details>

---

### Opgave 2.42: Validate and print
**Opgave:**
Skriv metode `printValidAge(int age)` der:
- Printer alderen hvis den er mellem 0 og 150
- Printer "Invalid age" ellers

<details>
<summary>Se svar</summary>

```java
void printValidAge(int age) {
    if (age >= 0 && age <= 150) {
        System.out.println("Age: " + age);
    } else {
        System.out.println("Invalid age");
    }
}

void main() {
    printValidAge(25);
    printValidAge(-5);
    printValidAge(200);
}
// Output:
// Age: 25
// Invalid age
// Invalid age
```
</details>

---

### Opgave 2.43: Calculate and print
**Opgave:**
Skriv metode `printRectangleArea(int width, int height)` der beregner arealet af et rektangel og printer både dimensionerne og arealet.

<details>
<summary>Se svar</summary>

```java
void printRectangleArea(int width, int height) {
    int area = width * height;
    System.out.println("Rectangle " + width + " x " + height);
    System.out.println("Area: " + area);
}

void main() {
    printRectangleArea(5, 3);
    printRectangleArea(10, 4);
}
// Output:
// Rectangle 5 x 3
// Area: 15
// Rectangle 10 x 4
// Area: 40
```
</details>

---

### Opgave 2.44: Progress bar
**Opgave:**
Skriv metode `printProgressBar(int percent)` der printer en progress bar. Parameteren er procenten (0-100). Baren skal være 10 tegn bred.
- `printProgressBar(0)` → `[          ] 0%`
- `printProgressBar(50)` → `[=====     ] 50%`
- `printProgressBar(100)` → `[==========] 100%`

<details>
<summary>💡 Trin-for-trin guide</summary>

1. **Beregn antal fyldte felter:** Hvis procent er 50 og baren er 10 tegn bred, skal 5 felter være fyldte. Formel: `int filled = percent / 10;`

2. **Beregn antal tomme felter:** Resten af de 10 felter. Formel: `int empty = 10 - filled;`

3. **Print startklammer:** `System.out.print("[");`

4. **Print fyldte felter:** Brug et loop til at printe `=` tegn:
   ```java
   for (int i = 0; i < filled; i++) {
       System.out.print("=");
   }
   ```

5. **Print tomme felter:** Brug et loop til at printe mellemrum:
   ```java
   for (int i = 0; i < empty; i++) {
       System.out.print(" ");
   }
   ```

6. **Print slutklammer og procent:** `System.out.println("] " + percent + "%");`
</details>

<details>
<summary>Se svar</summary>

```java
void printProgressBar(int percent) {
    int filled = percent / 10;
    int empty = 10 - filled;
    
    System.out.print("[");
    for (int i = 0; i < filled; i++) {
        System.out.print("=");
    }
    for (int i = 0; i < empty; i++) {
        System.out.print(" ");
    }
    System.out.println("] " + percent + "%");
}

void main() {
    printProgressBar(0);
    printProgressBar(30);
    printProgressBar(50);
    printProgressBar(80);
    printProgressBar(100);
}
// Output:
// [          ] 0%
// [===       ] 30%
// [=====     ] 50%
// [========  ] 80%
// [==========] 100%
```
</details>

---

### Opgave 2.45: Array parameter
**Opgave:**
Skriv metode `printAllNumbers(int[] numbers)` der printer alle tal i et array (ét tal per linje).

<details>
<summary>Se svar</summary>

```java
void printAllNumbers(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}

void main() {
    int[] myNumbers = {10, 20, 30, 40, 50};
    printAllNumbers(myNumbers);
}
// Output:
// 10
// 20
// 30
// 40
// 50
```
</details>

---

### Opgave 2.46: Print array with label
**Opgave:**
Skriv metode `printArrayWithLabel(String label, int[] numbers)` der først printer en overskrift og derefter alle tallene (indrykket med to mellemrum).

<details>
<summary>Se svar</summary>

```java
void printArrayWithLabel(String label, int[] numbers) {
    System.out.println(label + ":");
    for (int i = 0; i < numbers.length; i++) {
        System.out.println("  " + numbers[i]);
    }
}

void main() {
    int[] scores = {85, 90, 78};
    printArrayWithLabel("Scores", scores);
}
// Output:
// Scores:
//   85
//   90
//   78
```
</details>

---

### Opgave 2.47: Print array sum
**Opgave:**
Skriv metode `printArraySum(int[] numbers)` der beregner summen af alle tal i arrayet og printer resultatet.

<details>
<summary>Se svar</summary>

```java
void printArraySum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
    }
    System.out.println("Sum: " + sum);
}

void main() {
    int[] myNumbers = {1, 2, 3, 4, 5};
    printArraySum(myNumbers);
}
// Output: Sum: 15
```
</details>

---

### Opgave 2.48: Complete user profile display
**Opgave:**
Skriv disse tre metoder der arbejder sammen:
1. `printHeader(String title)` - printer en titel med "===" foran
2. `printField(String label, String value)` - printer "label: value"
3. `printProfile(String name, int age, String city)` - bruger de andre metoder til at printe en pæn profil

<details>
<summary>💡 Trin-for-trin guide</summary>

1. **Start med printHeader:**
   ```java
   void printHeader(String title) {
       System.out.println("=== " + title + " ===");
   }
   ```

2. **Lav printField:**
   ```java
   void printField(String label, String value) {
       System.out.println(label + ": " + value);
   }
   ```

3. **Lav printProfile der kalder de andre:**
   - Kald `printHeader("User Profile")`
   - Kald `printField` tre gange med navn, alder og by
   - Bemærk: alder er en int, men printField tager String. Du kan konvertere med `"" + age`
   - Print en afsluttende linje med `=` tegn

4. **Test det hele fra main**
</details>

<details>
<summary>Se svar</summary>

```java
void printHeader(String title) {
    System.out.println("=== " + title + " ===");
}

void printField(String label, String value) {
    System.out.println(label + ": " + value);
}

void printProfile(String name, int age, String city) {
    printHeader("User Profile");
    printField("Name", name);
    printField("Age", "" + age);
    printField("City", city);
    System.out.println("================");
}

void main() {
    printProfile("Anna", 25, "Copenhagen");
    System.out.println();
    printProfile("Mikkel", 30, "Aarhus");
}
// Output:
// === User Profile ===
// Name: Anna
// Age: 25
// City: Copenhagen
// ================
//
// === User Profile ===
// Name: Mikkel
// Age: 30
// City: Aarhus
// ================
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem en parameter og et argument?
2. Hvorfor er parametre nyttige?
3. Hvad sker der hvis du giver forkert antal argumenter?
4. Hvad sker der hvis argumenternes typer ikke matcher parametrene?
5. Hvordan gør parametre metoder mere genbrugelige?
6. Hvornår skal du bruge én parameter vs flere parametre?
7. Hvordan kan du videregive en parameter til en anden metode?
8. Hvad er fordelen ved at kombinere parametre med if/else og loops?
