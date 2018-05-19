public abstract class Parts{

	private Double _grade;

	public Parts(Double grade){
		_grade = grade;
	}

	public Double returnGrade(){
		return _grade;
	}

	public void setGrade(Double grade){
		_grade = grade; 
	}
}