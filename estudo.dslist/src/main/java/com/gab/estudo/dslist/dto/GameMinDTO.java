package com.gab.estudo.dslist.dto;

import com.gab.estudo.dslist.entities.Game;
import com.gab.estudo.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYaer();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        shortDescription = projection.getShortDescription();
    }
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
