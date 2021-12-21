public class Point {

  int x, y;

  public Point() {
      this(0, 0);// constructor delegation
  }
  public Point(int x) {
      this(x, 0);
  }
  public Point(int _x, int _y) {
      x = _x;
      y = _y;
  }

  public static double distance(Point p1, Point p2) {
      return p1.distanceTo(p2);
  }
  // p1.distanceTo(p2)

  public double distanceTo(Point p2) {
      double dist = Math.sqrt(
              Math.pow(p2.x - x, 2) + Math.pow(p2.y - y, 2));
      return dist;
  }

}