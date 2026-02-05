# Level 3: Writing & Calling Return Methods (No Parameters)

## Begrebsgennemgang

### Hvad Du Har Lært Indtil Nu

**Level 1:** Void metoder uden parametre - gør noget, men giver intet tilbage
```java
void sayHello() {
    System.out.println("Hello!");
}
```

**Level 2:** Void metoder med parametre - modtager data, men giver stadig intet tilbage
```java
void greet(String name) {
    System.out.println("Hello, " + name);
}
```

**Nu:** Metoder der **giver noget tilbage** - return metoder!

---

## Problemet med Void Metoder

Forestil dig dette scenarie:

```java
void printDouble(int number) {
    System.out.println(number * 2);
}

void main() {
    printDouble(5);  // Printer 10... men hvad så?
    
    // Hvad hvis jeg vil bruge resultatet til noget?
    // Hvad hvis jeg vil lægge 10 sammen med noget andet?
    // Det kan jeg ikke! Resultatet er "væk" efter print.
}
```

Void metoder **gør** noget (printer), men de **giver ikke noget tilbage** som vi kan bruge bagefter.

---

## Hvad er en Return Metode?

En **return metode** giver en værdi tilbage til det sted, hvor metoden blev kaldt.

**Analogi: Brødrister vs Regnemaskine**

**Void metode = Brødrister:**
- Du putter brød i
- Den gør noget (rister)
- Resultatet ligger i brødristeren - du skal selv tage det ud
- Brødristeren "giver" dig ikke noget direkte

**Return metode = Regnemaskine:**
- Du trykker på nogle tal
- Den regner
- Den **giver dig svaret** på displayet
- Du kan bruge svaret til noget andet

---

## Din Første Return Metode

```java
int getTen() {
    return 10;
}

void main() {
    int number = getTen();  // number bliver 10
    System.out.println(number);
}
```

**Hvad sker der?**
1. `getTen()` bliver kaldt
2. Metoden kører og rammer `return 10`
3. Værdien 10 bliver "sendt tilbage" til kaldestedet
4. `getTen()` bliver erstattet af værdien 10
5. `int number = 10` - variablen får værdien

**Tænk på det sådan:** Når metoden kører, bliver `getTen()` *erstattet* af det den returnerer.

---

## Return Type

I stedet for `void` skriver du den type, metoden giver tilbage:

```java
int getNumber() {      // Giver en int tilbage
    return 42;
}

String getMessage() {   // Giver en String tilbage
    return "Hello";
}

double getPrice() {     // Giver en double tilbage
    return 29.95;
}

boolean isReady() {     // Giver en boolean tilbage
    return true;
}
```

**Return typen er et løfte:** "Denne metode vil altid give en [type] tilbage."

---

## return Statement

`return` gør to ting:
1. Sender en værdi tilbage til kaldestedet
2. Stopper metoden med det samme

```java
int getAge() {
    return 25;          // Sender 25 tilbage OG stopper
    System.out.println("Dette kører aldrig!");  // Unreachable!
}
```

---

## At Modtage og Bruge Return Værdien

**Dette er det vigtigste i hele Level 3!**

Når du kalder en return metode, får du en værdi tilbage. Du skal **gøre noget med den værdi**.

### Måde 1: Gem i en variabel (ANBEFALET for begyndere)

```java
int getScore() {
    return 100;
}

void main() {
    int score = getScore();  // Gem værdien i en variabel
    System.out.println(score);  // Brug variablen
}
```

**Tænk på det som en kasse:**
- `getScore()` giver dig værdien 100
- `int score` er en kasse du putter værdien i
- Nu kan du bruge `score` så mange gange du vil

### Måde 2: Brug direkte i println

```java
void main() {
    System.out.println(getScore());  // Printer 100 direkte
}
```

Her "flyder" værdien direkte ind i println uden at blive gemt først.

### Måde 3: Brug i en beregning

```java
void main() {
    int score = getScore();
    int doubled = score * 2;  // Brug værdien i beregning
    System.out.println(doubled);  // 200
}
```

