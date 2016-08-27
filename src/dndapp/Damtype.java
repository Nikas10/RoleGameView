/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndapp;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nikas
 */
@Entity
@Table(name = "DAMTYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Damtype.findAll", query = "SELECT d FROM Damtype d"),
    @NamedQuery(name = "Damtype.findById", query = "SELECT d FROM Damtype d WHERE d.id = :id"),
    @NamedQuery(name = "Damtype.findByName", query = "SELECT d FROM Damtype d WHERE d.name = :name")})
public class Damtype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;

    public Damtype() {
    }

    public Damtype(int Id) {
        this.id = Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Damtype)) {
            return false;
        }
        Damtype other = (Damtype) object;
        if ((this.id == 0 && other.id != 0) || (this.id != 0 && !(this.id == other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dndapp.Damtype[ id=" + id + " ]";
    }
    
}
