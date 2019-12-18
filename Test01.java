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
			System.out.println("****欢迎来到学生管理系统****");
			System.out.println("请选择操作：");
			System.out.println("1.增加学生信息");
			System.out.println("2.删除学生信息");
			System.out.println("3.修改学生信息");
			System.out.println("4.查看学生信息");
			System.out.println("5.退出");
			System.out.print("请输入你想执行的操作编号：");
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
				System.out.println("输入错误，请重新输入！");
				break;
			}
		}
	}

	
}