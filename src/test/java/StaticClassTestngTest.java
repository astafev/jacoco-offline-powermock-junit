import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.Test;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

@SuppressStaticInitializationFor("StaticClass")
public class StaticClassTestngTest extends PowerMockTestCase {

    @Test
    public void test() {
        mockStatic(StaticClass.class);
        new StaticClass();
    }
}
