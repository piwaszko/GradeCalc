package src;

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
}