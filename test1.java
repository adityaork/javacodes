import java.util.*;
public class test1 {
		public static void main(String[] args) {
				int x = 10;
				boolean b = true;

				l1: 
				 for(int i=1;i>0;i--){ b = x < 1; 
					System.out.println("l1");
				l2: while (b) {

						    System.out.println("hail");
							  // i++; continue l1;
				}
				}
			int move = -1;
			  String moveColumn = "";
			Scanner scan = new Scanner(System.in);
	       System.out.print("Please enter a move: ");
	        moveColumn = scan.next();
			move = Integer.parseInt(moveColumn);
			    System.out.println("You chose " + moveColumn + ".");
		}
}
