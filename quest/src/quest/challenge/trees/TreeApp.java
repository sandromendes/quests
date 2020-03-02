package quest.challenge.trees;

public class TreeApp {

	public static void main(String[] args) {
		Node tree = new Node(2);
		
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		tree.insert(6);
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(10);
		tree.insert(8);
		tree.insert(12);

		System.out.println("Teste de busca: ");
		
		System.out.println("Contém o número 4? " + tree.contains(4));
		System.out.println("Contém o número 20? " + tree.contains(20));
		
		System.out.println("Percurso em ordem: " + tree.inorder());
		System.out.println("Percurso pré-ordem: " + tree.preorder());
		System.out.println("Percurso pós-ordem: " + tree.postorder());
	}

}
