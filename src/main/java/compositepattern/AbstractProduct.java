package compositepattern;

/**
 * 
 * @author Luis Conde
 * @date 15 sep. 2021
 * @time 0:49:07
 */
public abstract class AbstractProduct {
  protected String name;
  protected Double price;
  protected String brand;

  public AbstractProduct(String name, double price, String brand) {
    super();
    this.name = name;
    this.price = price;
    this.brand = brand;
  }

  public String getName() {
    return name;    
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}