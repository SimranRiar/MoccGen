import java.util.*;
import javax.imageio.*;

/* The forethought:
take question
make mock sentence blank
run through length
randomize between upper and lower case
	0 - length-1
	int x = random between 0 and 1
	question(i)
		if 0 - lower case
		if 1 - upper case
add to mock
print mock with picture
*/

public class AskUser {

	public static void main(String[] args){
		
		String question = "";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ask me a question.");
		question = in.nextLine();
		
		String mock = "";
		
		for (int i = 0; i <= question.length()-1; i++){
			
			int x = (int)(Math.random()*2);
			char let = question.charAt(i);
			
			if (Character.isLetter(let)){
				if (x == 0){
					char l = Character.toLowerCase(let);
					mock += l;
				}
				if (x ==1){
					char u = Character.toUpperCase(let);
					mock += u;
				}
			}
			else {
				mock += let;
			}
		}
		
		System.out.println(mock);
		
	}
}