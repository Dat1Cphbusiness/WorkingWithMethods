# Level 5: Classes and Objects Basics

## Begrebsgennemgang

### Problemet: Mange Relaterede Variable

Forestil dig du laver et spil med spillere:

```java
void main() {
    String player1Name = "Anna";
    int player1Health = 100;
    int player1Score = 0;
    
    String player2Name = "Mikkel";
    int player2Health = 100;
    int player2Score = 0;
    
    String player3Name = "Sofie";
    int player3Health = 100;
    int player3Score = 0;
}
```

**Dette er upraktisk!**
- Mange variable at holde styr på
- Svært at tilføje flere spillere
- Svært at sende en spiller til en metode

**Der må være en bedre måde...**

---

## Løsningen: Objekter

Et **objekt** samler relaterede data i én enhed:

```java
void main() {
    Player player1 = new Player("Anna", 100);
    Player player2 = new Player("Mikkel", 100);
    Player player3 = new Player("Sofie", 100);
}
```

**Meget bedre!**
- Hver spiller er én variabel
- Nemt at tilføje flere spillere
- Nemt at arbejde med

---

## Hvad er en Klasse?

En **klasse** er en skabelon (blueprint) der beskriver hvad et objekt skal indeholde.

**Analogi:**
- En **klasse** er som en opskrift på en kage
- Et **objekt** er en konkret kage lavet fra opskriften
- Du kan lave mange kager fra samme opskrift

**I kode:**
```java
// Klassen = skabelonen
class Player {
    String name;
    int health;
    int score;
}

void main() {
    // Objekter = konkrete spillere
    Player player1 = new Player("Anna", 100);
    Player player2 = new Player("Mikkel", 100);
}
```

---

## Din Første Klasse

Lad os lave en simpel `Pokemon` klasse:

```java
class Pokemon {
    String name;
    int level;
    int hp;
}
```

**Komponenter:**
- `class` - keyword der starter en klasse definition
- `Pokemon` - klassens navn (altid med stort begyndelsesbogstav)
- `{}` - klassen's body
- `name`, `level`, `hp` - **instance variables** (data som objektet indeholder)

**Instance variables:**
- Variable der tilhører objektet
- Hver Pokemon har sine egne værdier
- Kaldes også "fields" eller "attributes"

---

## Konstruktør - Lav Objekter

For at kunne lave objekter skal klassen have en **konstruktør**:

```java
class Pokemon {
    String name;
    int level;
    int hp;
    
    // Konstruktør
    Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
}
```

**Konstruktør:**
- Har samme navn som klassen
- Har INGEN return type (ikke engang `void`)
- Kaldes automatisk når du bruger `new`
- Initialiserer instance variables

**`this` keyword:**
- Refererer til "dette objekt"
- `this.name` = objektets name variable
- `name` = parameter name
- Bruges når parameter og instance variable har samme navn

---

## Lav Objekter med `new`

Nu kan vi lave Pokemon objekter:

```java
void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    Pokemon charizard = new Pokemon("Charizard", 50, 150);
    Pokemon bulbasaur = new Pokemon("Bulbasaur", 10, 80);
}
```

**Hvad sker der?**
1. `new Pokemon(...)` - kalder konstruktøren
2. Konstruktøren laver et nyt objekt i hukommelsen
3. Instance variables får deres værdier
4. Reference til objektet gemmes i variablen

**Du har brugt `new` før:**
```java
Scanner scanner = new Scanner(System.in);  // Scanner objekt
int[] numbers = new int[10];                // Array objekt
Pokemon pikachu = new Pokemon("Pikachu", 25, 100);  // Pokemon objekt
```

---

## Tilgå Instance Variables

Brug **dot-notation** til at tilgå instance variables:

```java
void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    
    System.out.println(pikachu.name);    // Pikachu
    System.out.println(pikachu.level);   // 25
    System.out.println(pikachu.hp);      // 100
}
```

