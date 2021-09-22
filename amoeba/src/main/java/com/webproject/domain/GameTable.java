package com.webproject.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "game_table")
public class GameTable {

    private Long id;

    private Integer dimensionX;
    private Integer dimensionY;

    private Player player1;
    private Player player2;

    private Player winner;

    private List<Point> steps;



    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
