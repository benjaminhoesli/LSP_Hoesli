package org.howard.edu.lsp.assignment5.test;
import java.util.Arrays;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;

/**
 * Class to test IntegerSet class.
 * @author benjin8or
 *
 */
public class Driver {
	public static void main(String[] args) {
		
		//Objects to test:
		IntegerSet s1 = new IntegerSet();
		IntegerSet s2 = new IntegerSet();
		
		
		//testing clear()
		s1.add(1);
		System.out.println( "Set1 = " + s1.toString());
		s1.clear();
		System.out.println("After clear: " + s1.toString() + "\n");
		
		//testing length()
		s1.add(1);
		s1.add(2);
		s1.add(3);
		System.out.println("Set1: " + s1.toString() + " Length set1 = " + s1.length() + "\n");
		System.out.println("Set2: " + s2.toString() + " Length set2 = " + s2.length() + "\n");
		
		//testing equals()
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		System.out.println("Are sets equal:"+s1.equals(s2)+"\n");
		s2.add(1);
		s2.add(2);
		s2.add(3);
		System.out.println("Set2: " + s2.toString() + "\n");
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Are sets equal:"+s1.equals(s2)+"\n");
		
		
		// testing contains()
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		System.out.println("Does set1 contain 4:"+s1.contains(4)+"\n");
		System.out.println("Does set2 contain 3:"+s2.contains(3)+"\n");
		
		// testing largest()
		s2.clear();
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		try {
			System.out.println("Largest element of Set1 = " + s1.largest() + "\n");
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Largest element of Set2 = " + s2.largest() + "\n");
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		//testing smallest
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		try {
			System.out.println("Smallest element of Set1 = " + s1.smallest() + "\n");
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Largest element of Set2 = " + s2.smallest() + "\n");
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		//testing add()
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		s2.add(5);
		s2.add(6);
		System.out.println("Added 5,6 to set2:"+s2.toString()+"\n");
		s2.add(6);
		System.out.println("trying to add 6 to set2:"+s2.toString()+"\n");
		
		//testing remove()
		System.out.println("Set2: " + s2.toString() + "\n");
		try {
			s2.remove(5);
			System.out.println("Removed 5 from set2 = " + s2.toString() + "\n");
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		try {
			s2.remove(5);
			System.out.println("Removed 5 from set2 = " + s2.toString() + "\n");
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		//testing union()
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		s1.union(s2);
		System.out.println("Union of set1 and set2"+s1.toString()+"\n");
		
		//testing intersect()
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		s1.intersect(s2);
		System.out.println("Intersect of set1 and set2"+s1.toString()+"\n");
		
		//testing diff()
		s1.add(5);
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		s1.diff(s2);
		System.out.println("Sets after Set1 - Set2"+"\n");
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s2.toString() + "\n");
		
		//testing isEmpty()
		IntegerSet s3 = new IntegerSet();
		System.out.println("Set1: " + s1.toString() + "\n");
		System.out.println("Set2: " + s3.toString() + "\n");
		System.out.println("Set1 empty: " + s1.isEmpty() + "\n");
		System.out.println("Set2 empty: " + s3.isEmpty() + "\n");
	}}
		
		

