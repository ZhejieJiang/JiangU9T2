public class Dog extends Animal
{
    private boolean WalkedWith;
    private int bonesChewedOn;
    public Dog(String name, int age, boolean isVaccinated, boolean neutered)
    {
        super(name, age, isVaccinated, neutered);
        WalkedWith = false;
        bonesChewedOn = 0;
    }

    public int getBonesChewedOn() {
        return bonesChewedOn;
    }

    public boolean hasWalkedWith() {
        return WalkedWith;
    }

    public void walk()
    {
        System.out.println(" Time for a walk outside ");
        WalkedWith = true;
    }

    public void bark()
    {
        System.out.println("Woof Woof Woof");
    }

      public void bones()
      {
          System.out.println("The dog chewed on the bone and broke it");
          bonesChewedOn++;
      }
}
