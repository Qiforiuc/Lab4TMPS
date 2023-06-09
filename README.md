# Design Pattern App

The Design Pattern App is a Java application that demonstrates the implementation of several design patterns. It showcases the usage of the following design patterns:

- Chain of Responsibility
- Command
- Observer
- Strategy

## Overview

The application provides a practical demonstration of these design patterns in action. Each pattern is implemented using the appropriate classes and interfaces, showcasing their key concepts and usage scenarios.

## Features

- **Chain of Responsibility**: Illustrates a chain of handlers where a request is passed through each handler until it is handled appropriately or reaches the end of the chain.
- **Command**: Demonstrates the encapsulation of requests as objects, separating the sender from the receiver and enabling flexible execution of different commands.
- **Observer**: Shows the one-to-many dependency between objects, where multiple observers are notified and updated when the state of the subject changes.
- **Strategy**: Exhibits the ability to select and switch between interchangeable strategies at runtime, enabling dynamic behavior changes.

## App Structure

![img_12.png](img_12.png)

## Implementation

### Chain of Responsability

The Chain of Responsibility pattern allows passing a request along a chain of potential handlers, where each handler decides whether to handle the request or pass it to the next handler in the chain. In this application, the `Handler`, `ConcreteHandler1`, and `ConcreteHandler2` classes demonstrate the Chain of Responsibility pattern.

![img.png](img.png)
![img_1.png](img_1.png)
![img_2.png](img_2.png)

### Command

The Command pattern encapsulates requests or operations as objects, allowing the separation of the sender (invoker) of the request from the object that performs the action (receiver). In this application, the `Command`, `ConcreteCommand`, and `Receiver` classes showcase the Command pattern.

![img_3.png](img_3.png)
![img_4.png](img_4.png)
![img_5.png](img_5.png)

### Observer

The Observer pattern defines a one-to-many dependency between objects, where multiple observers can be notified and updated when the state of the subject changes. The application demonstrates the Observer pattern with the `Observer`, `ConcreteObserver`, and `Subject` classes.

![img_6.png](img_6.png)
![img_7.png](img_7.png)
![img_8.png](img_8.png)


### Strategy 

The Strategy pattern enables the selection of an algorithm at runtime from a family of interchangeable strategies. This application showcases the Strategy pattern with the `Strategy`, `ConcreteStrategy1`, and `ConcreteStrategy2` classes.

![img_9.png](img_9.png)
![img_10.png](img_10.png)
![img_11.png](img_11.png)

### Results after execution 

![img_13.png](img_13.png)

### Conclusion

In conclusion, this laboratory work has provided hands-on experience in implementing and utilizing several important design patterns in Java. By building the Design Pattern App, we gained a practical understanding of the Chain of Responsibility, Command, Observer, and Strategy patterns.

Throughout the development process, we learned the key concepts and principles behind each design pattern and their applicability in real-world scenarios. We observed how the Chain of Responsibility pattern enables the decoupling of request senders and receivers, how the Command pattern encapsulates actions as objects, how the Observer pattern establishes a publish-subscribe mechanism, and how the Strategy pattern allows for flexible algorithm selection at runtime.

By applying these design patterns, we achieved increased modularity, flexibility, and maintainability in our code. Each pattern provided a distinct solution to common software design challenges, promoting better code organization and separation of concerns.

Overall, this laboratory work has deepened our understanding of software design principles and design patterns. It has equipped us with valuable knowledge and skills to tackle future software engineering tasks, enabling us to create more robust and extensible applications through the effective application of design patterns.
