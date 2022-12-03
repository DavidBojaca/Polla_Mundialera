package modelo;
import java.awt.Image;

public class Team {
    private String nombre;
    private int x;
    private int y;
    private Image flagContext;
    private String grupo;
    private int posicion_usr;
    
    public Team(String nombre, int x, int y, Image context, String grupo) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.flagContext = context;
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getFlagContext() {
        return flagContext;
    }

    public void setContext(Image context) {
        this.flagContext = context;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getPosicionUsr() {
        return posicion_usr;
    }

    public void setPosicionUsr(int posicion_usr) {
        this.posicion_usr = posicion_usr;
    }

}
