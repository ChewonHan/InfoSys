package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AdditionalComparatorExample {
    public static void main(String[] args) {
        Student s1 = new Student(20, 4.0);
        Student s2 = new Student(22, 3.0);
        Student s3 = new Student(21, 5.0);

        ArrayList<Student> arr = new ArrayList();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        System.out.println("STUDENT Unsorted : " + arr);

        // sort by age
        Collections.sort(arr, new ageComparator());
        System.out.println("STUDENT Sorted based on age : " + arr);

        // sort by gpa
        Collections.sort(arr, new gpaComparator());
        System.out.println("STUDENT Sorted based on GPA : " + arr);

        // More example
        Pet p1 = new Pet(4, "Cat");
        Pet p2 = new Pet(12, "Dog");
        Pet p3 = new Pet(102, "Turtle");

        ArrayList<Object> arr2 = new ArrayList();
        arr2.add(p1);
        arr2.add(p2);
        arr2.add(p3);

        System.out.println();
        System.out.println("Unsorted : " + arr2);

        // sort by age
        Collections.sort(arr2, new ageComparator());
        System.out.println("Sorted based on age : " + arr2);
    }
}

class ageComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Age a1 = (Age) o1; // downcast o1 to Age 'Datatype'
        Age a2 = (Age) o2; // downcast o1 to Age 'Datatype'


        if (a1.getAge() > a2.getAge()) return 1;
        else if (a1.getAge() < a2.getAge()) return -1;
        else return 0;
    }
}

class gpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() > s2.getGpa()) return 1;
        else if (s1.getGpa() < s2.getGpa()) return -1;
        else return 0;
    }
}

interface Age {
    public int getAge();
}

class Pet implements Age{
    private int age;
    private String species;

    public Pet(int age, String species) {
        this.age = age;
        this.species = species;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Pet age : " + age + ", species : " + species;
    }
}

class Student implements Age{
    // attributes / data fields
    private int age;
    private double gpa;

    //constructor
    public Student(int age, double gpa) {
        this.age = age;
        this.gpa = gpa;
    }

    // getter
    @Override
    public int getAge(){
        return age;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString() {
        return "Student age : " + age + ", GPA : " + gpa;
    }
}
