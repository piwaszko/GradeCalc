package src.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javafx.util.Pair;

public class Class{

	private String _className;
	private ArrayList<Parts> _parts;
	private HashMap<String, Double> _categories;

	public Class(String className){
		_className = className; 
		_parts = new ArrayList<Parts>();
		_categories = new HashMap<String, Double>();
	}

    /**
     *
     * @param partName - Category name
     * @param weight   - The weight of the category
     * @return true if category does not exist
     */
	public boolean addCategory (String partName, Double weight){

	    if(_categories.containsKey(partName)){
	        return false;
        }
        _categories.put(partName,weight);
	    return true;
    }

	public void add(String part, double grade){
		_parts.add(new Parts(part, grade));
	}

	public String getName(){
		return _className;
	}

	public HashMap<String, Double> getCategories(){
	    return _categories;
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