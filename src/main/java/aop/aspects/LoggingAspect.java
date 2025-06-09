package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public void aop.Library.getBook(..))")
    public void beforeGetBook(JoinPoint joinPoint) {
        System.out.println("Попытка получить книгу");
    }
}
