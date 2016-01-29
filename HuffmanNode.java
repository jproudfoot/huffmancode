
public class HuffmanNode implements Comparable<HuffmanNode>{
	private Character character;
	private int frequency;
	private HuffmanNode left, right;
	
	public HuffmanNode (Character c) {
		this.setCharacter(c);
		this.setFrequency(1);
		
		this.setLeft(null);
		this.setRight(null);
	}
	
	public HuffmanNode (Character c, int frequency) {
		this.setCharacter(c);
		this.setFrequency(frequency);
		
		this.setLeft(null);
		this.setRight(null);
	}
	
	/***
	 * Increased the frequency of the character by one
	 */
	public void incrementFrequency () {
		this.setFrequency(this.getFrequency() + 1);
	}
	
	/**
	 * Returns the character of the Huffman Node
	 * @return Character character
	 */
	public Character getCharacter() {
		return character;
	}

	/**
	 * Sets the character of the HuffmanNode
	 * @param character
	 */
	public void setCharacter(Character character) {
		this.character = character;
	}

	/**
	 * Returns the frequency of the Huffman Node
	 * @return int frequency
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * Sets the frequency of the Huffman Node
	 * @param frequency
	 */
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	
	/**
	 * Returns the HuffmanNode contained in the left pointer
	 * @return HuffmanNode left
	 */
	public HuffmanNode getLeft() {
		return left;
	}


	/**
	 * Sets the left HuffmanNode 
	 * @param left
	 */
	public void setLeft(HuffmanNode left) {
		this.left = left;
	}

	/**
	 * Gets the HuffmanNode contained in the right pointer
	 * @return right
	 */
	public HuffmanNode getRight() {
		return right;
	}

	/**
	 * Sets the HuffmanNode's right pointer
	 * @param right
	 */
	public void setRight(HuffmanNode right) {
		this.right = right;
	}
	
	@Override
	public int compareTo(HuffmanNode hf) {
		if (((HuffmanNode) hf).getFrequency() > getFrequency()) return -1;
		else if (((HuffmanNode) hf).getFrequency() == getFrequency()) return 0;
		else return 1;
	}

	/** Returns a string representation of the binary tree.
	* @return String string representation
	*/
	public String toString () {
		if (left == null && right == null) {
			return character + "";
		}
		else {
			String str = " " + character;
			if (left != null && right != null) {
				str += " (" + left.toString() + ", " + right.toString() +")";
			}
			else{
				if (left != null) {
					str += "(" + left.toString() + ", ())";
				}
				else if (right != null) {
					str += "((), " + right.toString() + ")";
				}
			}
				
			return str;
		}
	}
}
