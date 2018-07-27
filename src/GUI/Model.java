package src.GUI;
import src.code.*;
import src.code.Class;
import src.gui.Controller;

import java.util.ArrayList;

public class Model{

    private ArrayList<Class> _classes;
    private GUI _gui;

    public Model(GUI gui){
        _classes = new ArrayList<Class>();
        _gui = gui;
    }

    public void addAClass(String temp){
        Class tClass = new Class(temp);

        _classes.add(tClass);
        _gui.test(temp);
    }

    public ArrayList<Class> getClasses() {
        return _classes;
    }
}