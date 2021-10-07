package br.com.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEnconding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String c = "C";
		System.out.println(c.codePointAt(0));
		
		Charset a = Charset.defaultCharset();
		System.out.println(a.displayName());
		
		byte[] bytes = c.getBytes("windows-1252");
		System.out.println(bytes.length+", "+"windows-1252");
		
		bytes = c.getBytes("UTF-16");
		System.out.println(bytes.length+", "+"UTF-16");
		
		bytes = c.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length+", "+"ASCII");
		
	}
}
