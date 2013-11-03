public class MyIntegerComparable implements Comparable
{

	public Integer myInt;

	public MyIntegerComparable(Integer myInt)
	{
		this.myInt = myInt;
	}

	@Override
	public int compareTo(Object o)
	{
		MyIntegerComparable i = (MyIntegerComparable) o;
		if (this.myInt < i.myInt)
		{
			return -1;
		}
		if (i.myInt < this.myInt)
		{
			return 1;
		}
		return 0;
	}

}
