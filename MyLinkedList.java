
public class MyLinkedList {
    
    Node head;
    Node tail;
    public int size;
    
    //inserts at the beginning of the list
    public void insertAtHead(String key) {
        
        Node node = new Node();
        node.key = key;
        node.next = null;
        node.next = head;
        head = node;
        
        size++;
        
    } //end of insertAtHead
    
    //inserts into the middle of the list
    public void insertAtMiddle(String key) {
        
        Node node = new Node(key);
        
        //checks to see if list is empty
        if(head == null) {
            
            head = node;
            tail = node;
            
        } else {
           
            Node temp;
            Node current;
            
            int count = middle();
            
            temp = head;
            current = null;
            
            for(int i = 0; i < count; i++) {
                
                current = temp;
                temp = temp.next;
                
            }
            
            current.next = node;
            node.next = temp;
            
        }
        
        size++;
        
    } //end of insertAtMiddle
    
    //inserts at the end of the list 
    public void insertAtTail(String key) {
    
        Node node = new Node(key);
        
        //checks to see if list is empty 
        if (head == null) { 
            
            head = node;
            //tail = node;
            
        }
            
            Node temp = head;
            
            while(temp.next != null) {
                
                temp = temp.next;
                
            }
            
        temp.next = node;
            
        size++;
        
    } //end of insertAtTail
    
    //removes node from start of line
    public void removeFromHead() {
        
        //checks to see if list is empty
        if(head == null) {
            
            System.out.println("List is empty.");
            
        } else {
            
            //checks for only one element
            if(head != tail) {
                
                head = head.next;
                
            } else {
                
                head = null;
                tail = null;
                
            }
            
        }
        
        size--;
        
    } //end of removeFromHead
    
    //removes the node from the middle of the list
    public void removeFromMiddle() {
        
        Node temp;
        Node current;
        
        //checks to see if list is empty
        if(head == null) {
            
            System.out.print("List is empty.");
            
        } else {
            
            int count = middle();
            
            //checks for only one element
            if(head != tail) {
                
                temp = head;
                current = null;
                
                for(int i = 0; i < count; i++) {
                    
                    current = temp;
                    temp = temp.next;
                    
                }
                
                if(current != null) {
                    
                    current.next = temp.next;
                    temp = null;
                    
                } else {
                    
                    head = tail = temp.next;
                    temp = null;
                    
                }
                
            } else {
                
                head = null;
                tail = null;
                
            } 
                
        }
        
        size--;
        
    } //end of removeFromMiddle
    
    //removes node from the end of the list
    public void removeFromTail() {
        
        //checks to see if list is empty
        if(head == null) {
            
            System.out.println("List is empty.");
            
        }
        
        if(head.next == null) {
            
            head = head.next;
            
        }
        
        Node previous = null;
        Node temp = head;
        
        while(temp.next != null) {
            
            previous = temp;
            temp = temp.next;
            
        }
            
        previous.next = null;
        
        size--;
        
    } //end of removeFromTail
    
    //Prints the size of the list
    public void sizeList() {
        
        System.out.println("The length of the list is: " + size);
        
    } //end of sizeList
    
    //searches for an element in the list
    public void searchForElement(String element) {
        
        //checks to see if list is empty
        if(head == null) {
            
            //element not found
            System.out.println("List is empty. Element \"" + element + "\" nout found.");
        }
        
        int index = 0;
        Node temp = head;
        
        //while loop to search entire list
        while(temp != null) {
            
            if(temp.key.equalsIgnoreCase(element)) {
                
                System.out.println("Element \"" + temp.key + "\" found in the list at index " + index + ".");
                break;
            } 
            
            index++;
            temp = temp.next;
            
        }
        
        if(temp == null) {
                
                System.out.println("Element \"" + element + "\" not found in the list.");
                
        }
        
    } //end of searchForElement
    
    //displays the contents of the list
    public void display() {
    
        Node current = head;
        
        if(head == null) {
            
            System.out.println("List is empty.");
        
        }
        
        System.out.println("Current contents of list: ");
        
        while(current != null) {
            
            System.out.println(current.key);
            current = current.next;
            
        }
        
        System.out.println();
        
    } //end of display
    
    public int middle() {
        
        if(size % 2 == 0) {
            
            return ((size / 2) + 1);
            
        } else {
            
            return ((size / 2) + 1);
            
        }
        
    } //end of middle
    
} //end of class