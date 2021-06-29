package maze;

public class maze {
	static int i=0,j=0;
	static int flag=0;

int check(int[][] m,int n){
		int a[][]=new int[n][n];
	for(int l=0;l<n;l++) {
		for(int p=0;p<n;p++) {
		a[l][p]=m[l][p];
		}
	}
	/*for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
		System.out.print(a[i][j]);
		}
	System.out.println();	
	}
	System.out.println();
	System.out.println();
	*/
	
	//print maze
	if(a[n-1][n-1]==2) {
		System.out.println();
		System.out.println("final");
		flag=1;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==2) {
					System.out.print("_ ");
				}
				else System.out.print(a[i][j]+" ");
			}
		System.out.println();	
		}
		return flag;
	 	}
	
	else if(i<n && j<n) {
		//down check
	  if(i+1<n) {
		  if(a[i+1][j]==1) {
	    	a[++i][j]=2;
	    	check(a,n);
	    	a[i][j]=1;
	    	i--;
	    }
		  }
	   //right check
	
	 if(j+1<n) { 
		 if(a[i][j+1]==1) {
		  
		  a[i][++j]=2;
		  check(a,n);
		  j--;
		  
	  }
	  else { return 0;}
	 }
	}
	return flag;
  }
}
