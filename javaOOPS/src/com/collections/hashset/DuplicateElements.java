package com.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		        int[] arr = {1, 2, 3, 2, 4, 1};

		        Set<Integer> seen = new HashSet<>();
		        Set<Integer> duplicates = new HashSet<>();

		        for (int num : arr) {
		        	boolean status=seen.add(num);

		            if (!status) {
		                duplicates.add(num);
		            }
		        }

		        System.out.println("Duplicates: " + duplicates);
		    }


	}

