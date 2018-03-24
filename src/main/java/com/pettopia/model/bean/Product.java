package com.pettopia.model.bean;
// Generated Mar 21, 2018 11:04:53 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 *Products generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private int productid;
     private String productname;
     private double productprice;
     private String productdescription;
     private String soldYn;
     private String category;

    public Product() {
    }

	
    public Product(int productid) {
        this.productid = productid;
    }
    public Product( String productname, double productprice, String soldYn ,String productdescription, String category) {
       this.productid = productid;
       this.productname = productname;
       this.productprice = productprice;
       this.soldYn = soldYn;
       this.productdescription = productdescription;
       this.category = category;
    }
            
            
    public Product(int productid, String productname, double productprice, String productdescription, String soldYn, String category) {
       this.productid = productid;
       this.productname = productname;
       this.productprice = productprice;
       this.productdescription = productdescription;
       this.soldYn = soldYn;
       this.category = category;
    }
   
    public int getProductid() {
        return this.productid;
    }
    
    public void setProductid(int productid) {
        this.productid = productid;
    }
    public String getProductname() {
        return this.productname;
    }
    
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public double getProductprice() {
        return this.productprice;
    }
    
    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }
    public String getProductdescription() {
        return this.productdescription;
    }
    
    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }
    public String getSoldYn() {
        return this.soldYn;
    }
    
    public void setSoldYn(String soldYn) {
        this.soldYn = soldYn;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }




}


