import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticClass.class)
@SuppressStaticInitializationFor("StaticClass")
public class StaticClassJunitTest {
    @Test
    public void test() {
        mockStatic(StaticClass.class);
        new StaticClass();
    }

}
