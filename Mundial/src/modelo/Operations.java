package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import vista.Window;

public class Operations {
    private ArrayList<Team> teams = new ArrayList<>();
    private Window window = null;
    
    public Operations(Window window){
        this.window = window;
    }
    
    public void init(){
        if (teams.isEmpty()) {
            createTeams();
            updateUI();
        }
    }

        public void guardarSelecciones(){
        HashMap<String, Integer> positions = window.Positions();

        for (Entry<String, Integer> map : positions.entrySet()) {
            for (Team team : teams) {
                if (map.getKey().equals(team.getNombre())) {
                    team.setPosicionUsr(map.getValue());
                }
            }
        }
    }

    public void createTeams(){
        teams.add(new Team("Ecuador", 80, 100, Context.getInstance().getEcuador(), "A"));
        teams.add(new Team("Qatar", 80, 150, Context.getInstance().getQatar(), "A"));
        teams.add(new Team("Holanda", 80, 200, Context.getInstance().getHolanda(), "A"));
        teams.add(new Team("Senegal", 80, 250, Context.getInstance().getSenegal(), "A"));
        teams.add(new Team("Gales", 400, 100, Context.getInstance().getGales(), "B"));
        teams.add(new Team("Inglaterra", 400, 150, Context.getInstance().getInglaterra(), "B"));
        teams.add(new Team("Iran", 400, 200, Context.getInstance().getIran(), "B"));
        teams.add(new Team("USA", 400, 250, Context.getInstance().getUsa(), "B"));
        teams.add(new Team("Arabia Saudi", 720, 100, Context.getInstance().getArabia_Saudi(), "C"));
        teams.add(new Team("Argentina", 720, 150, Context.getInstance().getArgentina(), "C"));
        teams.add(new Team("Mexico", 720, 200, Context.getInstance().getMexico(), "C"));
        teams.add(new Team("Polonia", 720, 250, Context.getInstance().getPolonia(), "C"));
        teams.add(new Team("Australia", 80, 370, Context.getInstance().getAustralia(), "D"));
        teams.add(new Team("Dinamarca", 80, 420, Context.getInstance().getDinamarca(), "D"));
        teams.add(new Team("Francia", 80, 470, Context.getInstance().getFrancia(), "D"));
        teams.add(new Team("Tunez", 80, 520, Context.getInstance().getTunez(), "D"));
        teams.add(new Team("Alemania", 400, 370, Context.getInstance().getAlemania(), "E"));
        teams.add(new Team("Costa Rica", 400, 420, Context.getInstance().getCosta_Rica(), "E"));
        teams.add(new Team("España", 400, 470, Context.getInstance().getEspaña(), "E"));
        teams.add(new Team("Japon", 400, 520, Context.getInstance().getJapon(), "E"));
        teams.add(new Team("Belgica", 720, 370, Context.getInstance().getBelgica(), "F"));
        teams.add(new Team("Canada", 720, 420, Context.getInstance().getCanada(), "F"));
        teams.add(new Team("Croacia", 720, 470, Context.getInstance().getCroacia(), "F"));
        teams.add(new Team("Marruecos", 720, 520, Context.getInstance().getMarruecos(), "F"));
        teams.add(new Team("Brazil", 240, 640, Context.getInstance().getBrazil(), "G"));
        teams.add(new Team("Camerun", 240, 690, Context.getInstance().getCamerun(), "G"));
        teams.add(new Team("Serbia", 240, 740, Context.getInstance().getSerbia(), "G"));
        teams.add(new Team("Suiza", 240, 790, Context.getInstance().getSuiza(), "G"));
        teams.add(new Team("Ghana", 560, 640, Context.getInstance().getGhana(), "H"));
        teams.add(new Team("Corea", 560, 690, Context.getInstance().getKorea(), "H"));
        teams.add(new Team("Portugal", 560, 740, Context.getInstance().getPortugal(), "H"));
        teams.add(new Team("Uruguay", 560, 790, Context.getInstance().getUruguay(), "H"));
    }

    public void updateUI() {
        window.getPanelBackground().getTeams().addAll(teams);
        window.repaint();
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

}
