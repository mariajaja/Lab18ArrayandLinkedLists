/**
* 
*/

/**
 * @author Mariah
 *
 */
public class LinkedAndArrayList {

	public static void main(String[] args) {
		testArrayList();
		testLinkedList();

	}

	private static void testLinkedList() {
		List linkedUp = new LinkedList();

		linkedUp.addAtEnd("a");
		linkedUp.addAtEnd("b");
		linkedUp.addAtEnd("c");
		linkedUp.addAtEnd("d");

		try {
//			boolean linkedTF = linkedUp.insertAt(7, "NEW");
			boolean linkedTF = linkedUp.removeAt(7);

			if (linkedTF == true) {
				System.out.println(linkedUp);
			} else {
				System.out.println("Sorry that's not a valid index to add to! Try a smaller index.");
			}
		} catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Sorry that's not a valid index to add to! Try a smaller index.");
		}

	}

	private static void testArrayList() {

		List arrayList = new ArrayList();

		arrayList.addAtEnd("a");
		arrayList.addAtEnd("b");
		arrayList.addAtEnd("c");
		arrayList.addAtEnd("d");

		try {
//			boolean arrayTF = arrayList.insertAt(7, "NEW");
			boolean arrayTF = arrayList.removeAt(7);
			if (arrayTF == true) {
				System.out.println(arrayList);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Sorry that's not a valid index to add to! Try a smaller index.");
		}

	}

}
