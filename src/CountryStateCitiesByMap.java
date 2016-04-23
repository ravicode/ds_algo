

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountryStateCitiesByMap {
	
	
	public static void main(String[] args) {
		
Map<String,Map<String,List<String>>> mp1=new HashMap<String,Map<String,List<String>>>();

List<String> city1=new ArrayList<String>();

city1.add("Dhanbad");
city1.add("bokaro");

List<String> city2=new ArrayList<String>();

city2.add("Banglore");
city2.add("Vellore");


Map<String,List<String>> state1=new HashMap<String,List<String>>();
state1.put("Jharkhand",city1);
state1.put("Karnataka",city2);

mp1.put("India",state1);

Iterator it = mp1.entrySet().iterator();
while (it.hasNext()) {
   // Map.Entry pairs = (Map.Entry)it.next();
	System.out.println(it.next());
   // System.out.println(pairs.getKey() + " -> " + pairs.getValue());
}







		
	}
	

}
