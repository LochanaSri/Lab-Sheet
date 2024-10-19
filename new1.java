import java.util.Collection;
import java.util.LinkedList;

class CollectionPractical1{
	public static void main(String []args){
		Collection<Integer> c = new LinkedList();
		c.add(5);
		c.add(4);
		c.add(3);
		c.add(6);
		c.add(8);
		System.out.println("Is collection empty "+c.isEmpty());
		System.out.println("Collection Size is "+c.size());
		if (c.contains(6)){
			System.out.println("Collection contains the element");
		}else{
			System.out.println("Collection Does not contain the element");
		}
		System.out.println("Collection values are: "+c);
		c.remove(5);
		System.out.println("Collection values are: "+c);
	}
	
	
}