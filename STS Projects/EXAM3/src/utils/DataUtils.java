package utils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import petstore.Pet;
import petstore.PetCategory;

public interface DataUtils {
	public static Map<Integer,Pet> populateData() {
		Map<Integer,Pet>petMap=new HashMap<>();
		Pet p1=new Pet("Labrador",PetCategory.valueOf("DOG"),12000,5);
		petMap.put(p1.getPetId(),p1);
		Pet p2=new Pet("GoldFish",PetCategory.valueOf("FISH"),100,5);
		petMap.put(p2.getPetId(),p2);
		Pet p3=new Pet("Parrot",PetCategory.valueOf("BIRD"),500,5);
		petMap.put(p3.getPetId(),p3);
		Pet p4=new Pet("Doberman",PetCategory.valueOf("DOG"),15000,5);
		petMap.put(p4.getPetId(),p4);
		Pet p5=new Pet("PersionCat",PetCategory.valueOf("CAT"),8000,5);
		petMap.put(p5.getPetId(),p5);	
		return petMap;
	}

}
