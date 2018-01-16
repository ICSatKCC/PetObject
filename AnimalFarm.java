/**
 * ICS 211 Subclass/Superclass Example *
 * Animal Farm
 * 
 * @author Mark Nelson
 */

public class AnimalFarm {

	public static void main(String[] args) {
		System.out.println("Welcome to the farm");
		
		System.out.println("At first we didn't have any animals");
		Animal firstAnimal = null;
		
		System.out.print("And then we bought a... ");
		firstAnimal = new Chicken();
		System.out.println(firstAnimal.getSpeciesName());
		
		System.out.println("We liked having chickens on the farm, so we bought one more");
	  Chicken firstChicken = (Chicken) firstAnimal;
	  Chicken secondChicken = new Chicken();
		
	  System.out.print("They sound nice...");
    System.out.print(firstChicken.tweet() + " ");
    System.out.println(secondChicken.tweet());
    
    System.out.println("One day, we found an egg");
    Chicken anEgg = new Chicken();
    System.out.println("After the first week, we checked to see if the egg had hatched = " + anEgg.isHatched());
    anEgg.hatch();
    System.out.println("On the third week, we checked to see if the egg had hatched = " + anEgg.isHatched());
    Chicken cuteChick = anEgg;
    anEgg = null;
    
    System.out.println("About this time, our friend brought us a pet parrot");
    Parrot pua = new Parrot();
    System.out.println("Pets have names, so we thought... and thought...");
    pua.setName("Pua");
    System.out.println("...and we named it " + pua.getName() + " the " + pua.getSpeciesName());
    
    System.out.println("We even taught " + pua.getName() + " to speak");
    System.out.println(pua.tweet());

    System.out.println("Next, we bought a cow");
    Cow betsyTheCow = new Cow();
    
    System.out.println("Now, we have all these animals...");
    Animal[] allOfOurAnimals = new Animal[5];    
    allOfOurAnimals[0] = firstChicken;
    allOfOurAnimals[1] = secondChicken;
    allOfOurAnimals[2] = cuteChick;
    allOfOurAnimals[3] = pua;
    allOfOurAnimals[4] = betsyTheCow;
  
    for ( Animal animal : allOfOurAnimals ) {
      System.out.println("  " + animal.getSpeciesName());
    }

    System.out.println("In the morning, the birds wake us up");
    Bird[] allBirds = new Bird[4];
    allBirds[0] = firstChicken;
    allBirds[1] = secondChicken;
    allBirds[2] = cuteChick;
    allBirds[3] = pua;
    
    for( int i = 0 ; i < 9 ; i++ ) {
      System.out.print( "'" 
                      + allBirds[i % allBirds.length].tweet() 
                      + "' ");  
                              
    }
    System.out.println("");
    
    System.out.println("Most birds fly = " + pua.canFly());
    System.out.println("But chickens don't fly very well, chickens + fly = " + cuteChick.canFly());
    
    System.out.println("Mahalo for visiting our farm");

	}

}
