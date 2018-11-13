# Greetings

With this project you can print Greetings for the morning or evening. Also it is possible to print greetings specific for a person.

## Classes
1. Greeting
2. Morning
3. Evening
4. Main

### Greeting

Interface as base for all kind of greetings.

#### Methods
1. greet()
Method which return a greet message.
```java
public String greet();
```

2. greetPerson()
Method which return a greet message for a specific person.
```java
public String greetPerson(String name);
```

### Morning

Class which implements interface Greeting.
Morning has methods to return morning Greetings.

#### Methods
1. greet()
Method which returns a good moring greet message.
```java
public String greet() {
    return "Good morning";
}
```

2. greetPerson()
Method which return a good morning greet message for a specific person.
```java
public String greetPerson(String name) {
    return "Good morning " + name;
}
```

### Evening

Class which implements interface Greeting.
Evening has methods to return evening greetings.

#### Methods
1. greet()
Method which returns a good evening greet message.
```java
public String greet() {
    return "Good evening";
}
```

2. greetPerson()
Method which return a good evening greet message for a specific person.
```java
public String greetPerson(String name) {
    return "Good evening " + name;
}
```

### Main

Test class to test all classes and Methods.

#### Methods
1. Main()
Main method to run the program.

```java
  public static void main(String[] args) {
      Greeting morningGreeting = new Morning();
      System.out.println(morningGreeting.greet());
      System.out.println(morningGreeting.greetPerson("Rick"));

      Greeting eveningGreeting = new Evening();
      System.out.println(eveningGreeting.greet());
      System.out.println(eveningGreeting.greetPerson("Rick"));

  }
```

#### How to use the programm

To greet, you have to create one of the two greeting classes: Morning or Evening.
You can achieve this by creating a object of the interface Greeting class and assign a new Morning or Evening class to it.

```java
Greeting morningGreeting = new Morning();
Greeting eveningGreeting = new Evening();
```

Now you can use the methods of the interface to print the great message depending if the class is a Morning or Evening greeting.

```java
System.out.println(morningGreeting.greet());                //Result-> Good morning
System.out.println(morningGreeting.greetPerson("Rick"));    //Result-> Good morning Rick
System.out.println(eveningGreeting.greet());                //Result-> Good evening
System.out.println(eveningGreeting.greetPerson("Rick"));    //Result-> Good evening Rick
```
