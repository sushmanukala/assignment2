package com.credential.main;
import com.credential.model.*;

public class DriverClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AdminDepartment ad=new AdminDepartment();
        System.out.println("Welcome to  "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        
        HrDepartment hr=new HrDepartment();
        System.out.println("Welcome to  "+hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
        
        TechDepartment t=new TechDepartment();
        System.out.println("Welcome to  "+t.departmentName());
        System.out.println(t.getTodaysWork());
        System.out.println(t.getWorkDeadline());
        System.out.println(t.getTechStackInformation());
        System.out.println(t.isTodayAHoliday());
	}
}
