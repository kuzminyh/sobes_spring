package sobesedSpring.test;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Myu Myu");
    }

    public Cat() {
        System.out.println("Cat bean is created");
    }
}
