package com.acts.methods;

public class AddBinary{
	public static void main(String[] args){
		
	String s1= "100", s2= "101";
	char carry='0';
	char[] ans = new char[3];
	for(int i=s1.length()-1; i>=0 ; i--)
	{
		if((s1.charAt(i)=='1') && (s2.charAt(i)=='1') ){
			if(carry=='0'){
				ans[i]='0';
				carry='1';
			}
			else{
				ans[i]='1';
				carry='1';
				}
		}
		else if ((s1.charAt(i)=='0') && (s2.charAt(i)=='0') ){
			if(carry=='0'){
				ans[i]='0';
				carry='0';
			}
			else{
				ans[i]='1';
				carry='0';
				}
		}
		else{
			if(carry=='0'){
				ans[i]='1';
				carry='0';
			}
			else{
				ans[i]='0';
				carry='1';
				}
			
		}
	}
	
	for(int i=0; i<ans.length; i++)
	{
		System.out.print(ans[i]);
	}
	
	}
}