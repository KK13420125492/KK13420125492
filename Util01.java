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
	           System.out.print("������ѧ�ţ�");
	           id = sc.nextLine();
	         
	           boolean flag = false;
	           for (int i = 0; i < stuList.size(); i++) {
	               if (stuList.get(i).getId().equals(id)) {
	                   flag = true;  
	               }
	           }
	           if (flag == true) {
	               System.out.print("�Ѿ���ѧ��������������");
	           }
	           else {
	               break;
	           }
	       }
	    stu.setId(id);System.out.print("������������");
		String name=sc.nextLine();
		stu.setName(name);
		System.out.print("���������䣺");
		String age=sc.nextLine();
		stu.setAge(age);
		System.out.print("������סַ��");
		String address=sc.nextLine();
		stu.setAddress(address);
        stuList.add(stu);
		System.out.println(stuList);
		System.out.println("��ӳɹ���");
	}	

		public static void deleteStudent(ArrayList<Student> stuList){

		Scanner sc=new Scanner(System.in);
		if(stuList.size()==0){
			System.out.println("��ǰû��ѧ����Ϣ,�޷�ɾ����");
			
		}
		System.out.println(stuList);
		System.out.print("����������ɾ����ѧ��ѧ�ţ�");
		String id=sc.nextLine();
		for (int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getId().equals(id)){
				stuList.remove(i);
			}
		}
		System.out.println(stuList);
		System.out.println("ɾ���ɹ���");
	}

		public static void changeStudent(ArrayList<Student> al){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
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
	            System.out.println("����Ϣ�����ڣ����������룺");
	            System.out.println();
	        }else{
	            System.out.println("������ѧ����������");
	            String name = sc.nextLine();
	            System.out.println("������ѧ�������䣺");
	            String age = sc.nextLine();
	            System.out.println("������ѧ���¾�ס�أ�");
	            String address = sc.nextLine();
	            Student ss = new Student();
	            ss.setId(id);
	            ss.setName(name);
	            ss.setAge(age);
	            ss.setAddress(address);
	            al.set(index1,ss);
	            System.out.println("�޸ĳɹ�");
	            System.out.println();
	        }
	    }	

		public static void showStudent(ArrayList<Student> stuList){
		Scanner sc=new Scanner(System.in);
		if(stuList.size()==0){
			System.out.println("��ǰû��ѧ����Ϣ,�޷��鿴��");
			
		}
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i).getId());
		}
		System.out.print("����������鿴��ѧ����ѧ�ţ�");
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
