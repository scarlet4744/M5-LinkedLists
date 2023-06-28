
public class Node {
    
    public String key;
    public Node next;
    
    //default constructor
    public Node() {
        
    	next = null;
    	key = "";
        
    }
    
    //constructor 
    public Node(String key) {
        
        this.key = key;
        this.next = null;
        
    }
    
    //setters and getters for nodes and keys
    public Node getNext() {
        
    	return next;
        
    }
    
    public void setNext(Node node) {
        
    	next = node;
        
    }
    
    public String getKey() {
        
    	return key;
        
    }
    
    public void setKey(String element) {
        
    	key = element;
        
    }
    
    //toString method
   // @Override
    //public String toString() {
    	//return Integer.toString(key);
    //}
    
} //end of class
