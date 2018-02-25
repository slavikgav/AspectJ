package com.aspectexample.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class CustomAspect {

	@Before("execution(* com.aspectexample.codder.Codder.createRepository(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("before method " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.aspectexample.codder.Codder.createRepository(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("after method " + joinPoint.getSignature().getName() +"\n");
	}

	public void logAfterReturning(JoinPoint joinPoint, String repositoryName) {
		System.out.println("afterReturning of method: " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + repositoryName + "\n");
	}

 	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("logAfterThrowing()  : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
	}
	
	
	@Around("execution(* com.aspectexample.codder.Codder.createRepositoryAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("running around method of " + joinPoint.getSignature().getName() + " with arguments: " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");
	}
	
}