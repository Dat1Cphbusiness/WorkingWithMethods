# Level 1: Calling Void Methods (No Parameters)

## Level 1 fokuserer på:
- Kalde metoder uden parametre
- Void metoder (returnerer intet)
- Method call syntax
- Forstå hvad en metode gør
- Metodenavne og deres betydning
- Sekvens af method calls

---

## Begrebsgennemgang

### Hvad er en Metode?

En **metode** er en navngivet blok kode der udfører en specifik opgave. Du kan "kalde" (call) metoden for at udføre dens kode.

```java
void printWelcome() {
    System.out.println("Welcome!");
}
```

### Kalde en Metode (Method Call)

For at bruge en metode, skal du **kalde** den:

```java
printWelcome();  // Method call
```

**Hvad sker der:**
1. Java finder metoden `printWelcome()`
2. Koden inde i metoden bliver udført
3. "Welcome!" bliver printet

### Method Call Syntax

```java
metodenavn();
```

- **Metodenavn**: Navnet på metoden du vil kalde
- **()**: Parenteser - SKAL ALTID være der, selv når der ingen parametre er
- **;**: Semikolon - afslutter statement

**Eksempler:**
```java
printWelcome();     // Korrekt
printGoodbye();     // Korrekt
printLine();        // Korrekt

printWelcome;       // FORKERT - mangler ()
printWelcome()      // FORKERT - mangler ;
```

### Void Metoder

En **void metode** returnerer ingen værdi. Den udfører bare en handling (ofte print).

```java
void sayHello() {
    System.out.println("Hello!");
}
```

- `void` betyder "returnerer intet"
- Metoden gør noget (printer), men giver ikke en værdi tilbage
- Du kan ikke gemme resultatet i en variabel

**Eksempler:**
```java
printWelcome();           // OK - bare kald metoden
int x = printWelcome();   // FORKERT - void returnerer intet!
```

### Metodenavne Fortæller Hvad De Gør

Gode metodenavn beskriver hvad metoden gør:

```java
printWelcome();      // Printer en velkomst besked
showTime();          // Viser tiden
saveData();          // Gemmer data
clearScreen();       // Rydder skærmen
```

**Naming convention:**
- Start med lille bogstav
- Brug camelCase
- Brug verber (print, show, save, clear, display)

### Sekvens af Method Calls

Du kan kalde flere metoder efter hinanden:

```java
printHeader();
printWelcome();
printLine();
printGoodbye();
printFooter();
```

**Output:**
```
=== MENU ===
Welcome!
-------------------
Goodbye!
=== END ===
```

Rækkefølgen betyder noget! Metoderne bliver kaldt fra top til bund.

### Metoder Kan Kaldes Flere Gange

Du kan kalde samme metode flere gange:

```java
printLine();
printWelcome();
printLine();
printLine();
```

**Output:**
```
-------------------
Welcome!
-------------------
-------------------
```

### I Dette Level

Du har 20 void metoder tilgængelige. Din opgave er at **kalde** dem i forskellige kombinationer for at løse opgaverne.

**Tilgængelige metoder:**
- `printWelcome()` - Printer "Welcome!"
- `printGoodbye()` - Printer "Goodbye!"
- `printLine()` - Printer en linje
- `printNewLine()` - Printer tom linje
- `printHeader()` - Printer "=== MENU ==="
- `printFooter()` - Printer "=== END ==="
- `displayWelcomeMessage()` - Printer velkomst på dansk
- `displayErrorMessage()` - Printer fejlbesked
- `showTime()` - Viser tid
- `showDate()` - Viser dato
- `clearScreen()` - "Rydder" skærmen (printer tomme linjer)
- `playSound()` - Printer "*BEEP*"
- `saveData()` - Printer "Data saved"
- `loadData()` - Printer "Data loaded"
- `initializeSystem()` - Printer "System initialized"
- `shutdownSystem()` - Printer "System shutting down"
- `displayLogo()` - Printer ASCII logo
- `printSeparator()` - Printer lang linje
- `printSuccess()` - Printer success besked
- `printWarning()` - Printer warning besked

**Skriv din kode i `testLevel1()` metoden.**

---

## Tips
- Husk () efter metodenavnet
- Husk ; efter hvert method call
- Rækkefølgen af calls betyder noget
- Du kan kalde samme metode flere gange
- Metoderne er allerede implementeret - du skal bare kalde dem
- Al din kode skal placeres inde i `testLevel1()` metoden

---

## Del A: Basic Method Calls

