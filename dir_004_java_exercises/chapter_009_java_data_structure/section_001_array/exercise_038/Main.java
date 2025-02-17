// Import necessary Java libraries.
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays; 

// Define a class named Main.
public class Main
{
    // The main method for executing the program.
  	public static void main (String[] args)
	{
		// Define an array to test for the majority element.
		int nums[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
        System.out.println("Original Array : " + Arrays.toString(nums));  
		// Call the MajorityElement method to find the majority element.
		int result = MajorityElement(nums);
		if (result != -1)
			System.out.println("Majority element is " + result);
		else
			System.out.println("Majority element does not exist");
	}
  
	// A method to find the majority element in an array.
	public static int MajorityElement(int arra1[])
	{
		int n = arra1.length;

		// Create a hash map to store element frequencies.
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
		// Calculate the frequency of each element in the map.
		for (int i = 0; i < n; i++)
		{
			if (map.get(arra1[i]) == null)
				map.put(arra1[i], 0);
			
			map.put(arra1[i], map.get(arra1[i]) + 1);
		}

		// Return the element if its count is more than n/2.
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) 
		{
			Map.Entry pair = (Map.Entry)it.next();
			if ((int)pair.getValue() > n/2)
				return (int)pair.getKey();

			it.remove(); 
		}

		// No majority element found.
		return -1;
	}
}
