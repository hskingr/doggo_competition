package xyz.hskr.main.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import xyz.hskr.main.DogCompPlaces;

public class DogCompPlacesTest {

	@Test
	public void test() {
		DogCompPlaces myComp = new DogCompPlaces();
		String input = "3rd";
		String[] result = myComp.InputPlace(input);
		assertNotSame("The Result should not read 3rd Place.", input, result[2]);
	}

}
