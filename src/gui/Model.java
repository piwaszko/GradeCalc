package src.gui;
import src.code.*;
import src.code.Class;

import java.util.ArrayList;

public class Model{

    private ArrayList<Class> classes;
    private Controller _con;

    public Model(Controller con){
        classes = new ArrayList<Class>();
        _con = con;
    }

    public void test(String temp){
        _con.print();
    }


}