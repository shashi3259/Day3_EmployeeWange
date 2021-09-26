package com.bridgelab.EmpWage;

import java.util.Random;

public class UC4_EmpSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dailyWage = 0;
		int empWagePerHr = 20;
		int fullDayHr =8;
		int partTimehr =4;
		int partTimeWage=0;

		Random attend = new Random();

		for(int day=1; day<=20; day++) {
			int check = attend.nextInt(3);
			switch(check) {
			case 1:
				dailyWage = dailyWage + empWagePerHr*fullDayHr;
				System.out.println(check+":" + "Day" + day+" Employee is present today's earning is: " + empWagePerHr*fullDayHr );
			case 2:
				partTimeWage = partTimeWage + empWagePerHr*partTimehr;
				System.out.println(check+":" + "Day" + day+" Employee is doing part time today & today's earning is " + empWagePerHr*partTimehr );
			case 0:
				System.out.println(check+":" +"Day" + day+" Emplyee is Absent");

			}
		}
		System.out.println("Employee wage for the month is: " + (dailyWage+partTimeWage));

	}


}

