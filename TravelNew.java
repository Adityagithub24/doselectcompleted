package doselect;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class TravelNew {
HashMap<String,Integer> holidayPkg = new HashMap<>();
	
	public int cheapestPackage(int numberOfPlaces)
	{
		TreeSet<Integer> values = new TreeSet<Integer>(holidayPkg.values());
		
		int packageValue = 0;
		for(Integer price : values)
		{
			if(numberOfPlaces!=0)
			{
				packageValue += price;
				numberOfPlaces--;
			}
			else {
				break;
			}
		}
		return packageValue; 
	}
	
	public int maximumPlace(int budget)
	{
			int maxPlaces = 0;
			
			SortedSet<Integer> values = new TreeSet<Integer>(holidayPkg.values());
			for(Integer packagePrice : values)
			{
				if(budget>packagePrice)
				{
					budget-=packagePrice;
					maxPlaces++;
				}
				else {
					break;
				}
			}
			return maxPlaces;
	}

	public static void main(String[] args) {
		
		TravelNew obj = new TravelNew();
		obj.holidayPkg.put("Delhi", 5000);
		obj.holidayPkg.put("Agra", 2500);
		obj.holidayPkg.put("Jaipur", 4000);
		obj.holidayPkg.put("Goa", 7000);
		
		System.out.println(obj.cheapestPackage(2));
		System.out.println(obj.maximumPlace(3000));

	}

}
