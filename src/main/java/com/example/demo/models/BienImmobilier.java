package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "biens_immobilier")
public class BienImmobilier {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_bien_immobilier")
    private long identifiantBienImmobilier;

    @Column(name = "superficie")
    private double superficie;

    @Column(name = "type")
    private String type;

    @Column(name = "nombre_chambre")
    private int nombreChambre;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "ville")
    private String ville;

    public long getIdentifiantBienImmobilier() {
        return identifiantBienImmobilier;
    }

    public void setIdentifiantBienImmobilier(long identifiantBienImmobilier) {
        this.identifiantBienImmobilier = identifiantBienImmobilier;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNombreChambre() {
        return nombreChambre;
    }

    public void setNombreChambre(int nombreChambre) {
        this.nombreChambre = nombreChambre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
