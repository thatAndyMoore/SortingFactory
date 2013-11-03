
public class IntegerComparator implements Comparable<Integer>
{

	Integer x;

	public IntegerComparator(Integer x)
	{
		this.x = x;
	}
	
	public int compareTo(Integer y)
	{
		if (this.x < y)
		{
			return -1;
		}
		
		if (y < this.x)
		{
			return 1;
		}
		
		return 0;
	}
}
