public class Product {
  private int no;
  private String name;
  private double price;
  private int amountInStock;

  public Product() {
      this(0, "", 0, 0);
  }

  public Product(int no, String name, double price, int amountInStock) {
      setNo(no);
      setName(name);
      setPrice(price);
      setAmountInStock(amountInStock);
  }

  public int getNo() {
      return this.no;
  }

  public void setNo(int no) {
      this.no = no;
  }

  public String getName() {
      return this.name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public double getPrice() {
      return this.price;
  }

  public void setPrice(double price) {
      this.price = price;
  }

  public int getAmountInStock() {
      return this.amountInStock;
  }

  public void setAmountInStock(int amountInStock) {
      this.amountInStock = amountInStock;
  }

}