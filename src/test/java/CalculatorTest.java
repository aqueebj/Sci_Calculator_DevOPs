import static org.junit.Assert.*;

import org.iiitb.Calculator.*;
import org.junit.*;

public class CalculatorTest {

    public Factorial factorial=new Factorial();
    public NLog nLog=new NLog();
    public Power power=new Power();
    public Sqroot sqroot=new Sqroot();

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before Class");
    }
    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @Test
    public void testFact() {
        System.out.println("Factorial Test");
        int a = 4;
        int fact = 24;
        int result =factorial.Fact(a); ;
        Assert.assertEquals(fact, result, 0);
    }
    @Test
    public void testNlog() {
        System.out.println("Nlog Test");
        double a = 1;
        double ln =0;
        double result =nLog.Log(a);
        Assert.assertEquals(ln, result, 0);
    }
    @Test
    public void testPower() {
        System.out.println("Power Test");
        double a =2;
        double b =3;
        double pow=8;
        double result =power.power(a,b);
        Assert.assertEquals(pow, result, 0);
    }
    @Test
    public void testSqroot() {
        System.out.println("Square Root Test");
        double a =4;
        double sr=2;
        double result =sqroot.Sroot(a);
        Assert.assertEquals(sr, result, 0);
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("After Class");
    }

}
