package com.org.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Employee1234
{
	private int id;
	private String name;
	public Employee1234(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}

/*
 * JDBC: Java Database Connectivity
 *  java Application--flipKart application(Web Server-8080)//127.8.1.3
 *  making order
 *  Order--orderId, orderName, orderDate, TransactionId, payment mode, address, mail phone
 *  array
 *  collection
 *  map
 *  stream
 *  Optional
 *  JDBC API
 *  java.sql
 *  
 *  Connection<interface>
 *  DriverManager<class>
 *  Statement
 *  PreparedStatement
 *  ResultSet
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  javax.sql
 *  //http://123.7.89.
 *  //testdb
 *  //root
 *  //root
 *  //
 *  Databaser Server(Postgres, MySql, Oracle, SqlServer)//localhost
 *  SQL--Structured Query lnaguage
 *  create table
 *  insert data
 *  update 
 *  delete
 *  fetch all
 *  fecth single
 *  joinng
 *  subquery
 *  string function
 *  group function
 *  order by
 *  group by
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 * 
 * 
 * 
 * 
 */
public class TestJdbcDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException  {

   // I want connect this java application with Relation database server(PostgresSQL)
	//we have load on database specific driver	
		//static Class forName(String className)throws ClassNotFoundException
	//	try
		//{
		// 
		//PostGresDB--specific driver org.postgresql.Driver
		/*
		 * load one dedicated component like driver class of particular database
		 * java--
		 * DB server-sql langaugae
		 * 
		 * 
		 */
		// Class forName(String input)throws ClassNotFoundException
		//  any compiled class name is the valid string for forName()
		//forName("com.org.Controller.Employee1234")
	Class.forName("org.postgresql.Driver");
	System.out.println("driver loaded");
	//Driver
	//address to the driver
	//url, username, password--- token Connection and runtime error
	// web server --Tomcat --port 8080
	//Data server --postgresSQL--5432
	//10 server-1,5,7,
	// jdbc:postgresql://localhost:5432/name of the database
final	String URL="jdbc:postgresql://localhost:5432/May10thBatchDB";
			final String USERNAME="postgres";
			final String PASSWORD="root";
			/*
			 * JDBC API
			 *          java.sql.
			 *          Connection<interface>
			 *          DriverManager.getConnection(url, username, password)
			 *          
			 *          Statement<interface>
			 *          PreParedStatement<interface>
			 *          CallableStatement<interface>
			 *          insert
			 *          delete
			 *          fetch
			 *          update
			 *  Data configuration information given by database team
			 *   url=jdbc:postgresql/localhost:databasename
			 *   username="postgres"
			 *   password=root
			 *   driver="org.postgres.Driver"
			 * 
			 */
			//static Connection getConnection(String url, String userName, String password)thorws SQLException
		
Connection con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println(con);
		//I want to insert few records in Employee table in the same database
		//first transaction
		
		//Connection<interface>
		//Statement createStatement ()
		//Statement
		//insert, update and delete
		// int executeUpdate();
	Statement statement=	  con.createStatement();
	//JPA with Hibernate
	// int executeUpdate(String sql)throws SQLException
	//inserting record into dtatabase
	int status=	statement.executeUpdate("insert into Employee values(1295,'Ankit','A','a@gmail.com',5454,67676)");
		System.out.println(status);
		// ResultSet executeQuery(String sql)--
		//fetch all the records from table called Employee from database
		// select * from employee --view
	final 	String FETCH_QUERY="select * from Employee";
	
	// ResultSet executeQuery(String sql)throws SQLException
	//Iteractor
	//hasNext next remove()
	ResultSet rs=	statement.executeQuery(FETCH_QUERY);
	//boolean next() --this method will return true if the resultset pointing to valid row if not then false
		while(rs.next())
		{
			//getInt() getString() getDouble, getByte(), getStrea
			//getInt(int colIndex)-int
			//getInt(String colName)--int
		int empId=  rs.getInt("empid");
	String empName=	  rs.getString(2);
	String empAddress=rs.getString(3);
	String empMail=rs.getString(4);
	long empPhone=rs.getLong(5);
	float empSal=rs.getFloat(6);
	System.out.println(empId + " "+empName + " "+empMail + " "+empPhone + " "+empSal);
		  //rs.getInt(1)
			
			
		}
		
		
		
		
		
		
		

	}

}
