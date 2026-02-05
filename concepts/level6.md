# Level 6: Instance Methods

## Begrebsgennemgang

### Hvad Du Allerede Kan

I Level 5 lærte du at lave klasser med instance variables og constructors:

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
}

void printCar(Car c) {
    System.out.println(c.brand + " - Speed: " + c.speed);
}

void main() {
    Car tesla = new Car("Tesla", 0, 100);
    printCar(tesla);
}
```

Men `printCar()` metoden er **udenfor** klassen. Hvad nu hvis bilen kunne printe sig selv?

---

## Problemet: Metoder Udenfor Klassen

Når metoder er udenfor klassen, skal du sende objektet som parameter:

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
}

void accelerate(Car c, int amount) {
    c.speed = c.speed + amount;
}

void brake(Car c, int amount) {
    c.speed = c.speed - amount;
}

void refuel(Car c, int amount) {
    c.fuel = c.fuel + amount;
}

void main() {
    Car tesla = new Car("Tesla", 0, 100);
    accelerate(tesla, 50);
    brake(tesla, 20);
    refuel(tesla, 30);
}
```

**Dette virker, men:**
- Mange separate metoder
- Skal altid huske at sende bilen som parameter
- Metoderne er ikke en del af bil-konceptet

---

## Løsningen: Instance Methods

**Instance methods** er metoder der ligger **inde i klassen**:

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
    
    // Instance methods - inde i klassen!
    void accelerate(int amount) {
        speed = speed + amount;
    }
    
    void brake(int amount) {
        speed = speed - amount;
    }
    
    void refuel(int amount) {
        fuel = fuel + amount;
    }
}

void main() {
    Car tesla = new Car("Tesla", 0, 100);
    tesla.accelerate(50);  // Kalder metode PÅ objektet
    tesla.brake(20);
    tesla.refuel(30);
}
```

**Fordele:**
- Metoder er en del af objektet
- Objektet kan ændre sin egen state
- Mere naturlig kode: `tesla.accelerate(50)`

---

## Hvad er en Instance Method?

En **instance method** er en metode der:
- Ligger inde i klassen
- Tilhører det specifikke objekt
- Kan tilgå objektets instance variables direkte
- Kaldes med dot-notation: `objekt.metode()`

**Analogi:**
- En bil (objekt) kan accelerere, bremse, tanke (methods)
- En person (objekt) kan spise, sove, løbe (methods)
- En konto (objekt) kan indsætte, hæve, vise saldo (methods)

---

## Din Første Instance Method

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
        stamina = stamina + 10;
        System.out.println(name + " trained! Stamina: " + stamina);
    }
}

void main() {
    Athlete runner = new Athlete("Anna", 50, 0);
    runner.train();  // Anna trained! Stamina: 60
    runner.train();  // Anna trained! Stamina: 70
}
```

**Bemærk:**
- `train()` er inde i `Athlete` klassen
- Ingen parameter for objektet - metoden tilhører objektet
- Kan tilgå `stamina` og `name` direkte
- Kaldes med `runner.train()`

---

## Tilgå Instance Variables

Instance methods kan tilgå alle instance variables direkte:

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
    
    void printInfo() {
        System.out.println("Dish: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Price: " + price + " kr");
    }
}

void main() {
    Dish pasta = new Dish("Pasta Carbonara", 650, 89.0);
    pasta.printInfo();
}
```

**Output:**
```
Dish: Pasta Carbonara
Calories: 650
Price: 89.0 kr
```

---

## Instance Methods med Parametre

Instance methods kan tage parametre ligesom andre metoder:

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
        fuel = fuel - (amount / 10);  // Bruger brændstof
    }
    
    void drive(int distance) {
        System.out.println(brand + " drives " + distance + " km");
        fuel = fuel - (distance / 5);
    }
}

void main() {
    Car toyota = new Car("Toyota", 0, 100);
    toyota.accelerate(50);
    toyota.drive(100);
    System.out.println("Fuel left: " + toyota.fuel);
}
```

---

## Instance Methods med Conditions

Instance methods kan bruge if-else:

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
    
    void compete() {
        if (stamina >= 20) {
            score = score + 10;
            stamina = stamina - 20;
            System.out.println(name + " competed and gained points!");
        } else {
            System.out.println(name + " is too tired to compete!");
        }
    }
}

void main() {
    Athlete runner = new Athlete("Mikkel", 50, 0);
    runner.compete();  // Virker
    runner.compete();  // Virker
    runner.compete();  // Too tired!
}
```

---

## Return Values fra Instance Methods

Instance methods kan returnere værdier:

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
    
    double getTotalValue() {
        return price * stock;
    }
    
    String getInfo() {
        return name + " - " + price + " kr (" + stock + " in stock)";
    }
}

void main() {
    Item laptop = new Item("Laptop", 8999.0, 5);
    
    System.out.println(laptop.getInfo());
    System.out.println("In stock: " + laptop.isInStock());
    System.out.println("Total value: " + laptop.getTotalValue());
}
```

