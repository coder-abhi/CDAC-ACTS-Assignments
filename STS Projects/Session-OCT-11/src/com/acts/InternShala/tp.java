package com.acts.InternShala;

import java.util.HashSet;

public class tp {

	public static void main(String[] args) {
		HashSet<Integer> setList = new HashSet<Integer>();
		setList.add(15);
		setList.add(35);
		setList.add(45);
		System.out.println(setList.toString());
		for(Integer js:setList) {
			setList.remove(js);
		}
		

	}

}
