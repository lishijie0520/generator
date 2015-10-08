package com.lcm.demo.lcm2;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public enum Color {
        RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4),AAA("OAS AMIs", 4);
        // 成员变量
        private String name;
        private int index;

        // 构造方法
        private Color(String name, int index) {
            this.name = name;
            this.index = index;
        }
        public static Color getColor(String color){    
            return valueOf(color);    
         }     

        // 覆盖方法
        @Override
        public String toString() {
            return this.index + "_" + this.name;
        }
    }

    public static void main(String[] args) {
       // System.out.println(Color.RED.toString());
    	Test test = new Test();
    	String str = test.switchCaseStr("hello11");
    	System.out.println(str);
    	String ss =null;
    	if(ss!=null || !ss.equals("")){
    		System.out.println(ss);
    	}
    	
    }
    
    public String switchCaseStr(String str) {  
        
    	  Map<String,Integer> map=new HashMap<String, Integer>();  
    	    
    	  map.put("hello", 1);  
    	  map.put("haha", 2);  
    	  map.put("yes", 3);  
    	  map.put("in", 4);  
    	  map.put("in Test", 5);  
    	  Integer integer = map.get(str);
    	  if(integer==null)
    		  integer=99;
    	  //String str="in Test";  
    	    
    	  switch(integer)  
    	  {      
    	   case 3:  
    	        System.out.println("yes");  
    	        
    	       break;  
    	   case 1:  
    	        System.out.println("hello");  
    	       // break;  
    	        return "hello";
    	    case 2:  
    	        System.out.println("haha");  
    	       break;  
    	    case 4:  
    	       System.out.println("in");  
    	       break;  
    	    case 5:  
    	    	System.out.println("in test");  
    	    	//break;  
    	    	return "ss";
    	   default:  
    	    System.out.println("default");  
    	  }  
    	  return "oooo";
    	 }  
}