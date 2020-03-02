package quest.challenge.trees;

public class Node {

	private int value;
	private Node left;
	private Node right;
	
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	public void insert(int value) {
		this.insert(this, value);
	}

	/**
	 * if the new node's value is lower than the current node's, we go to the left child
	 * if the new node's value is greater than the current node's, we go to the right child
	 * when the current node is null, we've reached a leaf node and we can insert the new node in that position
	 */
	public void insert(Node node, int value) {
		Node leaf = new Node(value);
		
		if(leaf.getValue() < node.getValue()) {
			if(node.getLeft() == null) {
				node.setLeft(leaf);
			} else {
				this.insert(node.getLeft(), value);
			}
		} else if(leaf.getValue() > node.getValue()) {
			if(node.getRight() == null) {
				node.setRight(leaf);
			} else {
				this.insert(node.getRight(), value);
			}
		}
	}
	
	public boolean contains(int value) {
		return this.contains(this, value);
	}
	
	public boolean contains(Node node, int value) {
		
		boolean result = false;
		
		if(node == null) {
			result = false;
		}
		
		if(node != null) {
			if(node.getValue() == value) {
				result = true;
			} else if(value > node.getValue() ) {
				result = this.contains(node.getRight(), value);
			} else {
				result = this.contains(node.getLeft(), value);
			}
		}
		
		return result;
	}
	
	public Node find(int value, DepthFirstSearch method) {
		Node node = null;
		
		switch (method) {
			case INORDER:
				
			case PREORDER:
				
			case POSTORDER:
			
		}
		
		return node;
	}
	
	public void remove(Node node) {
		
	}
	
	public String preorder() {
		return this.preorder(this);
	}
	
	//Pre-order traversal visits first the root node, then the left subtree, and finally the right subtree:
	public String preorder(Node node) {
		String sequence = "";
		
		if(node != null) {
			sequence += " | " + Integer.toString(node.getValue());
			sequence += this.preorder(node.getLeft());
			sequence += this.preorder(node.getRight());
		}
		
		return sequence;
	}
	
	public String inorder() {
		return this.inorder(this);
	}
	
	//The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree:
	public String inorder(Node node) {
		String sequence = "";

		if(node != null) {
			sequence += this.inorder(node.getLeft());
			sequence += " | " + Integer.toString(node.getValue());
			sequence += this.inorder(node.getRight());			
		}
		return sequence;
	}
	
	public String postorder() {
		return this.postorder(this);
	}
	
	//Post-order traversal visits the left subtree, the right subtree, and the root node at the end:
	public String postorder(Node node) {
		String sequence = "";
		
		if(node != null) {
			sequence += this.postorder(node.getLeft());
			sequence += this.postorder(node.getRight());
			sequence += " | " + Integer.toString(node.getValue());
		}
		
		return sequence;
	}
}
