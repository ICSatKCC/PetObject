
public abstract class Bird extends Animal {

	private boolean hasHatched;
	
	Bird() {
		hasHatched = false;
	}
	
	public abstract String tweet();
	
	public boolean isHatched() {
		return this.hasHatched;
	}
	
	public void hatch() {
		if( hasHatched ) {
			throw new RuntimeException( "The bird has already hatched" );
		}
		
		hasHatched = true;
	}
	
	public boolean canFly() {
	  return true; // Most birds can fly
	}
	
}
