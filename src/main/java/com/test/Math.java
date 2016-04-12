package com.test;

/**
 * Created by CMI-USER on 3/28/2016.
 */
public class Math {

    public static int div(int a, int b) throws ZeroException{
        if (b == 0)
            throw  new ZeroException();
        return a/b;
    }

}
