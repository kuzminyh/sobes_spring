import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

@Bean(name = "myPet")
public Dog getDog() {
        Dog dog = new Dog();
        return dog;

}

    @Bean(name = "myPerson")
    public Person getPerson(Pet pet) {
        Person person = new Person(pet);
//        dog.say();
        return person;

    }



    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}