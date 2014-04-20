// Brian Johnson
import java.util.Scanner;


public class testDriver extends ListA{
	
	public static void main(String args[])
	{
		String list;
		ListA AList = new ListA();

		Scanner keyboard = new Scanner(System.in);
		
	
		for(int i = 0; true; i++)
		{
			System.out.print("Enter # " );
			list = keyboard.next();
			if(AList.Add(list)== false)
				break;
			
		}
		
		System.out.println("Array is Full");
		System.out.println(AList.ToString());
		AList.Remove();
		System.out.println("removed last entery\n" + AList.ToString());
		
		
		
	}
}
