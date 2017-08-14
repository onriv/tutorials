package com.baeldung;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by shanghechen on 2017/8/14.
 */
@Aspect
@Component
public class SkippedAspect {

    @Around("@annotation(Skipped)")
    public Object skippedMethod(ProceedingJoinPoint joinPoint) {
        System.out.println("test");
        // skipped the joint point
        return null;
    }

}
