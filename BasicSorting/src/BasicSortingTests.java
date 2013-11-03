import static org.junit.Assert.*;

import org.junit.Test;


public class BasicSortingTests
{

	@Test
	public void test()
	{
		BasicSorting someName = new BasicSorting();
		
		int[] array = new int[7];
		array[0] = 8;
		array[1] = 1;
		array[2] = 2;
		array[3] = 7;
		array[4] = 5;
		array[5] = 6;
		array[6] = 4;
		
		someName.InsertionSort(array);
		assertArrayEquals(new int[] {1,2,4,5,6,7,8,}, array);
	}

}
