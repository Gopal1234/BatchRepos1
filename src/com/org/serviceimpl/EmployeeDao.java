package com.org.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.org.model.Employee;
import com.org.service.EmployeeService;

public class EmployeeDao  implements EmployeeService{
static Connection con;
	//to connection with DB server
	public static Connection getConnect()
	{
		Connection con=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			
		final	String url="jdbc:postgresql://localhost:5432/May10thBatchDB";
					final String userName="postgres";
					final String password="root";
					
		 con=DriverManager.getConnection(url, userName, password);
				
			
		}catch(ClassNotFoundException ce)
		{
			System.out.println(ce.getMessage());
		}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
		}
		return con;
	}
	
	
	
	// when we are creating new employee then only we are creating the object for employee
	//Employyee
	@Override
	public int addEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
	Connection con=	 getConnect();
	//St
		//I want parameterized query
	//empid,empName,empMail,empAddr, empPhone, empSalary,30
	String insertQuery="insert into Employee values(?,?,?,?,?,?)";
	//Parameterized query can be executed using PreparedStatement
	// we can get the object of PreparedStatement by calling the method of Connection interface
	// PreparedStatement prepareStatement(String sql)throws SQLException
	//try
	//{
	PreparedStatement ps=  con.prepareStatement(insertQuery);
	ps.setLong(1, emp.getId() );
	ps.setString(2,emp.getName());
	ps.setString(3, emp.getAddres());
	ps.setString(4, emp.getEmail());
	ps.setLong(5, emp.getPhone());
	ps.setDouble(6, emp.getSal());
	//insert, update, delete
	//int executeUpdate()
int status=ps.executeUpdate();
	  
	/*}catch(Exception e)	 
	{
		System.out.println(e.getMessage());
	}*/
		con.close();
		return status;
	}
// we need existing employee 
	@Override
	public List<Employee> viewAllEmployee() {

   List<Employee> listOfEmp=new ArrayList();
   
   Connection con=	 getConnect(); 
   try
   {
   PreparedStatement ps= con.prepareStatement("select * from Employee");
   //ResultSet executeQuery();
  // ps.setInt(1, empid);
    ResultSet rs= ps.executeQuery();
  //  System.out.println(rs.getInt(1)+ " "+)
   if(rs.next())
   {
	   //I fetching from DB server
	   // getInt(int columnIndex)
	   //getInt(column Name)
	  
	   int eId=rs.getInt(1);
	   
	   String name=rs.getString(2);
	   String address=rs.getString(3);
	   String mail=rs.getString(4);
	   long ph=rs.getLong(5);
	   float sal=rs.getFloat(6);
	   //I am going set all this with the object of employee
	   Employee e=new Employee(eId, name, sal, mail, ph, address);
	   listOfEmp.add(e);
	   
	   
	   
	   
	   
	   
	   
   }
   
   
   
   
   
   
   }catch(SQLException se)
   {
	   System.out.println(se.getMessage());
   }
   
   
   
		
		
		
		return listOfEmp;
	}

	@Override
	public Employee getEmployeeById(int empId) {
  Employee emp=null;
      try
      {
		//connect with DB server
	Connection con=	getConnect();
	PreparedStatement ps=con.prepareStatement("select empname,empmail, empphone from Employee where empid=? and empphone=?");
	ps.setInt(1, empId);
	ps.setLong(2,8147117572L);
	ResultSet rs=	ps.executeQuery();
	if(rs.next())
	{
		// int eId=rs.getInt("empid");
		   
		   String name=rs.getString(1);
		   //String address=rs.getString(3);
		   String mail=rs.getString(2);
		   long ph=rs.getLong(3);
		 //  System.out.println()
		   //float sal=rs.getFloat(6);
		   //I am going set all this with the object of employee
		  emp=new Employee();
		  emp.setName(name);
		  emp.setPhone(ph);
		  emp.setEmail(mail);
		   
	}
		
      }catch(Exception e)
      {
    	  System.out.println(e.getMessage());
      }
		/*if(emp==null)
		{
			throw new UserDefinedException();
		}*/
		
		return emp;
	}

	@Override
	public Employee removeEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
