package org.zoho;
import java.util.Scanner;
public class Q1Icecream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=0;k<n;k++) {
			int S=sc.nextInt();
			int S1=sc.nextInt();
			int[]s=new int[S1+1];
			for(int i=1;i<S1;i++) 
				s[i]=sc.nextInt();
				for(int i=1;i<=S1;i++) {
					for(int j=i+1; j<=S1;j++) {
						if(s[i]+s[j]==S) {
							System.out.println(i+" "+j);
							
						}
						break;
					}
				}
		}
		sc.close();
	}
}

				
						
				