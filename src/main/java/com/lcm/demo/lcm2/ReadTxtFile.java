package com.lcm.demo.lcm2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.stream.FileImageInputStream;

import org.junit.Test;

public class ReadTxtFile {

	
	/* @代表字母A-F  #代表数字0-9更新后希望大家赶紧注册

	092b32a9b@6b49#5已注册 勿试
	2@c52164#a72628c已注册 勿试
	5a49e111799#794@已注册 勿试
	08#51@9798602d5b已注册 勿试
	b19#15be8d288@82已注册 勿试
	79acda48c9@d5e#8已注册 勿试     
	81705@d75d484a#b已注册 勿试   
	a11#880c@66213ec已注册 勿试     
	2dad#0f98@520421已注册 勿试     
	125@31d8ce5a384#已注册 勿试         
	 #ed491342a42841@已注册 勿试 
	ee793a1@c6a11#af已注册 勿试       
	b4#6b00b3@41b8a2已注册 勿试       */
	@Test
	public void readTxt() throws IOException{
		
		
		/*FileInputStream fis = new FileInputStream("/cl.txt");
		byte[] buf = new byte[1024];
		int len=0;
		while((len = fis.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
		}
		fis.close();*/
		String fileContent = "";     
		File f = new File("/cl.txt");
		InputStreamReader read = new InputStreamReader(new FileInputStream(f),"gbk");
		BufferedReader reader = new BufferedReader(read);
		String line2;
		String reg = "[\u4e00-\u9fa5]";
		Pattern pat = Pattern.compile(reg);
		while ((line2 = reader.readLine()) != null) {
			/*
			 * fileContent += line2; System.out.println(line2);
			 */
			// String trim =
			// line2.replaceAll("(\\s[\u4E00-\u9FA5]+)|([\u4E00-\u9FA5]+\\s)",
			// "").trim();
			boolean contains = line2.contains("已注册");
			if(!line2.contains("已注册")){
				Matcher mat = pat.matcher(line2);
				String trim = mat.replaceAll("").trim();
				rendom(trim);
			}
			
		}
		read.close();

		
		
		
		/*FileReader fr = new FileReader("/cl.txt");
		MyBufferedReader mybufr = new MyBufferedReader(fr);
       
		String line = null;

		while((line=mybufr.myReadLine())!=null)
		{
			//System.out.println(line.trim());
			rendom(line.replaceAll("(\\s[\u4E00-\u9FA5]+)|([\u4E00-\u9FA5]+\\s)", "").trim());
		}

		mybufr.myClose();*/
		
	}
	public void rendom(String str){
		//String str="092b32a9b@6b49#5";
		//String replace = str.replace("@", "a");
		//System.out.println(replace);
		String [] letter= new String[]{"a","b","c","d","e","f"};
		String ss[] ={"a","b","c","d","e","f"};
		for(int x = 0; x<10;x++){
			//a b c d e f 
			String ns = str.replace("#", String.valueOf(x));
			for(int y=0;y<letter.length;y++){
				String cl = ns.replace("@", letter[y]);
				outTextFile(cl);
			}
			
		}
		outTextFile("----------------");
	}
	public void outTextFile(String string){
		
		try {
			FileOutputStream out = new FileOutputStream("/outcl.txt",true);
		
			out.write((string+"\n").getBytes());
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void fromSubmit(){
		// regname regpwd regpwdrepeat regemail   invcode
		//http://hzs6.cnzz.com/stat.htm?id=950900&r=http%3A%2F%2Fwo.yao.cl%2Fregister.php&lg=zh-cn&ntime=1413620884&cnzz_eid=1623836608-1413620884-&showp=1366x768&t=%E8%8D%89%E6%A6%B4%E7%A4%BE%E5%8D%80%20-%20power...&h=1&rnd=1483219433
	}
	@Test
	public void hashMap(){
		Map <String, String> map= new HashMap<String, String>();
		map.put("101", "5cf82dd2-8091-4d42-90b1-de75a5769f26");
		
		String bpId = map.get("101");
		
		//map.get("101");
		System.out.println(map.get("101"));
		System.out.println(bpId!=null?"1":"2");
	}
	
	
	@Test
	public void hashMapOrderby(){
		List<Map<String,String>> bpOnOpsEditionList = new ArrayList<Map<String,String>>();
		Map<String ,String> map = new HashMap<String,String>();
		Map<String ,String> map1 = new HashMap<String,String>();
		Map<String ,String> map2 = new HashMap<String,String>();
		//map.put("type", "bp");
		//bpOnOpsEditionList.add(map);
		
		map1.put("id", "2");
		map1.put("type", "bp");
		bpOnOpsEditionList.add(map1);
		map.put("id", "1");
		map.put("type", "ops");
		bpOnOpsEditionList.add(map);
		map2.put("id", "2");
		map2.put("type", "bp");
		bpOnOpsEditionList.add(map2);
		//map1.put("type", "bp");
		//bpOnOpsEditionList.add(map);
		
		for(Map<String, String>  map5:bpOnOpsEditionList){
			System.out.println(map5.get("type"));
		}
		
		Collections.sort(bpOnOpsEditionList, new MapComparator());
		for (Map<String, String> m : bpOnOpsEditionList) {
            System.out.println(m.get("type"));
        }

	}
	static class MapComparator implements Comparator<Map<String, String>> {
		 
        public int compare(Map<String, String> o1, Map<String, String> o2) {
            String b1 = o1.get("type");
            String b2 = o2.get("type");
            if (b2 != null) {
                return b1.compareTo(b2);
            }
            return 0;
        }
 
    }

}
