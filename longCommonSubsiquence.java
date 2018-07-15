 import java.util.*;
 public class longCommonSubsiquence{
 	public static void LCS(String x,String y){
 		int m=x.length();
 		int n=y.length();
 		int c[][]=new int[m+1][n+1];
 		int b[][]=new int[m+1][n+1];
 		for(int i=0;i<=m;i++){
 			c[i][0]=0;
 		}
 		for(int j=0;j<=n;j++){
 			c[0][j]=0;
 		}
 		for(int i=1;i<=m;i++){
 			for(int j=1;j<=n;j++){
 				if(x.charAt(i-1)==y.charAt(j-1)){
 					c[i][j]=c[i-1][j-1]+1;
 					b[i][j]=1;//1 for diagonal arrow
 				}
 				else{
 					if(c[i-1][j]>=c[i][j-1]){
 						c[i][j]=c[i-1][j];
 						b[i][j]=2;//2 for up arrow

 					}
 					else{
 						c[i][j]=c[i][j-1];
 						b[i][j]=3;//3 for left arrow
 					}
 				}
 			}
 		}
 		/*for(int i=0;i<=m;i++){
 			for(int j=0;j<=n;j++){
 				System.out.print(c[i][j]+" ");
 			}
 			System.out.println( );
 		}
 		 		for(int i=1;i<=m;i++){
 					for(int j=1;j<=n;j++){
 						System.out.print(b[i][j]+" ");
 					}
 					System.out.println( );
 		}*/
 		System.out.print("Longest Common Subsiquence is : ");
 		PRINT_LCS(b,x,x.length(),y.length());

 	}
 	public static void PRINT_LCS(int b[][],String x,int m,int n){
 		if(m==0 || n==0){
 			return;
 		}
 				if(b[m][n]==1){
 					PRINT_LCS(b,x,m-1,n-1);
 					System.out.print(x.charAt(m-1));
 				}
 				else if(b[m][n]==2){
 					PRINT_LCS(b,x,m-1,n);
 				}
 				else{
 					PRINT_LCS(b,x,m,n-1);
 				}
 	}
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter String x");
 		String x=sc.next();
 		System.out.println("Enter String y");
 		String y=sc.next();
 		LCS(x,y);
 	}
 }