**Output:**
```
Laptop - 8999.0 kr (5 in stock)
In stock: true
Total value: 44995.0
```

---

## `this` Keyword i Instance Methods

Du kan bruge `this` til at være eksplicit om at du refererer til objektets variable:

```java
class Dish {
    String name;
    int calories;
    
    Dish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
    
    void addIngredient(int calories) {
        this.calories = this.calories + calories;
    }
    
    boolean isHealthy() {
        return this.calories < 500;
    }
}
```

**Hvornår skal du bruge `this`?**
- **Konstruktør:** Altid (når parameter har samme navn)
- **Instance methods:** Valgfrit, men gør koden mere klar
- **Når der er konflikt:** Nødvendigt hvis lokal variabel har samme navn

**De fleste programmører dropper `this` i instance methods når der ikke er konflikt:**

```java
void addIngredient(int cal) {
    calories = calories + cal;  // OK - ingen konflikt
}
```

---

## Multiple Instance Methods

En klasse kan have mange instance methods:

```java
class Car {
    String brand;
    int speed;
    int fuel;
    int maxSpeed;
    
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
        fuel = fuel - (amount / 10);
    }
    
    void brake(int amount) {
        speed = speed - amount;
        if (speed < 0) {
            speed = 0;
        }
    }
    
    void refuel(int amount) {
        fuel = fuel + amount;
        if (fuel > 100) {
            fuel = 100;
        }
    }
    
    void printStatus() {
        System.out.println(brand);
        System.out.println("Speed: " + speed + "/" + maxSpeed);
        System.out.println("Fuel: " + fuel);
    }
    
    boolean canDrive() {
        return fuel > 0;
    }
}

void main() {
    Car ferrari = new Car("Ferrari", 300, 80);
    ferrari.accelerate(100);
    ferrari.accelerate(50);
    ferrari.printStatus();
}
```

---

## Instance Methods Kalder Andre Instance Methods

En instance method kan kalde andre instance methods i samme objekt:

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
    
    void rest() {
        stamina = stamina + 30;
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
    
    void fullTraining() {
        rest();      // Kalder anden instance method
        compete();   // Kalder anden instance method
        compete();
        rest();
    }
}

void main() {
    Athlete runner = new Athlete("Anna", 50, 0);
    runner.fullTraining();
    System.out.println("Score: " + runner.score);
}
```

---

## User Input til at Lave Objekter

Du kan bruge `Scanner` til at få input fra brugeren og lave objekter:

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
}

void main() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter dish name: ");
    String name = scanner.nextLine();
    
    System.out.print("Enter calories: ");
    int calories = scanner.nextInt();
    
    System.out.print("Enter price: ");
    double price = scanner.nextDouble();
    
    Dish dish = new Dish(name, calories, price);
    dish.printInfo();
}
```

**Eksempel kørsel:**
```
Enter dish name: Pizza
Enter calories: 800
Enter price: 75.5
Pizza - 800 cal - 75.5 kr
```

---

## Lav Flere Objekter fra User Input

```java
import java.util.Scanner;

class Car {
    String brand;
    int maxSpeed;
    
    Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    
    void printInfo() {
        System.out.println(brand + " (max: " + maxSpeed + " km/h)");
    }
}

void main() {
    Scanner scanner = new Scanner(System.in);
    Car[] cars = new Car[3];
    
    for (int i = 0; i < cars.length; i++) {
        System.out.println("Car " + (i + 1) + ":");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Max speed: ");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        cars[i] = new Car(brand, maxSpeed);
    }
    
    System.out.println("\nYour cars:");
    for (int i = 0; i < cars.length; i++) {
        cars[i].printInfo();
    }
}
```

---

## User Input + Instance Methods

Kombinér user input med instance methods:

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
        stamina = stamina + 10;
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
    
    void printStatus() {
        System.out.println(name + " - Stamina: " + stamina + ", Score: " + score);
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
        System.out.println("3. Status");
        System.out.println("4. Quit");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            athlete.train();
        } else if (choice == 2) {
            athlete.compete();
        } else if (choice == 3) {
            athlete.printStatus();
        } else if (choice == 4) {
            running = false;
        }
    }
}
```

---

## Beregninger i Instance Methods

Instance methods er gode til beregninger baseret på objektets state:

```java
class Item {
    String name;
    double price;
    int stock;
    double discount;  // 0.0 - 1.0 (0% - 100%)
    
