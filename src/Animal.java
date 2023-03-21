public class Animal
{
    private String name;
    private int age;
    private boolean isVaccinated;
    private boolean neutered;

    public Animal(String name, int age, boolean isVaccinated, boolean neutered)
    {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.neutered = neutered;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }
    public void adopt()
    {
        System.out.println("I have been adopted");
    }

    public void feed()
    {
        System.out.println("I have been fed, Thank you");
    }

    public void jump() {
        System.out.println("I jumped up into the air and fell down");
    }
}
