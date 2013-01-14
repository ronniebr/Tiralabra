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
public class MinimikekoTest {

    public MinimikekoTest() {
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
    public void kekoehtoTest() {
        Minimikeko testikeko = new Minimikeko(4);
        testikeko.heapInsert(0, 6);
        testikeko.heapInsert(1, 2);
        testikeko.heapInsert(2, 1);
        testikeko.heapInsert(3, 8);

        assertTrue(testikeko.heapDelMin() == 2);
        assertTrue(testikeko.heapDelMin() == 1);
        assertTrue(testikeko.heapDelMin() == 0);
        assertTrue(testikeko.heapDelMin() == 3);



    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
