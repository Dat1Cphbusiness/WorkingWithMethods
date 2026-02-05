# Level 4: Writing & Calling Return Methods (With Parameters)

## Begrebsgennemgang

### Hvad Du Har Lært

| Level | Metode type | Eksempel |
|-------|-------------|----------|
| 1 | void, ingen parametre | `void sayHello()` |
| 2 | void, med parametre | `void greet(String name)` |
| 3 | return, ingen parametre | `int getScore()` |
| **4** | **return, med parametre** | **`int double(int n)`** |

**Nu kombinerer vi det hele:** Metoder der både **modtager input** OG **giver output tilbage**.

---

## Hvorfor Return + Parametre?

**Level 3 problem:**
```java
int number = 5;  // Variabel udenfor metoden

int getDouble() {
    return number * 2;  // Kun én fast variabel
}

void main() {
    System.out.println(getDouble());  // Altid 10
    // Hvad hvis jeg vil double 7? Eller 100?
}
```

**Level 4 løsning:**
```java
int double(int n) {
    return n * 2;  // Virker med ENHVER værdi!
}

void main() {
    System.out.println(double(5));    // 10
    System.out.println(double(7));    // 14
    System.out.println(double(100));  // 200
}
```

**Parameter + Return = Fleksibel beregning!**

---

## Anatomi af en Return Metode med Parameter

```java
int double(int number) {
    return number * 2;
}
```

**Komponenter:**
1. **`int`** - Return type (hvad kommer tilbage)
2. **`double`** - Metodens navn
3. **`int number`** - Parameter (hvad går ind)
4. **`return number * 2`** - Beregning og returnering

**Tænk på det som en maskine:**
```
   INPUT          MASKINE           OUTPUT
     ↓               ↓                ↓
    (5)    →    [× 2]    →          10
    (7)    →    [× 2]    →          14
   (100)   →    [× 2]    →         200
```

---

## Din Første Parameter + Return Metode

```java
int addTen(int number) {
    return number + 10;
}

void main() {
    int result = addTen(5);  // result = 15
    System.out.println(result);
}
```

**Hvad sker der trin for trin?**

1. `addTen(5)` kaldes med argument 5
2. Inde i metoden: `number` = 5
3. Beregning: `number + 10` = 5 + 10 = 15
4. `return 15` sender 15 tilbage
5. `int result = 15`
6. Print: 15

---

## Brug Return Værdien

Ligesom i Level 3 skal du **gøre noget med værdien**:

**Gem i variabel:**
```java
int result = addTen(5);
System.out.println(result);
```

**Brug direkte:**
```java
System.out.println(addTen(5));
```

**Brug i beregning:**
```java
int total = addTen(5) + addTen(3);  // 15 + 13 = 28
```

**Som argument til anden metode:**
```java
System.out.println(addTen(addTen(5)));  // addTen(15) = 25
```

---

## Simple Beregningsmetoder

### Addition
```java
int add(int a, int b) {
    return a + b;
}

void main() {
    int sum = add(5, 3);
    System.out.println(sum);  // 8
}
```

### Subtraktion
```java
int subtract(int a, int b) {
    return a - b;
}
```

### Multiplikation
```java
int multiply(int a, int b) {
    return a * b;
}
```

### Division
```java
double divide(double a, double b) {
    return a / b;
}
```

---

## Forskellige Parameter og Return Typer

**int → int:**
```java
int square(int n) {
    return n * n;
}
```

**double → double:**
```java
double half(double n) {
    return n / 2;
}
```

**String → int:**
```java
int getLength(String text) {
    return text.length();
}
```

**int → boolean:**
```java
boolean isPositive(int n) {
    return n > 0;
}
```

**String → String:**
```java
String addExclamation(String text) {
    return text + "!";
}
```

---

## Boolean Metoder med Parameter

Super nyttigt til validering:

```java
boolean isAdult(int age) {
    return age >= 18;
}

boolean isValidScore(int score) {
    return score >= 0 && score <= 100;
}

boolean isLongEnough(String password) {
    return password.length() >= 8;
}

void main() {
    System.out.println(isAdult(20));           // true
    System.out.println(isAdult(15));           // false
    System.out.println(isValidScore(85));      // true
    System.out.println(isValidScore(150));     // false
    System.out.println(isLongEnough("abc"));   // false
    System.out.println(isLongEnough("password123"));  // true
}
```