**Dot-notation:**
- `objekt.variabel` - tilgår objektets variable
- Hver Pokemon har sine egne værdier

---

## Ændre Instance Variables

Du kan ændre instance variables efter objektet er lavet:

```java
void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    
    System.out.println(pikachu.hp);  // 100
    
    pikachu.hp = pikachu.hp - 20;    // Pikachu tager skade
    
    System.out.println(pikachu.hp);  // 80
}
```

**Hver objekt har sine egne værdier:**
```java
void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    Pokemon charizard = new Pokemon("Charizard", 50, 150);
    
    pikachu.hp = pikachu.hp - 20;
    
    System.out.println(pikachu.hp);     // 80
    System.out.println(charizard.hp);   // 150 (uændret!)
}
```

---

## Objekter i Metoder

Du kan sende objekter til metoder som parametre:

```java
class Pokemon {
    String name;
    int level;
    int hp;
    
    Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
}

void printPokemon(Pokemon p) {
    System.out.println("Name: " + p.name);
    System.out.println("Level: " + p.level);
    System.out.println("HP: " + p.hp);
}

void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    printPokemon(pikachu);
}
```

**Output:**
```
Name: Pikachu
Level: 25
HP: 100
```

---

## Metoder der Ændrer Objekter

Metoder kan ændre objekter:

```java
void heal(Pokemon p, int amount) {
    p.hp = p.hp + amount;
}

void takeDamage(Pokemon p, int damage) {
    p.hp = p.hp - damage;
}

void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    
    System.out.println(pikachu.hp);  // 100
    
    takeDamage(pikachu, 30);
    System.out.println(pikachu.hp);  // 70
    
    heal(pikachu, 20);
    System.out.println(pikachu.hp);  // 90
}
```

---

## Flere Objekter af Samme Klasse

En klasse er en skabelon - du kan lave mange objekter:

```java
void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    Pokemon charizard = new Pokemon("Charizard", 50, 150);
    Pokemon bulbasaur = new Pokemon("Bulbasaur", 10, 80);
    Pokemon squirtle = new Pokemon("Squirtle", 15, 90);
    
    // Alle er forskellige objekter med egne værdier
    System.out.println(pikachu.name);     // Pikachu
    System.out.println(charizard.name);   // Charizard
    System.out.println(bulbasaur.name);   // Bulbasaur
    System.out.println(squirtle.name);    // Squirtle
}
```

---

## Objekter i Conditions

Du kan bruge objekters data i conditions:

```java
void checkHealth(Pokemon p) {
    if (p.hp <= 0) {
        System.out.println(p.name + " is fainted!");
    } else if (p.hp < 30) {
        System.out.println(p.name + " is in danger!");
    } else {
        System.out.println(p.name + " is healthy");
    }
}

void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    Pokemon charizard = new Pokemon("Charizard", 50, 20);
    
    checkHealth(pikachu);     // Pikachu is healthy
    checkHealth(charizard);   // Charizard is in danger!
}
```

---

## Arrays af Objekter

Du kan lave arrays der indeholder objekter:

```java
void main() {
    // Før: arrays af primitive types
    int[] numbers = new int[3];
    String[] names = new String[3];
    
    // Nu: arrays af objekter
    Pokemon[] team = new Pokemon[3];
    
    team[0] = new Pokemon("Pikachu", 25, 100);
    team[1] = new Pokemon("Charizard", 50, 150);
    team[2] = new Pokemon("Bulbasaur", 10, 80);
    
    System.out.println(team[0].name);  // Pikachu
    System.out.println(team[1].name);  // Charizard
    System.out.println(team[2].name);  // Bulbasaur
}
```

**To trin:**
1. Lav array: `Pokemon[] team = new Pokemon[3];`
2. Lav objekter og put i array: `team[0] = new Pokemon(...);`

---

## Gennemløb Array af Objekter

Du kan bruge loops til at gennemløbe objekter:

