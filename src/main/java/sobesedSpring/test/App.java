package sobesedSpring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        person.callYourPet();
//        person.setAge(10);
//        person.setSurName("serg");
        System.out.println(person.getAge());
        System.out.println(person.getSurName());
//        Cat mycat = applicationContext.getBean("cat", Cat.class);
//        mycat.say();

//        ApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//        HelloWorld bean =
//                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());
    }
}