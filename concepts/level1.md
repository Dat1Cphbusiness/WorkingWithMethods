# Level 1: Writing & Calling Void Methods (No Parameters)

## Begrebsgennemgang

### What You've Been Doing

I de sidste to uger har du kaldt metoder som:
```java
System.out.println("Hello");
String text = "hello".toUpperCase();
```

Men hvad ER en metode egentlig? Og hvordan laver du dine egne?

---

## Hvad er en Metode?

En **metode** er en navngivet blok af kode der udfører en specifik opgave.

**Analogi:**
- En metode er som en **opskrift**
- Den har et **navn** ("Bag kage")
- Den har **instruktioner** (koden)
- Du kan **kalde** den når du vil (execute opskriften)

**Hvorfor bruge metoder?**
- ✅ **Genbrugelighed**: Skriv kode én gang, kald mange gange
- ✅ **Organisation**: Opdel store programmer i mindre dele
- ✅ **Læsbarhed**: Kode bliver nemmere at forstå
- ✅ **Vedligeholdelse**: Lettere at fixe bugs og ændre funktionalitet

---

## Anatomi af en Metode

```java
void printWelcome() {
    System.out.println("Welcome to the program!");
    System.out.println("Let's get started!");
}
```

**Komponenter:**
1. **`void`** - Return type (metoden returnerer intet)
2. **`printWelcome`** - Metodens navn
3. **`()`** - Parenteser (ingen parametre lige nu)
4. **`{}`** - Curly brackets (metodens kode/body)

---

## Void Metoder

**`void`** betyder metoden IKKE returnerer en værdi:

```java
void sayHello() {
    System.out.println("Hello!");
}
```

**Metoden:**
- Udfører en handling (printer noget)
- Giver IKKE et resultat tilbage
- Kaldes for dens **side effect** (det den gør)

**Tænk på det som:**
- Du beder metoden om at **gøre noget**
- Ikke om at **give dig noget**

---

## Metoder Uden Parametre

**Ingen parametre** betyder metoden ikke tager input:

```java
void printMenu() {
    System.out.println("1. Start Game");
    System.out.println("2. Exit");
}
```

**Metoden:**
- Har tomme parenteser `()`
- Gør altid det samme
- Ikke behov for information udefra

---

## At Skrive en Metode

**Template:**
```java
void methodName() {
    // Din kode her
}
```

**Eksempel:**
```java
void greet() {
    System.out.println("Hello!");
    System.out.println("Nice to meet you!");
}
```

**Regler:**
- Skrives UDEN FOR `main()` metoden
- Navn skal være beskrivende
- Brug camelCase (første ord lowercase, resten uppercase)

---

## At Kalde en Metode

Efter du har skrevet metoden, skal du **kalde** den for at køre koden:

```java
void greet() {
    System.out.println("Hello!");
}

void main() {
    greet();  // Kalder metoden
}
```

**Output:**
```
Hello!
```

**Execution flow:**
1. Program starter i `main()`
2. `greet()` kaldes
3. Koden i `greet()` executes
4. Control returnerer til `main()`

---

## Kalde Metoden Flere Gange

Du kan kalde samme metode flere gange:

```java
void sayHi() {
    System.out.println("Hi!");
}

void main() {
    sayHi();
    sayHi();
    sayHi();
}
```

**Output:**
```
Hi!
Hi!
Hi!
```

**Pointe:** Skriv koden én gang, genbruge mange gange!

---

## Flere Metoder

Du kan have mange metoder i samme program:

```java
void printHeader() {
    System.out.println("=== MY PROGRAM ===");
}

void printFooter() {
    System.out.println("=== END ===");
}

void main() {
    printHeader();
    System.out.println("Content here");
    printFooter();
}
```

**Output:**
```
=== MY PROGRAM ===
Content here
=== END ===
```

---

## Metoder Kalder Andre Metoder

En metode kan kalde en anden metode:

```java
void printDivider() {
    System.out.println("----------");
}

void printSection() {
    printDivider();
    System.out.println("Section Content");
    printDivider();
}

void main() {
    printSection();
}
```

**Output:**
```
----------
Section Content
----------
```

**Execution:**
1. `main()` kalder `printSection()`
2. `printSection()` kalder `printDivider()`
3. `printDivider()` kører og returnerer
4. `printSection()` fortsætter
5. `printSection()` kalder `printDivider()` igen
6. Control returnerer til `main()`

---

## Metode Navngivning

**Gode navne:**
```java
void printWelcome() { }
void displayMenu() { }
void showInstructions() { }
void clearScreen() { }
```

**Dårlige navne:**
```java
void p() { }           // For kort
void doStuff() { }     // Ikke beskrivende
void Method1() { }     // Ikke meningsfuldt
void PRINT() { }       // Skal være camelCase
```

**Best practices:**
- Brug verber (handling ord)
- Vær beskrivende
- camelCase convention
- Ikke for lang, ikke for kort

