# Level 2: Writing & Calling Void Methods (With Parameters)

## Begrebsgennemgang

### Hvad Du Allerede Kan

I Level 1 lærte du at skrive void metoder uden parametre:
```java
void sayHello() {
    System.out.println("Hello!");
}
```

Men hvad hvis du vil sige hej til forskellige personer? Skal du lave en ny metode for hver person?

```java
void sayHelloToAnna() {
    System.out.println("Hello, Anna!");
}

void sayHelloToMikkel() {
    System.out.println("Hello, Mikkel!");
}

void sayHelloToSofie() {
    System.out.println("Hello, Sofie!");
}
```

Det er **ikke praktisk**! Der må være en bedre måde...

---

## Hvad er en Parameter?

En **parameter** er en variabel der gør metoden fleksibel.

**Analogi:**
- En opskrift på pandekager siger "tilsæt X æg"
- X er en parameter - du bestemmer selv værdien
- Opskriften virker uanset om X er 2, 3 eller 4 æg

**Med parametre:**
```java
void sayHello(String name) {
    System.out.println("Hello, " + name + "!");
}

void main() {
    sayHello("Anna");    // Hello, Anna!
    sayHello("Mikkel");  // Hello, Mikkel!
    sayHello("Sofie");   // Hello, Sofie!
}
```

**Én metode, mange muligheder!**

---

## Anatomi af en Metode med Parameter

```java
void greet(String name) {
    System.out.println("Hello, " + name + "!");
}
```

**Komponenter:**
1. **`void`** - Return type (returnerer intet)
2. **`greet`** - Metodens navn
3. **`String name`** - Parameter (type + navn)
4. **`()`** - Parenteser indeholder parameteren
5. **`{}`** - Metodens body

**Parameteren `name`:**
- Fungerer som en lokal variabel
- Får sin værdi når metoden kaldes
- Kan bruges overalt i metodens body

---

## Parameter vs Argument

**Vigtigt at skelne mellem:**

**Parameter** (i metode definitionen):
```java
void greet(String name) {  // name er PARAMETER
    System.out.println("Hello, " + name);
}
```

**Argument** (når du kalder metoden):
```java
void main() {
    greet("Anna");  // "Anna" er ARGUMENT
}
```

**Huskeregl:**
- **P**arameter = **P**laceholder (i definitionen)
- **A**rgument = **A**ctual value (ved kaldet)

---

## Én Parameter - Forskellige Typer

Parameteren kan være enhver datatype:

**String parameter:**
```java
void printMessage(String message) {
    System.out.println(message);
}

void main() {
    printMessage("Hello!");
    printMessage("Goodbye!");
}
```

**int parameter:**
```java
void printNumber(int number) {
    System.out.println("Number: " + number);
}

void main() {
    printNumber(42);
    printNumber(100);
}
```

**double parameter:**
```java
void printPrice(double price) {
    System.out.println("Price: " + price + " kr");
}

void main() {
    printPrice(29.95);
    printPrice(149.00);
}
```

**boolean parameter:**
```java
void printStatus(boolean active) {
    System.out.println("Active: " + active);
}

void main() {
    printStatus(true);
    printStatus(false);
}
```

---

## Brug af Parameter i Metoden

Parameteren er en variabel du kan bruge i hele metoden:

```java
void printBox(String content) {
    System.out.println("+----------+");
    System.out.println("| " + content);
    System.out.println("+----------+");
}

void main() {
    printBox("Hello");
    printBox("Java!");
}
```

**Output:**
```
+----------+
| Hello
+----------+
+----------+
| Java!
+----------+
```

---

## Flere Parametre

En metode kan have flere parametre, adskilt af komma:

**To parametre:**
```java
void greetPerson(String name, int age) {
    System.out.println("Hello, " + name);
    System.out.println("You are " + age + " years old");
}

void main() {
    greetPerson("Anna", 25);
    greetPerson("Mikkel", 30);
}
```

