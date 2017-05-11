package com.project.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Loggin {
    
    @Before("execution(public User)")
    public void afterGetter(){
	System.out.println("aspect");
    }
}
