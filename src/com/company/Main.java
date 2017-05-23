package com.company;

public class Main {

    public static void main(String[] args) {

        int tempVal;
        int index = 0;
        boolean wasSwap = true;
        Person tempPerson;

        Person person1 = new Person(24, "Gosia","Gugu");
        Person person2 = new Person(15, "Ania","Buba");
        Person person3 = new Person(33, "Marek","Kia");
        Person person4 = new Person(44, "Maks","Ford");
        Person person5 = new Person(44, "Maks","Marchewka");
        Person person6 = new Person(44, "Stasiu","Marchewka");
        Person person7 = new Person(23, "Tosia","Banan");
        Person person8 = new Person(4, "Edward","Gierek");
        Person person9 = new Person(66, "Marcin","Arbuz");
        Person person10 = new Person(45, "Sabina","Melon");

        Person[] people = new Person[10];

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        people[5] = person6;
        people[6] = person7;
        people[7] = person8;
        people[8] = person9;
        people[9] = person10;

        BubbleSorter sorter2 = new BubbleSorter();
        SelectionSorter sorter1 = new SelectionSorter();
        PeoplePrinter printPeople = new PeoplePrinter();

        //Person[] sortedPeople = sorter1.sort(people);
        Person[] sortedPeople = sorter2.sort(people);
        printPeople.printPeople(sortedPeople);

    }
}

