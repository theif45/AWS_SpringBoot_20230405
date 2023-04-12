package com.web.study.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class TimerAop {

//	private final Logger logger = LogManager.getLogger(TimerAop.class);
	// 접근지정자 public은 생략 가능
	// ..하위의 모든 클래스 및 모든 메소드에 적용
	@Pointcut("execution(* com.web.study..*.*(..))")
	private void pointCut() {}
	
	@Pointcut("@annotation(com.web.study.aop.annotation.TimerAspect)")
	private void annotationPointCut() {}
	
	@Around("annotationPointCut()&&pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		//전처리
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object logic = joinPoint.proceed(); // proceed = 메소드 호출
		
		//후처리
		
		stopWatch.stop();
//		logger.info("로그 테스트");
		log.info("[ Time ] >>> {}.{}: {}초",
				joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName(),
				stopWatch.getTotalTimeSeconds());
//		System.out.println(joinPoint.getSignature().getDeclaringTypeName());
//		System.out.println(joinPoint.getSignature().getName());
//		System.out.println("메소드 실행 시간: " + stopWatch.getTotalTimeSeconds() + "초");
		return logic;
		
	}
}
