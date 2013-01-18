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
public class KruskalTest {

    public KruskalTest() {
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
        Kruskal kruskal = new Kruskal();
        Verkko ViritettyPuuKruskal;
        Verkko ViritettyPuuVastaus = new Verkko(5);
        ViritettyPuuVastaus.lisaaKaari(1, 4, 1);
        ViritettyPuuVastaus.lisaaKaari(1, 3, 1);

        ViritettyPuuVastaus.lisaaKaari(2, 3, 2);
        ViritettyPuuVastaus.lisaaKaari(0, 3, 4);



        ViritettyPuuKruskal = kruskal.virita(testiverkko);
        ViritettyPuuKruskal.toString();
        ViritettyPuuVastaus.toString();



        for (int i = 0; i < ViritettyPuuVastaus.getVieruslista().length; i++) {
            for (int j = 0; j < ViritettyPuuVastaus.getVieruslista()[i].length; j++) {
                if (ViritettyPuuVastaus.getVieruslista()[i][j] != null) {
                    assertTrue(ViritettyPuuVastaus.getVieruslista()[i][j].getKaaripaino()
                            == ViritettyPuuKruskal.getVieruslista()[i][j].getKaaripaino());
                    assertTrue(ViritettyPuuVastaus.getVieruslista()[i][j].getSolmunNumero()
                            == ViritettyPuuKruskal.getVieruslista()[i][j].getSolmunNumero());
                }


            }


        }
    }

    @Test
    public void testiTyhjalla() {
        Verkko testiverkko = new Verkko(3);
        Kruskal kruskal = new Kruskal();
        Verkko ViritettyPuuKruskal;
        Verkko ViritettyPuuVastaus = new Verkko(3);

        testiverkko.lisaaKaari(0, 0, 0);
        testiverkko.lisaaKaari(1, 1, 0);
        testiverkko.lisaaKaari(2, 2, 0);

        ViritettyPuuKruskal = kruskal.virita(testiverkko);

        for (int i = 0; i < ViritettyPuuVastaus.getVieruslista().length; i++) {
            for (int j = 0; j < ViritettyPuuVastaus.getVieruslista()[i].length; j++) {
                if (ViritettyPuuVastaus.getVieruslista()[i][j] != null) {
                    assertTrue(ViritettyPuuVastaus.getVieruslista()[i][j].getKaaripaino()
                            == ViritettyPuuKruskal.getVieruslista()[i][j].getKaaripaino());
                    assertTrue(ViritettyPuuVastaus.getVieruslista()[i][j].getSolmunNumero()
                            == ViritettyPuuKruskal.getVieruslista()[i][j].getSolmunNumero());
                }


            }


        }


    }

    @Test
    public void testiPienella() {
        Verkko testiverkko = new Verkko(3);
        Kruskal kruskal = new Kruskal();
        Verkko testiKruskal;
        Verkko haluttuKruskal = new Verkko(3);

        testiverkko.lisaaKaari(0, 1, 1);
        testiverkko.lisaaKaari(1, 2, 2);
        testiverkko.lisaaKaari(2, 0, 1);

        testiKruskal = kruskal.virita(testiverkko);
        haluttuKruskal.lisaaKaari(0, 1, 1);
        haluttuKruskal.lisaaKaari(0, 2, 1);

        for (int i = 0; i < haluttuKruskal.getVieruslista().length; i++) {
            for (int j = 0; j < haluttuKruskal.getVieruslista()[i].length; j++) {
                if (haluttuKruskal.getVieruslista()[i][j] != null) {
                    assertTrue(haluttuKruskal.getVieruslista()[i][j].getKaaripaino()
                            == testiKruskal.getVieruslista()[i][j].getKaaripaino());
                    assertTrue(haluttuKruskal.getVieruslista()[i][j].getSolmunNumero()
                            == testiKruskal.getVieruslista()[i][j].getSolmunNumero());
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
