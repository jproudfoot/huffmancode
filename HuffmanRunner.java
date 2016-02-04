
public class HuffmanRunner {
	public static void main (String [] args) {
		HuffmanTree tree = new HuffmanTree("hello");
		System.out.println(tree);
		
		System.out.println(tree.encode("hell"));
		System.out.println(tree.decode("11001010"));
		
	}
}
