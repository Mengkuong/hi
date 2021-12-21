public class TestCircle {
  public static void main(String[] args){
    Point p1 = new Point(3,2); //center
    Point p2 = new Point(7,8);

    Circle cir = new Circle(p1,p2);

    double r = cir.radius();
    double s = cir.surface();
    double l = cir.length();

  
    System.out.printf(" Radius of Circle: %.2f\n",r);
    System.out.printf(" Lenght of Circle:  %.2f\n",l);
    System.out.printf(" Surface of Circle:  %.2f\n",s);

  }
}
