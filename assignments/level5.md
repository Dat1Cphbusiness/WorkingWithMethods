# Level 5: Classes and Objects Basics - Opgaver

## Indhold
- [ ] [Del A: Simple Klasser og Objekter](#del-a-simple-klasser-og-objekter)
- [ ] [Del B: Objekter med Metoder og Conditions](#del-b-objekter-med-metoder-og-conditions)
- [ ] [Del C: Arrays af Objekter](#del-c-arrays-af-objekter)
- [ ] [Del D: Søg og Find i Object Arrays](#del-d-søg-og-find-i-object-arrays)
- [ ] [Del E: Komplekse Scenarier](#del-e-komplekse-scenarier)
- [ ] [Del F: Real-World Scenarios og Problemløsning](#del-f-real-world-scenarios-og-problemløsning)

## Del A: Simple Klasser og Objekter

### Opgave 1: Din Første Klasse
Lav en klasse `Book` med følgende instance variables:
- `String title`
- `String author`
- `int pages`

Lav en konstruktør der tager alle tre værdier som parametre.

I `main()`:
- Lav et `Book` objekt med titel "1984", forfatter "George Orwell", og 328 sider
- Print bogens titel

<details>
<summary>Hint</summary>

Brug `this` i konstruktøren til at sætte instance variables.
</details>

<details>
<summary>Se svar</summary>

```java
class Book {
    String title;
    String author;
    int pages;
    
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

void main() {
    Book book = new Book("1984", "George Orwell", 328);
    System.out.println(book.title);
}
```
</details>

---

### Opgave 2: Flere Objekter
Brug `Book` klassen fra opgave 1.

I `main()`:
- Lav tre forskellige `Book` objekter med forskellige titler
- Print alle tre bogtitler

<details>
<summary>Se svar</summary>

```java
void main() {
    Book book1 = new Book("1984", "George Orwell", 328);
    Book book2 = new Book("Harry Potter", "J.K. Rowling", 223);
    Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
    
    System.out.println(book1.title);
    System.out.println(book2.title);
    System.out.println(book3.title);
}
```
</details>

---

### Opgave 3: Gem Klasse
Lav en klasse `Game` med følgende instance variables:
- `String name`
- `int players`
- `boolean multiplayer`

Lav en konstruktør.

I `main()`:
- Lav et `Game` objekt med navn "Minecraft", 4 spillere, og multiplayer = true
- Print spillets navn og antal spillere

<details>
<summary>Se svar</summary>

```java
class Game {
    String name;
    int players;
    boolean multiplayer;
    
    Game(String name, int players, boolean multiplayer) {
        this.name = name;
        this.players = players;
        this.multiplayer = multiplayer;
    }
}

void main() {
    Game game = new Game("Minecraft", 4, true);
    System.out.println(game.name);
    System.out.println(game.players);
}
```
</details>

---

### Opgave 4: Ændre Instance Variables
Brug `Game` klassen fra opgave 3.

I `main()`:
- Lav et `Game` objekt med navn "Chess", 2 spillere, og multiplayer = true
- Print antal spillere
- Ændr antal spillere til 4
- Print antal spillere igen

<details>
<summary>Se svar</summary>

```java
void main() {
    Game game = new Game("Chess", 2, true);
    System.out.println(game.players);  // 2
    
    game.players = 4;
    System.out.println(game.players);  // 4
}
```
</details>

---

### Opgave 5: Simpel Pokemon
Lav en klasse `Pokemon` med:
- `String name`
- `int level`

Lav en konstruktør.

I `main()`:
- Lav en Pokemon med navn "Pikachu" og level 25
- Print "Pikachu is level 25" ved at bruge objektets instance variables

<details>
<summary>Se svar</summary>

```java
class Pokemon {
    String name;
    int level;
    
    Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }
}

void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25);
    System.out.println(pikachu.name + " is level " + pikachu.level);
}
```
</details>

---

### Opgave 6: Simpel Spiller
Lav en klasse `Player` med:
- `String name`
- `int score`

Lav en konstruktør.

I `main()`:
- Lav tre spillere med forskellige navne og scores
- Print hver spillers navn og score på formen: "Anna: 100"

<details>
<summary>Se svar</summary>

```java
class Player {
    String name;
    int score;
    
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

void main() {
    Player p1 = new Player("Anna", 100);
    Player p2 = new Player("Mikkel", 150);
    Player p3 = new Player("Sofie", 75);
    
    System.out.println(p1.name + ": " + p1.score);
    System.out.println(p2.name + ": " + p2.score);
    System.out.println(p3.name + ": " + p3.score);
}
```
</details>

---

### Opgave 7: Item Klasse
Lav en klasse `Item` med:
- `String name`
- `int price`
- `double weight`

Lav en konstruktør.

I `main()`:
- Lav et item "Sword" med pris 150 og vægt 2.5
- Lav et item "Potion" med pris 50 og vægt 0.3
- Print begge items med alle deres værdier

<details>
<summary>Se svar</summary>

```java
class Item {
    String name;
    int price;
    double weight;
    
    Item(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}

void main() {
    Item sword = new Item("Sword", 150, 2.5);
    Item potion = new Item("Potion", 50, 0.3);
    
    System.out.println(sword.name + " costs " + sword.price + " and weighs " + sword.weight);
    System.out.println(potion.name + " costs " + potion.price + " and weighs " + potion.weight);
}
```
</details>

---

### Opgave 8: Beregning med Objekter
Brug `Item` klassen fra opgave 7.

I `main()`:
- Lav to items med forskellige priser
- Beregn den totale pris af begge items
- Print den totale pris

<details>
<summary>Se svar</summary>

```java
void main() {
    Item sword = new Item("Sword", 150, 2.5);
    Item potion = new Item("Potion", 50, 0.3);
    
    int totalPrice = sword.price + potion.price;
    System.out.println("Total price: " + totalPrice);
}
```
</details>

---

## Del B: Objekter med Metoder og Conditions

### Opgave 9: Print Objekt Metode
Lav en klasse `Enemy` med:
- `String name`
- `int health`
- `int damage`

Lav en konstruktør.

Lav en metode `printEnemy(Enemy e)` der printer fjendens navn, health og damage.

I `main()`:
- Lav en Enemy "Goblin" med 50 health og 10 damage
- Kald `printEnemy()` metoden

<details>
<summary>Se svar</summary>

```java
class Enemy {
    String name;
    int health;
    int damage;
    
    Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
}

void printEnemy(Enemy e) {
    System.out.println("Name: " + e.name);
    System.out.println("Health: " + e.health);
    System.out.println("Damage: " + e.damage);
}

void main() {
    Enemy goblin = new Enemy("Goblin", 50, 10);
    printEnemy(goblin);
}
```
</details>

---

### Opgave 10: Modificer Objekt
Brug `Enemy` klassen fra opgave 9.

Lav en metode `takeDamage(Enemy e, int damage)` der reducerer fjendens health.

I `main()`:
- Lav en Enemy "Orc" med 100 health
- Print health
- Kald `takeDamage(orc, 30)`
- Print health igen

<details>
<summary>Se svar</summary>

```java
void takeDamage(Enemy e, int damage) {
    e.health = e.health - damage;
}

void main() {
    Enemy orc = new Enemy("Orc", 100, 15);
    System.out.println(orc.health);  // 100
    
    takeDamage(orc, 30);
    System.out.println(orc.health);  // 70
}
```
</details>

---

### Opgave 11: Check Status
Brug `Enemy` klassen fra opgave 9.

Lav en metode `isAlive(Enemy e)` der returnerer `true` hvis health > 0, ellers `false`.

I `main()`:
- Lav to enemies med forskellig health
- Check om hver enemy er alive og print resultatet

<details>
<summary>Hint</summary>

Brug en if-else til at returne boolean værdier.
</details>

<details>
<summary>Se svar</summary>

```java
boolean isAlive(Enemy e) {
    if (e.health > 0) {
        return true;
    } else {
        return false;
    }
}

void main() {
    Enemy goblin = new Enemy("Goblin", 50, 10);
    Enemy skeleton = new Enemy("Skeleton", 0, 5);
    
    System.out.println(goblin.name + " alive: " + isAlive(goblin));
    System.out.println(skeleton.name + " alive: " + isAlive(skeleton));
}
```
</details>

---

### Opgave 12: Conditional Print
Lav en klasse `Car` med:
- `String brand`
- `int speed`

Lav en konstruktør.

Lav en metode `checkSpeed(Car c)` der:
- Printer "Too fast!" hvis speed > 130
- Printer "OK" hvis speed <= 130

I `main()`:
- Lav to biler med forskellig speed
- Kald `checkSpeed()` på begge

<details>
<summary>Se svar</summary>

```java
class Car {
    String brand;
    int speed;
    
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

void checkSpeed(Car c) {
    if (c.speed > 130) {
        System.out.println("Too fast!");
    } else {
        System.out.println("OK");
    }
}

void main() {
    Car car1 = new Car("Tesla", 150);
    Car car2 = new Car("Toyota", 100);
    
    checkSpeed(car1);  // Too fast!
    checkSpeed(car2);  // OK
}
```
</details>

---

### Opgave 13: Level Up Pokemon
Lav en klasse `Pokemon` med:
- `String name`
- `int level`
- `int hp`

Lav en konstruktør.

Lav en metode `levelUp(Pokemon p)` der:
- Øger level med 1
- Øger hp med 10

I `main()`:
- Lav en Pokemon "Bulbasaur" med level 5 og hp 45
- Print level og hp
- Kald `levelUp()` tre gange
- Print level og hp igen

<details>
<summary>Se svar</summary>

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

void levelUp(Pokemon p) {
    p.level = p.level + 1;
    p.hp = p.hp + 10;
}

void main() {
    Pokemon bulbasaur = new Pokemon("Bulbasaur", 5, 45);
    System.out.println("Level: " + bulbasaur.level + ", HP: " + bulbasaur.hp);
    
    levelUp(bulbasaur);
    levelUp(bulbasaur);
    levelUp(bulbasaur);
    
    System.out.println("Level: " + bulbasaur.level + ", HP: " + bulbasaur.hp);
}
```
</details>

---

### Opgave 14: Sammenlign Objekter
Brug `Player` klassen fra Del A (med name og score).

Lav en metode `printWinner(Player p1, Player p2)` der printer navnet på spilleren med højest score.

I `main()`:
- Lav to spillere med forskellige scores
- Kald `printWinner()`

<details>
<summary>Se svar</summary>

```java
void printWinner(Player p1, Player p2) {
    if (p1.score > p2.score) {
        System.out.println(p1.name + " wins!");
    } else {
        System.out.println(p2.name + " wins!");
    }
}

void main() {
    Player anna = new Player("Anna", 150);
    Player mikkel = new Player("Mikkel", 120);
    
    printWinner(anna, mikkel);
}
```
</details>

---

### Opgave 15: Flere Conditions
Lav en klasse `BankAccount` med:
- `String owner`
- `int balance`

Lav en konstruktør.

Lav en metode `withdraw(BankAccount account, int amount)` der:
- Hvis balance >= amount: reducer balance og print "Withdrawn"
- Ellers: print "Insufficient funds"

I `main()`:
- Lav en konto med balance 1000
- Prøv at hæve 500 (skal virke)
- Prøv at hæve 800 (skal fejle)

<details>
<summary>Se svar</summary>

```java
class BankAccount {
    String owner;
    int balance;
    
    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
}

void withdraw(BankAccount account, int amount) {
    if (account.balance >= amount) {
        account.balance = account.balance - amount;
        System.out.println("Withdrawn");
    } else {
        System.out.println("Insufficient funds");
    }
}

void main() {
    BankAccount account = new BankAccount("Anna", 1000);
    
    withdraw(account, 500);  // Withdrawn
    System.out.println(account.balance);  // 500
    
    withdraw(account, 800);  // Insufficient funds
}
```
</details>

---

### Opgave 16: Status Check
Brug `Pokemon` klassen fra opgave 13.

Lav en metode `printStatus(Pokemon p)` der:
- Hvis hp <= 0: print "Fainted"
- Hvis hp < 30: print "Critical"
- Hvis hp < 70: print "Hurt"
- Ellers: print "Healthy"

I `main()`:
- Lav fire Pokemon med hp: 100, 50, 20, 0
- Kald `printStatus()` på alle fire

<details>
<summary>Se svar</summary>

```java
void printStatus(Pokemon p) {
    if (p.hp <= 0) {
        System.out.println(p.name + ": Fainted");
    } else if (p.hp < 30) {
        System.out.println(p.name + ": Critical");
    } else if (p.hp < 70) {
        System.out.println(p.name + ": Hurt");
    } else {
        System.out.println(p.name + ": Healthy");
    }
}

void main() {
    Pokemon p1 = new Pokemon("Pikachu", 25, 100);
    Pokemon p2 = new Pokemon("Charizard", 50, 50);
    Pokemon p3 = new Pokemon("Bulbasaur", 10, 20);
    Pokemon p4 = new Pokemon("Squirtle", 15, 0);
    
    printStatus(p1);
    printStatus(p2);
    printStatus(p3);
    printStatus(p4);
}
```
</details>

---

## Del C: Arrays af Objekter

### Opgave 17: Første Object Array
Lav en klasse `Student` med:
- `String name`
- `int age`

Lav en konstruktør.

I `main()`:
- Lav et array af `Student` objekter med plads til 3
- Fyld arrayet med tre studerende
- Print alle studerendes navne

<details>
<summary>Se svar</summary>

```java
class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

void main() {
    Student[] students = new Student[3];
    students[0] = new Student("Anna", 20);
    students[1] = new Student("Mikkel", 22);
    students[2] = new Student("Sofie", 21);
    
    System.out.println(students[0].name);
    System.out.println(students[1].name);
    System.out.println(students[2].name);
}
```
</details>

---

### Opgave 18: Loop Gennem Object Array
Brug `Student` klassen fra opgave 17.

I `main()`:
- Lav et array med 5 studerende
- Brug et for-loop til at printe alle studerendes navne

<details>
<summary>Se svar</summary>

```java
void main() {
    Student[] students = new Student[5];
    students[0] = new Student("Anna", 20);
    students[1] = new Student("Mikkel", 22);
    students[2] = new Student("Sofie", 21);
    students[3] = new Student("Lars", 23);
    students[4] = new Student("Emma", 19);
    
    for (int i = 0; i < students.length; i++) {
        System.out.println(students[i].name);
    }
}
```
</details>

---

### Opgave 19: Print Alle Objekter
Brug `Enemy` klassen fra Del B.

Lav en metode `printAllEnemies(Enemy[] enemies)` der bruger et loop til at printe alle enemies' navn og health.

I `main()`:
- Lav et array med 3 enemies
- Kald `printAllEnemies()`

<details>
<summary>Se svar</summary>

```java
void printAllEnemies(Enemy[] enemies) {
    for (int i = 0; i < enemies.length; i++) {
        System.out.println(enemies[i].name + ": " + enemies[i].health + " HP");
    }
}

void main() {
    Enemy[] enemies = new Enemy[3];
    enemies[0] = new Enemy("Goblin", 50, 10);
    enemies[1] = new Enemy("Orc", 100, 15);
    enemies[2] = new Enemy("Dragon", 200, 30);
    
    printAllEnemies(enemies);
}
```
</details>

---

### Opgave 20: Beregn Total
Brug `Player` klassen fra Del A (med name og score).

Lav en metode `calculateTotalScore(Player[] players)` der returnerer den totale score af alle spillere.

I `main()`:
- Lav et array med 4 spillere
- Print den totale score

<details>
<summary>Hint</summary>

Lav en variabel `total` der starter på 0, og læg hver spillers score til i et loop.
</details>

<details>
<summary>Se svar</summary>

```java
int calculateTotalScore(Player[] players) {
    int total = 0;
    for (int i = 0; i < players.length; i++) {
        total = total + players[i].score;
    }
    return total;
}

void main() {
    Player[] players = new Player[4];
    players[0] = new Player("Anna", 100);
    players[1] = new Player("Mikkel", 150);
    players[2] = new Player("Sofie", 75);
    players[3] = new Player("Lars", 200);
    
    int total = calculateTotalScore(players);
    System.out.println("Total score: " + total);
}
```
</details>

---

### Opgave 21: Tæl med Condition
Brug `Pokemon` klassen fra Del B.

Lav en metode `countHealthy(Pokemon[] team)` der tæller hvor mange Pokemon har hp > 50.

I `main()`:
- Lav et array med 5 Pokemon med forskellig hp
- Print antal healthy Pokemon

<details>
<summary>Se svar</summary>

```java
int countHealthy(Pokemon[] team) {
    int count = 0;
    for (int i = 0; i < team.length; i++) {
        if (team[i].hp > 50) {
            count = count + 1;
        }
    }
    return count;
}

void main() {
    Pokemon[] team = new Pokemon[5];
    team[0] = new Pokemon("Pikachu", 25, 100);
    team[1] = new Pokemon("Charizard", 50, 30);
    team[2] = new Pokemon("Bulbasaur", 10, 80);
    team[3] = new Pokemon("Squirtle", 15, 45);
    team[4] = new Pokemon("Jigglypuff", 20, 90);
    
    int healthy = countHealthy(team);
    System.out.println("Healthy Pokemon: " + healthy);
}
```
</details>

---

### Opgave 22: Gennemsnit
Brug `Student` klassen. Tilføj en `int grade` instance variable og opdater konstruktøren.

Lav en metode `calculateAverageGrade(Student[] students)` der returnerer gennemsnitskarakteren.

I `main()`:
- Lav et array med 4 studerende med forskellige karakterer
- Print gennemsnitskarakteren

<details>
<summary>Hint</summary>

Beregn total, del med antallet af studerende.
</details>

<details>
<summary>Se svar</summary>

```java
class Student {
    String name;
    int age;
    int grade;
    
    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

double calculateAverageGrade(Student[] students) {
    int total = 0;
    for (int i = 0; i < students.length; i++) {
        total = total + students[i].grade;
    }
    return (double) total / students.length;
}

void main() {
    Student[] students = new Student[4];
    students[0] = new Student("Anna", 20, 10);
    students[1] = new Student("Mikkel", 22, 7);
    students[2] = new Student("Sofie", 21, 12);
    students[3] = new Student("Lars", 23, 4);
    
    double average = calculateAverageGrade(students);
    System.out.println("Average grade: " + average);
}
```
</details>

---

### Opgave 23: Modificer Alle
Brug `Item` klassen fra Del A.

Lav en metode `applyDiscount(Item[] items, int discount)` der reducerer alle items' pris med discount beløbet.

I `main()`:
- Lav et array med 3 items
- Print alle priser
- Kald `applyDiscount(items, 10)`
- Print alle priser igen

<details>
<summary>Se svar</summary>

```java
void applyDiscount(Item[] items, int discount) {
    for (int i = 0; i < items.length; i++) {
        items[i].price = items[i].price - discount;
    }
}

void main() {
    Item[] items = new Item[3];
    items[0] = new Item("Sword", 150, 2.5);
    items[1] = new Item("Shield", 100, 3.0);
    items[2] = new Item("Potion", 50, 0.3);
    
    for (int i = 0; i < items.length; i++) {
        System.out.println(items[i].name + ": " + items[i].price);
    }
    
    applyDiscount(items, 10);
    
    for (int i = 0; i < items.length; i++) {
        System.out.println(items[i].name + ": " + items[i].price);
    }
}
```
</details>

---

### Opgave 24: Conditional Loop
Brug `Enemy` klassen fra Del B.

Lav en metode `printAliveEnemies(Enemy[] enemies)` der kun printer enemies med health > 0.

I `main()`:
- Lav et array med 5 enemies (nogle med 0 health)
- Kald metoden

<details>
<summary>Se svar</summary>

```java
void printAliveEnemies(Enemy[] enemies) {
    for (int i = 0; i < enemies.length; i++) {
        if (enemies[i].health > 0) {
            System.out.println(enemies[i].name + " is alive");
        }
    }
}

void main() {
    Enemy[] enemies = new Enemy[5];
    enemies[0] = new Enemy("Goblin", 50, 10);
    enemies[1] = new Enemy("Orc", 0, 15);
    enemies[2] = new Enemy("Dragon", 200, 30);
    enemies[3] = new Enemy("Skeleton", 0, 5);
    enemies[4] = new Enemy("Troll", 80, 20);
    
    printAliveEnemies(enemies);
}
```
</details>

---

## Del D: Søg og Find i Object Arrays

### Opgave 25: Find Første Match
Brug `Player` klassen fra Del A.

Lav en metode `findPlayerByName(Player[] players, String name)` der:
- Returnerer index af første spiller med det navn
- Returnerer -1 hvis ikke fundet

I `main()`:
- Lav et array med 4 spillere
- Find index af "Mikkel"
- Print resultatet

<details>
<summary>Hint</summary>

Loop gennem arrayet, check om name matcher, return index hvis match.
</details>

<details>
<summary>Se svar</summary>

```java
int findPlayerByName(Player[] players, String name) {
    for (int i = 0; i < players.length; i++) {
        if (players[i].name.equals(name)) {
            return i;
        }
    }
    return -1;
}

void main() {
    Player[] players = new Player[4];
    players[0] = new Player("Anna", 100);
    players[1] = new Player("Mikkel", 150);
    players[2] = new Player("Sofie", 75);
    players[3] = new Player("Lars", 200);
    
    int index = findPlayerByName(players, "Mikkel");
    System.out.println("Mikkel found at index: " + index);
}
```
</details>

---

### Opgave 26: Find Højeste
Brug `Player` klassen.

Lav en metode `findHighestScore(Player[] players)` der returnerer index af spilleren med højest score.

I `main()`:
- Lav et array med 5 spillere
- Find index af højeste score
- Print spillerens navn og score

<details>
<summary>Hint</summary>

Start med index 0 som højeste, sammenlign med resten i et loop.
</details>

<details>
<summary>Se svar</summary>

```java
int findHighestScore(Player[] players) {
    int highestIndex = 0;
    for (int i = 1; i < players.length; i++) {
        if (players[i].score > players[highestIndex].score) {
            highestIndex = i;
        }
    }
    return highestIndex;
}

void main() {
    Player[] players = new Player[5];
    players[0] = new Player("Anna", 100);
    players[1] = new Player("Mikkel", 250);
    players[2] = new Player("Sofie", 75);
    players[3] = new Player("Lars", 200);
    players[4] = new Player("Emma", 180);
    
    int index = findHighestScore(players);
    System.out.println("Highest score: " + players[index].name + " with " + players[index].score);
}
```
</details>

---

### Opgave 27: Find Laveste Health
Brug `Pokemon` klassen fra Del B.

Lav en metode `findWeakest(Pokemon[] team)` der returnerer index af Pokemon med lavest hp.

I `main()`:
- Lav et array med 4 Pokemon
- Find den svageste
- Print navn og hp

<details>
<summary>Se svar</summary>

```java
int findWeakest(Pokemon[] team) {
    int weakestIndex = 0;
    for (int i = 1; i < team.length; i++) {
        if (team[i].hp < team[weakestIndex].hp) {
            weakestIndex = i;
        }
    }
    return weakestIndex;
}

void main() {
    Pokemon[] team = new Pokemon[4];
    team[0] = new Pokemon("Pikachu", 25, 100);
    team[1] = new Pokemon("Charizard", 50, 150);
    team[2] = new Pokemon("Bulbasaur", 10, 45);
    team[3] = new Pokemon("Squirtle", 15, 90);
    
    int index = findWeakest(team);
    System.out.println("Weakest: " + team[index].name + " with " + team[index].hp + " HP");
}
```
</details>

---

### Opgave 28: Check Findes
Brug `Item` klassen fra Del A.

Lav en metode `hasItem(Item[] inventory, String itemName)` der returnerer `true` hvis itemet findes i inventory.

I `main()`:
- Lav et inventory array med 3 items
- Check om "Sword" findes
- Check om "Helmet" findes
- Print resultaterne

<details>
<summary>Se svar</summary>

```java
boolean hasItem(Item[] inventory, String itemName) {
    for (int i = 0; i < inventory.length; i++) {
        if (inventory[i].name.equals(itemName)) {
            return true;
        }
    }
    return false;
}

void main() {
    Item[] inventory = new Item[3];
    inventory[0] = new Item("Sword", 150, 2.5);
    inventory[1] = new Item("Shield", 100, 3.0);
    inventory[2] = new Item("Potion", 50, 0.3);
    
    System.out.println("Has Sword: " + hasItem(inventory, "Sword"));
    System.out.println("Has Helmet: " + hasItem(inventory, "Helmet"));
}
```
</details>

---

### Opgave 29: Find Alle Over Grænse
Brug `Student` klassen med grade fra opgave 22.

Lav en metode `countPassing(Student[] students, int passingGrade)` der tæller hvor mange studerende har grade >= passingGrade.

I `main()`:
- Lav et array med 6 studerende
- Tæl hvor mange har bestået (grade >= 2)
- Print antallet

<details>
<summary>Se svar</summary>

```java
int countPassing(Student[] students, int passingGrade) {
    int count = 0;
    for (int i = 0; i < students.length; i++) {
        if (students[i].grade >= passingGrade) {
            count = count + 1;
        }
    }
    return count;
}

void main() {
    Student[] students = new Student[6];
    students[0] = new Student("Anna", 20, 10);
    students[1] = new Student("Mikkel", 22, 7);
    students[2] = new Student("Sofie", 21, -3);
    students[3] = new Student("Lars", 23, 4);
    students[4] = new Student("Emma", 19, 12);
    students[5] = new Student("Peter", 21, 2);
    
    int passing = countPassing(students, 2);
    System.out.println("Passing students: " + passing);
}
```
</details>

---

### Opgave 30: Find Dyrest Item
Brug `Item` klassen fra Del A.

Lav en metode `findMostExpensive(Item[] items)` der returnerer index af det dyreste item.

I `main()`:
- Lav et array med 5 items
- Find det dyreste
- Print navn og pris

<details>
<summary>Se svar</summary>

```java
int findMostExpensive(Item[] items) {
    int mostExpensiveIndex = 0;
    for (int i = 1; i < items.length; i++) {
        if (items[i].price > items[mostExpensiveIndex].price) {
            mostExpensiveIndex = i;
        }
    }
    return mostExpensiveIndex;
}

void main() {
    Item[] items = new Item[5];
    items[0] = new Item("Sword", 150, 2.5);
    items[1] = new Item("Shield", 100, 3.0);
    items[2] = new Item("Helmet", 75, 1.5);
    items[3] = new Item("Armor", 300, 5.0);
    items[4] = new Item("Potion", 50, 0.3);
    
    int index = findMostExpensive(items);
    System.out.println("Most expensive: " + items[index].name + " costs " + items[index].price);
}
```
</details>

---

### Opgave 31: Find Første Over Værdi
Brug `Car` klassen fra Del B.

Lav en metode `findFirstSpeeding(Car[] cars, int speedLimit)` der returnerer index af første bil med speed > speedLimit, eller -1 hvis ingen findes.

I `main()`:
- Lav et array med 4 biler
- Find første bil over 130 km/t
- Print resultatet

<details>
<summary>Se svar</summary>

```java
int findFirstSpeeding(Car[] cars, int speedLimit) {
    for (int i = 0; i < cars.length; i++) {
        if (cars[i].speed > speedLimit) {
            return i;
        }
    }
    return -1;
}

void main() {
    Car[] cars = new Car[4];
    cars[0] = new Car("Tesla", 100);
    cars[1] = new Car("Toyota", 120);
    cars[2] = new Car("Ferrari", 180);
    cars[3] = new Car("Ford", 110);
    
    int index = findFirstSpeeding(cars, 130);
    if (index != -1) {
        System.out.println(cars[index].brand + " is speeding at " + cars[index].speed);
    } else {
        System.out.println("No speeding cars");
    }
}
```
</details>

---

### Opgave 32: Tæl Type
Lav en klasse `Monster` med:
- `String name`
- `String type` (f.eks. "Fire", "Water", "Grass")
- `int level`

Lav en konstruktør.

Lav en metode `countType(Monster[] monsters, String type)` der tæller hvor mange monsters har den type.

I `main()`:
- Lav et array med 6 monsters af forskellige typer
- Tæl hvor mange "Fire" type monsters der er
- Print resultatet

<details>
<summary>Se svar</summary>

```java
class Monster {
    String name;
    String type;
    int level;
    
    Monster(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }
}

int countType(Monster[] monsters, String type) {
    int count = 0;
    for (int i = 0; i < monsters.length; i++) {
        if (monsters[i].type.equals(type)) {
            count = count + 1;
        }
    }
    return count;
}

void main() {
    Monster[] monsters = new Monster[6];
    monsters[0] = new Monster("Charmander", "Fire", 5);
    monsters[1] = new Monster("Squirtle", "Water", 5);
    monsters[2] = new Monster("Bulbasaur", "Grass", 5);
    monsters[3] = new Monster("Vulpix", "Fire", 10);
    monsters[4] = new Monster("Psyduck", "Water", 8);
    monsters[5] = new Monster("Charizard", "Fire", 36);
    
    int fireCount = countType(monsters, "Fire");
    System.out.println("Fire type monsters: " + fireCount);
}
```
</details>

---

## Del E: Komplekse Scenarier

### Opgave 33: Heal Team
Brug `Pokemon` klassen fra Del B.

Lav en metode `healTeam(Pokemon[] team, int healAmount)` der:
- Øger hp for alle Pokemon med healAmount
- Men hp må ikke overstige 100

I `main()`:
- Lav et team med 3 Pokemon (hp: 50, 80, 30)
- Heal team med 30
- Print alle Pokemon's hp

<details>
<summary>Hint</summary>

Efter healing, check om hp > 100, og sæt til 100 hvis det er tilfældet.
</details>

<details>
<summary>Se svar</summary>

```java
void healTeam(Pokemon[] team, int healAmount) {
    for (int i = 0; i < team.length; i++) {
        team[i].hp = team[i].hp + healAmount;
        if (team[i].hp > 100) {
            team[i].hp = 100;
        }
    }
}

void main() {
    Pokemon[] team = new Pokemon[3];
    team[0] = new Pokemon("Pikachu", 25, 50);
    team[1] = new Pokemon("Charizard", 50, 80);
    team[2] = new Pokemon("Bulbasaur", 10, 30);
    
    healTeam(team, 30);
    
    for (int i = 0; i < team.length; i++) {
        System.out.println(team[i].name + ": " + team[i].hp);
    }
}
```
</details>

---

### Opgave 34: Battle System
Brug `Pokemon` klassen.

Lav en metode `attack(Pokemon attacker, Pokemon defender)` der:
- Reducer defender's hp med attacker's level
- Print "{attacker.name} attacks {defender.name}!"

I `main()`:
- Lav to Pokemon
- Lad dem angribe hinanden et par gange
- Print begge Pokemon's hp

<details>
<summary>Se svar</summary>

```java
void attack(Pokemon attacker, Pokemon defender) {
    System.out.println(attacker.name + " attacks " + defender.name + "!");
    defender.hp = defender.hp - attacker.level;
}

void main() {
    Pokemon pikachu = new Pokemon("Pikachu", 25, 100);
    Pokemon charizard = new Pokemon("Charizard", 50, 150);
    
    attack(pikachu, charizard);
    attack(charizard, pikachu);
    attack(pikachu, charizard);
    
    System.out.println(pikachu.name + ": " + pikachu.hp + " HP");
    System.out.println(charizard.name + ": " + charizard.hp + " HP");
}
```
</details>

---

### Opgave 35: Inventory System
Brug `Item` klassen fra Del A.

Lav en metode `calculateInventoryValue(Item[] inventory)` der returnerer total værdi af alle items.

Lav en metode `calculateInventoryWeight(Item[] inventory)` der returnerer total vægt.

I `main()`:
- Lav et inventory med 5 items
- Print total værdi og vægt

<details>
<summary>Se svar</summary>

```java
int calculateInventoryValue(Item[] inventory) {
    int total = 0;
    for (int i = 0; i < inventory.length; i++) {
        total = total + inventory[i].price;
    }
    return total;
}

double calculateInventoryWeight(Item[] inventory) {
    double total = 0;
    for (int i = 0; i < inventory.length; i++) {
        total = total + inventory[i].weight;
    }
    return total;
}

void main() {
    Item[] inventory = new Item[5];
    inventory[0] = new Item("Sword", 150, 2.5);
    inventory[1] = new Item("Shield", 100, 3.0);
    inventory[2] = new Item("Helmet", 75, 1.5);
    inventory[3] = new Item("Armor", 300, 5.0);
    inventory[4] = new Item("Potion", 50, 0.3);
    
    int value = calculateInventoryValue(inventory);
    double weight = calculateInventoryWeight(inventory);
    
    System.out.println("Total value: " + value);
    System.out.println("Total weight: " + weight);
}
```
</details>

---

### Opgave 36: Top 3 Scores
Brug `Player` klassen.

Lav en metode `printTop3(Player[] players)` der printer navnene på de 3 spillere med højest score.

I `main()`:
- Lav et array med 7 spillere
- Print top 3

<details>
<summary>Hint</summary>

Find højeste 3 gange, men ignorer allerede fundne spillere. Brug en hjælpe-variabel til at markere fundne.
</details>

<details>
<summary>Se svar</summary>

```java
void printTop3(Player[] players) {
    // Find 1st
    int first = 0;
    for (int i = 1; i < players.length; i++) {
        if (players[i].score > players[first].score) {
            first = i;
        }
    }
    System.out.println("1st: " + players[first].name + " - " + players[first].score);
    
    // Find 2nd
    int second = 0;
    if (second == first) second = 1;
    for (int i = 0; i < players.length; i++) {
        if (i != first && players[i].score > players[second].score) {
            second = i;
        }
    }
    System.out.println("2nd: " + players[second].name + " - " + players[second].score);
    
    // Find 3rd
    int third = 0;
    if (third == first || third == second) third = 1;
    if (third == first || third == second) third = 2;
    for (int i = 0; i < players.length; i++) {
        if (i != first && i != second && players[i].score > players[third].score) {
            third = i;
        }
    }
    System.out.println("3rd: " + players[third].name + " - " + players[third].score);
}

void main() {
    Player[] players = new Player[7];
    players[0] = new Player("Anna", 100);
    players[1] = new Player("Mikkel", 250);
    players[2] = new Player("Sofie", 175);
    players[3] = new Player("Lars", 200);
    players[4] = new Player("Emma", 180);
    players[5] = new Player("Peter", 90);
    players[6] = new Player("Maria", 220);
    
    printTop3(players);
}
```
</details>

---

### Opgave 37: Shop System
Brug `Item` og `Player` klasserne.

Tilføj `int money` til `Player` klassen.

Lav en metode `buyItem(Player player, Item item)` der:
- Hvis player.money >= item.price: reducer money, print "Purchased {item.name}"
- Ellers: print "Not enough money"

I `main()`:
- Lav en spiller med 200 money
- Lav 3 items med forskellige priser
- Prøv at købe alle 3 items

<details>
<summary>Se svar</summary>

```java
class Player {
    String name;
    int score;
    int money;
    
    Player(String name, int score, int money) {
        this.name = name;
        this.score = score;
        this.money = money;
    }
}

void buyItem(Player player, Item item) {
    if (player.money >= item.price) {
        player.money = player.money - item.price;
        System.out.println("Purchased " + item.name);
    } else {
        System.out.println("Not enough money for " + item.name);
    }
}

void main() {
    Player player = new Player("Anna", 0, 200);
    
    Item sword = new Item("Sword", 150, 2.5);
    Item shield = new Item("Shield", 100, 3.0);
    Item potion = new Item("Potion", 50, 0.3);
    
    buyItem(player, sword);
    buyItem(player, shield);
    buyItem(player, potion);
    
    System.out.println("Money left: " + player.money);
}
```
</details>

---

### Opgave 38: Team Average Level
Brug `Pokemon` klassen.

Lav en metode `getAverageLevel(Pokemon[] team)` der returnerer det gennemsnitlige level.

Lav en metode `isStrongTeam(Pokemon[] team)` der returnerer `true` hvis average level >= 30.

I `main()`:
- Lav to teams med forskellige levels
- Check om de er strong teams
- Print resultaterne

<details>
<summary>Se svar</summary>

```java
double getAverageLevel(Pokemon[] team) {
    int total = 0;
    for (int i = 0; i < team.length; i++) {
        total = total + team[i].level;
    }
    return (double) total / team.length;
}

boolean isStrongTeam(Pokemon[] team) {
    double avg = getAverageLevel(team);
    return avg >= 30;
}

void main() {
    Pokemon[] team1 = new Pokemon[3];
    team1[0] = new Pokemon("Pikachu", 25, 100);
    team1[1] = new Pokemon("Charizard", 50, 150);
    team1[2] = new Pokemon("Bulbasaur", 10, 80);
    
    Pokemon[] team2 = new Pokemon[3];
    team2[0] = new Pokemon("Dragonite", 55, 200);
    team2[1] = new Pokemon("Mewtwo", 70, 250);
    team2[2] = new Pokemon("Mew", 65, 220);
    
    System.out.println("Team 1 strong: " + isStrongTeam(team1));
    System.out.println("Team 2 strong: " + isStrongTeam(team2));
}
```
</details>

---

### Opgave 39: Swap Objects
Brug `Player` klassen.

Lav en metode `swapPlayers(Player[] players, int index1, int index2)` der bytter om på to spillere i arrayet.

I `main()`:
- Lav et array med 4 spillere
- Print alle navne
- Swap index 0 og 2
- Print alle navne igen

<details>
<summary>Hint</summary>

Brug en temporary variabel til at gemme den ene spiller mens du swapper.
</details>

<details>
<summary>Se svar</summary>

```java
void swapPlayers(Player[] players, int index1, int index2) {
    Player temp = players[index1];
    players[index1] = players[index2];
    players[index2] = temp;
}

void main() {
    Player[] players = new Player[4];
    players[0] = new Player("Anna", 100);
    players[1] = new Player("Mikkel", 150);
    players[2] = new Player("Sofie", 75);
    players[3] = new Player("Lars", 200);
    
    for (int i = 0; i < players.length; i++) {
        System.out.println(players[i].name);
    }
    
    System.out.println("--- After swap ---");
    swapPlayers(players, 0, 2);
    
    for (int i = 0; i < players.length; i++) {
        System.out.println(players[i].name);
    }
}
```
</details>

---

### Opgave 40: Remove Fainted Pokemon
Brug `Pokemon` klassen.

Lav en metode `countAlive(Pokemon[] team)` der returnerer antal Pokemon med hp > 0.

Lav en metode `getAliveTeam(Pokemon[] team)` der:
- Laver et nyt array med kun de Pokemon der har hp > 0
- Returnerer det nye array

I `main()`:
- Lav et team med 5 Pokemon (nogle med 0 hp)
- Lav et nyt array med kun de levende Pokemon
- Print navnene på de levende Pokemon

<details>
<summary>Hint</summary>

Først tæl hvor mange alive, lav array i den størrelse, fyld det med alive Pokemon.
</details>

<details>
<summary>Se svar</summary>

```java
int countAlive(Pokemon[] team) {
    int count = 0;
    for (int i = 0; i < team.length; i++) {
        if (team[i].hp > 0) {
            count = count + 1;
        }
    }
    return count;
}

Pokemon[] getAliveTeam(Pokemon[] team) {
    int aliveCount = countAlive(team);
    Pokemon[] aliveTeam = new Pokemon[aliveCount];
    
    int index = 0;
    for (int i = 0; i < team.length; i++) {
        if (team[i].hp > 0) {
            aliveTeam[index] = team[i];
            index = index + 1;
        }
    }
    
    return aliveTeam;
}

void main() {
    Pokemon[] team = new Pokemon[5];
    team[0] = new Pokemon("Pikachu", 25, 100);
    team[1] = new Pokemon("Charizard", 50, 0);
    team[2] = new Pokemon("Bulbasaur", 10, 80);
    team[3] = new Pokemon("Squirtle", 15, 0);
    team[4] = new Pokemon("Jigglypuff", 20, 90);
    
    Pokemon[] aliveTeam = getAliveTeam(team);
    
    System.out.println("Alive Pokemon:");
    for (int i = 0; i < aliveTeam.length; i++) {
        System.out.println(aliveTeam[i].name);
    }
}
```
</details>

---

## Del F: Real-World Scenarios og Problemløsning

### Opgave 41: RPG Character System
Lav en klasse `Character` med:
- `String name`
- `int health`
- `int attackPower`
- `int defense`
- `int level`

Lav en konstruktør.

Lav følgende metoder:
- `takeDamage(Character c, int damage)` - reducer health med (damage - defense), minimum 0
- `levelUp(Character c)` - øg level med 1, øg health med 20, øg attackPower med 5, øg defense med 3
- `printStats(Character c)` - print alle karakterens stats

I `main()`:
- Lav 2 karakterer
- Lad dem kæmpe (attack hinanden)
- Level up en karakter
- Print begge karakterers stats

<details>
<summary>Hint</summary>

Damage = damage - defense, men sørg for at health ikke bliver negativ.
</details>

<details>
<summary>Se svar</summary>

```java
class Character {
    String name;
    int health;
    int attackPower;
    int defense;
    int level;
    
    Character(String name, int health, int attackPower, int defense, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.level = level;
    }
}

void takeDamage(Character c, int damage) {
    int actualDamage = damage - c.defense;
    if (actualDamage < 0) {
        actualDamage = 0;
    }
    c.health = c.health - actualDamage;
    if (c.health < 0) {
        c.health = 0;
    }
}

void levelUp(Character c) {
    c.level = c.level + 1;
    c.health = c.health + 20;
    c.attackPower = c.attackPower + 5;
    c.defense = c.defense + 3;
}

void printStats(Character c) {
    System.out.println("=== " + c.name + " ===");
    System.out.println("Level: " + c.level);
    System.out.println("Health: " + c.health);
    System.out.println("Attack: " + c.attackPower);
    System.out.println("Defense: " + c.defense);
    System.out.println();
}

void main() {
    Character warrior = new Character("Warrior", 100, 20, 10, 1);
    Character mage = new Character("Mage", 80, 30, 5, 1);
    
    takeDamage(mage, warrior.attackPower);
    takeDamage(warrior, mage.attackPower);
    
    levelUp(warrior);
    
    printStats(warrior);
    printStats(mage);
}
```
</details>

---

### Opgave 42: Student Grade System
Brug `Student` klassen med grade fra tidligere.

Lav en metode `printGradeDistribution(Student[] students)` der printer:
- Antal studerende med grade 12
- Antal studerende med grade 10 eller 7
- Antal studerende med grade 4 eller 2
- Antal studerende med grade 0 eller -3

I `main()`:
- Lav et array med 10 studerende med forskellige karakterer
- Print grade distribution

<details>
<summary>Se svar</summary>

```java
void printGradeDistribution(Student[] students) {
    int top = 0;
    int good = 0;
    int passing = 0;
    int failing = 0;
    
    for (int i = 0; i < students.length; i++) {
        if (students[i].grade == 12) {
            top = top + 1;
        } else if (students[i].grade == 10 || students[i].grade == 7) {
            good = good + 1;
        } else if (students[i].grade == 4 || students[i].grade == 2) {
            passing = passing + 1;
        } else {
            failing = failing + 1;
        }
    }
    
    System.out.println("Grade 12: " + top);
    System.out.println("Grade 10/7: " + good);
    System.out.println("Grade 4/2: " + passing);
    System.out.println("Grade 0/-3: " + failing);
}

void main() {
    Student[] students = new Student[10];
    students[0] = new Student("Anna", 20, 12);
    students[1] = new Student("Mikkel", 22, 7);
    students[2] = new Student("Sofie", 21, 10);
    students[3] = new Student("Lars", 23, 4);
    students[4] = new Student("Emma", 19, 12);
    students[5] = new Student("Peter", 21, 2);
    students[6] = new Student("Maria", 20, 10);
    students[7] = new Student("Jonas", 22, 0);
    students[8] = new Student("Lisa", 21, 7);
    students[9] = new Student("Simon", 23, -3);
    
    printGradeDistribution(students);
}
```
</details>

---

### Opgave 43: Pokemon Team Battle
Brug `Pokemon` klassen.

Lav en metode `battleTeams(Pokemon[] team1, Pokemon[] team2)` der:
- Hver Pokemon fra team1 angriber en Pokemon fra team2 (i rækkefølge)
- Damage = attackerens level
- Print hvem der angriber hvem
- Efter alle angreb, print begge teams' total hp

I `main()`:
- Lav to teams med 3 Pokemon hver
- Lav battle
- Print resultatet

<details>
<summary>Hint</summary>

Brug modulo (%) til at wrappe rundt hvis et team er større end det andet.
</details>

<details>
<summary>Se svar</summary>

```java
void battleTeams(Pokemon[] team1, Pokemon[] team2) {
    for (int i = 0; i < team1.length; i++) {
        int targetIndex = i % team2.length;
        System.out.println(team1[i].name + " attacks " + team2[targetIndex].name);
        team2[targetIndex].hp = team2[targetIndex].hp - team1[i].level;
    }
    
    int total1 = 0;
    int total2 = 0;
    
    for (int i = 0; i < team1.length; i++) {
        total1 = total1 + team1[i].hp;
    }
    
    for (int i = 0; i < team2.length; i++) {
        total2 = total2 + team2[i].hp;
    }
    
    System.out.println("Team 1 total HP: " + total1);
    System.out.println("Team 2 total HP: " + total2);
}

void main() {
    Pokemon[] team1 = new Pokemon[3];
    team1[0] = new Pokemon("Pikachu", 25, 100);
    team1[1] = new Pokemon("Charizard", 50, 150);
    team1[2] = new Pokemon("Bulbasaur", 10, 80);
    
    Pokemon[] team2 = new Pokemon[3];
    team2[0] = new Pokemon("Squirtle", 15, 90);
    team2[1] = new Pokemon("Jigglypuff", 20, 110);
    team2[2] = new Pokemon("Meowth", 12, 70);
    
    battleTeams(team1, team2);
}
```
</details>

---

### Opgave 44: Library System
Lav en klasse `Book` med:
- `String title`
- `String author`
- `boolean available`

Lav en konstruktør (available starter som `true`).

Lav følgende metoder:
- `borrowBook(Book[] library, String title)` - find bogen og sæt available til false hvis fundet og available
- `returnBook(Book[] library, String title)` - find bogen og sæt available til true
- `printAvailableBooks(Book[] library)` - print alle tilgængelige bøger

I `main()`:
- Lav et bibliotek med 5 bøger
- Lån 2 bøger
- Print tilgængelige bøger
- Returner 1 bog
- Print tilgængelige bøger igen

<details>
<summary>Se svar</summary>

```java
class Book {
    String title;
    String author;
    boolean available;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
}

void borrowBook(Book[] library, String title) {
    for (int i = 0; i < library.length; i++) {
        if (library[i].title.equals(title)) {
            if (library[i].available) {
                library[i].available = false;
                System.out.println("Borrowed: " + title);
            } else {
                System.out.println("Not available: " + title);
            }
            return;
        }
    }
    System.out.println("Book not found: " + title);
}

void returnBook(Book[] library, String title) {
    for (int i = 0; i < library.length; i++) {
        if (library[i].title.equals(title)) {
            library[i].available = true;
            System.out.println("Returned: " + title);
            return;
        }
    }
}

void printAvailableBooks(Book[] library) {
    System.out.println("Available books:");
    for (int i = 0; i < library.length; i++) {
        if (library[i].available) {
            System.out.println("- " + library[i].title + " by " + library[i].author);
        }
    }
}

void main() {
    Book[] library = new Book[5];
    library[0] = new Book("1984", "George Orwell");
    library[1] = new Book("Harry Potter", "J.K. Rowling");
    library[2] = new Book("The Hobbit", "J.R.R. Tolkien");
    library[3] = new Book("Dune", "Frank Herbert");
    library[4] = new Book("Neuromancer", "William Gibson");
    
    borrowBook(library, "1984");
    borrowBook(library, "Dune");
    
    printAvailableBooks(library);
    
    returnBook(library, "1984");
    
    printAvailableBooks(library);
}
```
</details>

---

### Opgave 45: Store Inventory Management
Brug `Item` klassen. Tilføj `int stock` instance variable.

Lav følgende metoder:
- `sellItem(Item[] inventory, String itemName, int quantity)` - reducer stock hvis nok på lager
- `restockItem(Item[] inventory, String itemName, int quantity)` - øg stock
- `printLowStock(Item[] inventory, int threshold)` - print items med stock < threshold
- `calculateTotalInventoryValue(Item[] inventory)` - returner total værdi (price * stock for alle items)

I `main()`:
- Lav et inventory med 4 items
- Sælg nogle items
- Restock nogle items
- Print low stock items
- Print total inventory value

<details>
<summary>Hint</summary>

Hver metode skal finde itemet i arrayet først, så modificere det.
</details>

<details>
<summary>Se svar</summary>

```java
class Item {
    String name;
    int price;
    double weight;
    int stock;
    
    Item(String name, int price, double weight, int stock) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
    }
}

void sellItem(Item[] inventory, String itemName, int quantity) {
    for (int i = 0; i < inventory.length; i++) {
        if (inventory[i].name.equals(itemName)) {
            if (inventory[i].stock >= quantity) {
                inventory[i].stock = inventory[i].stock - quantity;
                System.out.println("Sold " + quantity + " " + itemName);
            } else {
                System.out.println("Not enough stock for " + itemName);
            }
            return;
        }
    }
}

void restockItem(Item[] inventory, String itemName, int quantity) {
    for (int i = 0; i < inventory.length; i++) {
        if (inventory[i].name.equals(itemName)) {
            inventory[i].stock = inventory[i].stock + quantity;
            System.out.println("Restocked " + quantity + " " + itemName);
            return;
        }
    }
}

void printLowStock(Item[] inventory, int threshold) {
    System.out.println("Low stock items:");
    for (int i = 0; i < inventory.length; i++) {
        if (inventory[i].stock < threshold) {
            System.out.println("- " + inventory[i].name + ": " + inventory[i].stock);
        }
    }
}

int calculateTotalInventoryValue(Item[] inventory) {
    int total = 0;
    for (int i = 0; i < inventory.length; i++) {
        total = total + (inventory[i].price * inventory[i].stock);
    }
    return total;
}

void main() {
    Item[] inventory = new Item[4];
    inventory[0] = new Item("Sword", 150, 2.5, 10);
    inventory[1] = new Item("Shield", 100, 3.0, 5);
    inventory[2] = new Item("Potion", 50, 0.3, 20);
    inventory[3] = new Item("Armor", 300, 5.0, 3);
    
    sellItem(inventory, "Sword", 7);
    sellItem(inventory, "Potion", 15);
    restockItem(inventory, "Shield", 10);
    
    printLowStock(inventory, 5);
    
    int value = calculateTotalInventoryValue(inventory);
    System.out.println("Total inventory value: " + value);
}
```
</details>

---

### Opgave 46: Racing Game
Lav en klasse `Racer` med:
- `String name`
- `int position` (starter på 0)
- `int speed`

Lav en konstruktør.

Lav følgende metoder:
- `race(Racer[] racers, int laps)` - simuler et race hvor hver racer rykker fremad med deres speed hver lap
- `printStandings(Racer[] racers)` - print racers sorteret efter position (højeste først)
- `findWinner(Racer[] racers)` - returner index af racer med højeste position

I `main()`:
- Lav 4 racers med forskellig speed
- Kør et 5-lap race
- Print standings
- Print vinderen

<details>
<summary>Hint</summary>

For printStandings skal du finde højeste position, print den, så find næsthøjeste, osv.
</details>

<details>
<summary>Se svar</summary>

```java
class Racer {
    String name;
    int position;
    int speed;
    
    Racer(String name, int speed) {
        this.name = name;
        this.position = 0;
        this.speed = speed;
    }
}

void race(Racer[] racers, int laps) {
    for (int lap = 0; lap < laps; lap++) {
        for (int i = 0; i < racers.length; i++) {
            racers[i].position = racers[i].position + racers[i].speed;
        }
    }
}

int findWinner(Racer[] racers) {
    int winnerIndex = 0;
    for (int i = 1; i < racers.length; i++) {
        if (racers[i].position > racers[winnerIndex].position) {
            winnerIndex = i;
        }
    }
    return winnerIndex;
}

void printStandings(Racer[] racers) {
    System.out.println("=== Race Standings ===");
    
    boolean[] printed = new boolean[racers.length];
    
    for (int place = 0; place < racers.length; place++) {
        int bestIndex = -1;
        int bestPosition = -1;
        
        for (int i = 0; i < racers.length; i++) {
            if (!printed[i] && racers[i].position > bestPosition) {
                bestPosition = racers[i].position;
                bestIndex = i;
            }
        }
        
        printed[bestIndex] = true;
        System.out.println((place + 1) + ". " + racers[bestIndex].name + " - Position: " + racers[bestIndex].position);
    }
}

void main() {
    Racer[] racers = new Racer[4];
    racers[0] = new Racer("Lightning", 25);
    racers[1] = new Racer("Storm", 30);
    racers[2] = new Racer("Thunder", 20);
    racers[3] = new Racer("Blaze", 28);
    
    race(racers, 5);
    
    printStandings(racers);
    
    int winner = findWinner(racers);
    System.out.println("\nWinner: " + racers[winner].name);
}
```
</details>

---

### Opgave 47: Card Deck System
Lav en klasse `Card` med:
- `String suit` ("Hearts", "Diamonds", "Clubs", "Spades")
- `String rank` ("2"-"10", "Jack", "Queen", "King", "Ace")
- `int value` (2-14, hvor Ace = 14)

Lav en konstruktør.

Lav følgende metoder:
- `createDeck()` - returner et array med alle 52 kort (13 ranks × 4 suits)
- `printDeck(Card[] deck)` - print alle kort
- `findHighestCard(Card[] hand)` - returner index af kort med højest værdi
- `calculateHandValue(Card[] hand)` - returner total værdi af alle kort

I `main()`:
- Lav et komplet deck (alle 52 kort)
- Lav en "hand" med 5 kort fra decket
- Find højeste kort i hånden
- Beregn hånd værdi

<details>
<summary>Hint</summary>

For at lave deck: nested loops - outer loop for suits, inner loop for ranks.
</details>

<details>
<summary>Se svar</summary>

```java
class Card {
    String suit;
    String rank;
    int value;
    
    Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
}

Card[] createDeck() {
    Card[] deck = new Card[52];
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    int index = 0;
    for (int s = 0; s < suits.length; s++) {
        for (int r = 0; r < ranks.length; r++) {
            deck[index] = new Card(suits[s], ranks[r], r + 2);
            index = index + 1;
        }
    }
    
    return deck;
}

void printDeck(Card[] deck) {
    for (int i = 0; i < deck.length; i++) {
        System.out.println(deck[i].rank + " of " + deck[i].suit);
    }
}

int findHighestCard(Card[] hand) {
    int highestIndex = 0;
    for (int i = 1; i < hand.length; i++) {
        if (hand[i].value > hand[highestIndex].value) {
            highestIndex = i;
        }
    }
    return highestIndex;
}

int calculateHandValue(Card[] hand) {
    int total = 0;
    for (int i = 0; i < hand.length; i++) {
        total = total + hand[i].value;
    }
    return total;
}

void main() {
    Card[] deck = createDeck();
    
    // Create a hand of 5 cards
    Card[] hand = new Card[5];
    hand[0] = deck[0];   // 2 of Hearts
    hand[1] = deck[13];  // 2 of Diamonds
    hand[2] = deck[25];  // King of Diamonds
    hand[3] = deck[38];  // Queen of Clubs
    hand[4] = deck[51];  // Ace of Spades
    
    System.out.println("Your hand:");
    printDeck(hand);
    
    int highest = findHighestCard(hand);
    System.out.println("\nHighest card: " + hand[highest].rank + " of " + hand[highest].suit);
    
    int handValue = calculateHandValue(hand);
    System.out.println("Hand value: " + handValue);
}
```
</details>

---

### Opgave 48: Social Network Simulation
Lav en klasse `User` med:
- `String username`
- `int followers`
- `int following`
- `int posts`

Lav en konstruktør.

Lav følgende metoder:
- `follow(User follower, User target)` - øg follower's following og target's followers
- `unfollow(User follower, User target)` - reducer begge
- `createPost(User user)` - øg user's posts med 1
- `calculateEngagement(User user)` - returner posts * followers (simuleret engagement score)
- `printTopUsers(User[] users, int count)` - print de `count` users med flest followers

I `main()`:
- Lav 6 users
- Simuler nogle follow/unfollow/post handlinger
- Print top 3 users

<details>
<summary>Se svar</summary>

```java
class User {
    String username;
    int followers;
    int following;
    int posts;
    
    User(String username) {
        this.username = username;
        this.followers = 0;
        this.following = 0;
        this.posts = 0;
    }
}

void follow(User follower, User target) {
    follower.following = follower.following + 1;
    target.followers = target.followers + 1;
}

void unfollow(User follower, User target) {
    if (follower.following > 0) {
        follower.following = follower.following - 1;
    }
    if (target.followers > 0) {
        target.followers = target.followers - 1;
    }
}

void createPost(User user) {
    user.posts = user.posts + 1;
}

int calculateEngagement(User user) {
    return user.posts * user.followers;
}

void printTopUsers(User[] users, int count) {
    System.out.println("=== Top " + count + " Users ===");
    
    boolean[] printed = new boolean[users.length];
    
    for (int rank = 0; rank < count && rank < users.length; rank++) {
        int topIndex = -1;
        int topFollowers = -1;
        
        for (int i = 0; i < users.length; i++) {
            if (!printed[i] && users[i].followers > topFollowers) {
                topFollowers = users[i].followers;
                topIndex = i;
            }
        }
        
        if (topIndex != -1) {
            printed[topIndex] = true;
            System.out.println((rank + 1) + ". " + users[topIndex].username + 
                             " - Followers: " + users[topIndex].followers + 
                             ", Posts: " + users[topIndex].posts +
                             ", Engagement: " + calculateEngagement(users[topIndex]));
        }
    }
}

void main() {
    User[] users = new User[6];
    users[0] = new User("alice");
    users[1] = new User("bob");
    users[2] = new User("charlie");
    users[3] = new User("diana");
    users[4] = new User("eve");
    users[5] = new User("frank");
    
    // Simulate activity
    follow(users[0], users[1]);
    follow(users[0], users[2]);
    follow(users[1], users[2]);
    follow(users[2], users[1]);
    follow(users[3], users[1]);
    follow(users[4], users[1]);
    
    createPost(users[1]);
    createPost(users[1]);
    createPost(users[1]);
    createPost(users[2]);
    createPost(users[2]);
    
    printTopUsers(users, 3);
}
```
</details>
