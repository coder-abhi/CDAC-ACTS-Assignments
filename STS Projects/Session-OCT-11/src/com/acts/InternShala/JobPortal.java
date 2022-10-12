package com.acts.InternShala;

import java.util.HashSet;

public class JobPortal {
	public static HashSet<Candidate> candidateList = new HashSet<Candidate>();
	public static void main(String[] args) {
		
		
		candidateList.add(CandidateUtil.addCandidate());
		
		printCandidateList();
	}
	
	public static void printCandidateList() {
		for(Candidate cd : candidateList) {
			System.out.println(cd.toString());
		}
	}
	
}
