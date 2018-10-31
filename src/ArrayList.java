import java.util.Arrays;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class ArrayList implements List {
	// The allocated array of memory. This might be bigger than the actual list.
	private static String[] array = new String[4];

	// How many items are actually in the list. May be less than the length of the
	// array.
	private int length = 0;

	@Override
	public boolean removeAt(int index) {

		if (length == 0) {
			return false;
		}

		for (int i = index; i < length; i++) {
			array[i - 1] = array[i];
		}

		if (array[index] == null) {
			return false;
		}

		array[length - 1] = null;
		length--;

		return true;
	}

	@Override
	public boolean insertAt(int index, String a) {

		if (length == array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}

		for (int i = length; i >= index; i--) {
			array[i] = array[i - 1];
		}
		if (array[index] == null) {
			return false;
		}
		array[index] = a;
		length++;
		return true;
	}

	@Override
	public void addAtEnd(String data) {
		if (length == array.length) {
			// If our array is out of space, double the size.
			array = Arrays.copyOf(array, array.length * 2);
		}
		// Set the next item in the array and increment the length.
		array[length] = data;
		length++;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				// Add comma, except after last item
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}
