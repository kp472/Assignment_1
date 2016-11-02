/**
 * 
 */
package com;

import org.w3c.dom.views.AbstractView;

/**
 * @author Kruti
 *
 */
public abstract class PersonBase implements Person{
	
	/**
		 * @author Kruti
		 *
		 */
	public interface Student extends AbstractView {

	}

	protected String name;
	protected Integer age;
	

	/**
	 * @param value
	 */
	public PersonBase(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public PersonBase(){
		// TODO Auto-generated constructor stub
	}
	 public String getName(){
		 return name;
		 
	 }

	 public Integer getAge(){
		 return age;
		 
	 }
}
