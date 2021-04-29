package 实验二;
class  Point
{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
}
class juxing extends Point
{
    public juxing(int x, int y) {
        super( x, y );
    }
    public int area(Point x)
     {
         return x.x*x.y;
     }
     public int length(Point x)
     {
         return 2*(x.x+x.y);
     }
}
public class Main1 {
    public static void main(String[] args) {
        juxing p1= new juxing( 6,7 );
        juxing p2= new juxing( 15,25 );
        System.out.println("矩形面积为："+p1.area( p1 ));
        System.out.println("矩形周长为："+p1.length( p1 ));
        System.out.println("矩形面积为："+p2.area( p2 ));
        System.out.println("矩形周长为："+p2.length( p2 ));
    }
}
