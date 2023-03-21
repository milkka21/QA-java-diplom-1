package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class BunTest {
    private final String bunName;
    private final float bunPrice;
    public BunTest (String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }
    @Parameterized.Parameters
    public static Object[][] getBun() {
        return new Object[][] {
                {"Булочка из материкового хребта", 984},
                { "Булочка для самых маленьких", 120},
        };
    }

    @Test
    public void getBunNameAndPrice() {
        Bun bun = new Bun(bunName, bunPrice);
        Assert.assertEquals(bunName, bun.getName());
        Assert.assertEquals(bunPrice, bun.getPrice(), 0.001);
    }
}