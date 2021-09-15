package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends AbstractProduct {

  private List<AbstractProduct> products = new ArrayList<AbstractProduct>();

  public CompositeProduct(String name, String brand) {
    super(name, 0, brand);
  }

  @Override
  public Double getPrice() {
    double price = 0d;
    for (AbstractProduct child : products) {
      price += child.getPrice();
    }
    return price;
  }

  @Override
  public void setPrice(double price) {
    throw new UnsupportedOperationException();
  }

  public void addProduct(AbstractProduct product) {
    this.products.add(product);
  }

  public boolean removeProduct(AbstractProduct product) {
    return this.products.remove(product);
  }
}
