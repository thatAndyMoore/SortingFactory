
public class main {

	
	public static void main(String[] args) 
	{
		
		
		
		BasicSorting someName = new BasicSorting();
		
		System.out.println("Array A: Sorting numbers 3, 2, 6, 5, 9, 4, 8");
		System.out.println("");
		
		int [] arrayA1 = new int [4];
		arrayA1[0] = 3;
		arrayA1[1] = 2;
		arrayA1[2] = 6;
		arrayA1[3] = 5;
		//arrayA1[4] = 9;
		//arrayA1[5] = 4;
		//arrayA1[6] = 8;
		
		
		ISort sorter = SortingFactory.FindSortingClass(arrayA1);
		sorter.Sort(arrayA1);
		//SelectionSort ssort = new SelectionSort(arrayA1);
		//ssort.Sort();
		//InsertionSort insertionSort = new InsertionSort(arrayA1);
		//insertionSort.Sort();
		
		//someName.InsertionSort(arrayA1);
		//System.out.println("");
		
		
		int [] arrayA2 = new int [7];
		arrayA2[0] = 3;
		arrayA2[1] = 2;
		arrayA2[2] = 6;
		arrayA2[3] = 5;
		arrayA2[4] = 9;
		arrayA2[5] = 4;
		arrayA2[6] = 8;
	
		sorter = SortingFactory.FindSortingClass(arrayA2);
		sorter.Sort(arrayA2);
		
		
		//someName.selectionInsertion(arrayA2);
		//System.out.println("");
		
		int [] arrayA3 = new int [12];
		arrayA3[0] = 3;
		arrayA3[1] = 2;
		arrayA3[2] = 6;
		arrayA3[3] = 5;
		arrayA3[4] = 9;
		arrayA3[5] = 4;
		arrayA3[6] = 8;
		arrayA3[7] = 10;
		arrayA3[8] = 13;
		arrayA3[9] = 12;
		arrayA3[10] = 11;
		arrayA3[11] = 14;
		
		sorter = SortingFactory.FindSortingClass(arrayA3);
		sorter.Sort(arrayA3);
		//someName.bubbleSort(arrayA3);
		//System.out.println("");
		
		
		
	
		System.out.println("Array B: Sorting numbers 4,2,6,7,1,0,9,8,5,3");
		System.out.println("");
		
	
		
		
		int[] arrayB1 = new int[4];
		arrayB1[0]=4;
		arrayB1[1]=2;
		arrayB1[2]=6;
		arrayB1[3]=7;
		//arrayB1[4]=1;
		//arrayB1[5]=0;
		//arrayB1[6]=9;
		//arrayB1[7]=8;
		//arrayB1[8]=5;
		//arrayB1[9]=3;
		
		sorter = SortingFactory.FindSortingClass(arrayB1);
		sorter.Sort(arrayB1);
		//someName.InsertionSort(arrayB1);
		//System.out.println(" ");
		
		int[] arrayB2 = new int[7];
		arrayB2[0]=4;
		arrayB2[1]=2;
		arrayB2[2]=6;
		arrayB2[3]=7;
		arrayB2[4]=1;
		arrayB2[5]=0;
		arrayB2[6]=9;
		//arrayB2[7]=8;
		//arrayB2[8]=5;
		//arrayB2[9]=3;
		
		sorter = SortingFactory.FindSortingClass(arrayB2);
		sorter.Sort(arrayB2);
		//someName.selectionInsertion(arrayB2);
		//System.out.println(" ");
		
		int[] arrayB3 = new int[12];
		arrayB3[0]=4;
		arrayB3[1]=2;
		arrayB3[2]=6;
		arrayB3[3]=7;
		arrayB3[4]=1;
		arrayB3[5]=0;
		arrayB3[6]=9;
		arrayB3[7]=8;
		arrayB3[8]=5;
		arrayB3[9]=3;
		arrayB3[10]=11;
		arrayB3[11]=10;
		
		sorter = SortingFactory.FindSortingClass(arrayB3);
		sorter.Sort(arrayB3);
		  //someName.bubbleSort(arrayB3);
		
		MyIntegerComparable[] comparableArray = new MyIntegerComparable[5];
		comparableArray[0] = new MyIntegerComparable(8);
		comparableArray[1] = new MyIntegerComparable(1);
		comparableArray[2] = new MyIntegerComparable(2);
		comparableArray[3] = new MyIntegerComparable(7);
		comparableArray[4] = new MyIntegerComparable(5);
		
		ISortComparable sortComparable = SortingFactory.FindComparableSortingClass(comparableArray);
		sortComparable.SortComparable(comparableArray);
		
	}

}
