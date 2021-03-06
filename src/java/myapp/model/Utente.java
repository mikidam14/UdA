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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author michele
 */
@Entity
@Table(name="UTENTE")
public class Utente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id 
    @Column(name = "Username")
    private String username;
	
    @Column(name = "Pswd")
    private String password;

    @Column(name = "Nom")
    private String nome;
    
    @Column(name = "Cog")
    private String cognome;
    
    @Column(name = "Responsabile")
    private char responsabile;
    
    @JoinColumn(name = "SETTORE", referencedColumnName = "IdStr")
    @ManyToOne(optional = false)
    private Settore settore;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="utente")
    private List<Segnalazione> segnalazioni;
    /*
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="utente")
    private List<AzioneVerifica> azioniverifica;
    */
    
    /*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="UT_TM", joinColumns={@JoinColumn(referencedColumnName="Username")}, inverseJoinColumns={@JoinColumn(referencedColumnName="IdTeam")})
    private List<Team> team;

    public List<Team> getTeam() {
        return team;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }*/
    
    public Settore getSettore() {
        return settore;
    }

    public void setSettore(Settore settore) {
        this.settore = settore;
    }

    public List<Segnalazione> getSegnalazioni() {
        return segnalazioni;
    }

    public void setSegnalazioni(List<Segnalazione> segnalazioni) {
        this.segnalazioni = segnalazioni;
    }
/*
    public List<AzioneVerifica> getAzioniverifica() {
        return azioniverifica;
    }

    public void setAzioniverifica(List<AzioneVerifica> azioniverifica) {
        this.azioniverifica = azioniverifica;
    }
 */   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public char getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(char responsabile) {
        this.responsabile = responsabile;
    }
}
