/**
 * 
 */
package com.shoppingcart.dto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author abhisu
 *
 */
@Entity
@Table(name="Stock_Detail")
public class Stock_Details {
  
  @Column(name="Design_ID")
  @Id
  private String design_ID;
  
  @Column(name="Category_ID")
  private String category_ID;
  
  @Column(name="Size_ID")
  private String size_ID;
  
  public String getDesign_ID() {
    return design_ID;
  }

  public void setDesign_ID(String design_ID) {
    this.design_ID = design_ID;
  }

  public String getCategory_ID() {
    return category_ID;
  }

  public void setCategory_ID(String category_ID) {
    this.category_ID = category_ID;
  }

  public String getSize_ID() {
    return size_ID;
  }

  public void setSize_ID(String size_ID) {
    this.size_ID = size_ID;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getColor_ID() {
    return color_ID;
  }

  /**
   * @param color_ID
   */
  public void setColor_ID(String color_ID) {
    this.color_ID = color_ID;
  }

  @Column(name="Price")
  private String price;
  
  @Column(name="Color_ID")
  private String color_ID;

  @Override
  public String toString() {
    return "Stock_Details [design_ID=" + design_ID + ", category_ID=" + category_ID + ", size_ID="
        + size_ID + ", price=" + price + ", color_ID=" + color_ID + "]";
  } 

}