    Item(String name, double price, int stock, double discount) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
    }
    
    double getFinalPrice() {
        return price * (1 - discount);
    }
    
    double getTotalValue() {
        return getFinalPrice() * stock;
    }
    
    double getSavings() {
        return (price - getFinalPrice()) * stock;
    }
    
    void printSummary() {
        System.out.println(name);
        System.out.println("Original: " + price + " kr");
        System.out.println("Final: " + getFinalPrice() + " kr");
        System.out.println("Stock: " + stock);
        System.out.println("Total value: " + getTotalValue() + " kr");
        System.out.println("Total savings: " + getSavings() + " kr");
    }
}

void main() {
    Item laptop = new Item("Laptop", 10000, 5, 0.15);
    laptop.printSummary();
}
```

---

## Void vs Return Methods

**Void methods** - udfører en handling:
```java
void accelerate(int amount) {
    speed = speed + amount;
}

void printInfo() {
    System.out.println(name);
}
```

**Return methods** - returnerer en værdi:
```java
boolean isInStock() {
    return stock > 0;
}

double getTotalPrice() {
    return price * quantity;
}

String getInfo() {
    return name + " - " + price;
}
```

**Hvornår bruger du hver?**
- **Void:** Når du vil ændre objektets state eller printe noget
- **Return:** Når du vil få information fra objektet

---

## Common Patterns

### Pattern 1: Status Checker
```java
boolean isLowOnFuel() {
    return fuel < 20;
}

boolean isAvailable() {
    return stock > 0;
}

boolean isHealthy() {
    return calories < 500;
}
```

### Pattern 2: State Modifier
```java
void increaseScore(int points) {
    score = score + points;
}

void reduceStock(int amount) {
    stock = stock - amount;
}

void rest() {
    stamina = stamina + 20;
}
```

### Pattern 3: Calculator
```java
double calculateTotal() {
    return price * quantity;
}

int getAge() {
    return 2024 - birthYear;
}

double getDiscount() {
    return price * 0.20;
}
```

### Pattern 4: Formatter
```java
String getInfo() {
    return name + " - " + price + " kr";
}

String getDescription() {
    return brand + " " + model + " (" + year + ")";
}
```

---

## Debugging Tips

**Problem:** Kan ikke tilgå instance variable
```java
class Car {
    String brand;
    
    void printBrand() {
        System.out.println(brand);  // OK - i instance method
    }
}

void main() {
    // System.out.println(brand);  // FEJL! Ikke i klassen
}
```

**Løsning:** Instance variables kan kun tilgås i klassen eller via objekt

---

**Problem:** Glemmer at kalde metode
```java
void main() {
    Car tesla = new Car("Tesla", 200, 100);
    tesla.accelerate;  // FEJL! Mangler ()
}
```

**Løsning:** Metoder kaldes altid med parenteser
```java
tesla.accelerate(50);  // Korrekt
```

---

**Problem:** Prøver at kalde instance method uden objekt
```java
void main() {
    accelerate(50);  // FEJL! Hvilken bil?
}
```

**Løsning:** Instance methods kaldes på et objekt
```java
Car tesla = new Car("Tesla", 200, 100);
tesla.accelerate(50);  // Korrekt
```

---

## Best Practices

**Metodenavne:**
- Brug verber (handling ord)
- Start med lille bogstav
- Brug camelCase
```java
void accelerate() { }     // Godt
void brake() { }          // Godt
void printInfo() { }      // Godt
void Accelerate() { }     // Dårligt (stort begyndelsesbogstav)
void print_info() { }     // Dårligt (underscore)
```

**Boolean methods:**
- Start med `is`, `has`, `can`
```java
boolean isEmpty() { }
boolean hasStock() { }
boolean canDrive() { }
boolean isHealthy() { }
```

**Getter methods:**
- Start med `get`
```java
double getPrice() { }
String getName() { }
int getStock() { }
```

**Enkelt ansvar:**
- Hver metode gør én ting
```java
// Godt - én opgave
void accelerate(int amount) {
    speed = speed + amount;
}

// Dårligt - for mange opgaver
void accelerateAndRefuelAndBrake() {
    speed = speed + 50;
    fuel = fuel + 20;
    speed = speed - 30;
}
```

---

## Opsummering

**Du har lært:**
- ✅ Hvad instance methods er
- ✅ Hvordan man skriver void instance methods
- ✅ Hvordan man skriver instance methods med return values
- ✅ Instance methods med parametre
- ✅ Instance methods med conditions
- ✅ Instance methods der kalder andre instance methods
- ✅ User input til at lave objekter
- ✅ Kombinere user input med instance methods
- ✅ Beregninger i instance methods

**Næste skridt:**
- Lav øvelserne i `level6_exercises.md`
- Eksperimenter med forskellige typer instance methods
- Prøv at kombinere void og return methods

**Husk:**
- Instance methods tilhører objektet
- Kaldes med `objekt.metode()`
- Kan tilgå instance variables direkte
- Void methods ændrer state, return methods giver information
