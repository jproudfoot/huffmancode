import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class HuffmanTree {
	private String string;
	private HuffmanNode root;
	
	/**
	 * Creates a new HuffmanTree with string parameter
	 * @param string
	 */
	public HuffmanTree(String s) {
		this.string = s;
		
		init();
	}
	
	/**
	 * Initializes the Huffman Tree using the string. Fills a HashMap with each of the characters with their respective frequency. 
	 */
	private void init() {
		/*
		 * I decided to use HashMap because for this scenario I want a faster get/set 
		*runtime and I do not care if the values are sorted. A TreeMap has a longer 
		*runtime because it takes time to sort the values.
		*/
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		/*
		 *Traverses through the string and add/increments character frequencies 
		 */
		for (Character c : string.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c,  1);
			}
		}
		
		/*
		 * Builds a priority queue of Huffman Nodes based on map's character and frequency values
		 */
		
		PriorityQueue<HuffmanNode> queue = new PriorityQueue<HuffmanNode>();
		for (Entry<Character, Integer> en : map.entrySet()) {
			queue.add(new HuffmanNode(en.getKey(), en.getValue()));
		}
		
		/*
		 * Builds HuffmanNode tree using Huffman Code algorithm and priority queue
		 */
		while(queue.size() > 1) {
			HuffmanNode lesser = queue.poll();
			HuffmanNode greater = queue.poll();
			HuffmanNode newNode = new HuffmanNode(null, lesser.getFrequency() + greater.getFrequency());
			//Stores the greater priority node in the right pointer
			newNode.setLeft(lesser);
			newNode.setRight(greater);
		}
		
		//Sets the root to the remaining node, which should be the HuffmanNode with greatest priority
		root = queue.poll();
	}
	
	/**
	 * Encodes a the plaintext string using the HuffmanNode tree built during initialization.
	 * Represents values as a series of bits representing left and right moves on the tree.
	 * @param plaintext
	 * @return String encoded
	 */
	public String encode (String plaintext) {
		
	}
	
	/**
	 * Decodes an encoded text using the HuffmanNode tree built during initialization. Finds
	 * characters based on a series of bits representing left and right respectively.
	 * @param encoded
	 * @return plaintext
	 */
	public String decode (String encoded) {
		
	}
	
	/** Returns a string representation of the binary tree.
	* @return String string representation
	*/
	public String toString () {
		return root.toString();
	}
}