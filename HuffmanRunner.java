
public class HuffmanRunner {
	public static void main (String [] args) {
		HuffmanNode root = new HuffmanNode(null);
		HuffmanNode leftRoot = new HuffmanNode(null);
		HuffmanNode rightRoot = new HuffmanNode(null);
		
		leftRoot.setLeft(new HuffmanNode('a'));
		leftRoot.setRight(new HuffmanNode('b'));
		
		rightRoot.setLeft(new HuffmanNode('c'));
		rightRoot.setRight(new HuffmanNode('d'));
		
		root.setLeft(leftRoot);
		root.setRight(rightRoot);
		
		System.out.println(root);
	}
}
