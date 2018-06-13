
package src.code;

public class Parts{
	private String _part;
	private double _grade;
//	private double _percentage;

	public Parts(String part, double grade){
		_part = part;
		_grade = grade;
//		_percentage = percentage;
	}

	@Override
	public boolean equals(Object part){
        if(part == null){
            return false;
        }
        final Parts p = (Parts) part;
        if(p._part == _part && _grade == p._grade){
            return true;
        }
        return false;
    }

    public String partName(){
	    return _part;
    }

    public Double getGrade(){
	    return _grade;
    }
}


