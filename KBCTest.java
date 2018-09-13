import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class KBCTest {
	public static void main(String args[]) {
		ArrayList ar = new ArrayList();
		for (int i=0;i<3;i++)
		{
			System.out.println("Enter your name : ");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			
			System.out.print("2 + 2 = \n (a)4 (b)0 (c)5 (d)2");
			String ans = sc.next();
			
			if(ans.equals("a"))
			{
				ar.add(name);
			}
			
		}
		
		System.out.println(ar);
		Collections.shuffle(ar);
		System.out.println(ar.get(1));
		//Random r = new Random();
		Random generator = new Random();
        int rnd = generator.nextInt(3);
		System.out.println(ar.get(rnd));
		
	}
}
