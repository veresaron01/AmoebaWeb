package com.webproject.service;

import com.webproject.domain.GameTable;
import com.webproject.domain.Player;
import com.webproject.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlayerService {

    private PlayerRepository playerRepository;
    private GameService gameService;

    @Autowired
    public PlayerService(PlayerRepository playerRepository, GameService gameService) {
        this.playerRepository = playerRepository;
        this.gameService = gameService;
    }

    public boolean isPlayersGame(String username, Long id) {
        GameTable gameTable = gameService.getGameTable(id);
        Player player = playerRepository.findByUsername(username);
        if (gameTable.getPlayer1().getId() == player.getId() || gameTable.getPlayer2().getId() == player.getId()) {
            return true;
        }
        return false;
    }
}
