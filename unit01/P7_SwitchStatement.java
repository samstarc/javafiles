import java.util.*;
class SwitchStatements 
{
	void switchStatements() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("CURRENT YEAR : 2022\n");
			break;
		case 2:
			System.out.println("CURRENT MONTH : APRIL\n");
			break;
		case 3:
			System.out.println("CUREENT DAY : SUNDAY");
			break;
		case 4:
			System.out.println("Not Applicable\n");
			break;
		default:
			System.out.println("INVALID INPUT\n");
		}
		sc.close();
	}
}
public class P7_SwitchStatement 
{

	public static void main(String[] args) 
	{
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}
}
