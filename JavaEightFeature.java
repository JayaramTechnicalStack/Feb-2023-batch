package com.java8features;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightFeature {

	public static void main(String args[]) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 40000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 50000.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		/*
		 * int maleCount =0; int femaleCount=0;
		 * 
		 * for(Employee emp : employeeList) {
		 * 
		 * if(emp.getGender().equals("Male")){ maleCount++; }else { femaleCount++; } }
		 * 
		 * System.out.println("No of male employees:"+maleCount);
		 * System.out.println("No of female employees:"+femaleCount);
		 */
		
		// Query 3.1 : How many male and female employees are there in the organization?

		// For queries such as above where you need to group the input elements,
		// use the Collectors.groupingBy() method. In this query, we use
		// Collectors.groupingBy()
		// method which takes two arguments. We pass Employee::getGender as first
		// argument
		// which groups the input elements based on gender and Collectors.counting()
		// as second argument which counts the number of entries in each group.

		
		/*
		 * System.out.
		 * println("How many male and female employees are there in the organization?");
		 * 
		 * Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		 * 
		 * System.out.println("Male and Female employees list: " +
		 * noOfMaleAndFemaleEmployees);
		 */
		 
		 
		 

		// Query 3.2 : Print the name of all departments in the organization?
		// Use distinct() method after calling map(Employee::getDepartment)
		// on the stream. It will return unique departments.

		
		
		
		/*
		 * System.out.println("Print the name of all departments in the organization?");
		 * 
		 * employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.
		 * out::println);
		 */
		 
		 
		 
		// Query 3.3 : What is the average age of male and female employees?
		// Use same method as query 3.1 but pass
		// Collectors.averagingInt(Employee::getAge)
		// as the second argument to Collectors.groupingBy().
		
		
		
		
		/*
		 * Map<String, Double> avgAgeOfMaleAndFemaleEmployees =
		 * 
		 * employeeList.stream() .collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingInt(Employee::getAge)));
		 * 
		 * System.out.println(avgAgeOfMaleAndFemaleEmployees);
		 */
		 
		 
		 

		// Query 3.4 : Get the details of highest paid employee in the organization?
		// Use Collectors.maxBy() method which returns maximum element wrapped
		// in an Optional object based on supplied Comparator.

		
		
		
		
		/*
		 * Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
		 * .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		 * 
		 * Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
		 * 
		 * System.out.println("Details Of Highest Paid Employee : ");
		 * 
		 * System.out.println("==================================");
		 * 
		 * System.out.println("ID : " + highestPaidEmployee.getId());
		 * 
		 * System.out.println("Name : " + highestPaidEmployee.getName());
		 * 
		 * System.out.println("Age : " + highestPaidEmployee.getAge());
		 * 
		 * System.out.println("Gender : " + highestPaidEmployee.getGender());
		 * 
		 * System.out.println("Department : " + highestPaidEmployee.getDepartment());
		 * 
		 * System.out.println("Year Of Joining : " +
		 * highestPaidEmployee.getYearOfJoining());
		 * 
		 * System.out.println("Salary : " + highestPaidEmployee.getSalary());
		 */
		 

		// Query 3.5 : Get the names of all employees who have joined after 2015?

		// For such queries which require filtering of input elements, use
		// Stream.filter() method which filters input elements according to supplied
		// Predicate.

		
		
		/*
		 * 
		 * System.out.
		 * println("Get the names of all employees who have joined after 2015");
		 * 
		 * employeeList.stream().filter(e -> e.getYearOfJoining() >
		 * 2015).map(Employee::getName) .forEach(System.out::println);
		 */
		 

		// Query 3.6 : Count the number of employees in each department?
		// This query is same as query 3.1 but here we are grouping the elements by
		// department.

		
		
		
		
		/*
		 * System.out.println("Count the number of employees in each department");
		 * 
		 * Map<String, Long> employeeCountByDepartment = employeeList.stream()
		 * .collect(Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.counting()));
		 * 
		 * Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
		 * 
		 * for (Entry<String, Long> entry : entrySet) {
		 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
		 */
		 
		 

		// Query 3.7 : What is the average salary of each department?
		// Use the same method as in the above query 3.6, but here pass
		// Collectors.averagingDouble(Employee::getSalary)
		// as second argument to Collectors.groupingBy() method.
		
		/*
		 * System.out.println("What is the average salary of each department?");
		 * 
		 * Map<String, Double> avgSalaryOfDepartments=
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.averagingDouble(Employee::getSalary)));
		 * 
		 * Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();
		 * 
		 * for (Entry<String, Double> entry : entrySet1) {
		 * System.out.println(entry.getKey()+" : "+entry.getValue()); }
		 */
		 
		// Query 3.8 : Get the details of youngest male employee in the product
		// development department?
		// For this query, use Stream.filter() method to filter male employees in
		// product development department
		// and to find youngest among them, use Stream.min() method.

		
		
		
		System.out.println("Get the details of youngest male employee "
				+ "in the product development department?");

		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
				.filter(e -> e.getGender() == "Male" & e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));
		
		  
		  Employee youngestMaleEmployeeInProductDevelopment =
		  youngestMaleEmployeeInProductDevelopmentWrapper.get();
		  
		  System.out.println("Details Of Youngest Male Employee In Product Development"
		  );
		  System.out.println(youngestMaleEmployeeInProductDevelopment);
		  
			/*
			 * System.out.println("----------------------------------------------");
			 * 
			 * System.out.println("ID : " +
			 * youngestMaleEmployeeInProductDevelopment.getId());
			 * 
			 * System.out.println("Name : " +
			 * youngestMaleEmployeeInProductDevelopment.getName());
			 * System.out.println("Gender :"+youngestMaleEmployeeInProductDevelopment.
			 * getGender()); System.out.println("Age : " +
			 * youngestMaleEmployeeInProductDevelopment.getAge());
			 * 
			 * System.out.println("Year Of Joinging : " +
			 * youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
			 * 
			 * System.out.println("Salary : " +
			 * youngestMaleEmployeeInProductDevelopment.getSalary());
			 * System.out.println("Deparment : " +
			 * youngestMaleEmployeeInProductDevelopment.getDepartment());
			 */
		 
			 
		 

		// Query 3.9 : Who has the most working experience in the organization?
		// For this query, sort employeeList by yearOfJoining in natural order
		// and first employee will have most working experience in the organization.
		// To solve this query, we will be using sorted() and findFirst() methods of
		// Stream.

		
		  System.out.println("Who has the most working experience in the organization?"
		  );
		  
		  Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream()
		  .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		  
		  Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
		  
		  System.out.println("Senior Most Employee Details :");
		  
		  System.out.println("----------------------------");
		  
		  System.out.println("ID : " + seniorMostEmployee.getId());
		  
		  System.out.println("Name : " + seniorMostEmployee.getName());
		  
		  System.out.println("Age : " + seniorMostEmployee.getAge());
		  
		  System.out.println("Gender : " + seniorMostEmployee.getGender());
		  
		  System.out.println("Age : " + seniorMostEmployee.getDepartment());
		  
		  System.out.println("Year Of Joinging : " +
		  seniorMostEmployee.getYearOfJoining());
		  
		  System.out.println("Salary : " + seniorMostEmployee.getSalary());
		 

		  
		/*
		 * List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * 
		 * al.stream().skip(5).mapToInt( i-> i*2).forEach(System.out::println);
		 */

	}
}
