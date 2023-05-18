package client;

import domain.chainofresponsibility.ConcreteHandler1;
import domain.chainofresponsibility.ConcreteHandler2;
import domain.command.Command;
import domain.command.ConcreteCommand;
import domain.strategy.ConcreteStrategy1;
import domain.strategy.ConcreteStrategy2;
import utilities.Receiver;
import domain.observer.ConcreteObserver;
import domain.strategy.Strategy;
import domain.chainofresponsibility.Handler;
import domain.observer.Subject;
import domain.observer.Observer;

public class Main {
  public static void main(String[] args) {
    // Chain of Responsibility
    Handler handler1 = new ConcreteHandler1();
    Handler handler2 = new ConcreteHandler2();
    handler1.setSuccessor(handler2);
    handler1.handleRequest(5);
    handler1.handleRequest(15);

    System.out.println();

    // Command
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    command.execute();

    System.out.println();

    // Observer
    Subject subject = new Subject();
    Observer observer1 = new ConcreteObserver("Observer 1");
    Observer observer2 = new ConcreteObserver("Observer 2");
    subject.attach(observer1);
    subject.attach(observer2);
    subject.setMessage("Hello, observers!");

    System.out.println();

    // Strategy
    Strategy strategy1 = new ConcreteStrategy1();
    Strategy strategy2 = new ConcreteStrategy2();
    strategy1.executeStrategy();
    strategy2.executeStrategy();
  }
}
