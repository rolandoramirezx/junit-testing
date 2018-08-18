import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

public class ExecutionProcedure {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This line executes once, in the beginning.");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This line executes once, after class has been called ");
    }

    @Before
    public void before(){
        System.out.println("Executes once, before JUNIT test.");
    }

    @After
    public void after(){
        System.out.println("Executes once, after JUnit test.");
    }

    @Test
    public void testCase1() {
        System.out.println("Executes during test, 1 of 2.");
    }

    @Test
    public void testCase2() {
        System.out.println("Executes during test, 2 of 2");
    }
}
