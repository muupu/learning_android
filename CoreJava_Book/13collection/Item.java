
import java.util.*;

public class Item implements Comparable<Item> {

	private String mDescription;
	private int mPartNumber;

	public Item(String description, int partNumber) {
		mDescription = description;
		mPartNumber = partNumber;
	}

	public String getDescription() {
		return mDescription;
	}

	public String toString() {
		return "[description=" + mDescription + ", partNumber=" + mPartNumber + "]";
	}

	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null) return false;
		if (getClass() != other.getClass()) return false;
		Item otherItem = (Item)other;
		return Objects.equals(mDescription, otherItem.mDescription) && mPartNumber == otherItem.mPartNumber;
	}

	public int hashCode() {
		return Objects.hash(mDescription, mPartNumber);
	}

	public int compareTo(Item other) {
		return Integer.compare(mPartNumber, other.mPartNumber);
	}
}