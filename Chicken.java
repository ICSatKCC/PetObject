
public class Chicken extends Bird {

  Chicken() {
    super.setSpeciesName("Chicken");
  }
  
  public String tweet() {
    return "Cluck";
  }
  
  public boolean canFly() {
    return false; // Most chickens don't fly very well
  }
  
}
