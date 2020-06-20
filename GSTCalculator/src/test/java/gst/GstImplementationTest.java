package test.java.gst;
import main.java.gst.Gst;
import main.java.gst.GstImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



@RunWith(JUnit4.class)
public class GstImplementationTest {

    Gst gst;

    public GstImplementationTest(){}

    @Before
    public void setUp(){
        gst=new GstImplementation(5);
    }
    @Test
    public void calculateTaxOnItem_itShouldReturnTaxOnAnItemWhenUnitPriceIsProvided(){
        double actualTax=gst.calculateTaxOnItem(100);
        Assert.assertEquals(5.0,actualTax,0.0);
    }

    @Test
    public void calculateTaxOnItem_itShouldReturnTaxOnAnItemWhenUnitPriceAndQuantityIsProvided(){
        double actualTax=gst.calculateTaxOnItem(100,2);
        Assert.assertEquals(10.0,actualTax,0.0);
    }
}


