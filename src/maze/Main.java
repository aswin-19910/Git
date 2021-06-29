package maze;

import java.util.Scanner;

/*
 Find the path to travel in maze
 1 -> path to travel
 0 -> no path to travel
 enter at [0,0] and Exit at [n,n]
 EXAMPLE:
 size of maze: 5
 "enter the maze element"
 1 1 1 0 0 						- - - 0 0
 1 0 1 0 0      ---\			1 0 - 0 0
 1 0 1 1 0 		---/			1 0 - - 0
 0 0 0 1 0 						0 0 0 - 0
 0 0 0 1 1 						0 0 0 - -
 
 EXAMPLE:
 1 1 1 0 0 					
 1 0 1 0 0     
 1 0 1 1 0 		
 0 0 0 1 0 						
 0 0 0 1 0
 
 NO EXIT
  */
 
public class Main {
	public static void main(String arg[]) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter the size of maze");
		int n=in.nextInt();
		int[][] a=new int[n][n];
		System.out.println("enter the element of maze(only 0 or 1 allowed)");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			System.out.print(a[i][j]);
			}
		System.out.println();	
		}
		int flag = 0;
		
		maze m=new maze();
		if(a[0][0]==1) {
			a[0][0]=2;
			 flag=m.check(a,n);
			//System.out.println(flag);
			}
		
		if(flag==0) {
			System.out.println("NO EXIT");
			}
	}
	
}
