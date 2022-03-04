package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Benjamin Hoesli
 *Class that does several operations on set like find largest nr, intersect...
 */
public class IntegerSet {
	private ArrayList<Integer> set = new ArrayList<>();
	/**
	 * Clears the set.
	 */
	public void clear() {
		set.clear();
	}
	/**
	 * 
	 * @return length of set.
	 */
	public int length(){
		return set.size();
	}
	/**
	 * Checks if 2 sets are the same.
	 */
	public boolean equals(IntegerSet b) {
		for (int i: this.set) {
			if (!b.contains(i)) {
				return false;
			}
			if (this.length() != b.length()){
				return false;	
			}
		}
		return true;	
	}
	/**
	 * 
	 * @param value of type int.
	 * @return true if the set contains the given value.
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}
	/**
	 * 
	 * @return the largest number in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	public int largest() throws IntegerSetException{
		if (this.set.isEmpty()){
			throw new IntegerSetException("Empty set");
		}
		else {
			int largest=this.set.get(0);
			for (int x = 0; x < this.set.size(); x ++){
				if (this.set.get(x) >= largest){
					largest = this.set.get(x); 
				}
			}
			return largest;
		}
		}
	/**
	 * 
	 * @return the smallest int of the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	public int smallest() throws IntegerSetException{
		if (this.set.isEmpty()){
			throw new IntegerSetException("Empty set");
		}
		else {
			int smallest=this.set.get(0);
			for (int x = 0; x < this.set.size(); x ++){
				if (this.set.get(x) <= smallest){
					smallest = this.set.get(x); 
				}
			}
			return smallest;
		}
		}
	/**
	 * Adds item to set if not in set already.
	 * @param item value of type int.
	 */
	public void add(int item) {
		if (!this.set.contains(item)){
			this.set.add(item);
		}
	}
	/**
	 * Removes item from set.
	 * @param item of type int.
	 * @throws IntegerSetException if set is empty.
	 */
	public void remove(int item) throws IntegerSetException {
		if (this.set.isEmpty()){
			throw new IntegerSetException("Empty set");
		}
		if (this.contains(item)) {
			for (int x = 0; x < this.set.size(); x ++){
				if (this.set.get(x) == item){
					this.set.remove(x); 
				}
			
		}
	}
	}
	/**
	 * Adds elements from set b to set a
	 * @param intSetb input of type set.
	 */
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.set.size(); i ++) {
			this.add(intSetb.set.get(i));
		}
	}
	/**
	 * Deletes all elements from set a that are not in set b.
	 * @param intSetb input of type set.
	 */
	public void intersect(IntegerSet intSetb) {
		int x = 0;
		while (x <this.set.size()) {
			Integer curr = this.set.get(x);
			if (!intSetb.contains(curr)) {
				this.set.remove(curr);
			} 
			else {
				x ++;
			}
		}
	}
	/**
	 * Calculates set a minus set b.
	 * @param intSetb input of type set.
	 */
	public void diff(IntegerSet intSetb) {
		int x = 0;
		while (x <this.set.size()) {
			Integer curr = this.set.get(x);
			if (intSetb.contains(curr)) {
				this.set.remove(curr);
			} 
			else {
				x ++;
			}
		}
	}
	/**
	 * Checks if set is empty.
	 * @return true if empty.
	 */
	public boolean isEmpty() {
		return this.set.isEmpty();
	}
	/**
	 * Turns set into string.
	 */
	public String toString() {
		return this.set.toString();
	}
}


