package com.example.demo.aspct;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspct {

    /**
     * コントローラークラスのログ出力用アスペクト.
     */
    @Before("execution(* *..*.*Controller.*(..))")
    public void startLog(JoinPoint jp) throws Throwable {

        System.out.println("メソッド開始: " + jp.getSignature());
    }

    @After("execution(* *..*.*Controller.*(..))")
    public void endLog(JoinPoint jp) {
    	System.out.println("メソッド終了:" + jp.getSignature());
    }
    /**
     * Daoクラスのログ出力用アスペクト.
     */
    @Around("execution(* *..*.*UserDao*.*(..))")
    public Object daoLog(ProceedingJoinPoint jp) throws Throwable {

        System.out.println("メソッド開始： " + jp.getSignature());

        try {

            Object result = jp.proceed();

            System.out.println("メソッド終了： " + jp.getSignature());

            return result;

        } catch (Exception e) {
            System.out.println("メソッド異常終了： " + jp.getSignature());
            e.printStackTrace();
            throw e;
        }
    }

}
