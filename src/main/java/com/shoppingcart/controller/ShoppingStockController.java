package com.shoppingcart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcart.service.StockService;
import com.shoppingcart.serviceImpl.StockServiceImpl;

/**
 * @author abhisu
 *
 */
@Component
@RequestMapping("/stock")
public class ShoppingStockController {

  @Autowired
  StockService stockService;

  private final static Logger LOGGER = LoggerFactory.getLogger(ShoppingStockController.class);

  @RequestMapping(value="/",method=RequestMethod.GET)
  public ModelAndView getListOfStock(Model model) {
    LOGGER.info("getListOfStock()-[START] ");
    model.addAttribute("stocks", stockService.getStockDetails());
    LOGGER.info("getListOfStock()--->{}", model);
    ModelAndView view = new ModelAndView();
    view.setViewName("stock_deatils.jsp");
    view.addObject(model);
    return view;
  }

}
