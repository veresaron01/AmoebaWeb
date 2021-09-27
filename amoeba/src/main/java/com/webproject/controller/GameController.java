package com.webproject.controller;

import com.webproject.dto.GameTableStatusDto;
import com.webproject.service.GameService;
import com.webproject.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameService gameService;
    private PlayerService playerService;

    @Autowired
    public GameController(GameService gameService, PlayerService playerService) {
        this.gameService = gameService;
        this.playerService = playerService;
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<GameTableStatusDto> getGameStatus(@PathVariable String gameId) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails user = (UserDetails) authentication.getPrincipal();

        Long id = Long.valueOf(gameId);
        GameTableStatusDto gameTableStatusDto = gameService.getGameStatus(id);

        if (playerService.isPlayersGame(user.getUsername(), gameTableStatusDto.getId())) {

            if (gameTableStatusDto != null) {
                return new ResponseEntity(gameTableStatusDto, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/{gameId}")
    public ResponseEntity playerTakeAStep() {
        //TODO
        return null;
    }

    private boolean isPlayerAuthorized() {
        //TODO
        return false;
    }

}
