import java.util.ArrayList; 
public class Class{

	private String _className;
	private ArrayList<Homeworks> _homeworks; 

	public Class(String className){
		_className = className; 
		_homeworks = new ArrayList<Homeworks>(); 
	}

	public void addHW(Double grade){
		_homeworks.add(new Homeworks(grade));
	}

	public void removesHW(){

	}

}