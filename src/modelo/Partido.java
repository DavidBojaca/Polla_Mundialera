package modelo;
import java.awt.Image;

public class Partido {
    private int id;
    private String equipo1;
    private String equipo2;
    private Image flagEquipo1;
    private Image flagEquipo2;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(int id, String equipo1, Image flagEquipo1, int x1, int y1, String equipo2, Image flagEquipo2, int x2, int y2){
        this.id = id;
        this.equipo1 = equipo1;
        this.flagEquipo1 = flagEquipo1;
        this.x1 = x1;
        this.y1 = y1;
        this.equipo2 = equipo2;
        this.flagEquipo2 = flagEquipo2;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }
    public String getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }
    public int getGolesEquipo1() {
        return golesEquipo1;
    }
    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }
    public int getGolesEquipo2() {
        return golesEquipo2;
    }
    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
    public Image getFlagEquipo1() {
        return flagEquipo1;
    }
    public Image getFlagEquipo2() {
        return flagEquipo2;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    
    
}
