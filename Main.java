package jdbc;



public class Main {

	public static void main(String[] args) throws Exception {
		DAO dao=new EmployeeDAO();
		Employee emp=new Employee(220,"Ami", 345.55f);
		dao.saveEmp(emp);
		
		}
		//update Employee
		//Employee emp=new Employee(107,"Ambili", 345.56f);
		//	dao.updateEmp(emp);
		
		
		
		/* delete employee int eno=107;
		dao.deleteEmp(eno);
		*/
		
		
	}


                                   