### Måde 4: Brug som del af en større expression

```java
void main() {
    int total = getScore() + 50;  // 100 + 50 = 150
    System.out.println(total);
}
```

---

## Visualisering: Hvad Sker Der Trin for Trin?

```java
int getMagicNumber() {
    return 42;
}

void main() {
    int x = getMagicNumber();
    int y = x + 8;
    System.out.println(y);
}
```

**Trin 1:** Vi starter i main
```
x = ?
y = ?
```

**Trin 2:** `getMagicNumber()` bliver kaldt
```
→ Hopper ind i getMagicNumber()
→ return 42
→ Hopper tilbage med værdien 42
```

**Trin 3:** Værdien 42 erstatter kaldet
```
int x = 42;   // getMagicNumber() er nu blevet til 42
x = 42
y = ?
```

**Trin 4:** Næste linje kører
```
int y = x + 8;   // y = 42 + 8
x = 42
y = 50
```

**Trin 5:** Print
```
System.out.println(y);   // Printer 50
```

---

## Almindelig Fejl: At Glemme at Bruge Værdien

**FORKERT:**
```java
int getScore() {
    return 100;
}

void main() {
    getScore();  // Værdien 100 returneres... men bliver smidt væk!
    // Vi gemte den ikke, vi brugte den ikke til noget
}
```

**KORREKT:**
```java
void main() {
    int score = getScore();  // Nu har vi gemt værdien
    System.out.println(score);  // Og vi bruger den
}
```

**Huskeregl:** Hvis du kalder en return metode, skal du **gøre noget med værdien!**

---

## Returnér Værdien af en Variabel

Metoder kan returnere værdien af class-level variabler:

```java
String playerName = "Anna";
int playerScore = 150;

String getPlayerName() {
    return playerName;
}

int getPlayerScore() {
    return playerScore;
}

void main() {
    System.out.println("Player: " + getPlayerName());
    System.out.println("Score: " + getPlayerScore());
}
```

**Output:**
```
Player: Anna
Score: 150
```

Disse kaldes ofte **getter metoder** - de "henter" en værdi.

---

## Returnér en Beregnet Værdi

Metoder kan udføre beregninger og returnere resultatet:

```java
int width = 10;
int height = 5;

int getArea() {
    return width * height;
}

int getPerimeter() {
    return 2 * width + 2 * height;
}

void main() {
    System.out.println("Area: " + getArea());
    System.out.println("Perimeter: " + getPerimeter());
}
```

**Output:**
```
Area: 50
Perimeter: 30
```

---

## Brug Return Værdien i Videre Beregninger

**Det her er super kraftfuldt:**

```java
int getBasePrice() {
    return 100;
}

void main() {
    int base = getBasePrice();
    int tax = base / 4;           // 25% moms
    int total = base + tax;
    
    System.out.println("Base: " + base);
    System.out.println("Tax: " + tax);
    System.out.println("Total: " + total);
}
```

**Output:**
```
Base: 100
Tax: 25
Total: 125
```

**Læg mærke til:** Vi kalder `getBasePrice()` én gang, gemmer resultatet, og bruger det flere gange!

---

## Boolean Return Metoder

Boolean metoder returnerer `true` eller `false`. De er perfekte til at tjekke tilstande:

```java
int age = 20;
int lives = 3;

boolean isAdult() {
    return age >= 18;
}

boolean isGameOver() {
    return lives <= 0;
}

void main() {
    System.out.println("Is adult: " + isAdult());      // true
    System.out.println("Game over: " + isGameOver());  // false
}
```

---

## Boolean Metoder i if-statements

**Her bliver det virkelig nyttigt:**

```java
int temperature = 35;

boolean isHot() {
    return temperature > 30;
}

void main() {
    if (isHot()) {
        System.out.println("Turn on the AC!");
    } else {
        System.out.println("Temperature is fine.");
    }
}
```

**Output:**
```
Turn on the AC!
```

**Hvad sker der?**
1. `isHot()` bliver kaldt
2. Metoden returnerer `true` (fordi 35 > 30)
3. `if (isHot())` bliver til `if (true)`
4. Så koden i if-blokken kører

