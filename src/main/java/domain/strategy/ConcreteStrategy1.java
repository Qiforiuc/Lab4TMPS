package domain.strategy;

import domain.strategy.Strategy;

public class ConcreteStrategy1 implements Strategy {
  public void executeStrategy() {
    System.out.println("Executing strategy 1.");
  }
}
