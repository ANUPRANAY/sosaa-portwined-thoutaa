public class ConcreteFlyweight implements Flyweight{
  private String layout; // Shared layout details

  public ConcreteFlyweight(String layout) {
    this.layout = layout;
  }

  @Override
  public void draw() {
    // Implementation to draw the building with the shared layout
    System.out.println("Drawing building with layout: " + layout);
  }

  public String getLayout() {
    return layout;
  }
}
