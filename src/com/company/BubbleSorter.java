package com.company;

/**
 * Created by RENT on 2017-05-22.
 */
public class BubbleSorter {

	private boolean wasSwap = true;
	private Person tempPerson;

	public BubbleSorter() {
	}

	public Person[] sort (Person[] people) {

		System.out.println("BubbleSorter");

		while (wasSwap) {
			wasSwap = false;

			for (int j = 0; j < people.length-1; j++){

				if (people[j].compareTo(people[j+1]) > 0){
					tempPerson = people[j];
					people[j] = people[j+1];
					people[j+1] = tempPerson;
					wasSwap = true;
				}
			}
		}

		return people;
	}

}
