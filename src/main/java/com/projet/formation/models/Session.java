package com.projet.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Session implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sessionId")
    private Long sessionId;
    private String lieu;
    @Column(name = "date_debut")
    private Date dateDebut;
    @Column(name = "date_fin")
    private Date dateFin;
    private int nbParticipants;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="formation_id")
    private Formation formation;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="participant_session",
            joinColumns = {@JoinColumn(name="session_id",referencedColumnName ="sessionId")},
            inverseJoinColumns = {@JoinColumn(name="participant_id",referencedColumnName = "participantID")}
    )
    private Set<Participant> participants=new HashSet<>();
    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbParticipants() {
        return nbParticipants;
    }

    public void setNbParticipants(int nbParticipants) {
        this.nbParticipants = nbParticipants;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }


}
