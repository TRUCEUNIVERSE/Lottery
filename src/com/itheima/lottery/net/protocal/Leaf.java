package com.itheima.lottery.net.protocal;


import org.xmlpull.v1.XmlSerializer;

/**
 * Message : 
 *      -----Head : 一系列叶子节点组成
 *      
 *      -----Body : 
 *            -----Elements
 *                   --------Element
 *                               ------一系列叶子节点
 *     
 */
public class Leaf {
	
	private String tagName;
	
	private String tagValue;

	public String getTagName() {
		return tagName;
	}

//	public void setTagName(String tagName) {
//		this.tagName = tagName;
//	}

	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}
	
	public Leaf(String tagName) {
		super();
		this.tagName = tagName;
	}

	public Leaf(String tagName, String tagValue) {
		super();
		this.tagName = tagName;
		this.tagValue = tagValue;
	}

	/**
	 * 序列化节点
	 */
	public void serializerLeaf(XmlSerializer serializer){
		try {
			serializer.startTag(null, tagName);
			serializer.text(tagValue);
			serializer.endTag(null, tagName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
