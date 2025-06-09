package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library =  applicationContext.getBean("library", Library.class);
        Book book = applicationContext.getBean("book", Book.class);
        library.getBook(book);

    }
}
