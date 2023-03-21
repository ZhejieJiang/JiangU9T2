public class Triangle extends Polygon
{
    private boolean rightTriangle;

    public Triangle(String name, int sides, boolean regular, boolean rightTriangle)
    {
        super(name, sides,regular);
        this.rightTriangle = rightTriangle;
    }

    public boolean isRightTriangle() {
        return rightTriangle;
    }
    public void triangleFact()
    {
        System.out.println("There is 6 different types of triangles");
    }
}
