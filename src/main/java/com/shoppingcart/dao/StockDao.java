/**
 * 
 */
package com.shoppingcart.dao;

import java.util.List;

import com.shoppingcart.dto.model.Stock_Details;

/**
 * @author abhisu
 *
 */
public interface StockDao {

  public List<Stock_Details> getStockDetails();

  public void saveStockDetails(Stock_Details stock_Details);

}
