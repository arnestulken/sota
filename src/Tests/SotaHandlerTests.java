import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sota.SotaHandler;

import java.awt.*;

public class SotaHandlerTests {

    private SotaHandler sHandler;

    @Before
    public void setup() {
        sHandler = new SotaHandler(new Point(0, 0), System.getProperty("user.dir") + "\\testMap.txt");
    }

    @Test
    public void playerMovesRight() {
        //Given/When/Then
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 82)));

        sHandler.controlMovement(true, false, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 83)));

        sHandler.controlMovement(true, false, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 84)));
    }

    @Test
    public void playerMovesLeft() {
        //Given/When/Then
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 82)));

        sHandler.controlMovement(false, true, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 81)));

        sHandler.controlMovement(false, true, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 80)));
    }

    @Test
    public void playerJump() {
        //Given/When/Then
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 82)));

        sHandler.controlMovement(false, false, true, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 82)));

        sHandler.controlMovement(false, false, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(16, 82)));

        sHandler.controlMovement(false, false, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(15, 82)));

        sHandler.controlMovement(false, false, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(15, 82)));

        sHandler.controlMovement(false, false, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(16, 82)));

        sHandler.controlMovement(false, false, false, false);
        Assert.assertThat(sHandler.position, CoreMatchers.is(new Point(17, 82)));
    }
}