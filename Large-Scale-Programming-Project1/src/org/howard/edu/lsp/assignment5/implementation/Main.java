package org.howard.edu.lsp.assignment5.implementation;

public class Main{
	public static void main(String[]args) throws IntegerSetException {
		IntegerSet s = new IntegerSet();
		IntegerSet t = new IntegerSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(12);
		s.add(-12);
		s.add(3);
		s.add(4);
		t.add(3);
		t.add(4);
		s.intersect(t);
	
		//s.clear();
		System.out.println(s.toString());
	}}