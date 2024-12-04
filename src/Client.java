import java.util.ArrayList;
import java.util.List;

public class Client {
  private List<Building> buildings = new ArrayList<>();
  private FlyweightFactory factory = new FlyweightFactory();

  public void addBuilding(String layout, int numberOfFloors, String color) {
    Flyweight flyweight = factory.getFlyweight(layout);
    UnsharedConcreteFlyweight uniqueAttributes = new UnsharedConcreteFlyweight(numberOfFloors, color);
    buildings.add(new Building(flyweight, uniqueAttributes));
  }

  public void drawBuildings() {
    for (Building building : buildings) {
      building.draw();
    }
  }

  public static void main(String[] args) {
    Client client = new Client();
    client.addBuilding("Modern", 5, "Red");
    client.addBuilding("Modern", 3, "Blue");
    client.addBuilding("Victorian", 2, "Green");
    client.drawBuildings();
  }
}
