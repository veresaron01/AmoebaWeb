package com.webproject.dto;

import com.webproject.domain.GameTable;
import com.webproject.domain.Player;
import com.webproject.domain.Point;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GameTableStatusDto {

    private Long id;
    private Integer dimensionX;
    private Integer dimensionY;
    private PlayerDtoForGameTable player1;
    private PlayerDtoForGameTable player2;
    private List<PointDto> steps;
    private Boolean isGameEnded;
    private Boolean isFirstPlayerWin;
    private Boolean isSecondPlayerWin;

    public GameTableStatusDto(GameTable gameTable) {
        this.id = gameTable.getId();
        this.dimensionX = gameTable.getDimensionX();
        this.dimensionY = gameTable.getDimensionY();
        this.player1 = new PlayerDtoForGameTable(gameTable.getPlayer1());
        this.player2 = new PlayerDtoForGameTable(gameTable.getPlayer2());
        this.steps = gameTable.getSteps().stream().map((Point point) -> new PointDto(point)).collect(Collectors.toList());
        this.isGameEnded = gameTable.getGameEnded();
        this.isFirstPlayerWin = gameTable.getFirstPlayerWin();
        this.isSecondPlayerWin = gameTable.getSecondPlayerWin();
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

    public PlayerDtoForGameTable getPlayer1() {
        return player1;
    }

    public void setPlayer1(PlayerDtoForGameTable player1) {
        this.player1 = player1;
    }

    public PlayerDtoForGameTable getPlayer2() {
        return player2;
    }

    public void setPlayer2(PlayerDtoForGameTable player2) {
        this.player2 = player2;
    }

    public List<PointDto> getSteps() {
        return steps;
    }

    public void setSteps(List<PointDto> steps) {
        this.steps = steps;
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
}
