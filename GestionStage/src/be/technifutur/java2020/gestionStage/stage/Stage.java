package be.technifutur.java2020.gestionStage.stage;
import be.technifutur.java2020.gestionStage.activite.Activite;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Stage {
    private String nom, txtDebut, txtFin;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private HashMap<String, Activite> listeActivite;

    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.of(2020,05,12,16,00);
        LocalDateTime b = LocalDateTime.of(2020,05,12,16,01);
        int c = a.compareTo(b);
        System.out.println(c);
    }

    public Stage (String nom, LocalDateTime debut, LocalDateTime fin, HashMap<String, Activite> listeActivite) {
            this.nom = nom;
            this.dateDebut = debut;
            this.dateFin = fin;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            String nDebut = debut.format(formatter);
            String nFIn = fin.format(formatter);
            this.txtDebut = nDebut;
            this.txtFin = nFIn;
            this.listeActivite = listeActivite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public LocalDateTime getDetaFin() {
        return dateFin;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public String getTxtDebut() {
        return txtDebut;
    }

    public String getTxtFin() {
        return txtFin;
    }

    public HashMap<String, Activite> getListeActivite() {
        return listeActivite;
    }
}
