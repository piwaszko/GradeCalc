package src.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {

    private JFrame _frame;
    private Model _model;

    public GUI(){
        _frame = new JFrame("Smart Calculator");
        _model = new Model(this);

        _frame.setLayout(new GridLayout(0,1));
        _frame.add(new JLabel("WELCOME TO YOUR SMART CALCULATOR"));

        JButton initital = new JButton("Add a Class!");
        _frame.add(initital);
        initital.addActionListener(new EventHandler(_model));

        showyourself();
        _frame.setSize(2000, 1600);
//        _frame.pack();
    }

    public void test(String temp){
        ArrayList<Class> classes= _model.getClasses();
        for(int i=0; i<classes.size(); ++i){
            _frame.add(new JLabel(classes.get(i).getName());
        }
        showyourself();
    }

    private void showyourself(){
        _frame.setVisible(true);
    }
}
