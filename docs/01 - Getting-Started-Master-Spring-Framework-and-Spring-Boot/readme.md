## 002 Step 01 - Understanding the Need for Java Spring Framework

![alt text](image-8.png)
![alt text](image-9.png)
![alt text](image-10.png)
![alt text](image-11.png)
![alt text](image-12.png)

## 003 Step 02 - Getting Started with Java Spring Framework

![alt text](image-13.png)
![alt text](image-14.png)
![go to start.spring.io](image-15.png)

## 004 Step 03 - Creating a New Spring Framework Project with Maven and Java

go to [start.spring.io](https://start.spring.io/)
![alt text](image-16.png)

## 005 Step 04 - Getting Started with Java Gaming Application

![alt text](image-17.png)
![alt text](image-18.png)
![alt text](image-20.png)
![alt text](image-21.png)
![alt text](image-22.png)

## 006 Step 05 - Understanding Loose Coupling and Tight Coupling

![alt text](image-24.png)

let's say instead of running the supperContra game, we want to run the mario game. We would have to change the `GamingConsole` class to `MarioGame` class. This is called tight coupling. We want to avoid this.

![alt text](image-25.png)

```java
package com.wchamara.learnspringframework.game;

public class SuperContraGame {

    public void up() {
        System.out.println("Jumping");
    }

    public void down() {
        System.out.println("sit down");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Fire a bullet");
    }
}
```

![alt text](image-26.png)

as you can see GameRunner is tightly coupled with MarioGame. We want to avoid this.

so now if we want to use the `SuperContraGame` class, we would have to change the `GameRunner` class to
use the `SuperContraGame` class.

![alt text](image-27.png)

![alt text](image-28.png)

now we can run the application with the `SuperContraGame` class.
![alt text](image-29.png)

![alt text](image-30.png)

## 007 Step 06 - Introducing Java Interface to Make App Loosely Coupled

![alt text](image-31.png)

let's create a `GamingConsole` interface.

```java
package com.wchamara.learnspringframework.game;

/**
 * The GaminConsole interface represents a gaming console's basic controls.
 * It provides methods to simulate the four main directions of movement in a game: up, down, left, and right.
 */
public interface GaminConsole {

    /**
     * Simulates the action of moving up in a game.
     */
    void up();

    /**
     * Simulates the action of moving down in a game.
     */
    void down();

    /**
     * Simulates the action of moving left in a game.
     */
    void left();

    /**
     * Simulates the action of moving right in a game.
     */
    void right();

}
```

then we can implement the `GamingConsole` interface in the `SuperContraGame` class.

```java
package com.wchamara.learnspringframework.game;

public class SuperContraGame implements GaminConsole {

    public void up() {
        System.out.println("Jumping");
    }

    public void down() {
        System.out.println("sit down");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Fire a bullet");
    }
}
```

now we can rename the variable to a more abstract name

![alt text](image-32.png)

now inside the gamerunner class, we can use the `GamingConsole` interface instead of the `SuperContraGame` class.

```java
package com.wchamara.learnspringframework.game;

public class GameRunner {

    private GaminConsole game;

    public GameRunner(GaminConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game..." + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
```

now we can use any class that implements the `GamingConsole` interface.

![alt text](image-33.png)

this is called loose coupling.

![alt text](image-34.png)

![alt text](image-36.png)

for now JVM manages the objects. But we want to use the spring framework to manage the objects.

now
![alt text](image-37.png)

this is what we want to achieve.
![alt text](image-38.png)

let's test the spring first
![alt text](image-39.png)

## 008 Step 07 - Bringing in Spring Framework to Make Java App Loosely Coupled

![alt text](image-41.png)
![alt text](image-40.png)

let's create a spring configuration file.

![alt text](image-42.png)

```java
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

}
```

![alt text](image-43.png)

@configuration tells spring that this is a configuration file.

now we can create a bean inside the configuration file.

```java
package com.wchamara.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringFramwork {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);
    }

}

```

![alt text](image-44.png)

`Bean` is an object that is managed by the spring framework.

let's ask spring to manage a bean called name

![alt text](image-45.png)

```java
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Chamara11111111111";
    }

}
```

we can access the bean using the `context` object.

```java
System.out.println(context.getBean("name"));
// Chamara11111111111
```

## 009 Step 08 - Your First Java Spring Bean and Launching Java Spring Configuration

## 010 Step 09 - Creating More Java Spring Beans in Spring Java Configuration File
