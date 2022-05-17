package org.howard.edu.lsp.finalExam;

import org.howard.edu.lsp.finalExam.*;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 



public class MapUtilitiesTest {
	@Test
	@DisplayName("Example from Document")
	public void testgivenexample() throws NullMapException {
		HashMap<String, String> m1= new HashMap<>();
		HashMap<String, String> m2= new HashMap<>();
		//fill map 1
		m1.put("Alice", "Healthy");
		m1.put("Mary", "Ecastic");
		m1.put("Chuck", "Fine");
		m1.put("Bob", "Happy");
		m1.put("Felix", "Sick");
		//fill map 2
		m2.put("Mary", "Ecastic");
		m2.put("Felix", "Healthy");
		m2.put("Ricardo", "Subperb");
		m2.put("Tam", "Fine");
		m2.put("Bob", "Happy");
		
		assertEquals(2, MapUtilities.commonKeyValuePairs(m1, m2));
	}
	@Test
	@DisplayName("Empty Maps")
	public void testemptymaps() throws NullMapException {
		HashMap<String, String> m1= new HashMap<>();
		HashMap<String, String> m2= new HashMap<>();
		HashMap<String, String> m3= new HashMap<>();
		m3.put("Alice", "Healthy");
		
		assertEquals(0, MapUtilities.commonKeyValuePairs(m1, m2));
		assertEquals(0, MapUtilities.commonKeyValuePairs(m3, m2));
	}
	@Test
	@DisplayName("Hashmap is null")
	public void testhashmapisnull() throws NullMapException{
		HashMap<String, String> m1= new HashMap<>();
		HashMap<String, String> m2= null;
		
		Exception ex1= assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(m1, m2);
		});
	}
	@Test
	@DisplayName("Maps with different length")
	public void testdifferentlength() throws NullMapException {
		HashMap<String, String> m1= new HashMap<>();
		HashMap<String, String> m2= new HashMap<>();
		
		m1.put("Alice", "Healthy");
		m1.put("Tam","Ecastic");
		m1.put("Mary", "Ecastic");
		
		m2.put("Alice", "Healthy");
		m2.put("Tam", "Fine");
		
		assertEquals(1, MapUtilities.commonKeyValuePairs(m1, m2));
	}
}