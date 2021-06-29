import java.util.*;
public class Vowels
 {

	public static void main(String[] args) {
     
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int  vow =0, con= 0, dig = 0, spaces = 0 , sp = 0;
		st = st.toLowerCase();
		
		for(int i = 0; i < st.length() ; i++)
		{
			char c = st.charAt(i);
			if(c == 'a'|| c== 'e' || c=='i' ||c =='o' || c=='u')
				vow++;
			else if(c>= 'a' && c<= 'z')
				con++;
			else if (c>='0' && c<= '9')
				dig++;
			else if(c == ' ')
				spaces++;
			else
			sp++;
		}
		System.out.println("Vowels = " +vow);
		System.out.println("Consonants = " +con);
		System.out.println("Digits = " +dig);
		System.out.println("Spaces  = " +spaces);
		System.out.println("Special Characters = " +sp);
	   	}

}
