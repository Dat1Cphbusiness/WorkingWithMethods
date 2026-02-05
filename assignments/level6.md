# Level 6: Instance Methods - Opgaver

## Indhold
- [ ] [Del A: Void Instance Methods](#del-a-void-instance-methods)
- [ ] [Del B: Return Instance Methods](#del-b-return-instance-methods)
- [ ] [Del C: Kombinerede Methods](#del-c-kombinerede-methods)
- [ ] [Del D: User Input til Objekter](#del-d-user-input-til-objekter)
- [ ] [Del E: Avancerede Scenarios](#del-e-avancerede-scenarios)

## Del A: Void Instance Methods

### Opgave 1: Første Instance Method
Lav en klasse `Car` med:
- `String brand`
- `int speed`
- `int fuel`

Lav en konstruktør.

Lav void instance methods:
- `accelerate(int amount)` - øger speed med amount, reducer fuel med (amount / 10)
- `brake(int amount)` - reducer speed (min 0)
- `printStatus()` - print brand, speed og fuel

I `main()`:
- Lav en bil med fuel 100 og speed 0
- Accelerate 50
- Accelerate 30
- Brake 20
- Print status

<details>
<summary>Se svar</summary>

```java
class Car {
    String brand;
    int speed;
    int fuel;
    
    Car(String brand, int speed, int fuel) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }
    
    void accelerate(int amount) {
        speed = speed + amount;
        fuel = fuel - (amount / 10);
    }
    
    void brake(int amount) {
        speed = speed - amount;
        if (speed < 0) {
            speed = 0;
        }
    }
    
    void printStatus() {
        System.out.println(brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + "%");
    }
}

void main() {
    Car ferrari = new Car("Ferrari", 0, 100);
    ferrari.accelerate(50);
    ferrari.accelerate(30);
    ferrari.brake(20);
    ferrari.printStatus();
}
```
</details>

---

### Opgave 2: Athlete Training System
Lav en klasse `Athlete` med:
- `String name`
- `int stamina`
- `int score`

Lav en konstruktør.

Lav void instance methods:
- `train()` - øger stamina med 15 (max 100)
- `compete()` - hvis stamina >= 20: øg score med 10, reducer stamina med 20. Ellers print "{name} is too tired!"
- `rest()` - øger stamina med 30 (max 100)
- `printStatus()` - print navn, stamina og score

I `main()`:
- Lav en atlet med stamina 50 og score 0
- Lad atleten compete to gange
- Lad atleten rest
- Lad atleten compete igen
- Print status

<details>
<summary>Se svar</summary>

```java
class Athlete {
    String name;
    int stamina;
    int score;
    
    Athlete(String name, int stamina, int score) {
        this.name = name;
        this.stamina = stamina;
        this.score = score;
    }
    
    void train() {
        stamina = stamina + 15;
        if (stamina > 100) {
            stamina = 100;
        }
    }
    
    void compete() {
        if (stamina >= 20) {
            score = score + 10;
            stamina = stamina - 20;
        } else {
            System.out.println(name + " is too tired!");
        }
    }
    
    void rest() {
        stamina = stamina + 30;
        if (stamina > 100) {
            stamina = 100;
        }
    }
    
    void printStatus() {
        System.out.println(name);
        System.out.println("Stamina: " + stamina);
        System.out.println("Score: " + score);
    }
}

void main() {
    Athlete runner = new Athlete("Anna", 50, 0);
    runner.compete();
    runner.compete();
    runner.rest();
    runner.compete();
    runner.printStatus();
}
```
</details>

---

### Opgave 3: Dish Calorie Tracker
Lav en klasse `Dish` med:
- `String name`
- `int calories`
- `double price`

Lav en konstruktør.

Lav void instance methods:
- `addIngredient(int cal, double cost)` - øger calories og price
- `applyDiscount(double percentage)` - reducer price (percentage er 0.0-1.0)
- `printInfo()` - print navn, calories og price

I `main()`:
- Lav en ret "Salad" med 200 calories og pris 50
- Add ingredient med 150 calories og 25 kr
- Apply 10% discount
- Print info

<details>
<summary>Se svar</summary>

```java
class Dish {
    String name;
    int calories;
    double price;
    
    Dish(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
    
    void addIngredient(int cal, double cost) {
        calories = calories + cal;
        price = price + cost;
    }
    
    void applyDiscount(double percentage) {
        price = price * (1 - percentage);
    }
    
    void printInfo() {
        System.out.println("Dish: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Price: " + price + " kr");
    }
}

void main() {
    Dish salad = new Dish("Salad", 200, 50);
    salad.addIngredient(150, 25);
    salad.applyDiscount(0.10);
    salad.printInfo();
}
```
</details>

---

### Opgave 4: Method Kalder Method
Lav en klasse `BankAccount` med:
- `String owner`
- `double balance`

Lav en konstruktør.

Lav void instance methods:
- `deposit(double amount)` - øger balance
- `withdraw(double amount)` - hvis balance >= amount: reducer balance. Ellers print "Insufficient funds"
- `transfer(BankAccount target, double amount)` - kalder withdraw() på sig selv, og hvis success kalder deposit() på target
- `printStatement()` - print owner og balance

I `main()`:
- Lav to konti
- Transfer penge mellem dem
- Print begge statements

<details>
<summary>Hint</summary>

transfer() skal først prøve at hæve fra sin egen konto, og kun hvis det lykkes, indsætte på target konto.
</details>

<details>
<summary>Se svar</summary>

```java
class BankAccount {
    String owner;
    double balance;
    
    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        balance = balance + amount;
    }
    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    void transfer(BankAccount target, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            target.deposit(amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed - insufficient funds");
        }
    }
    
    void printStatement() {
        System.out.println(owner + ": " + balance + " kr");
    }
}

void main() {
    BankAccount anna = new BankAccount("Anna", 1000);
    BankAccount mikkel = new BankAccount("Mikkel", 500);
    
    anna.transfer(mikkel, 300);
    
    anna.printStatement();
    mikkel.printStatement();
}
```
</details>

---

## Del B: Return Instance Methods

### Opgave 5: Boolean Return Methods
Lav en klasse `Item` med:
- `String name`
- `double price`
- `int stock`

Lav en konstruktør.

Lav instance methods:
- `boolean isInStock()` - returner true hvis stock > 0
- `boolean isExpensive()` - returner true hvis price > 1000
- `boolean canSell(int quantity)` - returner true hvis stock >= quantity
- `void printInfo()` - print navn, pris, stock og om det er in stock

I `main()`:
- Lav to items (et billigt med stock, et dyrt uden stock)
- Print info for begge
- Check om du kan sælge 5 af det billige item

<details>
<summary>Se svar</summary>

```java
class Item {
    String name;
    double price;
    int stock;
    
    Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    boolean isInStock() {
        return stock > 0;
    }
    
    boolean isExpensive() {
        return price > 1000;
    }
    
    boolean canSell(int quantity) {
        return stock >= quantity;
    }
    
    void printInfo() {
        System.out.println(name + " - " + price + " kr");
        System.out.println("Stock: " + stock);
        System.out.println("In stock: " + isInStock());
    }
}

void main() {
    Item mouse = new Item("Mouse", 299, 10);
    Item laptop = new Item("Laptop", 8999, 0);
    
    mouse.printInfo();
    System.out.println();
    laptop.printInfo();
    System.out.println();
    
    System.out.println("Can sell 5 mice: " + mouse.canSell(5));
}
```
</details>

---

### Opgave 6: Beregning Methods
Lav en klasse `Product` med:
- `String name`
- `double price`
- `int quantity`
- `double discount` (0.0-1.0)

Lav en konstruktør.

Lav instance methods:
- `double getFinalPrice()` - returner price efter discount
- `double getTotalPrice()` - returner finalPrice * quantity
- `double getSavings()` - returner hvor meget du sparer total (original - final) * quantity
- `void printSummary()` - print navn, original pris, final pris, quantity, total og savings

I `main()`:
- Lav et produkt med 20% discount
- Print summary

<details>
<summary>Se svar</summary>

```java
class Product {
    String name;
    double price;
    int quantity;
    double discount;
    
    Product(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    
    double getFinalPrice() {
        return price * (1 - discount);
    }
    
    double getTotalPrice() {
        return getFinalPrice() * quantity;
    }
    
    double getSavings() {
        return (price - getFinalPrice()) * quantity;
    }
    
    void printSummary() {
        System.out.println(name);
        System.out.println("Original: " + price + " kr");
        System.out.println("Final: " + getFinalPrice() + " kr");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + getTotalPrice() + " kr");
        System.out.println("You save: " + getSavings() + " kr");
    }
}

void main() {
    Product laptop = new Product("Laptop", 10000, 2, 0.20);
    laptop.printSummary();
}
```
</details>

---

### Opgave 7: String Return Methods
Lav en klasse `Car` med:
- `String brand`
- `int speed`
- `int fuel`
- `int maxSpeed`

Lav en konstruktør.

Lav instance methods:
- `String getStatus()` - returner "Ready" hvis fuel > 20, ellers "Low fuel"
- `String getSpeedCategory()` - returner "Slow" (speed < 50), "Medium" (50-100), "Fast" (> 100)
- `String getInfo()` - returner "{brand} - {speed}/{maxSpeed} km/h"
- `void printAll()` - print info, status og speed category

I `main()`:
- Lav en bil med speed 75 og fuel 30
- Print all info

<details>
<summary>Se svar</summary>

```java
class Car {
    String brand;
    int speed;
    int fuel;
    int maxSpeed;
    
    Car(String brand, int speed, int fuel, int maxSpeed) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }
    
    String getStatus() {
        if (fuel > 20) {
            return "Ready";
        } else {
            return "Low fuel";
        }
    }
    
    String getSpeedCategory() {
        if (speed < 50) {
            return "Slow";
        } else if (speed <= 100) {
            return "Medium";
        } else {
            return "Fast";
        }
    }
    
    String getInfo() {
        return brand + " - " + speed + "/" + maxSpeed + " km/h";
    }
    
    void printAll() {
        System.out.println(getInfo());
        System.out.println("Status: " + getStatus());
        System.out.println("Category: " + getSpeedCategory());
    }
}

void main() {
    Car tesla = new Car("Tesla", 75, 30, 200);
    tesla.printAll();
}
```
</details>

---

### Opgave 8: Sammenligning Method
Lav en klasse `Athlete` med:
- `String name`
- `int score`
- `int gamesPlayed`

Lav en konstruktør.

Lav instance methods:
- `double getAverage()` - returner score / gamesPlayed (hvis gamesPlayed > 0)
- `boolean isBetterThan(Athlete other)` - returner true hvis this athlete har højere average
- `void addGame(int points)` - øger gamesPlayed og score
- `void printStats()` - print navn, games, score og average

I `main()`:
- Lav to atleter
- Add nogle games til begge
- Find ud af hvem der er bedst
- Print deres stats

<details>
<summary>Se svar</summary>

```java
class Athlete {
    String name;
    int score;
    int gamesPlayed;
    
    Athlete(String name, int score, int gamesPlayed) {
        this.name = name;
        this.score = score;
        this.gamesPlayed = gamesPlayed;
    }
    
    double getAverage() {
        if (gamesPlayed == 0) {
            return 0;
        }
        return (double) score / gamesPlayed;
    }
    
    boolean isBetterThan(Athlete other) {
        return getAverage() > other.getAverage();
    }
    
    void addGame(int points) {
        gamesPlayed = gamesPlayed + 1;
        score = score + points;
    }
    
    void printStats() {
        System.out.println(name);
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Score: " + score);
        System.out.println("Average: " + getAverage());
    }
}

void main() {
    Athlete anna = new Athlete("Anna", 0, 0);
    Athlete mikkel = new Athlete("Mikkel", 0, 0);
    
    anna.addGame(25);
    anna.addGame(30);
    anna.addGame(28);
    
    mikkel.addGame(35);
    mikkel.addGame(20);
    
    anna.printStats();
    System.out.println();
    mikkel.printStats();
    System.out.println();
    
    if (anna.isBetterThan(mikkel)) {
        System.out.println(anna.name + " is better!");
    } else {
        System.out.println(mikkel.name + " is better!");
    }
}
```
</details>

---

## Del C: Kombinerede Methods

### Opgave 9: Game Character System
Lav en klasse `Character` med:
- `String name`
- `int health`
- `int maxHealth`
- `int attackPower`

Lav en konstruktør (health starter som maxHealth).

Lav instance methods:
- `void takeDamage(int damage)` - reducer health (min 0)
- `void heal(int amount)` - øger health (max maxHealth)
- `boolean isAlive()` - returner true hvis health > 0
- `double getHealthPercentage()` - returner (health / maxHealth) * 100
- `void attack(Character target)` - target tager damage lig med attackPower, print "{name} attacks {target.name}!"
- `void printStatus()` - print navn, health, max health og health percentage

I `main()`:
- Lav to characters
- Lad dem angribe hinanden nogle gange
- Heal en af dem
- Print begge deres status

<details>
<summary>Se svar</summary>

```java
class Character {
    String name;
    int health;
    int maxHealth;
    int attackPower;
    
    Character(String name, int maxHealth, int attackPower) {
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.attackPower = attackPower;
    }
    
    void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
    }
    
    void heal(int amount) {
        health = health + amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }
    
    boolean isAlive() {
        return health > 0;
    }
    
    double getHealthPercentage() {
        return ((double) health / maxHealth) * 100;
    }
    
    void attack(Character target) {
        System.out.println(name + " attacks " + target.name + "!");
        target.takeDamage(attackPower);
    }
    
    void printStatus() {
        System.out.println(name);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("HP: " + getHealthPercentage() + "%");
        System.out.println("Alive: " + isAlive());
    }
}

void main() {
    Character warrior = new Character("Warrior", 100, 25);
    Character mage = new Character("Mage", 80, 30);
    
    warrior.attack(mage);
    mage.attack(warrior);
    warrior.attack(mage);
    
    mage.heal(20);
    
    warrior.printStatus();
    System.out.println();
    mage.printStatus();
}
```
</details>

---

### Opgave 10: Shopping Cart
Lav en klasse `ShoppingCart` med:
- `String customer`
- `double total`
- `int itemCount`

Lav en konstruktør (total og itemCount starter på 0).

Lav instance methods:
- `void addItem(double price)` - øger total og itemCount
- `void removeItem(double price)` - reducer total og itemCount (kun hvis itemCount > 0)
- `double getAverage()` - returner total / itemCount (hvis itemCount > 0)
- `void applyDiscount(double percentage)` - reducer total med percentage
- `double calculateTax(double taxRate)` - returner total * taxRate
- `double getFinalTotal(double taxRate)` - returner total + tax
- `void printReceipt(double taxRate)` - print customer, items, subtotal, tax og final total

I `main()`:
- Lav en cart
- Add 4 items med forskellige priser
- Remove et item
- Apply 10% discount
- Print receipt med 25% tax

<details>
<summary>Se svar</summary>

```java
class ShoppingCart {
    String customer;
    double total;
    int itemCount;
    
    ShoppingCart(String customer) {
        this.customer = customer;
        this.total = 0;
        this.itemCount = 0;
    }
    
    void addItem(double price) {
        total = total + price;
        itemCount = itemCount + 1;
    }
    
    void removeItem(double price) {
        if (itemCount > 0) {
            total = total - price;
            itemCount = itemCount - 1;
        }
    }
    
    double getAverage() {
        if (itemCount == 0) {
            return 0;
        }
        return total / itemCount;
    }
    
    void applyDiscount(double percentage) {
        total = total * (1 - percentage);
    }
    
    double calculateTax(double taxRate) {
        return total * taxRate;
    }
    
    double getFinalTotal(double taxRate) {
        return total + calculateTax(taxRate);
    }
    
    void printReceipt(double taxRate) {
        System.out.println("=== Receipt ===");
        System.out.println("Customer: " + customer);
        System.out.println("Items: " + itemCount);
        System.out.println("Subtotal: " + total + " kr");
        System.out.println("Tax: " + calculateTax(taxRate) + " kr");
        System.out.println("Total: " + getFinalTotal(taxRate) + " kr");
    }
}

void main() {
    ShoppingCart cart = new ShoppingCart("Anna");
    cart.addItem(99.50);
    cart.addItem(149.00);
    cart.addItem(75.25);
    cart.addItem(120.00);
    cart.removeItem(75.25);
    cart.applyDiscount(0.10);
    cart.printReceipt(0.25);
}
```
</details>

---

### Opgave 11: Recipe System
Lav en klasse `Recipe` med:
- `String name`
- `int servings`
- `int prepTime` (minutter)
- `double costPerServing`

Lav en konstruktør.

Lav instance methods:
- `double getTotalCost()` - returner costPerServing * servings
- `void scale(double factor)` - multiplicer servings med factor (brug (int) casting)
- `double getCostPerMinute()` - returner totalCost / prepTime
- `boolean isCheaperThan(Recipe other)` - sammenlign costPerServing
- `boolean isFasterThan(Recipe other)` - sammenlign prepTime
- `void printInfo()` - print navn, servings, prep time, cost per serving og total cost

I `main()`:
- Lav to opskrifter
- Scale den ene til dobbelt størrelse
- Find ud af hvilken der er billigst og hurtigst
- Print info for begge

<details>
<summary>Se svar</summary>

```java
class Recipe {
    String name;
    int servings;
    int prepTime;
    double costPerServing;
    
    Recipe(String name, int servings, int prepTime, double costPerServing) {
        this.name = name;
        this.servings = servings;
        this.prepTime = prepTime;
        this.costPerServing = costPerServing;
    }
    
    double getTotalCost() {
        return costPerServing * servings;
    }
    
    void scale(double factor) {
        servings = (int)(servings * factor);
    }
    
    double getCostPerMinute() {
        return getTotalCost() / prepTime;
    }
    
    boolean isCheaperThan(Recipe other) {
        return costPerServing < other.costPerServing;
    }
    
    boolean isFasterThan(Recipe other) {
        return prepTime < other.prepTime;
    }
    
    void printInfo() {
        System.out.println(name);
        System.out.println("Servings: " + servings);
        System.out.println("Prep time: " + prepTime + " min");
        System.out.println("Cost/serving: " + costPerServing + " kr");
        System.out.println("Total cost: " + getTotalCost() + " kr");
    }
}

void main() {
    Recipe pasta = new Recipe("Pasta", 4, 30, 25.5);
    Recipe salad = new Recipe("Salad", 2, 15, 18.0);
    
    pasta.scale(2.0);
    
    pasta.printInfo();
    System.out.println();
    salad.printInfo();
    System.out.println();
    
    if (salad.isCheaperThan(pasta)) {
        System.out.println(salad.name + " is cheaper");
    }
    
    if (salad.isFasterThan(pasta)) {
        System.out.println(salad.name + " is faster");
    }
}
```
</details>

---

### Opgave 12: Statistics Calculator
Lav en klasse `Stats` med:
- `int count`
- `double sum`
- `double min`
- `double max`

Lav en konstruktør (count = 0, sum = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE).

Lav instance methods:
- `void addValue(double value)` - øger count og sum, opdater min/max
- `double getAverage()` - returner sum / count (hvis count > 0)
- `double getRange()` - returner max - min
- `void reset()` - reset alle værdier til start
- `void printStats()` - print count, sum, average, min, max, range

I `main()`:
- Lav en Stats
- Add values: 5.5, 10.2, 3.8, 8.1, 6.9, 12.3
- Print stats
- Reset
- Add nye values og print igen

<details>
<summary>Se svar</summary>

```java
class Stats {
    int count;
    double sum;
    double min;
    double max;
    
    Stats() {
        this.count = 0;
        this.sum = 0;
        this.min = Double.MAX_VALUE;
        this.max = Double.MIN_VALUE;
    }
    
    void addValue(double value) {
        count = count + 1;
        sum = sum + value;
        if (value < min) {
            min = value;
        }
        if (value > max) {
            max = value;
        }
    }
    
    double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
    
    double getRange() {
        return max - min;
    }
    
    void reset() {
        count = 0;
        sum = 0;
        min = Double.MAX_VALUE;
        max = Double.MIN_VALUE;
    }
    
    void printStats() {
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + getAverage());
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Range: " + getRange());
    }
}

void main() {
    Stats stats = new Stats();
    stats.addValue(5.5);
    stats.addValue(10.2);
    stats.addValue(3.8);
    stats.addValue(8.1);
    stats.addValue(6.9);
    stats.addValue(12.3);
    
    System.out.println("=== First Dataset ===");
    stats.printStats();
    
    stats.reset();
    
    stats.addValue(15.0);
    stats.addValue(20.5);
    stats.addValue(18.2);
    
    System.out.println("\n=== Second Dataset ===");
    stats.printStats();
}
```
</details>

---

## Del D: User Input til Objekter

### Opgave 13: Lav Car fra Input
Lav en klasse `Car` med:
- `String brand`
- `int maxSpeed`
- `int fuel`

Lav en konstruktør.

Lav instance methods:
- `void accelerate(int amount)` - øger speed (der skal være en speed instance variable)
- `void printInfo()` - print brand, maxSpeed og fuel

I `main()`:
- Brug Scanner til at få brand, maxSpeed og fuel fra brugeren
- Lav en Car
- Lad brugeren accelerate bilen (få amount fra input)
- Print info

<details>
<summary>Se svar</summary>

```java
import java.util.Scanner;

class Car {
    String brand;
    int speed;
    int maxSpeed;
    int fuel;
    
    Car(String brand, int maxSpeed, int fuel) {
        this.brand = brand;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }
    
    void accelerate(int amount) {
        speed = speed + amount;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }
    
    void printInfo() {
        System.out.println(brand);
        System.out.println("Speed: " + speed + "/" + maxSpeed + " km/h");
        System.out.println("Fuel: " + fuel + "%");
    }
}

void main() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter car brand: ");
    String brand = scanner.nextLine();
    
    System.out.print("Enter max speed: ");
    int maxSpeed = scanner.nextInt();
    
    System.out.print("Enter fuel level: ");
    int fuel = scanner.nextInt();
    
    Car car = new Car(brand, maxSpeed, fuel);
    
    System.out.print("Accelerate by how much? ");
    int amount = scanner.nextInt();
    car.accelerate(amount);
    
    car.printInfo();
}
```
</details>

---

### Opgave 14: Menu System med Athlete
Lav en klasse `Athlete` med:
- `String name`
- `int stamina`
- `int score`

Lav konstruktør og methods: `train()`, `compete()`, `rest()`, `printStatus()`.

I `main()`:
- Få athlete name og starting stamina fra brugeren
- Lav en Athlete
- Lav en menu loop:
  - 1. Train
  - 2. Compete
  - 3. Rest
  - 4. Status
  - 5. Quit
- Udfør action baseret på brugerens valg

<details>
<summary>Se svar</summary>

```java
import java.util.Scanner;

class Athlete {
    String name;
    int stamina;
    int score;
    
    Athlete(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
        this.score = 0;
    }
    
    void train() {
        stamina = stamina + 15;
        if (stamina > 100) {
            stamina = 100;
        }
        System.out.println(name + " trained!");
    }
    
    void compete() {
        if (stamina >= 20) {
            score = score + 10;
            stamina = stamina - 20;
            System.out.println(name + " competed!");
        } else {
            System.out.println(name + " is too tired!");
        }
    }
    
    void rest() {
        stamina = stamina + 30;
        if (stamina > 100) {
            stamina = 100;
        }
        System.out.println(name + " rested!");
    }
    
    void printStatus() {
        System.out.println("\n=== " + name + " ===");
        System.out.println("Stamina: " + stamina);
        System.out.println("Score: " + score);
    }
}

void main() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter athlete name: ");
    String name = scanner.nextLine();
    
    System.out.print("Enter starting stamina: ");
    int stamina = scanner.nextInt();
    
    Athlete athlete = new Athlete(name, stamina);
    
    boolean running = true;
    while (running) {
        System.out.println("\n1. Train");
        System.out.println("2. Compete");
        System.out.println("3. Rest");
        System.out.println("4. Status");
        System.out.println("5. Quit");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            athlete.train();
        } else if (choice == 2) {
            athlete.compete();
        } else if (choice == 3) {
            athlete.rest();
        } else if (choice == 4) {
            athlete.printStatus();
        } else if (choice == 5) {
            running = false;
        }
    }
    
    System.out.println("\nFinal status:");
    athlete.printStatus();
}
```
</details>

---

### Opgave 15: Restaurant Menu Creator
Lav en klasse `Dish` med:
- `String name`
- `int calories`
- `double price`

Lav konstruktør og methods: `printInfo()`, `isHealthy()` (calories < 500), `isExpensive()` (price > 100).

I `main()`:
- Få antal retter fra brugeren
- Lav et array og få input for hver ret (navn, calories, price)
- Print alle retter
- Print kun de healthy retter
- Print gennemsnitspris

<details>
<summary>Se svar</summary>

```java
import java.util.Scanner;

class Dish {
    String name;
    int calories;
    double price;
    
    Dish(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
    
    void printInfo() {
        System.out.println(name + " - " + calories + " cal - " + price + " kr");
    }
    
    boolean isHealthy() {
        return calories < 500;
    }
    
    boolean isExpensive() {
        return price > 100;
    }
}

void main() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("How many dishes? ");
    int count = scanner.nextInt();
    scanner.nextLine();
    
    Dish[] menu = new Dish[count];
    
    for (int i = 0; i < menu.length; i++) {
        System.out.println("\nDish " + (i + 1) + ":");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Calories: ");
        int calories = scanner.nextInt();
        
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        
        menu[i] = new Dish(name, calories, price);
    }
    
    System.out.println("\n=== Full Menu ===");
    for (int i = 0; i < menu.length; i++) {
        menu[i].printInfo();
    }
    
    System.out.println("\n=== Healthy Options ===");
    for (int i = 0; i < menu.length; i++) {
        if (menu[i].isHealthy()) {
            menu[i].printInfo();
        }
    }
    
    double total = 0;
    for (int i = 0; i < menu.length; i++) {
        total = total + menu[i].price;
    }
    System.out.println("\nAverage price: " + (total / menu.length) + " kr");
}
```
</details>

---

### Opgave 16: Shopping System
Lav en klasse `Item` med:
- `String name`
- `double price`
- `int stock`

Lav konstruktør og methods: `sell(int qty)`, `restock(int qty)`, `getTotalValue()`, `printInfo()`.

I `main()`:
- Lav et inventory array med 3 items (hardcoded)
- Menu loop:
  - 1. View inventory
  - 2. Sell item
  - 3. Restock item
  - 4. Total value
  - 5. Quit
- For sell/restock: få item index og quantity fra brugeren

<details>
<summary>Se svar</summary>

```java
import java.util.Scanner;

class Item {
    String name;
    double price;
    int stock;
    
    Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    void sell(int qty) {
        if (stock >= qty) {
            stock = stock - qty;
            System.out.println("Sold " + qty + " " + name);
        } else {
            System.out.println("Not enough stock!");
        }
    }
    
    void restock(int qty) {
        stock = stock + qty;
        System.out.println("Restocked " + qty + " " + name);
    }
    
    double getTotalValue() {
        return price * stock;
    }
    
    void printInfo() {
        System.out.println(name + " - " + price + " kr - Stock: " + stock);
    }
}

void main() {
    Scanner scanner = new Scanner(System.in);
    
    Item[] inventory = new Item[3];
    inventory[0] = new Item("Laptop", 8999, 10);
    inventory[1] = new Item("Mouse", 299, 25);
    inventory[2] = new Item("Keyboard", 599, 15);
    
    boolean running = true;
    while (running) {
        System.out.println("\n1. View inventory");
        System.out.println("2. Sell item");
        System.out.println("3. Restock item");
        System.out.println("4. Total value");
        System.out.println("5. Quit");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            for (int i = 0; i < inventory.length; i++) {
                System.out.print(i + ": ");
                inventory[i].printInfo();
            }
        } else if (choice == 2) {
            System.out.print("Item index: ");
            int index = scanner.nextInt();
            System.out.print("Quantity: ");
            int qty = scanner.nextInt();
            inventory[index].sell(qty);
        } else if (choice == 3) {
            System.out.print("Item index: ");
            int index = scanner.nextInt();
            System.out.print("Quantity: ");
            int qty = scanner.nextInt();
            inventory[index].restock(qty);
        } else if (choice == 4) {
            double total = 0;
            for (int i = 0; i < inventory.length; i++) {
                total = total + inventory[i].getTotalValue();
            }
            System.out.println("Total inventory value: " + total + " kr");
        } else if (choice == 5) {
            running = false;
        }
    }
}
```
</details>

---

## Del E: Avancerede Scenarios

### Opgave 17: Team Battle System
Lav en klasse `Athlete` med alle relevante methods fra tidligere.

Lav en ny method:
- `void battle(Athlete opponent)` - begge atleter mister 15 stamina. Den med højest stamina efter battle vinder 20 points

I `main()`:
- Lav et team array med 4 atleter
- Simuler 3 runder hvor:
  - Hver atlet battles en random opponent fra teamet
  - Efter hver runde, print alle atleters status
- Print vinderen (højeste score)

<details>
<summary>Hint</summary>

Brug `(int)(Math.random() * team.length)` for random opponent index.
</details>

<details>
<summary>Se svar</summary>

```java
class Athlete {
    String name;
    int stamina;
    int score;
    
    Athlete(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
        this.score = 0;
    }
    
    void battle(Athlete opponent) {
        stamina = stamina - 15;
        opponent.stamina = opponent.stamina - 15;
        
        if (stamina < 0) {
            stamina = 0;
        }
        if (opponent.stamina < 0) {
            opponent.stamina = 0;
        }
        
        System.out.println(name + " battles " + opponent.name + "!");
        
        if (stamina > opponent.stamina) {
            score = score + 20;
            System.out.println(name + " wins!");
        } else {
            opponent.score = opponent.score + 20;
            System.out.println(opponent.name + " wins!");
        }
    }
    
    void rest() {
        stamina = stamina + 30;
        if (stamina > 100) {
            stamina = 100;
        }
    }
    
    void printStatus() {
        System.out.println(name + " - Stamina: " + stamina + ", Score: " + score);
    }
}

void main() {
    Athlete[] team = new Athlete[4];
    team[0] = new Athlete("Anna", 100);
    team[1] = new Athlete("Mikkel", 100);
    team[2] = new Athlete("Sofie", 100);
    team[3] = new Athlete("Lars", 100);
    
    for (int round = 1; round <= 3; round++) {
        System.out.println("\n=== Round " + round + " ===");
        
        for (int i = 0; i < team.length; i++) {
            int opponentIndex = (int)(Math.random() * team.length);
            while (opponentIndex == i) {
                opponentIndex = (int)(Math.random() * team.length);
            }
            team[i].battle(team[opponentIndex]);
        }
        
        System.out.println("\n--- Status after round " + round + " ---");
        for (int i = 0; i < team.length; i++) {
            team[i].printStatus();
        }
        
        for (int i = 0; i < team.length; i++) {
            team[i].rest();
        }
    }
    
    int winnerIndex = 0;
    for (int i = 1; i < team.length; i++) {
        if (team[i].score > team[winnerIndex].score) {
            winnerIndex = i;
        }
    }
    
    System.out.println("\n=== WINNER ===");
    team[winnerIndex].printStatus();
}
```
</details>

---

### Opgave 18: Car Race Simulation
Lav en klasse `Car` med:
- `String brand`
- `int position`
- `int speed`
- `int fuel`

Lav konstruktør (position starter på 0).

Lav methods:
- `void accelerate()` - øger speed med random (10-30), reducer fuel med (speed / 20)
- `void move()` - øger position med speed
- `boolean canContinue()` - returner true hvis fuel > 0
- `void printStatus()` - print brand, position, speed, fuel

I `main()`:
- Lav 4 biler
- Simuler et race (10 laps):
  - Hver bil accelerate og move (hvis canContinue)
  - Efter hver lap, print alle bilers position
- Print vinderen (højeste position)

<details>
<summary>Se svar</summary>

```java
class Car {
    String brand;
    int position;
    int speed;
    int fuel;
    
    Car(String brand, int fuel) {
        this.brand = brand;
        this.position = 0;
        this.speed = 0;
        this.fuel = fuel;
    }
    
    void accelerate() {
        int boost = (int)(Math.random() * 21) + 10;
        speed = speed + boost;
        fuel = fuel - (speed / 20);
        if (fuel < 0) {
            fuel = 0;
        }
    }
    
    void move() {
        position = position + speed;
    }
    
    boolean canContinue() {
        return fuel > 0;
    }
    
    void printStatus() {
        System.out.println(brand + " - Pos: " + position + ", Speed: " + speed + ", Fuel: " + fuel);
    }
}

void main() {
    Car[] cars = new Car[4];
    cars[0] = new Car("Ferrari", 100);
    cars[1] = new Car("Porsche", 100);
    cars[2] = new Car("Lamborghini", 100);
    cars[3] = new Car("McLaren", 100);
    
    for (int lap = 1; lap <= 10; lap++) {
        System.out.println("\n=== Lap " + lap + " ===");
        
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].canContinue()) {
                cars[i].accelerate();
                cars[i].move();
            }
        }
        
        for (int i = 0; i < cars.length; i++) {
            cars[i].printStatus();
        }
    }
    
    int winnerIndex = 0;
    for (int i = 1; i < cars.length; i++) {
        if (cars[i].position > cars[winnerIndex].position) {
            winnerIndex = i;
        }
    }
    
    System.out.println("\n=== WINNER ===");
    cars[winnerIndex].printStatus();
}
```
</details>

---

### Opgave 19: Restaurant Order Management
Lav en klasse `Order` med:
- `int orderNumber`
- `String customerName`
- `double totalPrice`
- `boolean paid`
- `boolean ready`

Lav konstruktør (paid og ready starter som false, totalPrice = 0).

Lav methods:
- `void addItem(double price)` - øger totalPrice
- `void pay()` - sætter paid til true
- `void markReady()` - sætter ready til true (kun hvis paid er true)
- `String getStatus()` - returner "Ready for pickup", "Waiting for payment", eller "Being prepared"
- `void printReceipt()` - print orderNumber, customerName, totalPrice, status

I `main()`:
- Lav 5 orders (hardcoded)
- Add items til hver order (random priser 50-150)
- Pay random orders
- Mark nogle ready
- Print alle orders
- Print total revenue (sum af paid orders)
- Print antal ready orders

<details>
<summary>Se svar</summary>

```java
class Order {
    int orderNumber;
    String customerName;
    double totalPrice;
    boolean paid;
    boolean ready;
    
    Order(int orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.totalPrice = 0;
        this.paid = false;
        this.ready = false;
    }
    
    void addItem(double price) {
        totalPrice = totalPrice + price;
    }
    
    void pay() {
        paid = true;
    }
    
    void markReady() {
        if (paid) {
            ready = true;
        }
    }
    
    String getStatus() {
        if (ready) {
            return "Ready for pickup";
        } else if (!paid) {
            return "Waiting for payment";
        } else {
            return "Being prepared";
        }
    }
    
    void printReceipt() {
        System.out.println("Order #" + orderNumber + " - " + customerName);
        System.out.println("Total: " + totalPrice + " kr");
        System.out.println("Status: " + getStatus());
    }
}

void main() {
    Order[] orders = new Order[5];
    orders[0] = new Order(101, "Anna");
    orders[1] = new Order(102, "Mikkel");
    orders[2] = new Order(103, "Sofie");
    orders[3] = new Order(104, "Lars");
    orders[4] = new Order(105, "Emma");
    
    for (int i = 0; i < orders.length; i++) {
        int itemCount = (int)(Math.random() * 3) + 1;
        for (int j = 0; j < itemCount; j++) {
            double price = (Math.random() * 100) + 50;
            orders[i].addItem(price);
        }
    }
    
    orders[0].pay();
    orders[0].markReady();
    orders[2].pay();
    orders[3].pay();
    orders[3].markReady();
    
    System.out.println("=== All Orders ===");
    for (int i = 0; i < orders.length; i++) {
        orders[i].printReceipt();
        System.out.println();
    }
    
    double totalRevenue = 0;
    int readyCount = 0;
    
    for (int i = 0; i < orders.length; i++) {
        if (orders[i].paid) {
            totalRevenue = totalRevenue + orders[i].totalPrice;
        }
        if (orders[i].ready) {
            readyCount = readyCount + 1;
        }
    }
    
    System.out.println("Total revenue: " + totalRevenue + " kr");
    System.out.println("Ready orders: " + readyCount);
}
```
</details>

---

### Opgave 20: Subscription Manager System
Lav en klasse `Subscription` med:
- `String service`
- `double monthlyPrice`
- `int monthsActive`
- `boolean autoRenew`

Lav konstruktør (monthsActive = 0, autoRenew = true).

Lav methods:
- `void renew()` - øger monthsActive med 1 (kun hvis autoRenew er true)
- `void cancel()` - sætter autoRenew til false
- `void reactivate()` - sætter autoRenew til true
- `double getTotalPaid()` - returner monthlyPrice * monthsActive
- `double getYearlyCost()` - returner monthlyPrice * 12
- `boolean isCheaperThan(Subscription other)` - sammenlign monthlyPrice
- `void printInfo()` - print service, monthlyPrice, monthsActive, totalPaid, autoRenew

I `main()`:
- Lav 5 subscriptions med forskellige priser
- Simuler 12 måneder:
  - Efter måned 3: cancel 2 random subscriptions
  - Efter måned 6: reactivate 1 af dem
  - Renew alle hver måned
- Print alle subscriptions
- Find billigste subscription
- Beregn total månedlig udgift (kun active subscriptions)
- Print total betalt over året

<details>
<summary>Se svar</summary>

```java
class Subscription {
    String service;
    double monthlyPrice;
    int monthsActive;
    boolean autoRenew;
    
    Subscription(String service, double monthlyPrice) {
        this.service = service;
        this.monthlyPrice = monthlyPrice;
        this.monthsActive = 0;
        this.autoRenew = true;
    }
    
    void renew() {
        if (autoRenew) {
            monthsActive = monthsActive + 1;
        }
    }
    
    void cancel() {
        autoRenew = false;
    }
    
    void reactivate() {
        autoRenew = true;
    }
    
    double getTotalPaid() {
        return monthlyPrice * monthsActive;
    }
    
    double getYearlyCost() {
        return monthlyPrice * 12;
    }
    
    boolean isCheaperThan(Subscription other) {
        return monthlyPrice < other.monthlyPrice;
    }
    
    void printInfo() {
        System.out.println(service);
        System.out.println("Monthly: " + monthlyPrice + " kr");
        System.out.println("Months active: " + monthsActive);
        System.out.println("Total paid: " + getTotalPaid() + " kr");
        System.out.println("Auto-renew: " + autoRenew);
    }
}

void main() {
    Subscription[] subs = new Subscription[5];
    subs[0] = new Subscription("Netflix", 99);
    subs[1] = new Subscription("Spotify", 79);
    subs[2] = new Subscription("YouTube Premium", 119);
    subs[3] = new Subscription("Disney+", 89);
    subs[4] = new Subscription("HBO Max", 109);
    
    for (int month = 1; month <= 12; month++) {
        if (month == 3) {
            subs[1].cancel();
            subs[3].cancel();
        }
        
        if (month == 6) {
            subs[1].reactivate();
        }
        
        for (int i = 0; i < subs.length; i++) {
            subs[i].renew();
        }
    }
    
    System.out.println("=== Subscription Overview ===");
    for (int i = 0; i < subs.length; i++) {
        subs[i].printInfo();
        System.out.println();
    }
    
    int cheapestIndex = 0;
    for (int i = 1; i < subs.length; i++) {
        if (subs[i].isCheaperThan(subs[cheapestIndex])) {
            cheapestIndex = i;
        }
    }
    System.out.println("Cheapest subscription: " + subs[cheapestIndex].service);
    
    double totalMonthly = 0;
    for (int i = 0; i < subs.length; i++) {
        if (subs[i].autoRenew) {
            totalMonthly = totalMonthly + subs[i].monthlyPrice;
        }
    }
    System.out.println("Current monthly cost: " + totalMonthly + " kr");
    
    double totalPaidYear = 0;
    for (int i = 0; i < subs.length; i++) {
        totalPaidYear = totalPaidYear + subs[i].getTotalPaid();
    }
    System.out.println("Total paid this year: " + totalPaidYear + " kr");
}
```
</details>
