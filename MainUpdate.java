package jdbc;



public class MainUpdate {
	public static void main(String[] args) throws Exception {
		
	
		DAO dao=new EmployeeDAO();
		Employee emp=new Employee(141,"Aadi", 345.97f);
		dao.updateEmp(emp);
	}

}
    
