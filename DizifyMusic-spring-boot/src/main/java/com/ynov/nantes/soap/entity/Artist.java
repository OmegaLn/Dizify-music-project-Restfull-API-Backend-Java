package com.ynov.nantes.soap.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Entité Auteur persistente en base de données.
 * 
 * @author Matthieu BACHELIER
 * @since 2020-10
 * @version 1.0
 */
@Entity
@Table(name = "artist")

public class Artist {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column (name = "alias")
    private String alias;
    
    @Column (name = "avatar")
    private String avatar;
    
    @Column (name = "annee")
    private int annee;

    @JsonInclude()
    @Transient
    private List<Title> listTitles;
    
    @JsonInclude()
    @Transient
    private List<Album> listAlbums;
    
    @JsonInclude()
    @Transient
    private boolean favoris = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public boolean isFavoris() {
        return favoris;
    }

    public void setFavoris(boolean favoris) {
        this.favoris = favoris;
    }

    public List<Title> getListTitles() {
        return listTitles;
    }

    public void setListTitles(List<Title> listTitles) {
        this.listTitles = listTitles;
    }

    public List<Album> getListAlbums() {
        return listAlbums;
    }

    public void setListAlbums(List<Album> listAlbums) {
        this.listAlbums = listAlbums;
    }


    
}
