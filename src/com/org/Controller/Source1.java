package com.org.Controller;

import java.util.Arrays;

class TransactionParty {
    String seller;
    String buyer;
    public TransactionParty(String seller,String buyer){
      this.seller=seller;
      this.buyer=buyer;
    }
}

class Receipt{
	TransactionParty transactionParty;
    String productsQR;
    public Receipt(TransactionParty transactionParty,String productsQR){
      this.transactionParty=transactionParty;
      this.productsQR=productsQR;
    }
}


class GenerateReceipt{
    public int  verifyParty(Receipt r){
        String regex="^[A-Za-z]$+[\s]+['-]";
        if(r.transactionParty.seller.matches(regex) && r.transactionParty.buyer.matches(regex))
          return 2;
        else if(r.transactionParty.seller.matches(regex) || r.transactionParty.buyer.matches(regex))
            return 1;
        else
            return 0;
    }
    public static  String calcGST(String r){
    	//String str="";
    	Integer result=0;
    	//100,10@120,30@300,60
    	//<Rate>,<Qun1> <rat1>,<quan1>
        String[]str1=r.split("@");
       String[] str2=null;
        System.out.println(Arrays.toString(str1));
        for(int i=0;i<str1.length;i++){
        	//Rate quqn1
        	//100 10
          str2=str1[i].split(",");
         
          //100 10 120 30 340 60
          System.out.println(Arrays.toString(str2)); 
        	  
          String rate=str2[0];
          String quantity=str2[1];
          int priceinNum=Integer.parseInt(rate);
          int q1=Integer.parseInt(quantity);
        result=result+(priceinNum*q1);
       
          }
          
          // 2 5 6
      //  System.out.println(Arrays.toString(str2)); 
          
        
        
     
        return  result.toString();
    }
}
public class Source1{
  public static void main(String[] args){
      
String result=	  GenerateReceipt.calcGST("100,10@120,30@300,60");
	 System.out.println(result); 
	  
  }
}