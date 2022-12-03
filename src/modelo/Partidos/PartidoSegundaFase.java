package modelo.Partidos;

import modelo.Operations;
import modelo.Team;

public class PartidoSegundaFase {

    private int idPartido;
    

    private Team team1;
    private int marcadorT1;

    private Team team2;
    private int marcadorT2;
    private Operations ope;
    private Team ganador;

    /**
     * @param team1
     * @param team2
     */
    public PartidoSegundaFase(int id,int id1, int id2) {
        this.team1 = ope.encontarEquipo(id1) ;
        this.team2 = ope.encontarEquipo(id2);
        
    }


    /**
     * @return the idPartido
     */
    public int getIdPartido() {
        return idPartido;
    }

    /**
     * @param idPartido the idPartido to set
     */
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    /**
     * @return the marcadorT1
     */
    public int getMarcadorT1() {
        return marcadorT1;
    }

    /**
     * @param marcadorT1 the marcadorT1 to set
     */
    public void setMarcadorT1(int marcadorT1) {
        this.marcadorT1 = marcadorT1;
    }

    /**
     * @return the marcadorT2
     */
    public int getMarcadorT2() {
        return marcadorT2;
    }

    /**
     * @param marcadorT2 the marcadorT2 to set
     */
    public void setMarcadorT2(int marcadorT2) {
        this.marcadorT2 = marcadorT2;
    }

    /**
     * @return the ganador
     */
    public Team getGanador() {
        return ganador;
    }

    /**
     * @param ganador the ganador to set
     */
    public void setGanador(Team ganador) {
        this.ganador = ganador;
    }


    /**
     * @return the team1
     */
    public Team getTeam1() {
        return team1;
    }

    /**
     * @param team1 the team1 to set
     */
    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    /**
     * @return the team2
     */
    public Team getTeam2() {
        return team2;
    }

    /**
     * @param team2 the team2 to set
     */
    public void setTeam2(Team team2) {
        this.team2 = team2;
    }


    public void darGanador() {
        
    }

    


    

    
    
}
