/**
 * 
 */
package com;

/**
 * @author Kruti
 *
 */
public class Student extends PersonBase implements Studying {

	/**
	 * 
	 */
	private String grade;
	private String id;
	
	public Student() {
		
		super ("heni" ,12);
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public Student(String _name, Integer _age) {
		super(_name, _age);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public Student(String _name, Integer _age, String _grade) {
		this(_name ,_age);
		
		grade = _grade;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public Student(String _name, Integer _age, String _grade,String _id) {
		this(_name, _age,_grade);
		// TODO Auto-generated constructor stub
		id =_id;
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	
	public String getName(String _name, Integer _age) {
		return name;
	}
	
	public String getName(String _lastName) {
		return name + _lastName;
	}



	public Integer getAge() {
		return age - 10;
	}


	public String studyFor() {
		// TODO Auto-generated method stub
		return "JAVA";
	}

	
		// TODO Auto-generated constructor stub
	}


