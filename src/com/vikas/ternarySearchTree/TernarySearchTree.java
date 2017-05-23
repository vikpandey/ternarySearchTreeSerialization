package com.vikas.ternarySearchTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vikas
 *
 */

public class TernarySearchTree implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1658747584883211758L;
	private Node root;

	public TernarySearchTree() {
		this.root = new Node((byte) 0);
	}

	/**
	 * 
	 * @param key
	 *            byte value that needs to be inserted
	 */
	public void insert(byte key) {

		Node tempNode = root;

		int index = key - 0;

		if (tempNode.getChild(index) == null) {
			Node node = new Node(key);
			tempNode.setChild(index, node);
			tempNode = node;
		} else {
			tempNode = tempNode.getChild(index);
		}

		tempNode.setLeaf(true);
	}

	/**
	 * 
	 * @param key
	 *            byte value, that needs to be searched
	 * @return boolean value, whether the given key is there in the
	 *         ternarysearch tree or not
	 */

	public boolean search(byte key) {

		Node temp = root;

		int index = key - 0;
		if (temp.getChild(index) == null) {
			return false;
		} else {
			temp = temp.getChild(index);
		}

		if (!temp.isLeaf()) {
			return false;
		}

		return true;

	}

	/*
	public List<String> allBytesWithPrefix(byte prefix) {

		Node temp = root;

		List<String> allbytes = new ArrayList<String>();

		for (int i = 0; i < temp.getChildren().length; i++) {
			int index = prefix - 0;

			if (temp != null) {
				temp = temp.getChild(index);

				char c = (char) prefix;
				String s = Character.toString(c);
				collect(temp, s, allbytes);
			}
		}

		return allbytes;
	}

	private void collect(Node node, String prefix, List<String> allbytes) {

		if (node == null)
			return;

		if (node.isLeaf()) {
			allbytes.add(prefix);
		}

		for (Node childNode : node.getChildren()) {
			if (childNode == null)
				continue;
			byte childCharacter = childNode.getCharacter();
			collect(childNode, prefix + childCharacter, allbytes);
		}
	}
	
	*/

}
