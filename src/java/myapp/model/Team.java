/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author marco
 */
@Entity
@Table(name="TEAM")
public class Team implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id 
    @Column(name = "IdTeam")
    private String idTeam;
	
    @Column(name = "Nome")
    private String nome;

    @JoinColumn(name = "SETTORE", referencedColumnName = "IdStr")
    @ManyToOne(optional = false)
    private String settore;  
    
   
}