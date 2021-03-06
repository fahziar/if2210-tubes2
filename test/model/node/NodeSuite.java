package model.node;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite to test all test case in package model.node together.
 * @author Riva Syafri Rachmatullah
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({BuildingTest.class, NodeTypeTest.class, NodeFactoryTest.class, NodeTest.class, CanteenTest.class})
public class NodeSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
