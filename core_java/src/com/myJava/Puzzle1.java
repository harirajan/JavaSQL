/*I had the other day in my possession a label bearing the number 3 0 2 5 in large figures. 
This got accidentally torn in half, so that 3 0 was on one piece and 2 5 on the other. 
On looking at these pieces I began to make a calculation, when I discovered this little peculiarity. 
If we add the 3 0 and the 2 5 together and square the sum we get as the result, the complete original number 
on the label! Thus, 30 added to 25 is 55, and 55 multiplied by 55 is 3025. Curious, is it not?

Now, the challenge is to find another 
number, composed of four figures, all different, 
which may be divided in the middle and produce the same result.

Create a program that verifies if a number is a valid torn number.*/

package com.myJava;

public class Puzzle1 {

	public static void main(String[] args) {
		int digit =3025;
		//int digit = Integer.g.getInteger(args[0]);
		
		Puzzle1 p1 = new Puzzle1();
		for(int j = 1000; j<=9999;j++) {
		//int x = (int)(Math.random() * 9999)+1000 ;
		//System.out.println(x);//(x)
		args[0] = Integer.toString(j);
		if(j == p1.afterOperation(Character.getNumericValue(args[0].charAt(0)),Character.getNumericValue(args[0].charAt(1)),Character.getNumericValue(args[0].charAt(2)),Character.getNumericValue(args[0].charAt(3))))
			System.out.println("Yes" + j); 
		//else
			//System.out.println("No");
		/*for(int i=0; i <=args.length; i++) {
			
			}
			
			
		}
		char[] digits = args[0].toCharArray();
		*/
		}
		char c ='0';
		
		int v = (int) Character.getNumericValue(c);
		System.out.println(v);
	}
	
	public  int afterOperation(int a, int b, int c, int d) {
		
		
		return ((a*10+b)+(c*10+d))*((a*10+b)+(c*10+d)) ;
		
		
		
		//return 0;
	}
}
