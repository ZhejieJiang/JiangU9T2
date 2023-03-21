public class Polygon
{
    private  int sides;
    private  boolean regular;
    private  String name;

    public Polygon(String name, int sides, boolean regular)
    {
        this.name = name;
        this.sides = sides;
        this.regular = regular;
    }
    public void speak()
    {
        System.out.println("I'm a " + sides + "sided Polygon");
    }

    public boolean isRegular() {
        return regular;
    }

    public int getSide() {
        return sides;
    }

    public String getName() {
        return name;
    }
}
