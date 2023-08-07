package com.example.methodOverloading.boot;

import com.example.methodOverloading.app.Elevator;
import com.example.methodOverloading.app.Gadget;
import com.example.methodOverloading.app.Hotel;
import com.example.methodOverloading.app.IronBox;
import com.example.methodOverloading.app.Ladder;
import com.example.methodOverloading.app.Mouse;
import com.example.methodOverloading.app.Plier;
import com.example.methodOverloading.app.Specs;
import com.example.methodOverloading.app.Stapler;
import com.example.methodOverloading.app.Umbrella;

public class Main {

	public static void main(String[] args) {
		System.out.println("Calling Main...........");

		Hotel hotel = new Hotel();
		hotel.management();

		System.out.println("------------------------------------");

		IronBox box=new IronBox();
		box.smoothsCloth(89);

		System.out.println("------------------------------------");

		Specs specs=new Specs();
		specs.lens(3);

		System.out.println("------------------------------------");

		Umbrella umbrella=new Umbrella();
		umbrella.protects("Sun", "WineRed");

		System.out.println("------------------------------------");

		Stapler stapler=new Stapler();
		stapler.steples();

		System.out.println("------------------------------------");

		Ladder ladder=new Ladder();
		ladder.ladderTypes();

		System.out.println("------------------------------------");

		Gadget gadget=new Gadget();
		gadget.run("CAR");

		System.out.println("------------------------------------");

		Plier plier=new Plier();
		plier.cuts();

		System.out.println("------------------------------------");

		Mouse mouse=new Mouse();
		mouse.moves();

		System.out.println("------------------------------------");

		Elevator elevator=new Elevator();
		elevator.movement(10);
	}

}
 