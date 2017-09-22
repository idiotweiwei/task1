package com.idiot.junit;

import static org.junit.Assert.*;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.*;
import java.util.*;



public class AnnotationsTest {

    private ArrayList testList;

    @BeforeClass
    public static void onceExecutedBeforeAll(){
        System.out.println("@BeforeClass:onceExecutedBeforeAll");
    }

    @Before
    public void executedBeforeEach(){
        testList = new ArrayList();
        System.out.println("@Before:executedBeforeEach");
    }

    @AfterClass
    public static void onceExecutedAfterALL(){
        System.out.println("@AfterClass:onceExecutedAfterALL");
    }

    @After
    public void executedAfterEach(){
        testList.clear();
        System.out.println("@After:executedAfterEach");
    }

    @Test
    public void EmptyCollection(){
        assertTure(testList.isEmpty());
        System.out.println("@Test:EmptyArrayList");
    }

    private void assertTure(boolean empty) {
    }


    @Test
    public void OneItemCollection(){
        testList.add("oneItem");
        assertEquals(1,testList.size());
        System.out.println("@Test:OneItemArrayList");
    }

    @Ignore
    public void excutionIgnored(){
        System.out.println("@Ignore:This execution is ignored");
    }

}
