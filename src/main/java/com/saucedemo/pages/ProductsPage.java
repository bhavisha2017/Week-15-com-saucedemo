package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;



public class ProductsPage extends Utility {
    private  static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage(){
        PageFactory.initElements(driver,this);
    }


    public int verifyProductList()
   {
        log.info("Verify Products : ");
       return getSize(By.xpath("//div[@class='inventory_item']"));
    }
}
