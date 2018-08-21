package com.xStream.poc;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * http://x-stream.github.io/tutorial.html
 * @author ravisut
 *
 */
public class XStreamTest {

	public static void main(String[] args) {
		
		XStream xstream = new XStream();
		
		
		//Security framework of XStream not initialized, XStream is probably vulnerable
		XStream.setupDefaultSecurity(xstream);
		xstream.allowTypes(new Class[] { Person.class, PhoneNumber.class });
		
		
		XStream xstream1 = new XStream(new DomDriver()); // does not require XPP3 library
		XStream xstream2 = new XStream(new StaxDriver()); // does not require XPP3 library starting with Java 6
		
		//@XStreamAlias("PhoneNumber")
		//xstream.alias("person", Person.class);
		//xstream.alias("phonenumber", PhoneNumber.class);
		
		Person joe = new Person(1, "Joe", 123.30D, new BigDecimal(13), new BigInteger("123"), new PhoneNumber(123, "1234-456"));
		System.out.println(joe);
		
		
		String xml = xstream.toXML(joe);
		System.out.println(xml);
		
		
		Person newJoe = (Person)xstream.fromXML(xml);
		System.out.println(newJoe);
		
	} 
	
	
	
	
}
