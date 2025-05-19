package com.gab.estudo.dslist.dto;

import com.gab.estudo.dslist.entities.Game;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer yaer;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        yaer = entity.getYaer();
        shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYaer() {
        return yaer;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
