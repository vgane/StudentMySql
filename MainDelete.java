package jdbc;

import java.util.Scanner;

public class MainDelete {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in); 
		int eno=sc.nextInt();
		DAO dao=new EmployeeDAO();
	
		dao.deleteEmp(eno);
		
	}

}
 

