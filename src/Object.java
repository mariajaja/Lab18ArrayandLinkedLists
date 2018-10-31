
/**
 * @author Mariah
 *
 */
public class Object {
	// The value stored by this node
	private String data;
	// Link to the next node.
	private Object next;

	public Object(String data, Object next) {
		this.data = data;
		this.next = next;
	}

	public Object(String data) {
		this.data = data;
	}

	public Object() {
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Object getNext() {
		return next;
	}

	public void setNext(Object next) {
		this.next = next;
	}

	@Override
	public String toString() {
		if (next != null) {
			return this.data + " -> ";
		} else {
			return this.data;
		}
	}

}
