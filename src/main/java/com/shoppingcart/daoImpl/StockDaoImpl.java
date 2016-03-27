/**
 * 
 */
package com.shoppingcart.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingcart.dao.StockDao;
import com.shoppingcart.dto.model.Stock_Details;

/**
 * @author abhisu
 *
 */

@Repository
public class StockDaoImpl implements StockDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public List<Stock_Details> getStockDetails() {
    return getSession().createCriteria(Stock_Details.class).list();
  }

  @Override
  public void saveStockDetails(Stock_Details stock_Details) {
    getSession().merge(stock_Details);
  }

  private Session getSession() {
    Session currentSession = getSessionFactory().getCurrentSession();
    if (currentSession == null) {
      currentSession = getSessionFactory().openSession();
    }
    return currentSession;
  }

  private SessionFactory getSessionFactory() {
    return sessionFactory;
  }


}
