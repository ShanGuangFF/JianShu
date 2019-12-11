package com.xupt.ff.JianShu.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * @author cc_ff
 * @creat 2019-12-2019/12/11-18:35
 */
@Component("insertException")
@Aspect
public class insertException {

    @Pointcut("execution(* com.xupt.ff.JianShu.service.*.*(..))")
    private void pt1(){}

    @Pointcut()

    @Around("pt1()")
    public Object aroundPringLog(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            Object[] args = pjp.getArgs();
            rtValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）
            return rtValue;
        }catch (Throwable t){
            return "一定是你错了，不是我错了";
        }finally {

        }
    }
}