**Tre parametre:**
```java
void printProduct(String name, double price, int quantity) {
    System.out.println("Product: " + name);
    System.out.println("Price: " + price + " kr");
    System.out.println("Quantity: " + quantity);
}

void main() {
    printProduct("Milk", 12.50, 2);
}
```

**Rækkefølge er vigtig:**
- Argumenter skal matches til parametre i rækkefølge
- Typer skal passe

---

## Argument Rækkefølge

**Vigtigt:** Argumenter skal gives i SAMME rækkefølge som parametre:

```java
void printInfo(String name, int age) {
    System.out.println(name + " is " + age);
}

void main() {
    printInfo("Anna", 25);  // Korrekt
    // printInfo(25, "Anna");  // FEJL! Forkert rækkefølge
}
```

**Type mismatch giver kompileringsfejl!**

---

## Parametre med Samme Type

Flere parametre kan have samme type:

```java
void printFullName(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
}

void main() {
    printFullName("Anna", "Jensen");
    printFullName("Mikkel", "Hansen");
}
```

**Output:**
```
Anna Jensen
Mikkel Hansen
```

---

## Brug af Variabler som Argumenter

Du kan sende variabler (ikke kun literals) som argumenter:

```java
void printGreeting(String name) {
    System.out.println("Hello, " + name);
}

void main() {
    String person1 = "Anna";
    String person2 = "Mikkel";
    
    printGreeting(person1);  // Sender variabel
    printGreeting(person2);  // Sender variabel
    printGreeting("Sofie");  // Sender literal
}
```

**Output:**
```
Hello, Anna
Hello, Mikkel
Hello, Sofie
```

---

## Expressions som Argumenter

Du kan også sende expressions (udregninger):

```java
void printDouble(int number) {
    System.out.println("Double: " + number);
}

void main() {
    int x = 5;
    printDouble(x * 2);     // Sender expression: 10
    printDouble(3 + 7);     // Sender expression: 10
    printDouble(x);         // Sender variabel: 5
}
```

**Output:**
```
Double: 10
Double: 10
Double: 5
```

---

## Parameter Scope

**Parameteren eksisterer KUN inde i metoden:**

```java
void printName(String name) {
    System.out.println(name);  // name eksisterer her
}

void main() {
    printName("Anna");
    // System.out.println(name);  // FEJL! name eksisterer ikke her
}
```

**Hver metode har sin egen "verden" af variabler.**

---

## Samme Parameternavn i Forskellige Metoder

Forskellige metoder kan have parametre med samme navn:

```java
void methodA(String name) {
    System.out.println("A: " + name);
}

void methodB(String name) {
    System.out.println("B: " + name);
}

void main() {
    methodA("Anna");
    methodB("Mikkel");
}
```

**Output:**
```
A: Anna
B: Mikkel
```

**De to `name` parametre er helt separate variabler!**

---

## Metoder Kalder Metoder (med Parametre)

En metode kan kalde andre metoder og videregive parametre:

```java
void printDivider() {
    System.out.println("----------");
}

void printBoxed(String text) {
    printDivider();
    System.out.println(text);
    printDivider();
}

void main() {
    printBoxed("Important!");
}
```

**Output:**
```
----------
Important!
----------
```

---

## Videregiv Parameter til Anden Metode

Du kan sende en parameter videre til en anden metode:

```java
void printUpperCase(String text) {
    System.out.println(text.toUpperCase());
}

void printFormatted(String message) {
    System.out.print(">>> ");
    printUpperCase(message);  // Videregiver message
}

void main() {
    printFormatted("hello");
}
```

**Output:**
```
>>> HELLO
```

---

## Beregninger med Parametre

Parametre kan bruges i beregninger:

```java
void printRectangleArea(int width, int height) {
    int area = width * height;
    System.out.println("Area: " + area);
}

void main() {
    printRectangleArea(5, 3);   // Area: 15
    printRectangleArea(10, 4);  // Area: 40
}
```

---

## Conditionals med Parametre

