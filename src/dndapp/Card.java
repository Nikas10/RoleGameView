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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nikas
 */
@Entity
@Table(name = "CARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Card.findAll", query = "SELECT c FROM Card c"),
    @NamedQuery(name = "Card.findById", query = "SELECT c FROM Card c WHERE c.id = :id"),
    @NamedQuery(name = "Card.findByName", query = "SELECT c FROM Card c WHERE c.name = :name"),
    @NamedQuery(name = "Card.findBySdesc", query = "SELECT c FROM Card c WHERE c.sdesc = :sdesc"),
    @NamedQuery(name = "Card.findByLdesc", query = "SELECT c FROM Card c WHERE c.ldesc = :ldesc"),
    @NamedQuery(name = "Card.findByDtype", query = "SELECT c FROM Card c WHERE c.dtype = :dtype"),
    @NamedQuery(name = "Card.findBySource", query = "SELECT c FROM Card c WHERE c.source = :source"),
    @NamedQuery(name = "Card.findByDicemod", query = "SELECT c FROM Card c WHERE c.dicemod = :dicemod"),
    @NamedQuery(name = "Card.findByDammod", query = "SELECT c FROM Card c WHERE c.dammod = :dammod"),
    @NamedQuery(name = "Card.findByDuration", query = "SELECT c FROM Card c WHERE c.duration = :duration")})
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="sqlite")
    @TableGenerator(name="sqlite", table="sqlite_sequence",
    pkColumnName="name", valueColumnName="seq",
    pkColumnValue="CARD",
    initialValue=1, allocationSize=1)   
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SDESC")
    private String sdesc;
    @Column(name = "LDESC")
    private String ldesc;
    @Column(name = "DTYPE")
    private Integer dtype;
    @Column(name = "SOURCE")
    private Integer source;
    @Column(name = "DICEMOD")
    private Integer dicemod;
    @Column(name = "DAMMOD")
    private Integer dammod;
    @Column(name = "DURATION")
    private Integer duration;

    public Card() {
    }

    public Card(int ID) {
        this.id= ID;
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

    public String getSdesc() {
        return sdesc;
    }

    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }

    public String getLdesc() {
        return ldesc;
    }

    public void setLdesc(String ldesc) {
        this.ldesc = ldesc;
    }

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getDicemod() {
        return dicemod;
    }

    public void setDicemod(Integer dicemod) {
        this.dicemod = dicemod;
    }

    public Integer getDammod() {
        return dammod;
    }

    public void setDammod(Integer dammod) {
        this.dammod = dammod;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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
        if (!(object instanceof Card)) {
            return false;
        }
        Card other = (Card) object;
        if ((this.id == 0 && other.id != 0) || (this.id != 0 && !(this.id == other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dndapp.Card[ id=" + id + " ]";
    }
    
}
