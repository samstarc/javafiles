public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int i = 0;
		String rev = "";
        while(i < s.length())
        {
        	rev = s.charAt(i) + rev;
        	i++;
        }
        if(rev.equals(s))
        	System.out.println("Yes it is a palindrome ");
        else
        	System.out.println("No it is not a palindrome");
        	
	}

	void reverseOfAString(String s) {
		int i = 0;
		String rev = "";
        while(i < s.length())
        {
        	rev = s.charAt(i) + rev;
        	i++;
        }

	}
	
	void stringEqualOrNot(String s1,String s2) {
		int dif = s1.compareTo(s2);
		if(dif == 0)
			System.out.println("Strings are EQUAL");
		else
			System.out.println("Strings are Not Equal");
		
	}
}
