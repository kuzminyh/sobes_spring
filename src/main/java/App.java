import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
//        Pet pet =  (Pet) applicationContext.getBean("myPet", Pet.class);
//        pet.say();
        Person person = (Person) applicationContext.getBean("myPerson");
        person.callYourPet();


//        ApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//        HelloWorld bean =
//                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());
    }
}