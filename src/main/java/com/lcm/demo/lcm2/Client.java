package com.lcm.demo.lcm2;

enum Animal {    
    dog,cat,bear;  
     public static Animal getAnimal(String animal){    
       return valueOf(animal );    
    }     
}  
  
public class Client {    
    
   public void caseAnimal(String animal){    
       switch(Animal.getAnimal(animal)){    
       case cat:    
           System.out.println("this is a cat");    
           break;    
       case dog:    
           System.out.println("this is a dog");    
           break;    
       case bear:    
           System.out.println("this is a bear");    
           break;    
       }    
   }  
     
  public static void main(String[] args) {  
      Client client = new Client();    
       client.caseAnimal("dog");   
}   
   
}   
