/**
 * 
 */
package com.shoppingcart.service;

import java.util.List;

import com.shoppingcart.dto.model.Stock_Details;

/**
 * @author abhisu
 */
public interface StockService {

  public List<Stock_Details> getStockDetails();

  public void saveStockDetails(Stock_Details stock_Details);

}
