package com.webproject.service;

import com.webproject.domain.GameTable;
import com.webproject.dto.GameTableStatusDto;
import com.webproject.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class GameService {

    private GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public GameTableStatusDto getGameStatus(Long id) {
        Optional<GameTable> gameTable = gameRepository.findById(id);
        GameTableStatusDto gameTableStatusDto = null;
        if (gameTable.isPresent()) {
            gameTableStatusDto = new GameTableStatusDto(gameTable.get());
        }
        return gameTableStatusDto;
    }

    public GameTable getGameTable(Long id) {
        Optional<GameTable> gameTable = gameRepository.findById(id);
        if (gameTable.isPresent()) {
            return gameTable.get();
        } else {
            return null;
        }
    }
}
