package com.example.waa_playground;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class RepoCache {

    private Map<String, Object> cache = new HashMap<>();

    @Pointcut("@annotation(com.example.waa_playground.Cachable)")
    void cachePointCut() { }

    @Around("cachePointCut()")
    Object performCaching(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String cacheKey = proceedingJoinPoint.toLongString();

        Object value = cache.get(cacheKey);
        if (value != null) {
            System.out.println("Found in the cache returning");
            return value;
        }

        value = proceedingJoinPoint.proceed();
        cache.put(cacheKey, value);
        return value;
    }





}
