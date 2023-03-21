public class Cat extends Animal
{
    private boolean playedWith;
    private boolean caughtMice;
    public Cat(String name, int age, boolean isVaccinated, boolean neutered)
    {
        super(name, age, isVaccinated, neutered);
        playedWith = false;
        caughtMice = false;
    }

    public boolean isCaughtMice() {
        return caughtMice;
    }

    public void CaughtMice()
    {
        System.out.println("The Cat caught a Mice");
        caughtMice = true;
    }
    public boolean hasPlayedWith() {
        return playedWith;
    }

    public void meow()
    {
        System.out.println("Meow Meow Meow");
    }

    public void play()
    {
        System.out.println(" Time for a play together ");
        playedWith = true;
    }


}
