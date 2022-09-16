package com.projet.formation.dto;

import com.projet.formation.models.Pays;
import com.projet.formation.models.Session;
import lombok.Getter;
import lombok.Setter;
import org.bongiorno.dto.support.AbstractDto;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class ParticipantDto extends AbstractDto {
    Long id ;
    String nom ;
    String prenom ;
    String email;
    String tel;
    Pays pays ;
    Set<Session> session = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Set<Session> getSession() {
        return session;
    }

    public void setSession(Set<Session> session) {
        this.session = session;
    }
//    @Override
//    public String toString() {
//        return "ParticipantDto{" +
//                "id=" + id +
//                ", nom='" + nom + '\'' +
//                ", prenom='" + prenom + '\'' +
//                ", email='" + email + '\'' +
//                ", tel='" + tel + '\'' +
//                ", pays=" + pays +
//                ", session=" + session +
//                '}';
//    }
}
