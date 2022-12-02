package vista;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import modelo.Context;
import modelo.Team;

public class PanelBackground extends JPanel{
    private ArrayList<Team> teams = new ArrayList<>();
    
    public PanelBackground(){
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics graph) {
        graph.clearRect(0, 0, 1200, 700);
        graph.drawImage(Context.getInstance().getImageBackground(), 0, 0, getWidth(), getHeight(), this);
        System.out.println(teams.size());
        
        for (int i = 0; i < teams.size(); i++) {
            graph.drawImage(teams.get(i).getFlagContext(), teams.get(i).getX(), teams.get(i).getY(), 45, 45, this);
        }
    }


    public ArrayList<Team> getTeams() {
        return teams;
    }
}
