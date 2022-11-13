import org.example.TriangleDetector;
import org.junit.Assert;
import org.junit.Test;

public class TriangleDetectorTest {

    @Test
    public void Test1(){
        TriangleDetector detector = new TriangleDetector();
        double a = 10.0;
        double b = 4.0;
        double c = 5.0;
        boolean waitedResult = false;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test2(){
        TriangleDetector detector = new TriangleDetector();
        double a = 10.0;
        double b = 4.0;
        double c = 7.0;
        boolean waitedResult = true;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test3(){
        TriangleDetector detector = new TriangleDetector();
        double a = 100.0;
        double b = 1.0;
        double c = 1.0;
        boolean waitedResult = false;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test4(){
        TriangleDetector detector = new TriangleDetector();
        double a = 4;
        double b = 3;
        double c = 5;
        boolean waitedResult = true;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test5(){
        TriangleDetector detector = new TriangleDetector();
        double a = 16.4;
        double b = 21.8;
        double c = 9.99;
        boolean waitedResult = true;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test6(){
        TriangleDetector detector = new TriangleDetector();
        double a = -196.4;
        double b = -211.8;
        double c = 1009.99;
        boolean waitedResult = false;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test7(){
        TriangleDetector detector = new TriangleDetector();
        double a = 1;
        double b = 1;
        double c = 1;
        boolean waitedResult = true;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test8(){
        TriangleDetector detector = new TriangleDetector();
        double a = 0;
        double b = 0;
        double c = 0;
        boolean waitedResult = false;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test9(){
        TriangleDetector detector = new TriangleDetector();
        double a = 31;
        double b = 31;
        double c = 31;
        boolean waitedResult = true;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test10(){
        TriangleDetector detector = new TriangleDetector();
        double a = 6;
        double b = 8;
        double c = 10;
        boolean waitedResult = true;
        Assert.assertEquals(detector.isExists(a, b, c), waitedResult);
    }
}
