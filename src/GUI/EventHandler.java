package src.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Event Handler class used to perform various actions in GUI
 *
 */
public class EventHandler implements ActionListener {

    private Model _model;

    /**
     * Constructor that uses an Association relationship between Event Handler and the GUI
     * @param m - Model class passed in by the GUI
     */
    public EventHandler(Model m) {
        _model = m;
    }

    /**
     * Each if statement checks for the source of the event and performs the corresponding event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        _model.addAClass("pretty");
    }
}
