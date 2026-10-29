package com.collections.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Task 4: Find Common Elements Between Two Sets ⭐⭐
//
//Scenario: Two students have enrolled in different courses. Find the courses they have in common.
//
//Set<String> student1 = new HashSet<>(
//    Arrays.asList("Java", "SQL", "Python", "React")
//);
//
//Set<String> student2 = new HashSet<>(
//    Arrays.asList("Java", "Spring Boot", "SQL", "Angular")
//);
//
//Requirements:
//Find the common courses between the two sets.
public class CommonElements {

	public static void main(String[] args) {
		Set<String> student1 = new HashSet<>(
	    Arrays.asList("Java", "SQL", "Python", "React")
	);
	
	Set<String> student2 = new HashSet<>(
	    Arrays.asList("Java", "Spring Boot", "SQL", "Angular")
	);
	System.out.println(student1);
	System.out.println(student2);
	System.out.println(student1.retainAll(student2));
	System.out.println(student1);
		

	}

}
