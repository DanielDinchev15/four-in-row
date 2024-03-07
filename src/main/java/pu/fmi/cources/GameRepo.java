package pu.fmi.cources;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

//@Repository
public class GameRepo {
    private Logger LOG = LoggerFactory.getLogger(GameRepo.class);
    private Map<UUID, Game> games = new ConcurrentHashMap<>();

    public void save(Game game){
        games.put(game.getGameId(), game);
    }

    public Game get(UUID gameId){
       return games.get(gameId);
    }

    public void delete(Game game){
        games.remove(game.getGameId());
    }
    @PreDestroy
    public void destroy() {
        games.clear();
        LOG.info("GameRepo pre destroy");
    }

    @PostConstruct
    public void init()
    {
        LOG.info("GameRepo post construct");
    }
}
