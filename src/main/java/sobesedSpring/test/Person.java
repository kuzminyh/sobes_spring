package sobesedSpring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person {
    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.surName}")
    private String surName;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person created");
//        this.pet = pet;
//    }

    public Pet getPet() {
        return pet;
    }

    public void callYourPet() {
        System.out.println("Calling your pet");
        pet.say();
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }


//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("person  created set pet");
        this.pet = pet;
    }

//    @Autowired
    public Person(Pet pet) {
        System.out.println("person created with default constructor");
    }
}
