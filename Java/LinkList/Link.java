

public class Link
{
	public int Data;
	public Link next = null;
	public Link(int data)
	{
		Data = data;
	}
	
	public void printData()
	{
		System.out.print(Data + ", ");
	}
}