```java
void main() {
    Pokemon[] team = new Pokemon[3];
    team[0] = new Pokemon("Pikachu", 25, 100);
    team[1] = new Pokemon("Charizard", 50, 150);
    team[2] = new Pokemon("Bulbasaur", 10, 80);
    
    // Print alle Pokemon navne
    for (int i = 0; i < team.length; i++) {
        System.out.println(team[i].name);
    }
}
```

**Output:**
```
Pikachu
Charizard
Bulbasaur
```

---

## Beregninger med Objekter i Loop

```java
void main() {
    Pokemon[] team = new Pokemon[3];
    team[0] = new Pokemon("Pikachu", 25, 100);
    team[1] = new Pokemon("Charizard", 50, 150);
    team[2] = new Pokemon("Bulbasaur", 10, 80);
    
    // Beregn total HP
    int totalHp = 0;
    for (int i = 0; i < team.length; i++) {
        totalHp = totalHp + team[i].hp;
    }
    
    System.out.println("Total HP: " + totalHp);  // Total HP: 330
}
```

---

## Find Objekt i Array

```java
void main() {
    Pokemon[] team = new Pokemon[4];
    team[0] = new Pokemon("Pikachu", 25, 100);
    team[1] = new Pokemon("Charizard", 50, 150);
    team[2] = new Pokemon("Bulbasaur", 10, 80);
    team[3] = new Pokemon("Squirtle", 15, 90);
    
    // Find Pokemon med lavest HP
    int lowestIndex = 0;
    for (int i = 1; i < team.length; i++) {
        if (team[i].hp < team[lowestIndex].hp) {
            lowestIndex = i;
        }
    }
    
    System.out.println("Weakest: " + team[lowestIndex].name);  // Bulbasaur
}
```

---

## Klasser med Forskellige Typer

En klasse kan have forskellige datatyper:

```java
class Item {
    String name;
    int price;
    boolean inStock;
    double weight;
    
    Item(String name, int price, boolean inStock, double weight) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.weight = weight;
    }
}

void main() {
    Item sword = new Item("Iron Sword", 150, true, 2.5);
    Item potion = new Item("Health Potion", 50, false, 0.2);
    
    System.out.println(sword.name + " costs " + sword.price);
    System.out.println("In stock: " + sword.inStock);
}
```

---

## Simpel Klasse uden Konstruktør

Du kan lave en klasse uden konstruktør og sætte værdierne bagefter:

```java
class Enemy {
    String name;
    int health;
    int damage;
}

void main() {
    Enemy goblin = new Enemy();  // Bruger default konstruktør
    goblin.name = "Goblin";
    goblin.health = 50;
    goblin.damage = 10;
    
    System.out.println(goblin.name);  // Goblin
}
```

**Men konstruktør er bedre:**
- Sikrer at objektet får alle værdier fra start
- Kortere kode
- Mere robust

---

## Klasse med Få Instance Variables

Start simpelt:

```java
class Dice {
    int sides;
    
    Dice(int sides) {
        this.sides = sides;
    }
}

void main() {
    Dice d6 = new Dice(6);
    Dice d20 = new Dice(20);
    
    System.out.println("D6 has " + d6.sides + " sides");
    System.out.println("D20 has " + d20.sides + " sides");
}
```

**En klasse kan have bare én instance variable!**

---

## Common Patterns

### Pattern 1: Lav og Print
```java
void main() {
    Player player = new Player("Anna", 100);
    System.out.println(player.name + " has " + player.health + " HP");
}
```

### Pattern 2: Lav Array og Fyld
```java
void main() {
    Player[] players = new Player[3];
    players[0] = new Player("Anna", 100);
    players[1] = new Player("Mikkel", 100);
    players[2] = new Player("Sofie", 100);
}
```

### Pattern 3: Gennemløb og Check
```java
void main() {
    Player[] players = new Player[3];
    // ... fyld array ...
    
    for (int i = 0; i < players.length; i++) {
        if (players[i].health > 0) {
            System.out.println(players[i].name + " is alive");
        }
    }
}
```

