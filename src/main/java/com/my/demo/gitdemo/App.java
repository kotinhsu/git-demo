package com.my.demo.gitdemo;

import com.my.demo.gitdemo.service.MainService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Every One and " + new MainService().sayHi("someone") );
    }
}
