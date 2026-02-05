# Level 1: Writing & Calling Void Methods (No Parameters) - Opgaver

## Indhold

- [ ] [Del A: Understanding Methods](#del-a-understanding-methods)
- [ ] [Del B: Creating Simple Void Methods](#del-b-creating-simple-void-methods)
- [ ] [Del C: Multiple Methods](#del-c-multiple-methods)
- [ ] [Del D: Methods for Organization](#del-d-methods-for-organization)
- [ ] [Del E: Methods Calling Other Methods](#del-e-methods-calling-other-methods)
- [ ] [Del F: Combining Multiple Concepts](#del-f-combining-multiple-concepts)

---

## Del A: Understanding Methods

### Opgave 1.1: Din første metode
**Opgave:**
Skriv en metode `sayHello()` der printer "Hello!". Kald den i main.

<details>
<summary>Se svar</summary>

```java
void sayHello() {
    System.out.println("Hello!");
}

void main() {
    sayHello();
}
// Output: Hello!
```
</details>

---

### Opgave 1.2: Kald metoden flere gange
**Opgave:**
Brug `sayHello()` fra opgave 1.1. Kald den 3 gange i main.

<details>
<summary>Se svar</summary>

```java
void sayHello() {
    System.out.println("Hello!");
}

void main() {
    sayHello();
    sayHello();
    sayHello();
}
// Output:
// Hello!
// Hello!
// Hello!
```
</details>

---

### Opgave 1.3: Metode med flere linjer
**Opgave:**
Skriv metode `printWelcome()` der printer:
```
Welcome to the program!
Let's get started!
```
Kald den i main.

<details>
<summary>Se svar</summary>

```java
void printWelcome() {
    System.out.println("Welcome to the program!");
    System.out.println("Let's get started!");
}

void main() {
    printWelcome();
}
```
</details>

---

### Opgave 1.4: Hvad sker der?
**Opgave:**
Hvad printer dette program?
```java
void greet() {
    System.out.println("Hi there!");
}

void main() {
    System.out.println("Before");
    greet();
    System.out.println("After");
}
```

<details>
<summary>Se svar</summary>

```
Before
Hi there!
After
```

Execution flow:
1. Print "Before"
2. Kald greet() → print "Hi there!"
3. Print "After"
</details>

---

### Opgave 1.5: Metode der ikke kaldes
**Opgave:**
Hvad printer dette program?
```java
void printMessage() {
    System.out.println("This is a message");
}

void main() {
    System.out.println("Start");
    System.out.println("End");
}
```

<details>
<summary>Se svar</summary>

```
Start
End
```

`printMessage()` bliver ALDRIG kaldt, så den kører ikke.
Metoder kører kun når de kaldes!
</details>

---

### Opgave 1.6: Rækkefølge af kald
**Opgave:**
Skriv to metoder: `first()` printer "First", `second()` printer "Second".
I main: kald second(), derefter first(). Hvad bliver output?

<details>
<summary>Se svar</summary>

```java
void first() {
    System.out.println("First");
}

void second() {
    System.out.println("Second");
}

void main() {
    second();
    first();
}
// Output:
// Second
// First

// Rækkefølgen af KALD bestemmer execution, ikke definition
```
</details>

---

### Opgave 1.7: Metode med variable
**Opgave:**
Lav en variabel `String appName = "MyApp"` øverst. Skriv metode `printAppName()` der printer appName. Kald den i main.

<details>
<summary>Se svar</summary>

```java
String appName = "MyApp";

void printAppName() {
    System.out.println(appName);
}

void main() {
    printAppName();
}
// Output: MyApp
```
</details>

---

### Opgave 1.8: Brug variable i metode
**Opgave:**
Lav 2 variabler i det globale scope: `String title = "Game"`, `int version = 2`.  
Skriv metode `printInfo()` der printer begge. Kald metoden fra main.  
Skriv en anden metode `incrementVersion()`, der tæller `version` op med 1.
Kald metoden fra main og kald så `printInfo()` igen, for at se at `version` er blevet talt op.

<details>
<summary>Se svar</summary>

```java
String title = "Game";
int version = 2;

void printInfo() {
    System.out.println("Title: " + title+" v."+version);
   
}

void incrementVersion() {
    version++;
}


void main() {
    printInfo();
    incrementVersion();
    printInfo();
}
// Output:
// Title: Game
// Version: 2
// Title: Game
// Version: 3
```
</details>

---

## Del B: Creating Simple Void Methods

### Opgave 1.9: Print dashed line
**Opgave:**
Skriv metode `printLine()` der printer "----------". Kald den 3 gange i main.

<details>
<summary>Se svar</summary>

```java
void printLine() {
    System.out.println("----------");
}

void main() {
    printLine();
    printLine();
    printLine();
}
// Output:
// ----------
// ----------
// ----------
```
</details>

---

### Opgave 1.10: Print empty line
**Opgave:**
Skriv metode `printEmptyLine()` der printer en tom linje. Test i main.

<details>
<summary>Se svar</summary>

```java
void printEmptyLine() {
    System.out.println();
}

void main() {
    System.out.println("First");
    printEmptyLine();
    System.out.println("Second");
}
// Output:
// First
//
// Second
```
</details>

---

### Opgave 1.11: Print box
**Opgave:**
Skriv metode `printBox()` der printer:
```
+-----+
|     |
+-----+
```

<details>
<summary>Se svar</summary>

```java
void printBox() {
    System.out.println("+-----+");
    System.out.println("|     |");
    System.out.println("+-----+");
}

void main() {
    printBox();
}
```
</details>

---

### Opgave 1.12: Print pattern
**Opgave:**
Skriv metode `printPattern()` der printer:
```
* * *
* * *
* * *
```

<details>
<summary>Se svar</summary>

```java
void printPattern() {
    System.out.println("* * *");
    System.out.println("* * *");
    System.out.println("* * *");
}

void main() {
    printPattern();
}
```
</details>

---

### Opgave 1.13: Print menu
**Opgave:**
Skriv metode `printMenu()` der printer:
```
1. Start
2. Settings
3. Exit
```

<details>
<summary>Se svar</summary>

```java
void printMenu() {
    System.out.println("1. Start");
    System.out.println("2. Settings");
    System.out.println("3. Exit");
}

void main() {
    printMenu();
}
```
</details>

---

### Opgave 1.14: Print greeting
**Opgave:**
Skriv metode `printGreeting()` der printer en velkomstbesked på 3 linjer (vælg selv teksten).

<details>
<summary>Se svar</summary>

```java
void printGreeting() {
    System.out.println("Hello and welcome!");
    System.out.println("We're glad you're here.");
    System.out.println("Enjoy your stay!");
}

void main() {
    printGreeting();
}
```
</details>

---

### Opgave 1.15: Print ASCII art
**Opgave:**
Skriv metode `printSmile()` der printer et simpelt smiley:
```
 :)
```
Kald den 5 gange.

<details>
<summary>Se svar</summary>

```java
void printSmile() {
    System.out.println(" :)");
}

void main() {
    printSmile();
    printSmile();
    printSmile();
    printSmile();
    printSmile();
}
// Output:
//  :)
//  :)
//  :)
//  :)
//  :)
```
</details>

---

### Opgave 1.16: Print separator
**Opgave:**
Skriv metode `printSeparator()` der printer "====================".
Brug den til at separere to beskeder i main.

<details>
<summary>Se svar</summary>

```java
void printSeparator() {
    System.out.println("====================");
}

void main() {
    System.out.println("Section 1");
    printSeparator();
    System.out.println("Section 2");
}
// Output:
// Section 1
// ====================
// Section 2
```
</details>

---

## Del C: Multiple Methods

### Opgave 1.17: To forskellige metoder
**Opgave:**
Skriv `printHello()` der printer "Hello" og `printGoodbye()` der printer "Goodbye".
Kald begge i main.

<details>
<summary>Se svar</summary>

```java
void printHello() {
    System.out.println("Hello");
}

void printGoodbye() {
    System.out.println("Goodbye");
}

void main() {
    printHello();
    printGoodbye();
}
// Output:
// Hello
// Goodbye
```
</details>

---

### Opgave 1.18: Tre metoder i rækkefølge
**Opgave:**
Skriv tre metoder: `first()`, `second()`, `third()` der printer deres navne.
Kald dem i main i rækkefølge: third, first, second.

<details>
<summary>Se svar</summary>

```java
void first() {
    System.out.println("First");
}

void second() {
    System.out.println("Second");
}

void third() {
    System.out.println("Third");
}

void main() {
    third();
    first();
    second();
}
// Output:
// Third
// First
// Second
```
</details>

---

### Opgave 1.19: Morning routine
**Opgave:**
Skriv metoder til en morning routine:
- `wakeUp()` - prints "Wake up!"
- `eatBreakfast()` - prints "Eating breakfast"
- `brushTeeth()` - prints "Brushing teeth"

Kald dem i en logisk rækkefølge.

<details>
<summary>Se svar</summary>

```java
void wakeUp() {
    System.out.println("Wake up!");
}

void eatBreakfast() {
    System.out.println("Eating breakfast");
}

void brushTeeth() {
    System.out.println("Brushing teeth");
}

void main() {
    wakeUp();
    eatBreakfast();
    brushTeeth();
}
```
</details>

---

### Opgave 1.20: Days of week
**Opgave:**
Skriv 7 metoder: `monday()`, `tuesday()`, osv. der hver printer dagens navn.
I main: kald kun weekend-dagene (saturday, sunday).

<details>
<summary>Se svar</summary>

```java
void monday() {
    System.out.println("Monday");
}

void tuesday() {
    System.out.println("Tuesday");
}

void wednesday() {
    System.out.println("Wednesday");
}

void thursday() {
    System.out.println("Thursday");
}

void friday() {
    System.out.println("Friday");
}

void saturday() {
    System.out.println("Saturday");
}

void sunday() {
    System.out.println("Sunday");
}

void main() {
    saturday();
    sunday();
}
// Output:
// Saturday
// Sunday
```
</details>

---

### Opgave 1.21: Traffic light
**Opgave:**
Skriv tre metoder for traffic light:
- `red()` - prints "STOP"
- `yellow()` - prints "SLOW DOWN"
- `green()` - prints "GO"

Simulate en traffic light cycle: red → green → yellow → red.

<details>
<summary>Se svar</summary>

```java
void red() {
    System.out.println("STOP");
}

void yellow() {
    System.out.println("SLOW DOWN");
}

void green() {
    System.out.println("GO");
}

void main() {
    red();
    green();
    yellow();
    red();
}
```
</details>

---

### Opgave 1.22: Combining methods
**Opgave:**
Skriv `printStars()` der printer "***" og `printDashes()` der printer "---".
I main: Lav et pattern: stars, dashes, stars, dashes, stars.

<details>
<summary>Se svar</summary>

```java
void printStars() {
    System.out.println("***");
}

void printDashes() {
    System.out.println("---");
}

void main() {
    printStars();
    printDashes();
    printStars();
    printDashes();
    printStars();
}
// Output:
// ***
// ---
// ***
// ---
// ***
```
</details>

---

### Opgave 1.23: Repeated calls
**Opgave:**
Skriv `printBeep()` der printer "BEEP!".
I main: kald den 10 gange (simulate en alarm).

<details>
<summary>Se svar</summary>

```java
void printBeep() {
    System.out.println("BEEP!");
}

void main() {
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
}
// Output: BEEP! (10 gange)
```
</details>

---

### Opgave 1.24: Mixed calls
**Opgave:**
Brug `printHello()` og `printGoodbye()` fra tidligere.
I main: hello, goodbye, hello, goodbye, hello.

<details>
<summary>Se svar</summary>

```java
void printHello() {
    System.out.println("Hello");
}

void printGoodbye() {
    System.out.println("Goodbye");
}

void main() {
    printHello();
    printGoodbye();
    printHello();
    printGoodbye();
    printHello();
}
```
</details>

---

## Del D: Methods for Organization

### Opgave 1.25: Header, body, footer
**Opgave:**
Skriv tre metoder:
- `printHeader()` - prints "=== REPORT ==="
- `printBody()` - prints "Data goes here"
- `printFooter()` - prints "=== END ==="

Kald dem i korrekt rækkefølge.

<details>
<summary>Se svar</summary>

```java
void printHeader() {
    System.out.println("=== REPORT ===");
}

void printBody() {
    System.out.println("Data goes here");
}

void printFooter() {
    System.out.println("=== END ===");
}

void main() {
    printHeader();
    printBody();
    printFooter();
}
```
</details>

---

### Opgave 1.26: Title and content
**Opgave:**
Skriv metoder til en formateret side:
- `printTitle()` - prints title med decoration
- `printContent()` - prints noget content
- `printPageNumber()` - prints "Page 1"

<details>
<summary>Se svar</summary>

```java
void printTitle() {
    System.out.println("*** MY DOCUMENT ***");
}

void printContent() {
    System.out.println("This is the content of the document.");
    System.out.println("It can have multiple lines.");
}

void printPageNumber() {
    System.out.println("Page 1");
}

void main() {
    printTitle();
    System.out.println();
    printContent();
    System.out.println();
    printPageNumber();
}
```
</details>

---

### Opgave 1.27: Section dividers
**Opgave:**
Skriv `printDivider()` der printer "--------------------".
Brug den til at separere tre sections med forskelligt content.

<details>
<summary>Se svar</summary>

```java
void printDivider() {
    System.out.println("--------------------");
}

void main() {
    System.out.println("Section 1");
    printDivider();
    System.out.println("Section 2");
    printDivider();
    System.out.println("Section 3");
}
```
</details>

---

### Opgave 1.28: Formatted output
**Opgave:**
Lav metoder til at printe en formateret liste:
- `printListHeader()` - prints "Shopping List:"
- `printListFooter()` - prints "--- End of List ---"

Mellem header og footer: print 3 items (i main).

<details>
<summary>Se svar</summary>

```java
void printListHeader() {
    System.out.println("Shopping List:");
}

void printListFooter() {
    System.out.println("--- End of List ---");
}

void main() {
    printListHeader();
    System.out.println("- Milk");
    System.out.println("- Bread");
    System.out.println("- Eggs");
    printListFooter();
}
```
</details>

---

### Opgave 1.29: Game sections
**Opgave:**
Skriv metoder til et spil:
- `printGameTitle()` - game title
- `printInstructions()` - kort instruktion
- `printControls()` - controls info

Kald alle tre for at vise game startup screen.

<details>
<summary>Se svar</summary>

```java
void printGameTitle() {
    System.out.println("=== SPACE INVADERS ===");
}

void printInstructions() {
    System.out.println("Destroy all enemies!");
}

void printControls() {
    System.out.println("Use arrow keys to move");
    System.out.println("Press SPACE to shoot");
}

void main() {
    printGameTitle();
    System.out.println();
    printInstructions();
    System.out.println();
    printControls();
}
```
</details>

---

### Opgave 1.30: Data presentation
**Opgave:**
Variabler: `String name = "Anna"`, `int age = 25`, `String city = "Copenhagen"`.
Skriv tre metoder der hver printer én variabel med label.
Kald alle tre i main.

<details>
<summary>Se svar</summary>

```java
String name = "Anna";
int age = 25;
String city = "Copenhagen";

void printName() {
    System.out.println("Name: " + name);
}

void printAge() {
    System.out.println("Age: " + age);
}

void printCity() {
    System.out.println("City: " + city);
}

void main() {
    printName();
    printAge();
    printCity();
}
```
</details>

---

### Opgave 1.31: Table format
**Opgave:**
Skriv metoder til at printe en table:
- `printTableHeader()` - prints column headers
- `printTableDivider()` - prints divider line
- `printTableFooter()` - prints bottom line

<details>
<summary>Se svar</summary>

```java
void printTableHeader() {
    System.out.println("Name     | Age | City");
}

void printTableDivider() {
    System.out.println("---------+-----+-----------");
}

void printTableFooter() {
    System.out.println("=========================");
}

void main() {
    printTableHeader();
    printTableDivider();
    System.out.println("Anna     | 25  | Copenhagen");
    System.out.println("Bob      | 30  | Aarhus");
    printTableFooter();
}
```
</details>

---

### Opgave 1.32: Receipt sections
**Opgave:**
Skriv metoder til en receipt:
- `printReceiptHeader()` - "RECEIPT" med decoration
- `printThankYou()` - "Thank you for your purchase!"

Brug dem med items i midten.

<details>
<summary>Se svar</summary>

```java
void printReceiptHeader() {
    System.out.println("========== RECEIPT ==========");
}

void printThankYou() {
    System.out.println("Thank you for your purchase!");
}

void main() {
    printReceiptHeader();
    System.out.println("Item: Coffee - 25 kr");
    System.out.println("Item: Sandwich - 45 kr");
    System.out.println("Total: 70 kr");
    System.out.println();
    printThankYou();
}
```
</details>

---

## Del E: Methods Calling Other Methods

### Opgave 1.33: Method calls method
**Opgave:**
Skriv `printLine()` der printer "-----".
Skriv `printBox()` der kalder `printLine()` to gange med text imellem.

<details>
<summary>Se svar</summary>

```java
void printLine() {
    System.out.println("-----");
}

void printBox() {
    printLine();
    System.out.println("Text");
    printLine();
}

void main() {
    printBox();
}
// Output:
// -----
// Text
// -----
```
</details>

---

### Opgave 1.34: Layered calls
**Opgave:**
- `printStar()` prints "*"
- `printThreeStars()` kalder `printStar()` 3 gange
- main kalder `printThreeStars()`

<details>
<summary>Se svar</summary>

```java
void printStar() {
    System.out.println("*");
}

void printThreeStars() {
    printStar();
    printStar();
    printStar();
}

void main() {
    printThreeStars();
}
// Output:
// *
// *
// *
```
</details>

---

### Opgave 1.35: Nested method calls
**Opgave:**
- `printDash()` prints "-"
- `printHeader()` kalder `printDash()` 5 gange, derefter prints "HEADER", derefter `printDash()` 5 gange
- Kald `printHeader()` i main

<details>
<summary>Se svar</summary>

```java
void printDash() {
    System.out.println("-");
}

void printHeader() {
    printDash();
    printDash();
    printDash();
    printDash();
    printDash();
    System.out.println("HEADER");
    printDash();
    printDash();
    printDash();
    printDash();
    printDash();
}

void main() {
    printHeader();
}
```
</details>

---

### Opgave 1.36: Building blocks
**Opgave:**
- `printEquals()` prints "=========="
- `printSpacing()` prints empty line
- `printSection()` kalder: equals, spacing, prints "Content", spacing, equals

<details>
<summary>Se svar</summary>

```java
void printEquals() {
    System.out.println("==========");
}

void printSpacing() {
    System.out.println();
}

void printSection() {
    printEquals();
    printSpacing();
    System.out.println("Content");
    printSpacing();
    printEquals();
}

void main() {
    printSection();
}
```
</details>

---

### Opgave 1.37: Reusable components
**Opgave:**
- `printBorder()` prints "+------+"
- `printEmpty()` prints "|      |"
- `printFullBox()` kalder border, empty, border

<details>
<summary>Se svar</summary>

```java
void printBorder() {
    System.out.println("+------+");
}

void printEmpty() {
    System.out.println("|      |");
}

void printFullBox() {
    printBorder();
    printEmpty();
    printBorder();
}

void main() {
    printFullBox();
}
```
</details>

---

### Opgave 1.38: Composite method
**Opgave:**
- `printWelcome()` prints "Welcome!"
- `printInstructions()` prints "Follow the instructions"
- `printStart()` prints "Let's begin!"
- `printFullIntro()` kalder alle tre med spacing imellem

<details>
<summary>Se svar</summary>

```java
void printWelcome() {
    System.out.println("Welcome!");
}

void printInstructions() {
    System.out.println("Follow the instructions");
}

void printStart() {
    System.out.println("Let's begin!");
}

void printFullIntro() {
    printWelcome();
    System.out.println();
    printInstructions();
    System.out.println();
    printStart();
}

void main() {
    printFullIntro();
}
```
</details>

---

### Opgave 1.39: Multiple levels
**Opgave:**
- `printA()` prints "A"
- `printB()` kalder `printA()` to gange og prints "B"
- `printC()` kalder `printB()` og prints "C"
- main kalder `printC()`

Hvad bliver output?

<details>
<summary>Se svar</summary>

```java
void printA() {
    System.out.println("A");
}

void printB() {
    printA();
    printA();
    System.out.println("B");
}

void printC() {
    printB();
    System.out.println("C");
}

void main() {
    printC();
}
// Output:
// A
// A
// B
// C
```
</details>

---

### Opgave 1.40: Chain of calls
**Opgave:**
Lav en chain hvor:
- `method1()` prints "1" og kalder `method2()`
- `method2()` prints "2" og kalder `method3()`
- `method3()` prints "3"
- main kalder `method1()`

<details>
<summary>Se svar</summary>

```java
void method3() {
    System.out.println("3");
}

void method2() {
    System.out.println("2");
    method3();
}

void method1() {
    System.out.println("1");
    method2();
}

void main() {
    method1();
}
// Output:
// 1
// 2
// 3
```
</details>

---

## Del F: Combining Multiple Concepts

### Opgave 1.41: Complete program structure
**Opgave:**
Variabler: `String appName = "MyApp"`, `String version = "1.0"`.
Skriv metoder:
- `printAppInfo()` - prints app name and version (brug variablerne)
- `printDivider()` - prints "==============="
- `printWelcome()` - prints welcome message
- `showStartup()` - kalder: divider, appInfo, divider, welcome

main kalder kun `showStartup()`.

<details>
<summary>Se svar</summary>

```java
String appName = "MyApp";
String version = "1.0";

void printAppInfo() {
    System.out.println(appName + " v" + version);
}

void printDivider() {
    System.out.println("===============");
}

void printWelcome() {
    System.out.println("Welcome to the application!");
}

void showStartup() {
    printDivider();
    printAppInfo();
    printDivider();
    printWelcome();
}

void main() {
    showStartup();
}
```
</details>

---

### Opgave 1.42: Menu system
**Opgave:**
Skriv metoder til et menu system:
- `printMenuHeader()` - "=== MAIN MENU ==="
- `printMenuOptions()` - prints 4 menu options
- `printMenuFooter()` - "================="
- `displayMenu()` - kalder alle tre

<details>
<summary>Se svar</summary>

```java
void printMenuHeader() {
    System.out.println("=== MAIN MENU ===");
}

void printMenuOptions() {
    System.out.println("1. New Game");
    System.out.println("2. Load Game");
    System.out.println("3. Settings");
    System.out.println("4. Exit");
}

void printMenuFooter() {
    System.out.println("=================");
}

void displayMenu() {
    printMenuHeader();
    printMenuOptions();
    printMenuFooter();
}

void main() {
    displayMenu();
}
```
</details>

---

### Opgave 1.43: Report generator
**Opgave:**
Variabler: `String reportTitle = "Sales Report"`, `String date = "2024-01-15"`.
Skriv metoder til report:
- `printReportHeader()` - title og date
- `printReportBody()` - noget data
- `printReportFooter()` - "End of report"
- `generateReport()` - kalder alle dele med spacing

<details>
<summary>Se svar</summary>

```java
String reportTitle = "Sales Report";
String date = "2024-01-15";

void printReportHeader() {
    System.out.println("=== " + reportTitle + " ===");
    System.out.println("Date: " + date);
}

void printReportBody() {
    System.out.println("Total Sales: 15000 kr");
    System.out.println("Items Sold: 150");
}

void printReportFooter() {
    System.out.println("--- End of Report ---");
}

void generateReport() {
    printReportHeader();
    System.out.println();
    printReportBody();
    System.out.println();
    printReportFooter();
}

void main() {
    generateReport();
}
```
</details>

---

### Opgave 1.44: Game startup sequence
**Opgave:**
Skriv metoder til game startup:
- `showLogo()` - ASCII art logo
- `showTitle()` - game title
- `showVersion()` - version info (brug variabel)
- `showLoading()` - "Loading..." 3 gange
- `startupSequence()` - kalder alle i rækkefølge med pauser (empty lines)

<details>
<summary>Se svar</summary>

```java
String gameVersion = "v2.0";

void showLogo() {
    System.out.println("  ___  ");
    System.out.println(" |   | ");
    System.out.println(" |___| ");
}

void showTitle() {
    System.out.println("SUPER GAME");
}

void showVersion() {
    System.out.println("Version: " + gameVersion);
}

void showLoading() {
    System.out.println("Loading...");
    System.out.println("Loading...");
    System.out.println("Loading...");
}

void startupSequence() {
    showLogo();
    System.out.println();
    showTitle();
    showVersion();
    System.out.println();
    showLoading();
}

void main() {
    startupSequence();
}
```
</details>

---

### Opgave 1.45: Formatted data display
**Opgave:**
Variabler: `String name = "Anna"`, `int age = 25`, `String occupation = "Developer"`.
Skriv metoder:
- `printPersonName()` - prints name
- `printPersonAge()` - prints age
- `printPersonOccupation()` - prints occupation
- `printPersonDivider()` - prints "---"
- `displayPersonInfo()` - kalder alle med dividers mellem

<details>
<summary>Se svar</summary>

```java
String name = "Anna";
int age = 25;
String occupation = "Developer";

void printPersonName() {
    System.out.println("Name: " + name);
}

void printPersonAge() {
    System.out.println("Age: " + age);
}

void printPersonOccupation() {
    System.out.println("Occupation: " + occupation);
}

void printPersonDivider() {
    System.out.println("---");
}

void displayPersonInfo() {
    printPersonName();
    printPersonDivider();
    printPersonAge();
    printPersonDivider();
    printPersonOccupation();
}

void main() {
    displayPersonInfo();
}
```
</details>

---

### Opgave 1.46: Three-level method structure
**Opgave:**
Byg et program med 3 levels af method calls:
- Level 3: `printStar()`, `printDash()`
- Level 2: `printDecoration()` - kalder star 3 gange
- Level 1: `printDecoratedMessage()` - kalder decoration, prints message, kalder decoration
- main kalder kun `printDecoratedMessage()`

<details>
<summary>Se svar</summary>

```java
void printStar() {
    System.out.println("*");
}

void printDash() {
    System.out.println("-");
}

void printDecoration() {
    printStar();
    printStar();
    printStar();
}

void printDecoratedMessage() {
    printDecoration();
    System.out.println("Important Message");
    printDecoration();
}

void main() {
    printDecoratedMessage();
}
```
</details>

---

### Opgave 1.47: Configuration display
**Opgave:**
Variabler: `String username = "Admin"`, `boolean debugMode = true`, `int maxUsers = 100`.
Skriv metoder der printer hver config setting.
Skriv `displayConfig()` der kalder alle med formatting.

<details>
<summary>Se svar</summary>

```java
String username = "Admin";
boolean debugMode = true;
int maxUsers = 100;

void printUsername() {
    System.out.println("Username: " + username);
}

void printDebugMode() {
    System.out.println("Debug Mode: " + debugMode);
}

void printMaxUsers() {
    System.out.println("Max Users: " + maxUsers);
}

void printConfigHeader() {
    System.out.println("=== CONFIGURATION ===");
}

void printConfigFooter() {
    System.out.println("=====================");
}

void displayConfig() {
    printConfigHeader();
    printUsername();
    printDebugMode();
    printMaxUsers();
    printConfigFooter();
}

void main() {
    displayConfig();
}
```
</details>

---

### Opgave 1.48: Multi-section document
**Opgave:**
Lav et program der printer et dokument med 3 sections.
Hver section har: header, content, footer.
Brug metoder til at organisere det hele.

<details>
<summary>Se svar</summary>

```java
void printSectionHeader(String title) {
    // Wait - we can't do parameters yet!
    // Let's make it without parameters
}

void printSection1Header() {
    System.out.println("--- SECTION 1 ---");
}

void printSection1Content() {
    System.out.println("Content for section 1");
}

void printSection2Header() {
    System.out.println("--- SECTION 2 ---");
}

void printSection2Content() {
    System.out.println("Content for section 2");
}

void printSection3Header() {
    System.out.println("--- SECTION 3 ---");
}

void printSection3Content() {
    System.out.println("Content for section 3");
}

void printDocument() {
    printSection1Header();
    printSection1Content();
    System.out.println();
    printSection2Header();
    printSection2Content();
    System.out.println();
    printSection3Header();
    printSection3Content();
}

void main() {
    printDocument();
}
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er fordelen ved at bruge metoder fremfor at skrive alt i main?
2. Hvordan hjælper metoder med at organisere dit program?
3. Hvad sker der hvis du glemmer at kalde en metode?
4. Hvordan kan metoder kalde andre metoder?
5. Hvornår skal du lave en ny metode?
6. Hvorfor er det vigtigt at give metoder beskrivende navne?
7. Hvordan gør metoder det lettere at ændre dit program senere?
8. Hvad er forskellen mellem at definere en metode og at kalde den?

