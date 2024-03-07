package pu.fmi.cources;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameServiceImplTest {

    @Test
   void testStartNewGame() {
        var gameRepo = new GameRepo();
        var gameService = new GameServiceImpl(gameRepo);
        var game = gameService.startNewGame();


        assertNotNull(game);
        assertNotNull(game.getGameId());
        var storedGame = gameRepo.get(game.getGameId());
        assertEquals(game.getGameId(), storedGame.getGameId());
    }
}
