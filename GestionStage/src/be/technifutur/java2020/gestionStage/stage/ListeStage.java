package be.technifutur.java2020.gestionStage.stage;

import java.util.LinkedHashMap;


public class ListeStage {

   private LinkedHashMap<String, Stage> listeStage;

    public ListeStage () {
        listeStage = new LinkedHashMap<>();
    }
    public LinkedHashMap<String, Stage> getListeStage() {
        return listeStage;
    }


}
