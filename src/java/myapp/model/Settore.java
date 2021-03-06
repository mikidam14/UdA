/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author michele
 */
@Entity
@Table(name="SETTORE")
public class Settore implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="IdStr")
    private int id;
    
    @Column(name = "Nome")
    private String nome;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="settore")
    private List<Utente> utenti;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="settore")
    private List<Team> team;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "settore")
    private List<Team> segnalazioni;

    public List<Team> getTeam() {
        return team;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }

    public List<Team> getSegnalazioni() {
        return segnalazioni;
    }

    public void setSegnalazioni(List<Team> segnalazioni) {
        this.segnalazioni = segnalazioni;
    }

    public List<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(List<Utente> utenti) {
        this.utenti = utenti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
