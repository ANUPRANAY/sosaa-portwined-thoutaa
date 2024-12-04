public class UnsharedConcreteFlyweight {
  private int numberOfFloors; // Specific to each building
  private String color; // Specific to each building

  public UnsharedConcreteFlyweight(int numberOfFloors, String color) {
    this.numberOfFloors = numberOfFloors;
    this.color = color;
  }

  // Getters for specific attributes
  public int getNumberOfFloors() {
    return numberOfFloors;
  }

  public String getColor() {
    return color;
  }
}
