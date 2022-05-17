package org.howard.edu.lsp.finalExam;
import java.util.*;
/**
 * 
 * @author benjin8or
 *
 */
public class MapUtilities {
	/**
	 * 
	 * @param map1
	 * @param map2
	 * @return the number of key/value pairs
	 * @throws NullMapException if at least one hashmap is null.
	 */
    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2)throws NullMapException {
// implementation
    	//first condition if any hashmap is null:
    	if (map1 == null || map2 == null){
     		throw new NullMapException();
     	}
    	//second condition if hashmaps are empty
    	if (map1.isEmpty() || map2.isEmpty()) {
     		return 0;
     	}
    	//check how many key/value pairs there are
    	int common=0;
    	if (map1.size()>map2.size()) {
    		for (String k1: map1.keySet()) {
    			if (map1.get(k1)==(map2.get(k1))) {
    				common++;
    			}}}
    	else {
    		for (String k2: map2.keySet()) {
    			if (map1.get(k2)==(map2.get(k2))) {
    				common++;
    			}}}
    	// return number of key/value pairs
    	return common;
    }
}