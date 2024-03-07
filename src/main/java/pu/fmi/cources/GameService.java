package pu.fmi.cources;

import java.util.UUID;

public interface GameService {
    Game startNewGame();

    //Homework TO DO makeMove update board i proverka na borda
    void makeMove(Move move);

    Game getGame(UUID gameId);


}
