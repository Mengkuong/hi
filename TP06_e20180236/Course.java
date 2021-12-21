public class Course {
  
  private int no;
  private String title;
  private double price;
  private int totalHours ;


  public Course() {
      this(0, "", 0, 0);
  }

  public Course(int _no, String _tilte, double _price, int _TotalHours ) {
      setNo(_no);
      setTitle(_tilte);
      setPrice(_price);
      setTotalhours(_TotalHours);
  }

  public int getNo() {
      return this.no;
  }
  public void setNo(int no) {
      this.no = no;
  }
  public String getTitle() {
      return this.title;
  }
  public void setTitle(String title) {
      this.title = title;
  }
  public double getPrice() {
      return this.price;
  }
  public void setPrice(double price) {
      this.price = price;
  }

  public int getTotalhours() {
      return this.totalHours;
  }
  public void setTotalhours(int totalhours) {
      this.totalHours = totalhours;
  }

}
