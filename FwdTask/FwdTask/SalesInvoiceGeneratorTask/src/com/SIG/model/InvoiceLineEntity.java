/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIG.model;


public class InvoiceLineEntity {
private String itemName;
private double itemPrice;
private int itemCount;
private double lineTotal;
private InvoiceFrameEntity header;

    public InvoiceLineEntity(String itemName, double itemPrice, int itemCount, InvoiceFrameEntity header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.header = header;
        this.setLineTotal(this.itemCount*this.itemPrice);
    }

     
    public InvoiceFrameEntity getHeader() {
        return header;
    }

    public void setHeader(InvoiceFrameEntity header) {
        this.header = header;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getLineTotal(){
        return lineTotal;
    }

    private void setLineTotal(double lineTotal) {
this.lineTotal = lineTotal;
  }
     public String getDataAsCSV() {
        return "" + getHeader().getInvNum() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
    }
}
