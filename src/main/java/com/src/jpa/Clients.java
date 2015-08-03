/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MEDIA CITY
 */
@Entity
@Table(name = "clients", catalog = "bdd", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c"),
    @NamedQuery(name = "Clients.findByCodeCli", query = "SELECT c FROM Clients c WHERE c.codeCli = :codeCli"),
    @NamedQuery(name = "Clients.findByNom", query = "SELECT c FROM Clients c WHERE c.nom = :nom"),
    @NamedQuery(name = "Clients.findByPrenom", query = "SELECT c FROM Clients c WHERE c.prenom = :prenom"),
    @NamedQuery(name = "Clients.findByVille", query = "SELECT c FROM Clients c WHERE c.ville = :ville")})
public class Clients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodeCli", nullable = false)
    private Integer codeCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nom", nullable = false, length = 20)
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Prenom", nullable = false, length = 20)
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Ville", nullable = false, length = 20)
    private String ville;

    public Clients() {
    }

    public Clients(Integer codeCli) {
        this.codeCli = codeCli;
    }

    public Clients(Integer codeCli, String nom, String prenom, String ville) {
        this.codeCli = codeCli;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    public Integer getCodeCli() {
        return codeCli;
    }

    public void setCodeCli(Integer codeCli) {
        this.codeCli = codeCli;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCli != null ? codeCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clients)) {
            return false;
        }
        Clients other = (Clients) object;
        if ((this.codeCli == null && other.codeCli != null) || (this.codeCli != null && !this.codeCli.equals(other.codeCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.src.jpa.Clients[ codeCli=" + codeCli + " ]";
    }
    
}