---

## Hvor Skal Metoder Skrives?

**Struktur i din fil:**

```java
// Variabler (øverst)
String appName = "My App";

// Metoder (mellem variabler og main)
void printWelcome() {
    System.out.println("Welcome to " + appName);
}

void printGoodbye() {
    System.out.println("Goodbye!");
}

// main metode (nederst)
void main() {
    printWelcome();
    printGoodbye();
}
```

**Convention:**
- Variabler øverst
- Helper metoder i midten
- `main()` metode nederst

---

## Library Metoder vs Dine Egne Metoder

**Library metoder (du har brugt):**
```java
System.out.println("Hello");  // Fra Java biblioteket
"hello".toUpperCase();         // Fra String klassen
```

**Dine egne metoder:**
```java
void greet() {
    System.out.println("Hello");
}

void main() {
    greet();  // Din egen metode - kald direkte
}
```

**Forskel:**
- Library metoder: `object.method()` eller `Class.method()`
- Dine metoder: `method()` (direkte kald)

---

## Hvornår Laver Du en Metode?

**Lav en metode når:**
- ✅ Du gentager samme kode flere steder
- ✅ En opgave er logisk separeret
- ✅ Du vil organisere dit program
- ✅ Kode bliver for lang og svær at læse

**Eksempel - UDEN metoder:**
```java
void main() {
    System.out.println("=== MENU ===");
    System.out.println("1. Start");
    System.out.println("2. Exit");
    System.out.println("============");
    
    // ... game logic ...
    
    System.out.println("=== MENU ===");
    System.out.println("1. Start");
    System.out.println("2. Exit");
    System.out.println("============");
}
```

**Eksempel - MED metoder:**
```java
void printMenu() {
    System.out.println("=== MENU ===");
    System.out.println("1. Start");
    System.out.println("2. Exit");
    System.out.println("============");
}

void main() {
    printMenu();
    // ... game logic ...
    printMenu();
}
```

**Meget mere læsbart og vedligeholdbart!**

---

## Metoder og Variabler

Metoder kan bruge variabler fra toppen af filen:

```java
String gameName = "Super Game";
int maxPlayers = 4;

void printGameInfo() {
    System.out.println("Game: " + gameName);
    System.out.println("Max players: " + maxPlayers);
}

void main() {
    printGameInfo();
}
```

**Output:**
```
Game: Super Game
Max players: 4
```

**Scope:** Variabler øverst er tilgængelige for alle metoder.

---

## Common Patterns

### Pattern 1: Display Methods
```java
void displayWelcome() {
    System.out.println("Welcome!");
}

void displayGoodbye() {
    System.out.println("Goodbye!");
}
```

### Pattern 2: Formatting Methods
```java
void printDivider() {
    System.out.println("====================");
}

void printEmptyLine() {
    System.out.println();
}
```

### Pattern 3: Section Methods
```java
void printHeader() {
    System.out.println("=== HEADER ===");
}

void printBody() {
    System.out.println("Content");
}

void printFooter() {
    System.out.println("=== FOOTER ===");
}
```

---

## Execution Order

Metoder kører i den rækkefølge de kaldes:

```java
void methodA() {
    System.out.println("A");
}

void methodB() {
    System.out.println("B");
}

void methodC() {
    System.out.println("C");
}

void main() {
    methodC();  // Kører først
    methodA();  // Kører derefter
    methodB();  // Kører sidst
}
```

**Output:**
```
C
A
B
```

**Vigtigt:** Rækkefølgen af kald bestemmer execution, IKKE rækkefølgen metoderne er skrevet i.

---

## Debugging Tips

**Problem:** Metode kører ikke
```java
void sayHello() {
    System.out.println("Hello");
}

void main() {
    // Intet output! Hvorfor?
}
```

**Løsning:** Du skal KALDE metoden!
```java
void main() {
    sayHello();  // Nu virker det
}
```

---

**Problem:** Kode er uden for main
```java
void printMessage() {
    System.out.println("Message");
}

System.out.println("This won't work!");  // ERROR

void main() {
    printMessage();
}
```

**Løsning:** Kode skal være INDE i en metode
```java
void printMessage() {
    System.out.println("Message");
}

void main() {
    printMessage();
    System.out.println("This works!");
}
```

---

## Opsummering

**Du har lært:**
- ✅ Hvad en metode er
- ✅ Hvordan man skriver void metoder uden parametre
- ✅ Hvordan man kalder metoder
- ✅ Metoder kan kalde andre metoder
- ✅ Hvorfor metoder gør kode bedre
- ✅ Navngivning og organisering

**Næste skridt:**
- Lav øvelserne i `level1-exercises.md`
- Eksperimenter med dine egne metoder
- Byg programmer med mange små metoder

**Husk:** 
- Void = ingen return værdi
- () = ingen parametre
- Kald metoden for at køre den
- Metoder gør kode lettere at læse og vedligeholde!
