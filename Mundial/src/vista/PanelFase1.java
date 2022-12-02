package vista;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import modelo.Context;
import modelo.Team;

public class PanelFase1 extends JPanel{
    private ArrayList<Team> teams = new ArrayList<>();

    public PanelFase1(){
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graph) {
        graph.drawImage(Context.getInstance().getImageBackground(), 0, 0, getWidth(), getHeight(), this);
        // ImageIcon Img = new ImageIcon(getClass().getResource("../image/star.png"));
        // graph.drawImage(Img.getImage(), 0, 0, 50, 50, null);
        // graph.clearRect(0, 0, 1200, 700);
        // for (int i = 0; i < stars.size() ; i++) {
        //     graph.drawImage(stars.get(i).getContext().getImage(), 0, 0, getWidth(), getHeight(), this);
        // }

    }

    // public ArrayList<Team> getStars() {
    //     return stars;
    // }

    
}
