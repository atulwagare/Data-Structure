/**
 * Get sum of last kth elements from given linkedList.
 * @author Atul Wagare
 */
public class FindSumOfNthElementsFromLast {

	private Node node;

	class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
		}
	}
	/**
	 * Add new node
	 * @param data
	 */
	public void addNode(int data) {
		if (node == null) {
			node = new Node(data);
			return;
		}

		Node tempNode = node;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}

		tempNode.next = new Node(data);
	}

	/**
	 * Print whole list
	 */
	public void printList() {
		if (node == null) {
			System.out.println("Linked list has no elements.");
			return;
		}
		Node tempNode = node;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			System.out.println(tempNode.data + " ");
		}
	}
	/**
	 * Find the element from last
	 * @param i position from end
	 */
	public void findNodeFromLast(int i) {
		if (node == null) {
			System.out.println("Linked list has no elements.");
			return;
		}
		Node p = getElementFromLast(i);
		System.out.println(i + " element fron last is " + p.data);
	}

	
	private Node getElementFromLast(int i) {
		int count = 0;
		Node p = node;
		Node q = node;

		while (count < i - 1) {
			q = q.next;
			count = count + 1;
		}

		while (q.next != null) {
			q = q.next;
			p = p.next;
		}
		return p;
	}

	/**
	 * Find the sum of nth elements
	 * @param i position from end
	 */
	public void printSumOfLast(int i) {
		Node node = getElementFromLast(i);
		if (node == null) {
			System.out.println("No Elements");
			return;
		}
		int sum = 0;
		while (node.next != null) {
			sum = sum + node.data;
			node = node.next;
		}
		sum = sum + node.data;
		System.out.println("Sum of last " + i + " element is " + sum);
		
	}

	public static void main(String[] args) {
		FindSumOfNthElementsFromLast list = new FindSumOfNthElementsFromLast();
		
		list.addNode(12);
		list.addNode(14);
		list.addNode(15);
		list.addNode(16);
		list.addNode(56);
		list.addNode(13);
		list.addNode(7);
		list.addNode(1);
		list.addNode(50);
		
		list.printList();
		System.out.println("=====================================");
		list.findNodeFromLast(4);
		System.out.println("=====================================");
		list.printSumOfLast(3);
	}
}
