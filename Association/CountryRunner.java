package com.akshata.store.boot;

import com.akshata.store.app.Country;
import com.akshata.store.app.HomeMinister;
import com.akshata.store.app.PersonalAssistant;
import com.akshata.store.app.President;
import com.akshata.store.app.PrimeMinister;
import com.akshata.store.app.SecurityHead;

public class CountryRunner {
		public static void main(String[] args) {
			System.out.println("Invoking main in CountryRunner...");
			
			Country country =new Country();
			String name=country.name;
			String code=country.code;
			System.out.println("Country name:"+name);
			System.out.println("Country code:"+code);
			System.out.println();
			
			President president=country.president;
			String stateFrom=president.stateFrom;
			System.out.println("State:"+stateFrom);
			System.out.println();
			
			PrimeMinister primeMinister=country.primeMinister;
			String name1=primeMinister.name;
			int duration=primeMinister.duration;
			System.out.println("Prime Minister name:"+name1);
			System.out.println("Duration year "+duration);
			System.out.println();
			
			SecurityHead securityHead=primeMinister.securityhead;
			String head=securityHead.head;
			float salary=securityHead.salary;
			System.out.println("Head:"+head);
			System.out.println("Salary:"+salary);
			System.out.println();
			
			PersonalAssistant personalAssistant=primeMinister.personalAssistant;
			int noOfAssistant=personalAssistant.noOfAssistants;
			int age =personalAssistant.age;
			System.out.println("Number of assistants :"+noOfAssistant);
			System.out.println("Minimum age:"+age);
			System.out.println();
			
			HomeMinister homeMinister=primeMinister.homeminister;
			String stateFrom1=homeMinister.stateFrom;
			String qualification=homeMinister.qualification;
			System.out.println("From the state: "+stateFrom1);
			System.out.println("Qualifications: "+qualification);
			System.out.println();
			
		}
}