---

## Klasse vs Objekt - Resumé

**Klasse:**
- En skabelon/blueprint
- Definerer hvilke instance variables objektet har
- Definerer konstruktør
- Skrives ÉN gang

**Objekt:**
- En konkret instans af klassen
- Har egne værdier for instance variables
- Laves med `new`
- Kan laves MANGE gange

**Eksempel:**
```java
// Klasse = skabelon (skrives én gang)
class Car {
    String brand;
    String color;
    int speed;
    
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
}

void main() {
    // Objekter = konkrete biler (laves mange gange)
    Car car1 = new Car("Tesla", "Red", 0);
    Car car2 = new Car("Toyota", "Blue", 0);
    Car car3 = new Car("Ford", "Black", 0);
}
```

---

## Debugging Tips

**Problem:** Glemmer `new`
```java
void main() {
    Pokemon pikachu;  // Kun declaration, intet objekt!
    System.out.println(pikachu.name);  // FEJL! NullPointerException
}
```

**Løsning:** Brug altid `new` til at lave objektet
```java
void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    System.out.println(pikachu.name);  // Virker!
}
```

---

**Problem:** Glemmer `this` i konstruktør
```java
class Pokemon {
    String name;
    
    Pokemon(String name) {
        name = name;  // Sætter parameter til sig selv!
    }
}

void main() {
    Pokemon pikachu = new Pokemon("Pikachu");
    System.out.println(pikachu.name);  // null (ikke sat!)
}
```

**Løsning:** Brug `this` til at referere til instance variable
```java
class Pokemon {
    String name;
    
    Pokemon(String name) {
        this.name = name;  // Korrekt!
    }
}
```

---

**Problem:** Forkert array initialisering
```java
void main() {
    Pokemon[] team = new Pokemon[3];
    System.out.println(team[0].name);  // FEJL! team[0] er null
}
```

**Løsning:** Lav objekter og put i arrayet
```java
void main() {
    Pokemon[] team = new Pokemon[3];
    team[0] = new Pokemon("Pikachu", 25, 100);
    System.out.println(team[0].name);  // Virker!
}
```

---

## Best Practices

**Klassenavne:**
- Brug substantiver (navneord)
- Start med stort bogstav
- Brug CamelCase for flere ord
```java
class Pokemon { }      // Godt
class GameCharacter { }  // Godt
class player { }         // Dårligt (skal starte med stort)
class PLAYER { }         // Dårligt (ikke all caps)
```

**Instance variable navne:**
- Brug beskrivende navne
- Start med lille bogstav
- Brug camelCase for flere ord
```java
class Player {
    String name;           // Godt
    int healthPoints;      // Godt
    int hp;                // OK (hvis HP er velkendt)
    int x;                 // Dårligt (ikke beskrivende)
}
```

**Konstruktør parametre:**
- Brug samme navne som instance variables
- Brug `this` til at skelne
```java
class Player {
    String name;
    int health;
    
    Player(String name, int health) {  // Samme navne
        this.name = name;              // Brug this
        this.health = health;
    }
}
```

---

## Opsummering

**Du har lært:**
- ✅ Hvad en klasse er (blueprint/skabelon)
- ✅ Hvad et objekt er (instans af klasse)
- ✅ Skrive klasser med instance variables
- ✅ Skrive konstruktører
- ✅ Lave objekter med `new`
- ✅ Tilgå instance variables med dot-notation
- ✅ Sende objekter til metoder
- ✅ Lave arrays af objekter
- ✅ Gennemløbe objekter i loops
- ✅ Bruge objekter i conditions

**Næste skridt:**
- Lav øvelserne i `level5_exercises.md`
- Eksperimenter med forskellige klasser
- Prøv at lave objekter i arrays

**Husk:**
- Klasse = skabelon (blueprint)
- Objekt = konkret instans
- `new` laver objektet
- `this` refererer til objektet selv
- Dot-notation tilgår instance variables
