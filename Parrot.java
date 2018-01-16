
public class Parrot extends Bird implements Pet {

  String name;
  
  Parrot() {
    super.setSpeciesName("Parrot");
  }
  
  public String tweet() {
    return "Polly wanna cracker";
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
}
