package com.devspring.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

	public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);
	
	//TypeofAdvice(returntype class-name.method(Arg) )
	// to select all methods from all classes with all kind of return types and with diff no of arguments TypeofAdvice(* *.*(..))
	@Before("execution (* com.devspring.springbootrest.service.JobService.getJob*(..)) || execution(* com.devspring.springbootrest.service.JobService.updateJob*(..))") //TypeofAdvice(Pointcut)
	public void logMethodCall(JoinPoint jp) { //(JoinPoint)
		LOGGER.info("Method Called "+jp.getSignature().getName()); //getName() Target and the method is covered inside proxy
	}
	
	
	
	@After("execution (* com.devspring.springbootrest.service.JobService.getJob*(..)) || execution(* com.devspring.springbootrest.service.JobService.updateJob*(..))")
	public void logMethodExecuted(JoinPoint jp) {
		LOGGER.info("Method Executed "+jp.getSignature().getName());
	}
	
	
	@AfterThrowing("execution (* com.devspring.springbootrest.service.JobService.getJob*(..)) || execution(* com.devspring.springbootrest.service.JobService.updateJob*(..))")
	public void logMethodCrashed(JoinPoint jp) {
		LOGGER.info("Method has some issues "+jp.getSignature().getName());
	}
	
	
	
	@AfterReturning("execution (* com.devspring.springbootrest.service.JobService.getJob*(..)) || execution(* com.devspring.springbootrest.service.JobService.updateJob*(..))")
	public void logMethodExecutedSuccess(JoinPoint jp) {
		LOGGER.info("Method Executed Successfully "+jp.getSignature().getName());
	}
}
