package com.lcm.demo.lcm2;

/*
明确了BufferedReader是一个装饰类后，
发现它有一个增强的功能，readLine。
而且readLine的原理是：
调用基础流对象的read方法，一次读一个字符，
并把该字符进行了临时存储。
直到读到回车换行符为止，将存储的数据作为字符串返回。

那么我们可以可以定义一个装饰类，对流对象进行功能的增强，
我们也可以 提供一个读一行的方法。

*/
import java.io.*;

class MyBufferedReader //extends Reader//自定义装饰类，模拟BufferedReader
{
	private Reader r;
	MyBufferedReader(Reader r)
	{
		this.r = r;
	}
	//读一行的方法。
	public String myReadLine()throws IOException
	{
		StringBuilder sb = new StringBuilder();

		int ch = 0;

		while((ch=r.read())!=-1)
		{
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}


		if(sb.length()!=0)
			return sb.toString();
		return null;
	}

	public void myClose()throws IOException
	{
		r.close();
	}
}