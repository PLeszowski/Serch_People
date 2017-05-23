package com.company;

/**
 * Created by RENT on 2017-05-22.
 */
public class SelectionSorter {

	private int index = 0;
	private boolean wasSwap = true;
	private Person tempPerson;

	public SelectionSorter() {
	}

	public Person[] sort (Person[] people){

		System.out.println("SelectionSorter");

		for (int i = 0; i < people.length; i++) {
			wasSwap = false;

			for (int j = i; j < people.length; j++) {

				if (people[j].compareTo(people[i]) < 0) {
					index = j;  //find index of the smallest value
					wasSwap = true;
				}
			}
			if (wasSwap) {
				tempPerson = people[i];
				people[i] = people[index];
				people[index] = tempPerson;
			}
		}

		return people;

	}

}
