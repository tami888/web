import org.junit.Test;
import sample.gradle.GradleMain;

import static org.junit.Assert.assertEquals;
public class test{
    @Test
    public void testAdd() {
        assertEquals(3, GradleMain.add(1, 2));
    }
}