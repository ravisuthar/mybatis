package com.xStream.poc;

import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamMap {

	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("a", "AAA");
		map.put("b", "BBB");
		map.put("c", "CCC");
		map.put("d", "DDD");
		
		System.out.println(convertHashMaptoXML(map));
		System.out.println(convertXMLtoMap(convertHashMaptoXML(map)));
	}
	
	public static String convertHashMaptoXML (Map <String, Object> inpMap){
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("map", java.util.Map.class);
		String xml = xStream.toXML(inpMap);
		return xml;
	}
	
	public static HashMap <String, Object> convertXMLtoMap (String inpXml){
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("map", java.util.Map.class);
		HashMap<String,Object> map = (HashMap<String,Object>) xStream.fromXML(inpXml);
		return map;
	}
	
}
