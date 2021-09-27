package com.webproject.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "game_table")
public class GameTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dimensionX;
    private Integer dimensionY;

    @OneToOne
    private Player player1;

    @OneToOne
    private Player player2;

    @OneToMany//(mappedBy = "gameTable")
    private List<Point> steps;

    private Boolean isGameEnded;

    private Boolean isFirstPlayerWin;

    private Boolean isSecondPlayerWin;

    public GameTable() {
    }

    public Boolean getGameEnded() {
        return isGameEnded;
    }

    public void setGameEnded(Boolean gameEnded) {
        isGameEnded = gameEnded;
    }

    public Boolean getFirstPlayerWin() {
        return isFirstPlayerWin;
    }

    public void setFirstPlayerWin(Boolean firstPlayerWin) {
        isFirstPlayerWin = firstPlayerWin;
    }

    public Boolean getSecondPlayerWin() {
        return isSecondPlayerWin;
    }

    public void setSecondPlayerWin(Boolean secondPlayerWin) {
        isSecondPlayerWin = secondPlayerWin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(Integer dimensionX) {
        this.dimensionX = dimensionX;
    }

    public Integer getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(Integer dimensionY) {
        this.dimensionY = dimensionY;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public List<Point> getSteps() {
        return steps;
    }

    public void setSteps(List<Point> steps) {
        this.steps = steps;
    }
}
