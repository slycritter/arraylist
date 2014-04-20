// Brian Johnson

public class ListA implements ListInterface
{
	private static final int Max = 5;// max size of array
	private String[]sA = new String[Max]; // array of strings 
	private int size; // amount of items in list
	
	public ListA() // constructor
	{
		size = 0;
	}
	public boolean Add(String s)
	{
		if(size >= Max) return false;// makes sure list is not full
		sA[size] = s; //adds an entry to the array
		size++;// adds another number to array
		return true;
		
	}
	public String Get(int i)
	{
		if((i > size) || (i < 0))// is this valid index
			return "";// no
		return sA[i];// returning string of arrays yes
		
	}
	public boolean Remove()
	{
		if (size < 1)
			return false;
		size--; // removing last entry
		return true;
	}
	public void Clear()
	{
		size = 0;// cleaning the array
	}
	public String ToString()
	{
		String sOut = "";
		if(size == 0)
			return "Array is empty";
		for(int n = 0; n < size; n++)
			sOut += sA[n] + "\n";
		return sOut;
	}

}
