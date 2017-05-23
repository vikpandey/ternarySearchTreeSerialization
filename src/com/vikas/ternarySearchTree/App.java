package com.vikas.ternarySearchTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 
 * @author vikas
 *
 */

public class App {

	public static void main(String[] args) {

		TernarySearchTree ternarySearchTree = new TernarySearchTree();

		/**
		 *  constructing the ternary search tree
		 */
		ternarySearchTree.insert((byte) 1);
		ternarySearchTree.insert((byte) 2);
		ternarySearchTree.insert((byte) 3);
		ternarySearchTree.insert((byte) 4);
		ternarySearchTree.insert((byte) 5);
		
		
		serialization(ternarySearchTree);
		
		deserialization();
		
	}
	
	public static void serialization(TernarySearchTree ternarySearchTree) {
		
		System.out.println("values before serialization...");
		boolean result = ternarySearchTree.search((byte) 4);
		System.out.println("search result for byte value 4 is :- " + result);
		boolean test = ternarySearchTree.search((byte) 10);
		System.out.println("search result for byte value 10 is :- " + test);
		//List<String> list = ternarySearchTree.allBytesWithPrefix((byte) 0);
		//System.out.println("list result :- " + list);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("tst.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(ternarySearchTree);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in tst.ser");
		} catch (IOException i) {
			i.printStackTrace();

		}
	}
	
	public static void deserialization() {
		

		 TernarySearchTree tst = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("tst.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         tst = (TernarySearchTree) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c) {
	         System.out.println("TernarySearchTree class not found");
	         c.printStackTrace();
	         return;
	      }
		
	      System.out.println();
	      System.out.println("=============================================");
	      System.out.println("values after deserialization...");
	      boolean result2 = tst.search((byte) 4);
	      System.out.println("search result for byte value 4 is :- " + result2);
	      boolean test2 = tst.search((byte) 10);
	      System.out.println("search result for byte value 10 is :- " + test2);
	}
}
