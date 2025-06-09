package sobesedSpring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Pet cat = (Pet) applicationContext.getBean("catBean");
        cat.say();



//        Dog dog1 = (Dog) applicationContext.getBean("dog");
//        Dog dog2 = (Dog) applicationContext.getBean("dog");
//        System.out.println(dog1);
//        System.out.println(dog2);

//                        AnnotationConfigApplicationContext(AppConfig.class);
//        Pet pet =  (Pet) applicationContext.getBean("myPet", Pet.class);
//        pet.say();
        Person person = (Person) applicationContext.getBean("personBean");
        person.callYourPet();
//        person.setAge(10);
//        person.setSurName("serg");
        System.out.println(person.getAge());
        System.out.println(person.getSurName());
    }
}
