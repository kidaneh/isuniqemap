/*
 * This program checks for uniqueness of values
 * Date 05/04/2020
 */

package map_isuniooque;

import java.util.*;

public class Is_unique {

	public static void main(String[] args) {
	Map <String, String>testMap= new TreeMap<String, String>();
	boolean isTrue;
	
	// create a tree map object
	testMap.put("Stu1", "Kidane");
	testMap.put("Stu2", "Sam");
	testMap.put("Stu3", "Bizi");
	testMap.put("Stu4", "Lumi");
	
	
	isTrue=isUnique(testMap);
	System.out.println("testMap returns: "+ isTrue);
	}
	
	private static boolean isUnique(Map<String, String> map)
	{
	Set<String>valueSet= new HashSet<String>();
	for(String value:map.keySet())
	{
		String key=map.get(value);
		valueSet.add(key);
	}
	return valueSet.size()==map.size();
	
	}
	
	}

	
	
	


