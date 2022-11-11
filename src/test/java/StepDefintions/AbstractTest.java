package StepDefintions;

import base.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class AbstractTest {

    static BaseClass baseClass = new BaseClass();

    @BeforeClass
    static public void baseTest() {
        baseClass.setUp();
    }

    @AfterClass
    static public void dropDriver(){baseClass.tearDown();}
}
