public class Rectangle extends Polygon
{
    private int l1;
    private int l2;

    public Rectangle(String name, int sides, boolean regular, boolean rightTriangle, int l1, int l2)
    {
        super(name, sides,regular);
        this.l1 = l1;
        this.l2 = l2;
    }

    public void square()
    {
        if(l1 == l2){System.out.println("I am a square");}
        else{System.out.println("I am a not square");}

    }

}
