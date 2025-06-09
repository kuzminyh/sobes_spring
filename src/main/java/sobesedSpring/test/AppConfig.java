package sobesedSpring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("sobesedSpring.test")
@PropertySource("classpath:myApp.properties")
public class AppConfig {



//@Bean(name = "pet")
//public Dog getDog() {
//        Dog dog = new Dog();
//        return dog;
//}

    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        Person person = new Person(catBean());
        return person;
    }



    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}