package com.projet.formation.dto;

import com.projet.formation.models.Formateur;
import com.projet.formation.models.Formation;
import com.projet.formation.models.Participant;
import lombok.Getter;
import lombok.Setter;
import org.bongiorno.dto.support.AbstractDto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class SessionDto extends AbstractDto {
    Long sessionId;
    String lieu;
    Date dateDebut;
    Date dateFin;
    int nbParticipants;
    Formateur formateur;
    Formation formation;
    private Set<Participant> participants = new HashSet<>();

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

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }
}
