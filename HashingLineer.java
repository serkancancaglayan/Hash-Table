public class HashingLineer {
	int size;
	Integer arr[];
	int capacity = 0;
	public HashingLineer(int size) {
		this.size = size;
		arr = new Integer[size];
		for(int i = 0; i < size; i++) {
			arr[i] = null;
		}
	}
	public void insert(int toAdd) {
		if(capacity >= size) {
			System.err.println("Dolu");
			return;
		}
		int index = hashCode(toAdd);
		if(arr[index] == null) {
			arr[index] = toAdd;
		}
		else {
			int i = 1;
			while(arr[index] != null) {
				index = index + i;
				if(index >= size) {
					index = 0;
				}
				// quadratic probingde i++ yerine i = i * i veya i^n yapilir
			}
			arr[index] = toAdd;
		}
		capacity = capacity + 1;
	}
	public void print() {
		for(int i = 0; i < size; i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
	private int hashCode(int x) {
		return (3 * x + 4) % size;
	}/*
	public static void main(String[] args) {
		HashingLineer hash = new HashingLineer(10);
		hash.insert(5);
		hash.insert(15);
		hash.insert(25);
		hash.print();
	}*/
}