### Opgave 1.1: Dit første method call
📖 [Se forklaring: Kalde en Metode](#kalde-en-metode-method-call)

**Opgave:** 
1. Kald metoden `printWelcome()`

**Forventet Output:**
```
Welcome!
```

---

### Opgave 1.2: Kald to metoder
**Opgave:** 
1. Kald `printWelcome()`
2. Kald `printGoodbye()`

**Forventet Output:**
```
Welcome!
Goodbye!
```

---

### Opgave 1.3: Kald med separator
**Opgave:** 
1. Kald `printWelcome()`
2. Kald `printLine()`
3. Kald `printGoodbye()`

**Forventet Output:**
```
Welcome!
-------------------
Goodbye!
```

---

### Opgave 1.4: Tre method calls
**Opgave:** 
Kald 3 metoder så du får det forventede output.

**Forventet Output:**
```
=== MENU ===
Welcome!
=== END ===
```

---

### Opgave 1.5: Gentag et method call
**Opgave:** 
1. Kald `printLine()` tre gange

**Forventet Output:**
```
-------------------
-------------------
-------------------
```

---

## Del B: Sekvens og Rækkefølge

### Opgave 1.6: Rækkefølge betyder noget
**Opgave:** 
1. Kald `printGoodbye()`
2. Kald `printWelcome()`

Bemærk: Rækkefølgen er modsat opgave 1.2!

**Forventet Output:**
```
Goodbye!
Welcome!
```

---

### Opgave 1.7: Build a menu
**Opgave:**
Kald 5 metoder sådan at du får det forventede output. Start med

1. Kald `printHeader()`
2. ?
3. 
...etc


**Forventet Output:**
```
=== MENU ===
-------------------
Velkommen til systemet!
-------------------
=== END ===
```

---

### Opgave 1.8: Empty lines
**Opgave:** 
1. Kald `printWelcome()`
2. Kald `printNewLine()` to gange
3. Kald `printGoodbye()`

**Forventet Output:**
```
Welcome!


Goodbye!
```

---

### Opgave 1.9: System startup sequence
**Opgave:** 
1. Kald `initializeSystem()`
2. Kald `loadData()`
3. Kald `printSuccess()`

**Forventet Output:**
```
System initialized.
Data loaded successfully.
✓ Success!
```

---

### Opgave 1.10: System shutdown sequence
**Opgave:** 
1. Kald `saveData()`
2. Kald `shutdownSystem()`
3. Kald `printGoodbye()`

**Forventet Output:**
```
Data saved successfully.
System shutting down...
Goodbye!
```

---

## Del C: Combining Method Calls

### Opgave 1.11: Display with separators
**Opgave:** 
Find ud af hvilke to metoder du skal kalde i trin 2 og 3, så du får det foreventede output.

1. Kald `printSeparator()`
2. ?
3. ?
4. Kald `printSeparator()`

**Forventet Output:**
```
========================
Current time: 12:00
Today: 2026-01-15
========================
```

---

### Opgave 1.12: Error message display
**Opgave:**
Find ud af hvilke to metoder du skal kalde i trin 2 og 3, så du får det foreventede output.

1. Kald `printLine()`
2. ?
3. ?
4. Kald `printLine()`

**Forventet Output:**
```
-------------------
ERROR: Something went wrong!
⚠ Warning!
-------------------
```

---

### Opgave 1.13: Logo display
**Opgave:** 
1. Kald `clearScreen()`
2. Kald `displayLogo()`
3. Kald `printNewLine()`
4. Kald `displayWelcomeMessage()`

**Forventet Output:**
```
[empty lines]
   _____  
  /     \ 
 | () () |
  \  ^  / 
   |||||  

Velkommen til systemet!
```

---

### Opgave 1.14: Sound effects
**Opgave:** 
1. Kald `printWelcome()`
2. Kald `playSound()`
3. Kald `printLine()`
4. Kald `printGoodbye()`
5. Kald `playSound()`

**Forventet Output:**
```
Welcome!
*BEEP*
-------------------
Goodbye!
*BEEP*
```

---

### Opgave 1.15: Multiple separators
**Opgave:** 
1. Kald `printLine()` to gange
2. Kald `printWelcome()`
3. Kald `printLine()` to gange

**Forventet Output:**
```
-------------------
-------------------
Welcome!
-------------------
-------------------
```

---

## Del D: Real-World Scenarios

### Opgave 1.16: Complete startup
**Opgave:** 
Lav en komplet startup sekvens:
1. Display logo
2. Print separator
3. Initialize system
4. Load data
5. Print success
6. Print separator
7. Display welcome message

**Forventet Output:** (dit eget design)

---

### Opgave 1.17: Status report
**Opgave:** 
Lav en status rapport:
1. Print header
2. Show date
3. Show time
4. Print separator
5. Print success (system OK)
6. Print footer

**Forventet Output:** (dit eget design)

---

### Opgave 1.18: Warning display
**Opgave:** 
Vis en advarsel med ramme:
1. Print separator
2. Print warning
3. Display error message
4. Print line
5. Print "Check logs" besked (brug en passende metode)
6. Print separator

**Forventet Output:** (dit eget design)

---

### Opgave 1.19: Menu system
**Opgave:** 
Byg et menu system:
1. Clear screen
2. Display logo
3. Print separator
4. Print header
5. Show date and time
6. Print line
7. Display welcome
8. Print footer
9. Print separator

**Forventet Output:** (dit eget design)

---

### Opgave 1.20: Complete session
**Opgave:** 
Simuler en komplet session:
1. Startup (initialize, load, success)
2. Display welcome
3. Print separator
4. Show time
5. Print separator  
6. Shutdown (save, shutdown, goodbye)

**Forventet Output:** (dit eget design)

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem metodenavnet og method call?
2. Hvorfor skal du bruge () efter metodenavnet?
3. Hvad betyder void?
4. Kan du gemme resultatet af en void metode i en variabel? Hvorfor ikke?
5. Hvordan kan du kalde samme metode flere gange?
6. Betyder rækkefølgen af method calls noget?
7. Hvad fortæller metodenavnet dig om hvad metoden gør?