---

## Navngivning af Return Metoder

**For metoder der henter værdier - brug `get`:**
```java
int getScore() { }
String getName() { }
double getPrice() { }
int getWidth() { }
```

**For boolean metoder - brug `is`, `has`, `can`:**
```java
boolean isActive() { }      // Er den aktiv?
boolean isEmpty() { }       // Er den tom?
boolean hasWon() { }        // Har spilleren vundet?
boolean canProceed() { }    // Kan vi fortsætte?
```

---

## Conditional Returns

En metode kan have flere `return` statements med conditions:

```java
int score = 85;

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
    System.out.println("Grade: " + grade);
}
```

**Output:**
```
Grade: B
```

**Vigtigt:** Alle mulige veje gennem metoden skal ende med et `return`!

---

## Return Metoder Kalder Andre Return Metoder

```java
int getWidth() {
    return 10;
}

int getHeight() {
    return 5;
}

int getArea() {
    int w = getWidth();
    int h = getHeight();
    return w * h;
}

void main() {
    System.out.println("Area: " + getArea());  // 50
}
```

**Hvad sker der i getArea()?**
1. `getWidth()` kaldes → returnerer 10 → w = 10
2. `getHeight()` kaldes → returnerer 5 → h = 5
3. `w * h` = 50
4. `return 50` → getArea() returnerer 50

---

## Beregninger med Arrays

```java
int[] numbers = {10, 20, 30, 40, 50};

int getSum() {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
    }
    return sum;
}

int getCount() {
    return numbers.length;
}

double getAverage() {
    return (double) getSum() / getCount();
}

void main() {
    System.out.println("Sum: " + getSum());
    System.out.println("Count: " + getCount());
    System.out.println("Average: " + getAverage());
}
```

**Output:**
```
Sum: 150
Count: 5
Average: 30.0
```

---

## Sammenligning: void vs return

| Void metode | Return metode |
|-------------|---------------|
| `void printScore()` | `int getScore()` |
| Gør noget (f.eks. printer) | Giver en værdi tilbage |
| Kan ikke gemme resultatet | Kan gemme resultatet i en variabel |
| Kan ikke bruge i beregninger | Kan bruge i beregninger |

**Hvornår void?**
- Når metoden skal printe noget
- Når metoden skal ændre noget
- Når du ikke har brug for et resultat

**Hvornår return?**
- Når du har brug for en værdi til videre brug
- Når metoden beregner noget
- Når metoden henter data

---

## Debugging: Almindelige Fejl

### Fejl 1: Forkert return type
```java
int getMessage() {      // Siger int
    return "Hello";     // Men returnerer String! FEJL!
}
```

### Fejl 2: Glemmer return statement
```java
int getNumber() {
    int x = 42;
    // Ups! Glemte at returnere x
}
```

### Fejl 3: Ikke alle paths returnerer
```java
String getGrade(int score) {
    if (score >= 50) {
        return "Pass";
    }
    // Hvad hvis score < 50? Ingen return! FEJL!
}
```

### Fejl 4: Ignorerer return værdien
```java
void main() {
    getScore();  // Returnerer 100, men vi bruger den ikke!
}
```

---

## Opsummering

**Du har lært:**
- ✅ Forskellen mellem void og return metoder
- ✅ Hvordan man skriver en return metode
- ✅ Hvordan return sender en værdi tilbage
- ✅ **At gemme return værdien i en variabel**
- ✅ **At bruge return værdien i beregninger**
- ✅ Boolean return metoder og brug i if-statements
- ✅ Getter metoder
- ✅ Return metoder der kalder andre return metoder

**Det vigtigste at huske:**
1. Return metoder **giver en værdi tilbage**
2. Du skal **gøre noget med værdien** (gem den eller brug den)
3. Tænk på `getScore()` som om det **bliver erstattet af værdien**

**Næste skridt:**
- Lav øvelserne i `level3_assignments.md`
- Start med at gemme ALLE return værdier i variabler
- Når det føles naturligt, kan du bruge dem direkte
