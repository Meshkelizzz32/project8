package project20;

import java.util.*;

class Fill2Test {
	  public static void main(String[] args) {
	    // Adapt a Collection:
	    List<Pet> carrier = new ArrayList<Pet>();
	    Fill2.fill(
	      new AddableCollectionAdapter<>(carrier),
	     Cat.class, 3);
	    // Helper method captures the type:
	    Fill2.fill(Adapter.collectionAdapter(carrier),
	    	EgyptianMau .class, 2);
	    for(Pet c: carrier)
	      System.out.println(c);
	    System.out.println("----------------------");
	    // Use an adapted class:
	    AddableSimpleQueue<Pet> petQueue =
	      new AddableSimpleQueue<Pet>();
	    Fill2.fill(petQueue, Pet.class, 4);
	    Fill2.fill(petQueue, Dog.class, 1);
	    for(Pet c: petQueue)
	    	System.out.println(c);
	  }
	}
