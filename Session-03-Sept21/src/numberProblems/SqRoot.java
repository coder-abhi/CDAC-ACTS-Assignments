package numberProblems;

import java.util.Scanner;

public class SqRoot{
public static void main(String[] args){
	int n, flag=0;
	System.out.println("Enter Number to find Square Root");
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	
	int ans, i, m=n/2;
	for(i=1; i<=m+1; i++){
		if (i*i==n){
		ans=i;
		flag=1;
		break;
		}
	}
	if(flag==1)
		System.out.println(i +" is Square root of "+ n);
	else
		System.out.println(n +" is not a Square ");

}
}