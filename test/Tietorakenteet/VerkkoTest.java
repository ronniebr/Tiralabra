/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tietorakenteet;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ronnie
 */
public class VerkkoTest {

    public VerkkoTest() {
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
    public void kaarenLisays1() {
        Verkko testiverkko = new Verkko(2);
        testiverkko.lisaaKaari(0, 1, 4);

        assertTrue(testiverkko.getVieruslista()[0][0].getSolmunNumero() == 1);
        assertTrue(testiverkko.getVieruslista()[0][0].getKaaripaino() == 4);
        assertTrue(testiverkko.getVieruslista()[1][0].getSolmunNumero() == 0);
        assertTrue(testiverkko.getVieruslista()[1][0].getKaaripaino() == 4);
    }

    @Test
    public void kaarenLisays2() {
        Verkko testiverkko = new Verkko(3);
        testiverkko.lisaaKaari(0, 1, 4);
        testiverkko.lisaaKaari(0, 2, 3);

        assertTrue(testiverkko.getVieruslista()[0][0].getSolmunNumero() == 1);
        assertTrue(testiverkko.getVieruslista()[0][0].getKaaripaino() == 4);
        assertTrue(testiverkko.getVieruslista()[1][0].getSolmunNumero() == 0);
        assertTrue(testiverkko.getVieruslista()[1][0].getKaaripaino() == 4);
        
        assertTrue(testiverkko.getVieruslista()[0][1].getSolmunNumero() == 2);
        assertTrue(testiverkko.getVieruslista()[0][1].getKaaripaino() == 3);
        assertTrue(testiverkko.getVieruslista()[2][0].getSolmunNumero() == 0);
        assertTrue(testiverkko.getVieruslista()[2][0].getKaaripaino() == 3);

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
