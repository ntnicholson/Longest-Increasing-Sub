package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 15, 19, 38, 18, 28, 0, 9, 60, 100, 20, 30, 120, 29, 56, 23, 54, 34, 67, 88, 193};
		List<Integer> temp = new ArrayList<Integer>();
		List<Integer> LIS = new ArrayList<Integer>();
		int currentMax = 0;
		int lengthMax = 0;
		
		for (int x = 0; x < array.length; x++) {
			currentMax = 0;
			
			for (int y = x; y < array.length; y++) 
			{
				if (array[y] > currentMax) //if the current position in array is greater than the max number
				{
					temp.add(array[y]); //add the number to the list
					currentMax = array[y]; //set the new current max
				}
			}//exit nested for loop
			if (lengthMax < temp.size()) {
				lengthMax = temp.size(); //the list size is the lis, set the lengthmax for later
				LIS.clear(); //Clear the LIS list
				LIS.addAll(temp); //Add all the contents from the iterated list to the LIS list for later
			}
			temp.clear();
		}
		
		System.out.println("The Longest Increasing Subsequence is: " + lengthMax);
		for (Integer i : LIS) {
			System.out.println(i);
		}
		
	}

}
