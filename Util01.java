package util;

import java.util.ArrayList;
import java.util.Scanner;

import dao.Student;

public class Util01 {
	public static void addStudent(ArrayList<Student> stuList){
		Scanner sc=new Scanner(System.in);
		Student stu=new Student();
	    String id;
	    while(true) {
	           System.out.print("请输入学号：");
	           id = sc.nextLine();
	         
	           boolean flag = false;
	           for (int i = 0; i < stuList.size(); i++) {
	               if (stuList.get(i).getId().equals(id)) {
	                   flag = true;  
	               }
	           }
	           if (flag == true) {
	               System.out.print("已经有学号了请重新输入");
	           }
	           else {
	               break;
	           }
	       }
	    stu.setId(id);System.out.print("请输入姓名：");
		String name=sc.nextLine();
		stu.setName(name);
		System.out.print("请输入年龄：");
		String age=sc.nextLine();
		stu.setAge(age);
		System.out.print("请输入住址：");
		String address=sc.nextLine();
		stu.setAddress(address);
        stuList.add(stu);
		System.out.println(stuList);
		System.out.println("添加成功！");
	}	

		public static void deleteStudent(ArrayList<Student> stuList){

		Scanner sc=new Scanner(System.in);
		if(stuList.size()==0){
			System.out.println("当前没有学生信息,无法删除！");
			
		}
		System.out.println(stuList);
		System.out.print("请输入您想删除的学生学号：");
		String id=sc.nextLine();
		for (int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getId().equals(id)){
				stuList.remove(i);
			}
		}
		System.out.println(stuList);
		System.out.println("删除成功！");
	}

		public static void changeStudent(ArrayList<Student> al){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("请输入你要修改的学生的学号：");
	        String id = sc.nextLine();
	        int index1 = -1;
	        for (int i = 0; i < al.size(); i++) {
	            Student s = al.get(i);
	            if(s.getId().equals(id)){
	               index1 = i;
	                break;
	            }
	        }
	        if(index1 == -1){
	            System.out.println("该信息不存在，请重新输入：");
	            System.out.println();
	        }else{
	            System.out.println("请输入学生新姓名：");
	            String name = sc.nextLine();
	            System.out.println("请输入学生新年龄：");
	            String age = sc.nextLine();
	            System.out.println("请输入学生新居住地：");
	            String address = sc.nextLine();
	            Student ss = new Student();
	            ss.setId(id);
	            ss.setName(name);
	            ss.setAge(age);
	            ss.setAddress(address);
	            al.set(index1,ss);
	            System.out.println("修改成功");
	            System.out.println();
	        }
	    }	

		public static void showStudent(ArrayList<Student> stuList){
		Scanner sc=new Scanner(System.in);
		if(stuList.size()==0){
			System.out.println("当前没有学生信息,无法查看！");
			
		}
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i).getId());
		}
		System.out.print("请输入您想查看的学生的学号：");
		String id=sc.nextLine();
		int choice=0;
		for (int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getId().equals(id)){
				System.out.println(stuList.get(i));
				break;
			}
			}
	}

}
