package listeg;
import java.util.ArrayList;

public class ListAssaignment 
{

	public static void main(String[] args) 
	{    
		        // 1. Create a new ArrayList and add some colors (strings)
		        ArrayList<String> colors = new ArrayList<String>();
		        colors.add("Red");
		        colors.add("Blue");
		        colors.add("Green");
		        colors.add("Yellow");
		        colors.add("Purple");

		        System.out.println("ArrayList of colors: " + colors);

		        // 2. Retrieve an element (at a specified index)
		        int index = 2;
		        String elementAtIndex = colors.get(index);
		        System.out.println("Element at index " + index + ": " + elementAtIndex);

		        // 3. Iterate through all elements in the ArrayList
		        System.out.println("\nIterating through the ArrayList:");
		        for (String color : colors) 
		        {
		            System.out.println(color);
		        }

		        // 4. Remove the third element from the ArrayList (index 2)
		        colors.remove(2); 
		        System.out.println("\nArrayList after removing the third element: " + colors);

		        // 5. Search for an element in the ArrayList
		        String searchElement = "Blue";
		        if (colors.contains(searchElement)) 
		        {
		            System.out.println("\nThe element '" + searchElement + "' is found in the ArrayList.");
		        } 
		        else 
		        {
		            System.out.println("\nThe element '" + searchElement + "' is not found in the ArrayList.");
		        }
	}

}
