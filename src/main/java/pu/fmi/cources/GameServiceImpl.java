package pu.fmi.cources;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Primary
@Component
public class GameServiceImpl implements  GameService{

    private GameRepo gameRepo;

    public GameServiceImpl(GameRepo gameRepo){
        this.gameRepo = gameRepo;
    }
    @Override
    public Game startNewGame() {
        Game game = new Game();
        gameRepo.save(game);
        return game;
    }

    @Override
    public void makeMove(Move move) {

    }

    @Override
    public Game getGame(UUID gameId) {
        return null;
    }
}
