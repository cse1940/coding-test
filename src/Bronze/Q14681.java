package Bronze;

import java.util.Scanner;

public class Q14681 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>0 && b>0) {
			System.out.println(1);
		} else if(a<0 && b>0) {
			System.out.println(2);
		} else if(a<0 && b<0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
		

	}

}
