package demo;
import java.util.ArrayList;

import java.util.Scanner;

import dao.Student;
import util.Util01;

public class Test01 {
public static void main(String[] args) {
		ArrayList<Student> stuList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("****��ӭ����ѧ������ϵͳ****");
			System.out.println("��ѡ�������");
			System.out.println("1.����ѧ����Ϣ");
			System.out.println("2.ɾ��ѧ����Ϣ");
			System.out.println("3.�޸�ѧ����Ϣ");
			System.out.println("4.�鿴ѧ����Ϣ");
			System.out.println("5.�˳�");
			System.out.print("����������ִ�еĲ�����ţ�");
			int op=Integer.parseInt(sc.nextLine());
			switch (op) {
			case 1:			
				Util01.addStudent(stuList);
				break;
			case 2:
				Util01.deleteStudent(stuList);
				break;
			case 3:
				Util01.changeStudent(stuList);
				break;
			case 4:
				Util01.showStudent(stuList);
				break;
			case 5:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("����������������룡");
				break;
			}
		}
	}

	
}