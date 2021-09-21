package com.webproject.domain;

import java.util.List;

public class GameTable {

    private Long id;

    private Integer dimensionX;
    private Integer dimensionY;

    private Player player1;
    private Player player2;

    private Player winner;

    private List<Point> steps;

}
