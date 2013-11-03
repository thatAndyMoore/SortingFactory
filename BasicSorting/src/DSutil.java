
public class DSutil 
{
	
	public static void Swap(int[] array, int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void Swap(Comparable[] array, int i, int j)
	{
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void printArray(int[] a)
	{
		for (int x=0;x<a.length; x++)
		{
			System.out.print(a[x] + " ");
		}
		
		System.out.println();
		
	}

}
