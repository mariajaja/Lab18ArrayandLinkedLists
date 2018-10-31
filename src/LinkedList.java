/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class LinkedList implements List {

	// head is the first node in the list. if null, the list is empty.
	private Object head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	@Override
	public boolean removeAt(int index) {
		// remove an object at specified index
		// returns false if index is out of range

		Object beforeObject = getObjectAt(index - 1);
		Object newObject = new Object();
		Object afterObject = getObjectAt(index + 1);

		if (index < 0 || index >= length) {
			return false;
		}

//		for (int i = 0; i < index; i++) {
//			newObject = newObject.getNext();
//		}
		if (index == 0) {
			newObject = head;
			head = newObject.getNext();
		} else {
			for (int i = length; i >= index; i--) {
				if (newObject == null) {
					return false;
				}
				beforeObject.setNext(afterObject);
			}
		}
		length--;
		return true;
	}

	@Override
	public boolean insertAt(int index, String data) {
		Object beforeObject = getObjectAt(index - 1);
		Object newObject = new Object(data);
		Object afterObject = getObjectAt(index);

		if (index == 0) {
			newObject.setNext(head);
			head = newObject;
			length++;
			return true;
		} else {
			for (int i = 0; i < index; i++) {
				if (newObject == null) {
					return false;
				}
				beforeObject.setNext(newObject);
				newObject.setNext(afterObject);
			}
			length++;
			return true;
		}
	}

	@Override
	public void addAtEnd(String data) {
		Object tail = new Object(data, null);

		if (length < 1) {
			Object newObject = new Object(data);
			newObject.setNext(head);
			head = newObject;
		} else {
			Object beforeTail = getObjectAt(length - 1);
			beforeTail.setNext(tail);
			tail.setNext(null);
		}
		length++;
	}

	private Object getObjectAt(int index) {
		// start at the head
		Object object = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (object == null) {
				return null;
			}
			object = object.getNext();
		}
		return object;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Object object = head;
		// follow the links between nodes until it reaches the end
		while (object != null) {
			sb.append(object.toString());
			object = object.getNext();
		}
		return sb.toString();
	}
}
