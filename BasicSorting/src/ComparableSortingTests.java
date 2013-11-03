import static org.junit.Assert.*;

import org.junit.Test;



public class ComparableSortingTests
{

	@Test
	public void test()
	{
		MyIntegerComparable[] comparableArray = new MyIntegerComparable[5];
		comparableArray[0] = new MyIntegerComparable(8);
		comparableArray[1] = new MyIntegerComparable(1);
		comparableArray[2] = new MyIntegerComparable(2);
		comparableArray[3] = new MyIntegerComparable(7);
		comparableArray[4] = new MyIntegerComparable(5);
		
		ISortComparable sortComparable = SortingFactory.FindComparableSortingClass(comparableArray);
		sortComparable.SortComparable(comparableArray);
		
		MyIntegerComparable[] expectedArray = new MyIntegerComparable[5];
		expectedArray[0] = new MyIntegerComparable(1);
		expectedArray[1] = new MyIntegerComparable(2);
		expectedArray[2] = new MyIntegerComparable(5);
		expectedArray[3] = new MyIntegerComparable(7);
		expectedArray[4] = new MyIntegerComparable(8);
		
		
		for (int i =0; i < expectedArray.length; i++)
		{
		assertEquals(0, expectedArray[i].compareTo(comparableArray[i]));
		}
		
		assertTrue(sortComparable instanceof SelectionSort);
		
		// ------------------SECOND ARRAY---------------------------
		MyIntegerComparable[] comparableArray2 = new MyIntegerComparable[3];
		comparableArray2[0] = new MyIntegerComparable(8);
		comparableArray2[1] = new MyIntegerComparable(1);
		comparableArray2[2] = new MyIntegerComparable(2);

		ISortComparable sortComparable2 = SortingFactory.FindComparableSortingClass(comparableArray2);
		sortComparable2.SortComparable(comparableArray2);
		
		MyIntegerComparable[] expectedArray2 = new MyIntegerComparable[3];
		expectedArray2[0] = new MyIntegerComparable(1);
		expectedArray2[1] = new MyIntegerComparable(2);
		expectedArray2[2] = new MyIntegerComparable(8);
		
		for (int i =0; i < expectedArray2.length; i++)
		{
		assertEquals(0, expectedArray2[i].compareTo(comparableArray2[i]));
		}
		
		assertTrue(sortComparable2 instanceof InsertionSort);
		
		// ------------------THIRD ARRAY-------------------------------
		MyIntegerComparable[] comparableArray3 = new MyIntegerComparable[11];
		comparableArray3[0] = new MyIntegerComparable(2);
		comparableArray3[1] = new MyIntegerComparable(4);
		comparableArray3[2] = new MyIntegerComparable(6);
		comparableArray3[3] = new MyIntegerComparable(8);
		comparableArray3[4] = new MyIntegerComparable(10);
		comparableArray3[5] = new MyIntegerComparable(11);
		comparableArray3[6] = new MyIntegerComparable(9);
		comparableArray3[7] = new MyIntegerComparable(7);
		comparableArray3[8] = new MyIntegerComparable(5);
		comparableArray3[9] = new MyIntegerComparable(3);
		comparableArray3[10] = new MyIntegerComparable(1);
		
		ISortComparable sortComparable3 = SortingFactory.FindComparableSortingClass(comparableArray3);
		sortComparable3.SortComparable(comparableArray3);
		
		MyIntegerComparable[] expectedArray3 = new MyIntegerComparable[11];
		expectedArray3[0] = new MyIntegerComparable(1);
		expectedArray3[1] = new MyIntegerComparable(2);
		expectedArray3[2] = new MyIntegerComparable(3);
		expectedArray3[3] = new MyIntegerComparable(4);
		expectedArray3[4] = new MyIntegerComparable(5);
		expectedArray3[5] = new MyIntegerComparable(6);
		expectedArray3[6] = new MyIntegerComparable(7);
		expectedArray3[7] = new MyIntegerComparable(8);
		expectedArray3[8] = new MyIntegerComparable(9);
		expectedArray3[9] = new MyIntegerComparable(10);
		expectedArray3[10] = new MyIntegerComparable(11);
		
		for (int i =0; i < expectedArray3.length; i++)
		{
		assertEquals(0, expectedArray3[i].compareTo(comparableArray3[i]));
		}
		
		assertTrue(sortComparable3 instanceof BubbleSort);
		
	// ---------------------- FORTH ARRAY -------------------
		
		MyIntegerComparable[] comparableArray4 = new MyIntegerComparable[16];
		comparableArray4[0] = new MyIntegerComparable(2);
		comparableArray4[1] = new MyIntegerComparable(4);
		comparableArray4[2] = new MyIntegerComparable(6);
		comparableArray4[3] = new MyIntegerComparable(8);
		comparableArray4[4] = new MyIntegerComparable(10);
		comparableArray4[5] = new MyIntegerComparable(11);
		comparableArray4[6] = new MyIntegerComparable(9);
		comparableArray4[7] = new MyIntegerComparable(7);
		comparableArray4[8] = new MyIntegerComparable(5);
		comparableArray4[9] = new MyIntegerComparable(3);
		comparableArray4[10] = new MyIntegerComparable(12);
		comparableArray4[11] = new MyIntegerComparable(13);
		comparableArray4[12] = new MyIntegerComparable(14);
		comparableArray4[13] = new MyIntegerComparable(15);
		comparableArray4[14] = new MyIntegerComparable(16);
		comparableArray4[15] = new MyIntegerComparable(17);
		
		ISortComparable sortComparable4 = SortingFactory.FindComparableSortingClass(comparableArray4);
		sortComparable4.SortComparable(comparableArray4);
		
		MyIntegerComparable[] expectedArray4 = new MyIntegerComparable[16];
		expectedArray4[0] = new MyIntegerComparable(2);
		expectedArray4[1] = new MyIntegerComparable(3);
		expectedArray4[2] = new MyIntegerComparable(4);
		expectedArray4[3] = new MyIntegerComparable(5);
		expectedArray4[4] = new MyIntegerComparable(6);
		expectedArray4[5] = new MyIntegerComparable(7);
		expectedArray4[6] = new MyIntegerComparable(8);
		expectedArray4[7] = new MyIntegerComparable(9);
		expectedArray4[8] = new MyIntegerComparable(10);
		expectedArray4[9] = new MyIntegerComparable(11);
		expectedArray4[10] = new MyIntegerComparable(12);
		expectedArray4[11] = new MyIntegerComparable(13);
		expectedArray4[12] = new MyIntegerComparable(14);
		expectedArray4[13] = new MyIntegerComparable(15);
		expectedArray4[14] = new MyIntegerComparable(16);
		expectedArray4[15] = new MyIntegerComparable(17);
		
		for (int i =0; i < expectedArray4.length; i++)
		{
		assertEquals(0, expectedArray4[i].compareTo(comparableArray4[i]));
		}
		
		assertTrue(sortComparable4 instanceof MergeSort);

		// --------------------- FIFTH ARRAY -------------------------
	
		MyIntegerComparable[] comparableArray5 = new MyIntegerComparable[21];
		comparableArray5[0] = new MyIntegerComparable(2);
		comparableArray5[1] = new MyIntegerComparable(4);
		comparableArray5[2] = new MyIntegerComparable(6);
		comparableArray5[3] = new MyIntegerComparable(8);
		comparableArray5[4] = new MyIntegerComparable(10);
		comparableArray5[5] = new MyIntegerComparable(11);
		comparableArray5[6] = new MyIntegerComparable(9);
		comparableArray5[7] = new MyIntegerComparable(7);
		comparableArray5[8] = new MyIntegerComparable(5);
		comparableArray5[9] = new MyIntegerComparable(3);
		comparableArray5[10] = new MyIntegerComparable(12);
		comparableArray5[11] = new MyIntegerComparable(13);
		comparableArray5[12] = new MyIntegerComparable(14);
		comparableArray5[13] = new MyIntegerComparable(15);
		comparableArray5[14] = new MyIntegerComparable(16);
		comparableArray5[15] = new MyIntegerComparable(17);
		comparableArray5[16] = new MyIntegerComparable(18);
		comparableArray5[17] = new MyIntegerComparable(19);
		comparableArray5[18] = new MyIntegerComparable(20);
		comparableArray5[19] = new MyIntegerComparable(21);
		comparableArray5[20] = new MyIntegerComparable(22);
	
		
		ISortComparable sortComparable5 = SortingFactory.FindComparableSortingClass(comparableArray5);
		sortComparable5.SortComparable(comparableArray5);
		
		MyIntegerComparable[] expectedArray5 = new MyIntegerComparable[21];
		expectedArray5[0] = new MyIntegerComparable(2);
		expectedArray5[1] = new MyIntegerComparable(3);
		expectedArray5[2] = new MyIntegerComparable(4);
		expectedArray5[3] = new MyIntegerComparable(5);
		expectedArray5[4] = new MyIntegerComparable(6);
		expectedArray5[5] = new MyIntegerComparable(7);
		expectedArray5[6] = new MyIntegerComparable(8);
		expectedArray5[7] = new MyIntegerComparable(9);
		expectedArray5[8] = new MyIntegerComparable(10);
		expectedArray5[9] = new MyIntegerComparable(11);
		expectedArray5[10] = new MyIntegerComparable(12);
		expectedArray5[11] = new MyIntegerComparable(13);
		expectedArray5[12] = new MyIntegerComparable(14);
		expectedArray5[13] = new MyIntegerComparable(15);
		expectedArray5[14] = new MyIntegerComparable(16);
		expectedArray5[15] = new MyIntegerComparable(17);
		expectedArray5[16] = new MyIntegerComparable(18);
		expectedArray5[17] = new MyIntegerComparable(19);
		expectedArray5[18] = new MyIntegerComparable(20);
		expectedArray5[19] = new MyIntegerComparable(21);
		expectedArray5[20] = new MyIntegerComparable(22);
		
		
		for (int i =0; i < expectedArray5.length; i++)
		{
		assertEquals(0, expectedArray5[i].compareTo(comparableArray5[i]));
		}
		
		//assertTrue(sortComparable5 instanceof QuickSort);
	}

}
