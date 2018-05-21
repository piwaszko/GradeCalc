package src.code;

import java.util.ArrayList;
public class Class{

	private String _className;
	private ArrayList<Homeworks> _homeworks; 

	public Class(String className){
		_className = className; 
		_homeworks = new ArrayList<Homeworks>(); 
	}

	public void addHW(double grade){
		_homeworks.add(new Homeworks(grade));
	}

	public void removeHW(double grade){
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
	}

}