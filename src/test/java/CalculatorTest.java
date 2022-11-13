import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void Plus_1And1Is2Test(){
        double a = 1.0;
        double b = 1.0;
        char operation = '+';
        double waitedResult = 2.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Plus_324And400Is724Test(){
        double a = 324.0;
        double b = 400.0;
        char operation = '+';
        double waitedResult = 724.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Minus_1And1Is0Test(){
        double a = 1.0;
        double b = 1.0;
        char operation = '-';
        double waitedResult = 0.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Minus_11AndMinus11Is22Test(){
        double a = 11.0;
        double b = -11.0;
        char operation = '-';
        double waitedResult = 22.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Multiply_12And10Is120Test(){
        double a = 12.0;
        double b = 10.0;
        char operation = '*';
        double waitedResult = 120.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Multuply_75And11Is825Test(){
        double a = 75.0;
        double b = 11.0;
        char operation = '*';
        double waitedResult = 825.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Divide_12and10Is1point2Test(){
        double a = 12.0;
        double b = 10.0;
        char operation = '/';
        double waitedResult = 1.2;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Divide_100And5Is20Test(){
        double a = 100.0;
        double b = 5.0;
        char operation = '/';
        double waitedResult = 20;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Mod_11And7Is4Test(){
        double a = 11.0;
        double b = 7.0;
        char operation = '%';
        double waitedResult = 4.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Mod_999And100Is99Test(){
        double a = 999.0;
        double b = 100.0;
        char operation = '%';
        double waitedResult = 99.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void InvalidOperationTest(){
        double a = 14;
        double b = 77;
        char operation = '@';
        double waitedResult = 0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult,0);
    }
}
