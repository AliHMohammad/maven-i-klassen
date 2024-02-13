package dat3.players.repository;

import dat3.players.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PlayerRepositoryTest {

    @Autowired
    PlayerRepository playerRepository;

    @BeforeEach
    void setUp() {
        playerRepository.save(new Player("Ali Mohammad", "Denmark", "Offence"));
        playerRepository.save(new Player("Chris Olande", "Argentina", "Middle"));
        playerRepository.save(new Player("Brian Skov", "Germany", "Offence"));
    }


    @Test
    public void testAllPlayers() {
        assertEquals(3, playerRepository.count());
    }

    @Test
    public void testAddPlayer() {
        Player player = new Player("xx", "yy", "zz");
        playerRepository.save(player);

        assertTrue(player.getId()>0);
        assertEquals(3, playerRepository.count());
    }


    public void alwaysFail() {
        assertTrue(false);
    }

}

