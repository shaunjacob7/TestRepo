package IoPack;

import java.io.Serializable;

public class Employye implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empId;
	String Name;
	public Employye(int empId, String name) {
		super();
		this.empId = empId;
		Name = name;
	}

}
