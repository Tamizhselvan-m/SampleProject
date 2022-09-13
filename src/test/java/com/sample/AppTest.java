package com.sample;

public class AppTest {
	public static void main(String[] args) {
		String str = "mY nAME iS tAMIZH";
		
		String[] strArr = str.split(" ");
		for(int i=strArr.length-1; i>=0; i--) {
			String[] wrdArr = strArr[i].split("");
			for(int j=0; j<wrdArr.length; j++) {
				if(j==0) {
					System.out.print(wrdArr[j].toUpperCase());
				}else {
					System.out.print(wrdArr[j].toLowerCase());
				}
			}
			System.out.print(" ");
		}
	}
}
