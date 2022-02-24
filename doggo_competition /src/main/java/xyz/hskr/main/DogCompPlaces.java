package xyz.hskr.main;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DogCompPlaces {
	
	public String[] InputPlace(String input) {
		String[] result = new String[100];
		
		Pattern pattern = Pattern.compile("\\d+", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(input);
		m.find();
		
		for (int index = 0; index < 100; index++) {
			result[index] = String.valueOf(index+1);
			
			if (m.group(0).equals(result[index])){
				//strip the "rd" from "3rd" and compare to "3"
				System.out.println("This was your input");
			} else if (result[index].endsWith("1") && !result[index].equals("11")) {
				result[index] += "st";
				System.out.println(result[index]);
			} else if (result[index].endsWith("2") && !result[index].equals("12")) {
				result[index] += "nd";
				System.out.println(result[index]);
			} else if (result[index].endsWith("3") && !result[index].equals("13")) {
				result[index] += "rd";
				System.out.println(result[index]);
			} else {
				result[index] += "th";
				System.out.println(result[index]);
			}
			
		}
//		System.out.println(Arrays.toString(result));
		// TODO Auto-generated method stub
		return result;
	}

}