Du kan bruge if/else baseret på parametre:

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
    printAgeCategory(8);   // Child
    printAgeCategory(15);  // Teenager
    printAgeCategory(25);  // Adult
}
```

---

## Loops med Parametre

Du kan bruge parametre i loops:

```java
void printStars(int count) {
    for (int i = 0; i < count; i++) {
        System.out.print("*");
    }
    System.out.println();
}

void main() {
    printStars(3);  // ***
    printStars(5);  // *****
    printStars(10); // **********
}
```

---

## Sammenlign: Uden vs Med Parametre

**Uden parametre (gentaget kode):**
```java
void printStars3() {
    System.out.println("***");
}

void printStars5() {
    System.out.println("*****");
}

void printStars10() {
    System.out.println("**********");
}
```

**Med parametre (én fleksibel metode):**
```java
void printStars(int count) {
    for (int i = 0; i < count; i++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**Parametre = Genbrugelighed!**

---

## Array som Parameter

Du kan sende arrays som parametre:

```java
void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}

void main() {
    int[] myNumbers = {1, 2, 3, 4, 5};
    printArray(myNumbers);
}
```

**Output:**
```
1
2
3
4
5
```

---

## Common Patterns

### Pattern 1: Formatted Output
```java
void printLabeled(String label, String value) {
    System.out.println(label + ": " + value);
}

void main() {
    printLabeled("Name", "Anna");
    printLabeled("City", "Copenhagen");
}
```

### Pattern 2: Repeated Action
```java
void printRepeated(String text, int times) {
    for (int i = 0; i < times; i++) {
        System.out.println(text);
    }
}
```

### Pattern 3: Conditional Display
```java
void printIfPositive(int number) {
    if (number > 0) {
        System.out.println(number);
    }
}
```

---

## Debugging Tips

**Problem:** Forkert antal argumenter
```java
void greet(String name, int age) {
    System.out.println(name + " is " + age);
}

void main() {
    greet("Anna");  // FEJL! Mangler age argument
}
```

**Løsning:** Giv alle krævede argumenter
```java
void main() {
    greet("Anna", 25);  // Korrekt
}
```

---

**Problem:** Forkert argument type
```java
void printAge(int age) {
    System.out.println("Age: " + age);
}

void main() {
    printAge("twenty-five");  // FEJL! String til int parameter
}
```

**Løsning:** Brug korrekt type
```java
void main() {
    printAge(25);  // Korrekt
}
```

---

**Problem:** Forkert rækkefølge
```java
void createUser(String name, int age) {
    System.out.println(name + " is " + age);
}

void main() {
    createUser(25, "Anna");  // FEJL! Byttet om
}
```

**Løsning:** Følg parameter rækkefølgen
```java
void main() {
    createUser("Anna", 25);  // Korrekt
}
```

---

## Best Practices

**Gode parameter navne:**
```java
void printPerson(String name, int age) { }  // Beskrivende
void printPerson(String n, int a) { }       // For korte
void printPerson(String x, int y) { }       // Ikke meningsfulde
```

**Antal parametre:**
- 1-3 parametre er normalt fint
- 4+ parametre kan være svært at huske rækkefølgen
- Overvej at opdele i flere metoder

**Parameter typer:**
- Brug den mest passende type
- `int` for hele tal
- `double` for decimaltal
- `String` for tekst
- `boolean` for ja/nej værdier

---

## Opsummering

**Du har lært:**
- ✅ Hvad parametre er og hvorfor de er nyttige
- ✅ Forskel mellem parameter og argument
- ✅ Én og flere parametre
- ✅ Forskellige datatyper som parametre
- ✅ Parameter scope
- ✅ Brug af parametre i beregninger, conditionals og loops
- ✅ Arrays som parametre
- ✅ Metoder der kalder andre metoder med parametre

**Næste skridt:**
- Lav øvelserne i `level2_assignments.md`
- Eksperimenter med parametre
- Prøv at lave fleksible, genbrugelige metoder

**Husk:**
- Parametre gør metoder fleksible
- Argument = værdien du sender
- Rækkefølge og type skal matche!
