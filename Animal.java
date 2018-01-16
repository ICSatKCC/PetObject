
public abstract class Animal {
	private String speciesName;
	
	Animal() {
		// Do nothing
	}
	
	public String getSpeciesName() {
		return this.speciesName;
	}
	
	protected void setSpeciesName( String name ) {
		this.speciesName = name;
	}
	
}
