/**
 * 
 */
package com.shoppingcart.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingcart.dao.StockDao;
import com.shoppingcart.dto.model.Stock_Details;
import com.shoppingcart.service.StockService;

/**
 * @author abhisu
 *
 */
@Service
public class StockServiceImpl implements StockService {

  public static final Logger LOGGER = LoggerFactory.getLogger(StockServiceImpl.class);

  @Autowired
  StockDao stockDao;

  @Transactional(readOnly = true)
  @Override
  public List<Stock_Details> getStockDetails() {
    return stockDao.getStockDetails();
  }

  @Transactional
  @Override
  public void saveStockDetails(Stock_Details stock_Details) {
    LOGGER.info("Stock_Details {}", stock_Details);
    stockDao.saveStockDetails(stock_Details);

  }

}
