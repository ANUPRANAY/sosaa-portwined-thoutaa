public class Building {
  private Flyweight flyweight;
  private UnsharedConcreteFlyweight uniqueAttributes;

  public Building(Flyweight flyweight, UnsharedConcreteFlyweight uniqueAttributes) {
    this.flyweight = flyweight;
    this.uniqueAttributes = uniqueAttributes;
  }

  public void draw() {
    flyweight.draw();
    System.out.println("Number of floors: " + uniqueAttributes.getNumberOfFloors() +
      ", Color: " + uniqueAttributes.getColor());
  }
}