---

## Boolean Metoder i if-statements

```java
boolean canVote(int age) {
    return age >= 18;
}

void main() {
    int personAge = 16;
    
    if (canVote(personAge)) {
        System.out.println("You can vote!");
    } else {
        System.out.println("Too young to vote");
    }
}
// Output: Too young to vote
```

**Hvad sker der?**
1. `canVote(16)` kaldes
2. Metoden beregner: 16 >= 18 = false
3. `return false`
4. `if (false)` → else-blokken kører

---

## Flere Parametre

```java
int calculateArea(int width, int height) {
    return width * height;
}

void main() {
    int area = calculateArea(10, 5);
    System.out.println("Area: " + area);  // 50
}
```

**Tre parametre:**
```java
double calculateVolume(double length, double width, double height) {
    return length * width * height;
}

void main() {
    double vol = calculateVolume(2.0, 3.0, 4.0);
    System.out.println("Volume: " + vol);  // 24.0
}
```

---

## Conditional Returns

Metoden kan returnere forskellige værdier baseret på input:

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
    System.out.println(getGrade(95));  // A
    System.out.println(getGrade(72));  // C
    System.out.println(getGrade(45));  // F
}
```

---

## Max og Min

```java
int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

int min(int a, int b) {
    if (a < b) {
        return a;
    } else {
        return b;
    }
}

void main() {
    System.out.println(max(10, 25));  // 25
    System.out.println(min(10, 25));  // 10
}
```

---

## Absolut Værdi

```java
int abs(int n) {
    if (n < 0) {
        return -n;
    } else {
        return n;
    }
}

void main() {
    System.out.println(abs(10));   // 10
    System.out.println(abs(-10));  // 10
    System.out.println(abs(0));    // 0
}
```

---

## String Metoder

```java
String greet(String name) {
    return "Hello, " + name + "!";
}

String shout(String text) {
    return text.toUpperCase();
}

String whisper(String text) {
    return text.toLowerCase();
}

void main() {
    String greeting = greet("Anna");
    System.out.println(greeting);  // Hello, Anna!
    
    System.out.println(shout("hello"));   // HELLO
    System.out.println(whisper("HELLO")); // hello
}
```

---

## Gentag String

```java
String repeat(String text, int times) {
    String result = "";
    for (int i = 0; i < times; i++) {
        result = result + text;
    }
    return result;
}

void main() {
    String stars = repeat("*", 5);
    System.out.println(stars);  // *****
    
    String ha = repeat("Ha", 3);
    System.out.println(ha);  // HaHaHa
}
```

---

## Array Parameter

```java
int sum(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
        total = total + numbers[i];
    }
    return total;
}

int count(int[] numbers) {
    return numbers.length;
}

double average(int[] numbers) {
    return (double) sum(numbers) / count(numbers);
}

void main() {
    int[] data = {10, 20, 30, 40, 50};
    
    System.out.println("Sum: " + sum(data));      // 150
    System.out.println("Count: " + count(data));  // 5
    System.out.println("Avg: " + average(data));  // 30.0
}
```

---

## Find i Array

```java
boolean contains(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            return true;  // Fandt det!
        }
    }
    return false;  // Fandt det ikke
}

int indexOf(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            return i;  // Returner index
        }
    }
    return -1;  // Ikke fundet
}

void main() {
    int[] data = {5, 10, 15, 20, 25};
    
    System.out.println(contains(data, 15));  // true
    System.out.println(contains(data, 99));  // false
    
    System.out.println(indexOf(data, 15));   // 2
    System.out.println(indexOf(data, 99));   // -1
}
```

---

## Metoder Kalder Metoder

```java
int square(int n) {
    return n * n;
}

int sumOfSquares(int a, int b) {
    return square(a) + square(b);
}

void main() {
    int result = sumOfSquares(3, 4);
    System.out.println(result);  // 9 + 16 = 25
}
```

**Hvad sker der?**
1. `sumOfSquares(3, 4)` kaldes
2. `square(3)` kaldes → returnerer 9
3. `square(4)` kaldes → returnerer 16
4. 9 + 16 = 25
5. `return 25`

---

## Praktisk Eksempel: Prisberegning

```java
double calculateTax(double price, double taxRate) {
    return price * taxRate;
}

