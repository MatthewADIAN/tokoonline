/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tokoonline.Frameworktest.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matthew
 */
@Entity
@Table(name = "roti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roti.findAll", query = "SELECT r FROM Roti r")
    , @NamedQuery(name = "Roti.findById", query = "SELECT r FROM Roti r WHERE r.id = :id")
    , @NamedQuery(name = "Roti.findByJenisRoti", query = "SELECT r FROM Roti r WHERE r.jenisRoti = :jenisRoti")
    , @NamedQuery(name = "Roti.findByHarga", query = "SELECT r FROM Roti r WHERE r.harga = :harga")
    , @NamedQuery(name = "Roti.findByStok", query = "SELECT r FROM Roti r WHERE r.stok = :stok")})
public class Roti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "jenis_roti")
    private String jenisRoti;
    @Basic(optional = false)
    @Column(name = "harga")
    private int harga;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public Roti() {
    }

    public Roti(String id) {
        this.id = id;
    }

    public Roti(String id, String jenisRoti, int harga, int stok) {
        this.id = id;
        this.jenisRoti = jenisRoti;
        this.harga = harga;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJenisRoti() {
        return jenisRoti;
    }

    public void setJenisRoti(String jenisRoti) {
        this.jenisRoti = jenisRoti;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roti)) {
            return false;
        }
        Roti other = (Roti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tokoonline.Frameworktest.entities.Roti[ id=" + id + " ]";
    }
    
}
