/**
 * 
 */
package com.pavan.yalamanchili;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author ypava
 *
 */
public class HashMap_Sort_byValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Map<String, Person> map = new HashMap<>();
		
		Person person = new Person();
		person.setFirstName("C");
		map.put("person1", person);
 
		person = new Person();
		person.setFirstName("B");
		map.put("person2", person);
		
		person = new Person();
		person.setFirstName("A");
		map.put("person3", person);
		
		Set<Entry<String, Person>> set = map.entrySet();
		
		List<Entry<String, Person>> list = new ArrayList<Map.Entry<String,Person>>(set);
		
		Collections.sort(list, new Comparator<Entry<String, Person>>() {
 
			@Override
			public int compare(Entry<String, Person> o1, Entry<String, Person> o2) {
				
				return (-o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName()));
			}
		});
		
		for (Entry<String, Person> entry : list) {
			System.out.println("Key-->"+entry.getKey()+"  Value-->"+entry.getValue().getFirstName());
		}
		
		/*
		 * This is for the Reverse sorting 
		 * return (-o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName()));
		 * */
	}

}
