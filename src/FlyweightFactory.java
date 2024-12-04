import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private Map<String, Flyweight> flyweights = new HashMap<>();

  public Flyweight getFlyweight(String layout) {
    Flyweight flyweight = flyweights.get(layout);
    if (flyweight == null) {
      flyweight = createFlyweight(layout);
    }
    return flyweight;
  }

  private Flyweight createFlyweight(String layout) {
    ConcreteFlyweight flyweight = new ConcreteFlyweight(layout);
    flyweights.put(layout, flyweight);
    return flyweight;
  }
}
