/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmit;

import Tietorakenteet.Verkko;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ronnie
 */
public class PrimTest {

    public PrimTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testiOletusverkolla() {
        Verkko testiverkko = new Verkko();
        Prim prim = new Prim();
        Verkko testiPrim;
        Verkko haluttuPrim = new Verkko(5);

        haluttuPrim.lisaaKaari(0, 3, 4);
        haluttuPrim.lisaaKaari(1, 3, 1);
        haluttuPrim.lisaaKaari(1, 4, 1);
        haluttuPrim.lisaaKaari(2, 3, 2);

        testiPrim = prim.virita(testiverkko, 0);

        for (int i = 0; i < haluttuPrim.getVieruslista().length; i++) {
            for (int j = 0; j < haluttuPrim.getVieruslista()[i].length; j++) {
                if (haluttuPrim.getVieruslista()[i][j] != null) {
                    assertTrue(haluttuPrim.getVieruslista()[i][j].getKaaripaino()
                            == testiPrim.getVieruslista()[i][j].getKaaripaino());
                    assertTrue(haluttuPrim.getVieruslista()[i][j].getSolmunNumero()
                            == testiPrim.getVieruslista()[i][j].getSolmunNumero());
                }


            }


        }
    }

    @Test
    public void testiTyhjalla() {
        Verkko testiverkko = new Verkko(3);
        Prim kruskal = new Prim();
        Verkko testiPrim;
        Verkko haluttuPrim = new Verkko(3);

        testiverkko.lisaaKaari(0, 0, 0);
        testiverkko.lisaaKaari(1, 1, 0);
        testiverkko.lisaaKaari(2, 2, 0);

        testiPrim = kruskal.virita(testiverkko, 0);

        for (int i = 0; i < haluttuPrim.getVieruslista().length; i++) {
            for (int j = 0; j < haluttuPrim.getVieruslista()[i].length; j++) {
                if (haluttuPrim.getVieruslista()[i][j] != null) {
                    assertTrue(haluttuPrim.getVieruslista()[i][j].getKaaripaino()
                            == testiPrim.getVieruslista()[i][j].getKaaripaino());
                    assertTrue(haluttuPrim.getVieruslista()[i][j].getSolmunNumero()
                            == testiPrim.getVieruslista()[i][j].getSolmunNumero());
                }


            }


        }


    }

    @Test
    public void testiPienella() {
        Verkko testiverkko = new Verkko(3);
        Prim kruskal = new Prim();
        Verkko testiPrim;
        Verkko haluttuPrim = new Verkko(3);

        testiverkko.lisaaKaari(0, 1, 1);
        testiverkko.lisaaKaari(1, 2, 2);
        testiverkko.lisaaKaari(2, 0, 1);

        testiPrim = kruskal.virita(testiverkko, 0);
        haluttuPrim.lisaaKaari(0, 1, 1);
        haluttuPrim.lisaaKaari(0, 2, 1);

        for (int i = 0; i < haluttuPrim.getVieruslista().length; i++) {
            for (int j = 0; j < haluttuPrim.getVieruslista()[i].length; j++) {
                if (haluttuPrim.getVieruslista()[i][j] != null) {
                    assertTrue(haluttuPrim.getVieruslista()[i][j].getKaaripaino()
                            == testiPrim.getVieruslista()[i][j].getKaaripaino());
                    assertTrue(haluttuPrim.getVieruslista()[i][j].getSolmunNumero()
                            == testiPrim.getVieruslista()[i][j].getSolmunNumero());
                }


            }


        }

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
