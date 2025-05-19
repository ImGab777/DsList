package com.gab.estudo.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String title;
    @Column (name = "game_year")
    private Integer yaer;
    private String genre;
    private String platform;
    private String shortDescriptions;
    private String longDescription;

    public Game() {
    }

    public Game(long id, String title, Integer yaer, String genre, String platform, String shortDescriptions, String longDescription) {
        this.id = id;
        this.title = title;
        this.yaer = yaer;
        this.genre = genre;
        this.platform = platform;
        this.shortDescriptions = shortDescriptions;
        this.longDescription = longDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYaer() {
        return yaer;
    }

    public void setYaer(Integer yaer) {
        this.yaer = yaer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getShortDescriptions() {
        return shortDescriptions;
    }

    public void setShortDescriptions(String shortDescriptions) {
        this.shortDescriptions = shortDescriptions;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
