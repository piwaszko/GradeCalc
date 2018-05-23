package src.code;

import java.util.ArrayList;
public class Class{

	private String _className;
	private ArrayList<Parts> _parts;

	public Class(String className){
		_className = className; 
		_parts = new ArrayList<Parts>();
	}

	public void add(String part, double grade, double weight){
		_parts.add(new Parts(part, grade, weight));
	}

	public String getClassName(){

		return _className;

	}

/*	public void removeHW(double grade){
        for(int i=0; i<_homeworks.size(); ++i){
            if(_homeworks.get(i).returnGrade() == grade){
                _homeworks.remove(i);
            }
        }
	}

	public double calcHWAvg() {
		double sum = 0;
		int counter = 0;
		for(Homeworks temp: _homeworks){
			sum += temp.returnGrade();
			counter++;
		}
		return sum/counter;
	}*/

}