package com.vikas.ternarySearchTree;

/**
 * 
 * @author vikas
 *
 */

public class Node implements java.io.Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -1909655539437816548L;
	private byte character;
	private Node[] children;
	private boolean leaf;

	/**
	 * 
	 * @param character byte value passed as parameter in the constructor
	 */
	
	public Node(byte character) {
		this.character = character;
		this.children = new Node[Constant.SIZE];
	}

	public byte getCharacter() {
		return character;
	}

	public void setCharacter(byte character) {
		this.character = character;
	}

	public Node[] getChildren() {
		return children;
	}
	
	public void setChildren(Node[] children) {
		this.children = children;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	
	/**
	 * 
	 * @param index position, where we want to store the node
	 * @param node, the node which we want to insert in the children array
	 */
	
	public void setChild(int index, Node node) {
		this.children[index] = node;
	}
	
	/**
	 * 
	 * @param index, int index, where we want to find a given node
	 * @return Node present at the given index in the children array.
	 */
	
	public Node getChild(int index) {
		
		return children[index];
	}
	
	@Override
	public String toString() {
		
		return ""+this.character;
	}

}
