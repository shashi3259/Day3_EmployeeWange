package com.bridgelab.EmpWage;

import java.util.Random;

public class UC2_EmpDailyWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int present = 1;
		int empWagePerHr = 20;
		int fullDayHr =8;

		Random attend = new Random();


		for(int day=1; day<=5; day++) {
			int check = attend.nextInt(2);
			if(check == present) {
				System.out.println(check+":" + "Day" + day+" Employee is present and today's earning is: "+ empWagePerHr*fullDayHr);
			}
			else {
				System.out.println(check+":" +"Day" + day+" Emplyee is Absent");
			}
		}
	}
}
