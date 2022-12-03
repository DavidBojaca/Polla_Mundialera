package vista;

import javax.swing.JPanel;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Panel extends JPanel{
    private ImageIcon imagen;

    public Panel(){
        this.setVisible(true);
    }

    public void paint(Graphics g){

        super.paintComponent(g);

        g.clearRect(0, 0, 1200, 700);
        imagen = new ImageIcon(getClass().getResource("/image/background.png"));
        g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this); 

        g.setColor(Color.BLACK);
        g.fillRect(0, 688, 1300, 26);
    }
    
}
