package com.company;

/**
 * Created by RENT on 2017-05-22.
 */
public class PeoplePrinter {


	public void printPeople(Person[] people){

		//System.out.println("size = "+ people.length);

		for(int i=0;i<people.length;i++){
			System.out.println(people[i].getName() + " " + people[i].getSurname() + " - " +  people[i].getAge());
		}

	}
}
