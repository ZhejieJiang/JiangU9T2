public class AnimalRunner
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal("some Animal", 6, false, false);
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.isNeutered());
        System.out.println(myAnimal.isVaccinated());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.jump();


        Dog myDog = new Dog("Dog", 9,false,false);
        System.out.println(myDog.getAge());
        System.out.println(myDog.getName());
        System.out.println(myDog.isNeutered());
        System.out.println(myDog.isVaccinated());
        myDog.adopt();
        myDog.feed();
        myDog.jump();
        myDog.walk();
        myDog.bark();
        myDog.bones();
        System.out.println(myDog.getBonesChewedOn());
        System.out.println(myDog.hasWalkedWith());

        Cat myCat = new Cat("Cat", 9,false,false);
        System.out.println(myCat.getAge());
        System.out.println(myCat.getName());
        System.out.println(myCat.isNeutered());
        System.out.println(myCat.isVaccinated());
        myCat.adopt();
        myCat.feed();
        myCat.jump();
        myCat.play();
        myCat.meow();
        myCat.CaughtMice();
        System.out.println(myCat.isCaughtMice());
        System.out.println(myCat.hasPlayedWith());
    }
}