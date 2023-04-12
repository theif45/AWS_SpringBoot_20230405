package com.web.study.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 표기용
@Retention(RetentionPolicy.RUNTIME) // 해당 메소드가 실행되면 실행하라고 지정하는 어노테이션
@Target({ElementType.METHOD}) // 중괄호를 사용한 이유는 여러가지 Type을 쉼표로 적용 가능
public @interface TimerAspect {

}
