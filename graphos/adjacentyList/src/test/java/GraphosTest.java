import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GraphosTest{

    @Test
    public void testGrafoConexo(){
        AdjacentyListIntGraph grafito = new AdjacentyListIntGraph(6);
        grafito.addEdgeDirigido(0, 3);
        grafito.addEdgeDirigido(0, 5);
        grafito.addEdgeDirigido(1, 4);
        grafito.addEdgeDirigido(2, 0);
        grafito.addEdgeDirigido(2, 5);
        grafito.addEdgeDirigido(3, 1);
        grafito.addEdgeDirigido(4, 2);
        grafito.addEdgeDirigido(5, 4);
        DephtFirstSearch control = new DephtFirstSearch(grafito, 0);
        control.isConexoDebil(grafito);
        assertTrue(control.isConexoDebil(grafito));
        //control.isConexoFuerte(grafito);
        assertFalse(control.isConexoFuerte(grafito));
    }
}