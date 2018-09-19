import java.util.ArrayList;
public class Lab4 
{
	
	public static void printArray(int[] anArray)
	{
		System.out.println("");
		for(int i = 0; i < anArray.length; i++)
			System.out.print(anArray[i] + "   ");
	}
	
	public static int[] sortArray(int[] oldArray)
	{
		int[] sortedArray = new int[oldArray.length];
		ArrayList<Integer> temp = new ArrayList(0);
		for(int e : oldArray)
		{
			temp.add(e);
		}
		
		int currentMax, currentIndex;
		
		for(int i = 0; i < oldArray.length; i++)
		{
			currentIndex = 0;
			currentMax = temp.get(0);
			while (currentIndex + 1< temp.size())
			{
				currentIndex ++;
				if (temp.get(currentIndex) > currentMax)
					currentMax = temp.get(currentIndex);
				
				
			}
			temp.remove(temp.indexOf(currentMax));
			sortedArray[i] = currentMax;
			
		}
		return sortedArray;
	}
	
	
	public static void main(String[] args)
	{
		int[] test1 = {2, 1, 3};
		int[] test2 = {1, 2, 3, 5, 4};
		int[] test3 = {1, 2, 3, 4, 5};
		int[] test4 = {1, 10, 100, 99, 43};
		int[] test5 = {0, 1, 22, 43, 200000, -2};
		int[] test6 = null;
		String[] test7 = {"hello"};
		
		test1 = sortArray(test1);
		test2 = sortArray(test2);
		test3 = sortArray(test3);
		test4 = sortArray(test4);
		test5 = sortArray(test5);
	
		
		printArray(test1);
		printArray(test2);
		printArray(test3);
		printArray(test4);
		printArray(test5);
		
	}
	
	
}
