
package src.code;
/*
public abstract class Parts{

	private double _grade;

	public Parts(double grade){

		_grade = grade;
	}

	public double returnGrade(){

	    return _grade;
	}

	public void setGrade(double grade){

	    _grade = grade;

	}
}*/

public class Parts{
	private String _part;
	private double _grade;
	private double _percentage;

	public Parts(String part, double grade, double percentage){
		_part = part;
		_grade = grade;
		_percentage = percentage;
	}
}


