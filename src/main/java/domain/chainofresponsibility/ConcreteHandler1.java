package domain.chainofresponsibility;

public class ConcreteHandler1 extends Handler {
  public void handleRequest(int request) {
    if (request >= 0 && request < 10) {
      System.out.println("domain.chainofresponsibility.ConcreteHandler1 handled the request: " + request);
    } else if (successor != null) {
      successor.handleRequest(request);
    }
  }
}