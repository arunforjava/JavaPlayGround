package com.learnin21.pezDispenser;

public class PezDispenserCreator {
	
	public static void main(String[] args) {
		
		PezDispenser pez= new PezDispenser("Batman");
		System.out.println("The name of the pez Dispenser that you created is "+pez.getCharacterName());
		
	}

}
