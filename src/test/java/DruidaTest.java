import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DruidaTest {
    @Test
    void deveRetornarDruidaDeVoo(){
        Druida druida = new Druida();
        druida.setMetamorfose("Coruja");
        assertEquals("Viajar pelo céu", druida.getSituacao());
    }

    @Test
    void deveRetornarDruidaParaBater(){
        Druida druida = new Druida();
        druida.setMetamorfose("Gato");
        assertEquals("Gato", druida.getMetamorfose());
    }

}
