public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }
    public void callYourPet() {
        System.out.println("Calling your pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println();
        this.pet = pet;
    }

    public Person() {
    }
}
