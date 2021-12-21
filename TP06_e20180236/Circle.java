
public class Circle {

  Point center = new Point();
  Point point = new Point();

  public Circle(Point _center, Point p){
     setCenter(_center);
     setPoint(p);
  }

  public void setCenter(Point cen){
    this.center = cen;
  }
  public void setPoint(Point po){
    this.point = po;
  }

  public double length(){
    // l = 2pi * r
    double l = 2 * Math.PI * radius() ;
    return l;
  }
  public double surface(){
    // pi r^2
    double  s =  Math.PI * Math.pow(radius(), 2);
    return s;
  }
  public double radius(){
    //from distance 
    double r = center.distanceTo(point);
    return r;
  }
}