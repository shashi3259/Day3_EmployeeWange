package com.bridgelab.EmpWage;

import java.util.Random;

public class UC1_EmpAbsentPresent {

	public static void main(String[] args) {
		int present = 1;
		Random attend = new Random();
		
		
		for(int day=1; day<=5; day++) {
			int check = attend.nextInt(2);
			
//			System.out.println(check);
			if(check == present) {
				System.out.println(check+":" + "Day" + day+" Employee is present");
			}
			else {
				System.out.println(check+":" +"Day" + day+" Emplyee is Absent");
			}
			
		}

	}

}
