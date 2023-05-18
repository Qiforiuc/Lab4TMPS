package domain.chainofresponsibility;

public class ConcreteHandler2 extends Handler {
  public void handleRequest(int request) {
    if (request >= 10 && request < 20) {
      System.out.println("domain.chainofresponsibility.ConcreteHandler2 handled the request: " + request);
    } else if (successor != null) {
      successor.handleRequest(request);
    }
  }
}