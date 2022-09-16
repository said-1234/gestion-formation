package com.projet.formation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="participantID")
    private Long id;
    private String nom;
    private String prenom;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true,nullable = false)
    private String tel;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY,
            mappedBy = "participants")
    Set<Session> session;
    @OneToOne()
    @JoinColumn(name="fk_pays", referencedColumnName = "PaysId", foreignKey = @ForeignKey(name = "PaysId"))
    private Pays pays;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return id.equals(that.id) &&
                nom.equals(that.nom) &&
                prenom.equals(that.prenom) &&
                email.equals(that.email) &&
                tel.equals(that.tel) &&
                session.equals(that.session) &&
                pays.equals(that.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, email, tel, session, pays);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", session=" + session +
                ", pays=" + pays +
                '}';
    }
}
