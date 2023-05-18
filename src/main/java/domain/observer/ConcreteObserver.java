package domain.observer;

import domain.observer.Observer;

public class ConcreteObserver implements Observer {
  private String name;

  public ConcreteObserver(String name) {
    this.name = name;
  }

  public void update(String message) {
    System.out.println(name + " received the message: " + message);
  }
}