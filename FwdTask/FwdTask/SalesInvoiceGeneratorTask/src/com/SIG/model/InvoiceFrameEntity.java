package com.SIG.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class InvoiceFrameEntity {
  private int invNum;
private String customerName;
private Date invDate;
private ArrayList<InvoiceLineEntity> lines;



    public InvoiceFrameEntity(int invNum, String customerName, Date invDate) {
        this.invNum = invNum;
        this.customerName = customerName;
        this.invDate = invDate;
      
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        String str="InvoiceFram1{" + "invNum=" + invNum + ", customerName=" + customerName + ", invDate=" + invDate + '}' ;
       for(InvoiceLineEntity line: getLines()){
           str += "\n\t" + line;
       } 
        return str;
    }

    public ArrayList<InvoiceLineEntity> getLines() {
        if (lines == null)
            lines = new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<InvoiceLineEntity> lines) {
        this.lines = lines;
    }

    public double getInvTotal() {
        double total = 0.0;
        for (InvoiceLineEntity line : getLines()){
            total += line.getLineTotal();
        }
        return total;
    }

     public void addInvLine(InvoiceLineEntity line){
        getLines().add(line);
        
     }
 public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvNum() + "," + df.format(getInvDate()) + "," + getCustomerName();
}
}
