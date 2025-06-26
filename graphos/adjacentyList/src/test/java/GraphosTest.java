import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GraphosTest{

    @Test
    public void testGrafoConexo(){
        AdjacentyListIntGraph grafito = new AdjacentyListIntGraph(4);
        grafito.addEdgeDirigido(0, 1);
        grafito.addEdgeDirigido(2, 1);
        grafito.addEdgeDirigido(3, 2);
        grafito.addEdgeDirigido(0, 3);
       // DephtFirstSearch control = new DephtFirstSearch(grafito, 0);
        //control.isConexo(grafito);
        grafito.main(null);
    }
}