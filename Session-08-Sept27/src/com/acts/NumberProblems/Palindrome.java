package com.acts.NumberProblems;

import java.util.*;
public class Palindrome {
public static void main(String [] args) {
Scanner sc=new Scanner (System.in);
System.out.print("Enter a number");
int n = sc.nextInt();
int num=n;
int u=0,sum=0;
while(n>0) {
    u=n%10;
	sum=(sum*10)+u;
	n=n/10;
}
if(sum==num){
	System.out.println("Palindrome");
}
else {
	System.out.println("Not Palindrome");
}
}
}