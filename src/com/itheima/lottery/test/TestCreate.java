package com.itheima.lottery.test;

import java.io.StringWriter;

import org.xmlpull.v1.XmlSerializer;

import com.itheima.lottery.global.ConstantValue;
import com.itheima.lottery.net.protocal.Leaf;

import android.test.AndroidTestCase;
import android.util.Xml;

public class TestCreate extends AndroidTestCase{
	
	public void testCreateLeaf(){
		
		XmlSerializer serializer = Xml.newSerializer();
		try {
			StringWriter stringWriter = new StringWriter();
			serializer.setOutput(stringWriter);
			serializer.startDocument(ConstantValue.ENCODING, null);
			Leaf leaf = new Leaf("haha");
			leaf.setTagValue("hehe");
			leaf.serializerLeaf(serializer);
			serializer.endDocument();
			System.out.println(stringWriter.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
