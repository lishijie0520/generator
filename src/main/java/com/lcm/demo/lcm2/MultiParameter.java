package com.lcm.demo.lcm2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiParameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		Person person = new Person("lisi",1);
		System.err.println(person.getAge());
		aa("AAAA","BBBB","CCCC",list);
		
		
		List<HashMap<String, String>> list2 = new ArrayList<HashMap<String,String>>();
		
		for(int x=0;x<10;x++){
			Map map = new HashMap<String, String>();
			map.put("name", "lisi_"+x);
			map.put("age", 10+x);
			list2.add((HashMap<String, String>) map);
		}
	   
		
		for(Map newmap :list2){
			String name = (String) newmap.get("name");
			Integer age = (Integer) newmap.get("age");
			System.out.println(name+"---"+age);
		}
		
		
		String ani=null;
		Integer integer = Integer.parseInt(ani);
		System.out.println(integer);

	}
	
	public static void aa(Object ... str){
		System.out.println(str[3]);
		System.out.println(str.length);
		
		//str[3]
	}
	
	

}
class Person{
	private String name;
	private Integer age;
	
	public Person(String name ,Integer age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}