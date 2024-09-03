package module1;

public class MostRepeatedElement {

	public static void main(String[] args) {
		        int[] array = { 1, 2, 3, 2, 2, 3, 4, 5, 5, 5, 5 };
		        int maxCount = 0;
		        int mostRepeatedElement=0;
		        for (int i = 0; i < array.length; i++) 
		        {
		            int currentElement = array[i];
		            int currentCount = 1;
		            for (int j = i + 1; j < array.length; j++) 
		            {
		                if (array[j] == currentElement)
		                    currentCount++;
		                
		            }
		            
		            if (currentCount > maxCount)
		            {
		                mostRepeatedElement = currentElement;
		                maxCount = currentCount;
		            }
		        }
		        
		        System.out.println("Most repeated element: " + mostRepeatedElement);
		        System.out.println("Count: " + maxCount);
		    }
		}

