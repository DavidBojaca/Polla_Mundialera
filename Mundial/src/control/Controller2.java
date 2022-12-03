package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Operations;
import utils.Utils;
import vista.WindowF1;

public class Controller2 implements ActionListener{
    private Operations model;
    private WindowF1 view2;

    public Controller2(Operations model, WindowF1 view){
        this.model = model;
        this.view2 = view;
        this.view2.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // view2 = new WindowF1();
        if (e.getActionCommand().equals(Utils.SAVE_MARCADORES)) {
            model.guardarSeleccionesMarcadores();
        } 
    }
}