double calculateDiscount(double price, double discountPercent) {
    return price * (discountPercent / 100);
}

double calculateTotal(double price, double taxRate, double discountPercent) {
    double tax = calculateTax(price, taxRate);
    double discount = calculateDiscount(price, discountPercent);
    return price + tax - discount;
}

void main() {
    double price = 100.0;
    double taxRate = 0.25;      // 25%
    double discount = 10.0;     // 10%
    
    double total = calculateTotal(price, taxRate, discount);
    System.out.println("Total: " + total + " kr");  // 115.0 kr
}
```

---

## Praktisk Eksempel: Password Validering

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
    System.out.println(isValidPassword("abc"));        // false (for kort)
    System.out.println(isValidPassword("abcdefgh"));   // false (ingen tal)
    System.out.println(isValidPassword("abcdef12"));   // true
}
```

---

## Sammenligning: Alle 4 Typer

```java
// Level 1: void, ingen parametre
void sayHello() {
    System.out.println("Hello!");
}

// Level 2: void, med parametre
void sayHelloTo(String name) {
    System.out.println("Hello, " + name + "!");
}

// Level 3: return, ingen parametre
String getGreeting() {
    return "Hello!";
}

// Level 4: return, med parametre
String createGreeting(String name) {
    return "Hello, " + name + "!";
}

void main() {
    sayHello();                              // Printer: Hello!
    sayHelloTo("Anna");                      // Printer: Hello, Anna!
    
    String msg1 = getGreeting();             // msg1 = "Hello!"
    String msg2 = createGreeting("Anna");    // msg2 = "Hello, Anna!"
    
    System.out.println(msg1);
    System.out.println(msg2);
}
```

---

## Hvornår Bruger Du Hvad?

| Situation | Metode type |
|-----------|-------------|
| Vil bare printe noget | void |
| Vil printe med varierende data | void + parametre |
| Vil hente en fast værdi | return |
| Vil beregne noget baseret på input | **return + parametre** |

**Return + parametre er den mest fleksible** - brug den når du vil:
- Lave beregninger
- Validere input
- Transformere data
- Bygge genbrugelige "byggeklodser"

---

## Debugging Tips

### Fejl 1: Glemmer at bruge return værdien
```java
int add(int a, int b) {
    return a + b;
}

void main() {
    add(5, 3);  // Returner 8, men vi bruger det ikke!
}
```
**Fix:** `int result = add(5, 3);`

### Fejl 2: Forkert antal/type argumenter
```java
int add(int a, int b) {
    return a + b;
}

void main() {
    add(5);        // FEJL: mangler argument
    add("5", 3);   // FEJL: forkert type
}
```

### Fejl 3: Return type matcher ikke
```java
int getMessage() {       // Siger int
    return "Hello";      // Returnerer String - FEJL!
}
```

### Fejl 4: Ikke alle paths returnerer
```java
String getSign(int n) {
    if (n > 0) {
        return "positive";
    } else if (n < 0) {
        return "negative";
    }
    // Hvad hvis n == 0? Ingen return!
}
```
**Fix:** Tilføj `else { return "zero"; }`

---

## Navngivning

**Beregninger - beskriv hvad der returneres:**
```java
int calculateArea(int w, int h) { }
double computeAverage(int[] nums) { }
String formatName(String first, String last) { }
```

**Boolean - stil et spørgsmål:**
```java
boolean isValid(int value) { }
boolean hasPermission(String user) { }
boolean canAfford(double price, double budget) { }
```

**Transformationer - beskriv transformationen:**
```java
String toUpperCase(String text) { }
int toSeconds(int minutes) { }
double toCelsius(double fahrenheit) { }
```

---

## Opsummering

**Du har nu lært alle 4 typer metoder!**

| | Ingen parametre | Med parametre |
|---|---|---|
| **void** | Level 1 | Level 2 |
| **return** | Level 3 | **Level 4** |

**Level 4 metoder:**
- Modtager input via parametre
- Udfører beregning/logik
- Returnerer et resultat
- Er de mest fleksible og genbrugelige

**Husk:**
1. Parameter = input til metoden
2. Return = output fra metoden
3. Brug altid return værdien!
4. Match typer korrekt
5. Alle paths skal returnere

**Du er nu klar til at skrive rigtige, genbrugelige metoder!**
