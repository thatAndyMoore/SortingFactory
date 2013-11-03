public class BubbleSort implements ISort, ISortComparable
{

	int[] a;

	public BubbleSort()
	{

	}

	public BubbleSort(int[] array)
	{
		this.a = array;
	}

	public void Sort(int[] a)
	{
		this.DoBubbleSort(a);
	}

	public void DoBubbleSort(int[] a)
	{

		System.out.println("Bubble Sort:");
		System.out.println("---------------------");

		int lowindex = 0;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = a.length - 1; j > i; j--)
			{
				lowindex = j;
				if (a[j] < a[j - 1])
				{
					lowindex = j - 1;

				}
				DSutil.Swap(a, j, lowindex);
			}
			DSutil.printArray(a);

		}
	}

	public void DoBubbleSort(Comparable[] a)
	{
		System.out.println("Bubble Sort:");
		System.out.println("---------------------");
		for (int i = 0; i < a.length - 1; i++)
		{
			for (int j = a.length - 1; j > i; j--)
			{
				if ((a[j].compareTo(a[j - 1]) < 0))
				{
					DSutil.Swap(a, j, j - 1);
				}
			}
		}
	}

	@Override
	public void SortComparable(Comparable[] a)
	{
		DoBubbleSort(a);

	}
}
