package TP2;

import java.util.*;
import java.util.Map.Entry;

import org.junit.Test;

public class FormationTest {

	@Test
	public void testAjouterMatiere() {
		Map<String, String> lmat = new HashMap<>();
		lmat.put("Math", "3");
		lmat.put("APL", "5");
		lmat.put("ASR", "2");
		lmat.put("WIM", "1");
		 System.out.println("Parcours de l'objet HashMap : ");
	      Set<Entry<String, String>> setlmat = lmat.entrySet();
	      Iterator<Entry<String, String>> it = setlmat.iterator();
	      while(it.hasNext()){
	         Entry<String, String> e = it.next();
	         System.out.println(e.getKey() + " : " + e.getValue());
	      }
	      
	}
	
	@Test
	public void testSupprimerMatiere(){
		Map<String, String> lmat = new HashMap<>();
		lmat.remove("Math", "3");
		System.out.println("Parcours de l'objet HashMap : ");
	      Set<Entry<String, String>> setlmat = lmat.entrySet();
	      Iterator<Entry<String, String>> it = setlmat.iterator();
	      while(it.hasNext()){
	         Entry<String, String> e = it.next();
	         System.out.println(e.getKey() + " : " + e.getValue());
	}
	}
	
	public void main (String[] args){
		testSupprimerMatiere();
		
		
	}
}
