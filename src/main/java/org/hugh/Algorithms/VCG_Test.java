package org.hugh.Algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class VCG_Test {
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		readXML("C:\\Users\\1903004\\Desktop\\1120.xml");
//		readFileByLines("D:\\IISI-IDB\\CSOAS開發環境設定\\iacd\\src\\tw\\gov\\moeaidb\\apms\\Exception.java");
	}

	/**
	 * 讀取XML檔
	 * 
	 * @param fileName 檔名
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 */
	public static void readXML(String file) throws ParserConfigurationException, SAXException, IOException {
		File f = new File(file);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		NodeList nl = doc.getElementsByTagName("CodeIssue");
		for (int i = 0; i < nl.getLength(); i++) {
			try {
				String priority = doc.getElementsByTagName("Priority").item(i).getFirstChild().getNodeValue().trim();
				String fileName = doc.getElementsByTagName("FileName").item(i).getFirstChild().getNodeValue().trim();
				String line = doc.getElementsByTagName("Line").item(i).getFirstChild().getNodeValue().trim();
				if (fileName.contains(".java") && Integer.parseInt(priority) != 6)
					readFileByLines(fileName, Integer.parseInt(line));
			} catch (NullPointerException npe) {
				System.out.println("有空節點");
			}
		}
		System.out.println("DONE");

	}

	/**
	 * 以行為單位讀取檔案，常用於讀面向行的格式化檔案
	 * 
	 * @param fileName 檔名
	 */
	public static void readFileByLines(String fileName, int whichLine) {
		File file = new File(fileName);
		BufferedReader reader = null;
		FileWriter fw = null;
		List<String> tempStringList = new LinkedList<>();
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// 一次讀入一行，直到讀入null為檔案結束
			while ((tempString = reader.readLine()) != null) {
				if (whichLine == line) {
					tempStringList.add("/**//**/" + tempString + "/**//**/");
				} else {
					tempStringList.add(tempString);
				}
				line++;
			}
			reader.close();
			fw = new FileWriter(fileName);
			for (String str : tempStringList) {
				fw.write(str + "\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
			if (fw != null) {
				try {
					fw.flush();
					fw.close();
				} catch (IOException e1) {
				}
			}
		}
	}
}
