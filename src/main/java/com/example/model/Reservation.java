package com.example.model;

import javax.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String date;

    @Column(nullable = true)
    private String heure;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Salle salle;

    public Reservation() {
    }

    public Reservation(Utilisateur utilisateur, Salle salle) {
        this.utilisateur = utilisateur;
        this.salle = salle;
    }


    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
    public String getHeure() {
        return heure;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setSalle(Salle salle) {
    }


}
