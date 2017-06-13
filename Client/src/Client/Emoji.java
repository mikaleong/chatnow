package Client;

/*
* Class name: Emoji.java
* Author:@ Wing Yu Leung 山东大学软件工程八班 梁咏瑜
* 
* 该类用于储存Emoji表情的Unicode码
* 
*/

import java.nio.charset.Charset;

public class Emoji {
	public static String[] emoji = {
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x81}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x82}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x83}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x84}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x85}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x86}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x89}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x8A}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x8B}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x8C}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x8D}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x8F}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x92}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x93}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x94}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x96}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x98}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x9A}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x9C}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x9D}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x9E}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA0}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA1}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA2}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA3}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA4}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA5}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA8}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xA9}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xAA}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xAB}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xAD}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xB0}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xB1}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xB2}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xB3}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xB5}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0xB7}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x85}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x86}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x87}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x88}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x89}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x8A}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x8B}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x8C}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x8D}, Charset.forName("UTF-8")),
		new String(new byte[]{(byte)0xF0, (byte)0x9F, (byte)0x99, (byte)0x8E}, Charset.forName("UTF-8")),
	};
}