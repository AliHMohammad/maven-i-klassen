package dat3.players.api;

import dat3.players.entity.Player;
import dat3.players.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    PlayerRepository playerRepository;
    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    @GetMapping
    List<Player> getPlayers() {
        return  playerRepository.findAll();
    }
}

