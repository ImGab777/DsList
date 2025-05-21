package com.gab.estudo.dslist.projections;

import com.gab.estudo.dslist.entities.Game;

import java.awt.*;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    String getPosition();

}
