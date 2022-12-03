package vista;

import java.awt.Graphics;
import java.util.ArrayList;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;

import modelo.Context;
import modelo.Partido;

public class PanelFase1 extends JPanel{
    private ArrayList<Partido> partidos = new ArrayList<>();

    public PanelFase1(){
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graph) {
        graph.clearRect(0, 0, 1200, 700);

        graph.setFont(new Font("Helvetivca", Font.BOLD, 14));
        graph.setColor(Color.WHITE);

        graph.drawImage(Context.getInstance().getImageBackground(), 0, 0, getWidth(), getHeight(), this);
        System.out.println(partidos.size());
        for (int i = 0; i < partidos.size(); i++) {
            graph.drawImage(partidos.get(i).getFlagEquipo1(), partidos.get(i).getX1(), partidos.get(i).getY1(), 45, 45, this);
            graph.drawString(partidos.get(i).getEquipo1(), partidos.get(i).getX1() - 85, partidos.get(i).getY1() + 30);
            graph.drawString("vs", partidos.get(i).getX1() + 77, partidos.get(i).getY1() + 30);
            graph.drawImage(partidos.get(i).getFlagEquipo2(), partidos.get(i).getX2(), partidos.get(i).getY2(), 45, 45, this);
            graph.drawString(partidos.get(i).getEquipo2(), partidos.get(i).getX2() + 50, partidos.get(i).getY2() + 30);
        }
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

}
