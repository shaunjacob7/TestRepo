package Collection;

import java.util.Hashtable;
import java.util.Map;

class Book{
	int id;
	int qty;
	String name,author;
	public Book(int id, int qty, String name, String author) {
		this.id = id;
		this.qty = qty;
		this.name = name;
		this.author = author;
	}

	
}

public class HashTableExample {

	public static void main(String[] args) {
		Map<Integer,Book> map=new Hashtable<>();
		Book b1=new Book(205,1,"aaaa","fff1");
		map.put(5, b1);
		map.put(1,new Book(200,1,"aaaa","fff1"));
		map.put(2,new Book(201,2,"bbbb","fff2"));
		map.put(3,new Book(202,3,"cccc","fff3"));
		map.put(4,new Book(203,4,"dddd","fff4"));
		
		for(Map.Entry<Integer,Book> entry:map.entrySet()) {
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println(key+"details");
			System.out.println(b.id+" "+b.name+" "+b.author+" ");
		}
		
	}

}
