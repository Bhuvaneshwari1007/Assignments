abstract class shape {
    abstract void draw();
}
class rectangle extends shape
{
    int height,width;
    rectangle(int h, int w) {
        this.height = h;
        this.width = w;
    }
    public void draw(){

        System.out.println("The Rectangle is drawn");
    }
}
class line extends shape{
    int length;
    line(int length) {
        this.length=length; }
    public void draw()
    {
        System.out.println("The Line is drawn");
    }
}

class cube extends shape{
    int s;
    cube(int s) {
        this.s=s;
    }
    public void draw()
    {
        System.out.println("The Cube is drawn");
    }
}

class shapes
{
    public static void main(String[] args) {
        rectangle q=new rectangle(  10, 5);
        q.draw();
        cube k=new cube(6);
        k.draw();
        line l=new line( 15);
        l.draw();
    }
}