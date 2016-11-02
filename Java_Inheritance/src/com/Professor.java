/**
 * 
 */
package com;

/**
 * @author Kruti
 *
 */
public class Professor extends PersonBase {
	 private String title;

	/**
	 * 
	 */
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	/**
	
	 */
	public Professor(String _name,Integer _age, String _title) {
		super(_name, _age);
		
		title= _title;
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return "prof:" +super.getName();
		
 	}
	

}
