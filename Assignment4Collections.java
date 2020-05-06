package ITC155;
import java.util.HashSet;
import java.util.Map;
public class Assignment4Collections {

	/*
	 * Write a method isUnique that accepts a map whose keys and values are
strings as a parameter and returns true if no two keys map to the same
value (and false if any two or more keys do map to the same value).
For example, if the map contains the following key/value pairs, your
method would return true: {Marty=Stepp, Stuart=Reges,
Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the
following map would return false, because of two mappings for Perkins
and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller,
Bruce=Reges, Hal=Perkins}.
	 */
	public static void main(String[] args) {
		

	}

	public boolean isUnique(Map<String, String> map) {
		HashSet<String> set = new HashSet<String>();
		
		for(String key : map.keySet()) {
			String value = map.get(key);
			
			if(set.contains(value))
				return false;
			set.add(value);
		}
		return true;
	}
}
