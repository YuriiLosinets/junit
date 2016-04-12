package com.test;

import org.junit.*;



/**
 * Created by CMI-USER on 3/28/2016.
 */
public class MathTest {

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Test
    public void test1() {
        System.out.println("test1");
        int res = Math.div(6, 3);

        Assert.assertEquals(2, res);
    }

    @Test
    public void test2() {
        System.out.println("test2");
        int res = Math.div(8, 2);

        Assert.assertEquals(4, res);
    }

    @Test(expected = ZeroException.class)
    public void testZero() {
        System.out.println("testZero");
        Math.div(8, 0);
    }
}
