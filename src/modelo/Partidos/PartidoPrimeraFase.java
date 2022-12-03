package modelo.Partidos;

import modelo.Operations;
import modelo.Team;

public class PartidoPrimeraFase {
    private int idPartido;
    private Team team1;
    private int marcadorT1;
    private Team team2;
    private int marcadorT2;
    private Operations ope;
    
    /**
     * @param team1
     * @param team2
     */
    public PartidoPrimeraFase(int id,Team team1, Team team2) {
        this.idPartido = id;
        this.team1 = team1;
        this.team2 = team2;
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


   

    
    
    



    
}
