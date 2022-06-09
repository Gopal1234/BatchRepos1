package com.org.Controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee123456 {
 String name;
 int salary;
 public Employee123456(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	
   
    public String toString() {
		StringBuffer sb2=new StringBuffer("[");
        StringBuilder sb = new StringBuilder();
      
        sb.append("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        sb.append(",");
        StringBuffer sb3=new StringBuffer("]");
        String sb5=sb2.toString().concat(sb.toString().concat(sb3.toString()));
       // sb.insert(sb.length()-1, "]");
        return sb5;
    
    	
	}
}
public class EmployeeInfo{
    enum SortMethod {
    BYNAME,BYSALARY
    };
    public static  List<Employee123456> sort(List<Employee123456> emps,final SortMethod method){
	if(method.name().equals("BYSALARY")) {
    return emps.stream().sorted(Comparator.comparing(Employee123456::getSalary)).collect(Collectors.toList());
	}
	else {
	    return emps.stream().sorted(Comparator.comparing(Employee123456::getName)).collect(Collectors.toList());
	}
}

public  static boolean isCharacterPresentInAllNames(Collection<Employee123456> entities, String character) {
	for(Employee123456 emp: entities) {
		if(emp.name.contains(character)) {
			return true;
		}
	}
	return false;
}
public static void main(String[] arg)
{
	List<Employee123456> emps = new ArrayList<>();
	emps.add(new Employee123456("Mickey", 100000));
	emps.add(new Employee123456("Timmy", 50000));
	emps.add(new Employee123456("Annny", 40000));

	List<Employee123456> list1=sort(emps, SortMethod.BYNAME);
	list1.forEach(e->System.out.print(e));
	
	System.out.println("\n");
	List<Employee123456> list2=sort(emps, SortMethod.BYSALARY);//giving correct output now
	list2.forEach(e->System.out.print(e));
	
}
}




