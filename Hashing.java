//Seperate Chaining
public class Hashing {
	int size;
	Node arr[];
	
	// tum array null ile baslatildi.Ekleme yaparken bos mu degil mi diye kontrol icin.
	Hashing(int size){
		this.size = size;
		arr = new Node[size];
		for(int i = 0; i < size; i++) {
			arr[i] = null;
		}
	}  
	
	//eklerken bos mu degil mi diye bakiyoruz.Bossa direk ekledik, degilse linked list mantigi ile ekledik
	void insert(int toAdd) {
		int index = hashCode(toAdd);
		Node v = new Node(toAdd);
		if(arr[index] == null) {
			arr[index] = v; 
		}
		
		else {
			Node temp = arr[index];
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = v;
		}
	}
	
	//diziyi yazdiriyor
	void print() {
		for(int i = 0; i < size; i++) {
			Node temp = arr[i];
			System.out.printf("{ ");
			while(temp != null) {
				System.out.printf("%d ", temp.data);
				temp = temp.next;
			}
			System.out.printf("}\n");
		}	
	}
	
	//hash code uretir
	int hashCode(int x) {
		return (3 * x + 4) % size;
	}
	
	//arama fonksiyonu
	int search(int data) {
		return hashCode(data);
	}
	
	public static void main(String[] args) {
		Hashing hash = new Hashing(4);
		hash.insert(8);
		hash.insert(2);
		hash.insert(4);
		hash.insert(7);
		hash.insert(9);
		hash.insert(31);
		hash.insert(97);
		hash.insert(3);
		hash.insert(10);
		//System.out.println(hash.search(97));
		hash.print();
	}
}
