public class Stack {
    LinkedList stack;
    int size;
    int maxSize;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;

    public Stack(){
        this.stack = new LinkedList();
        this.size = 0;
        this(DEFAULT_MAX_SIZE);
    }
    public Stack(int maxSize){
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void push(String data){
        if(!this.hasSpace()){
            System.out.println("Stack is full");
            return;
        }
        this.stack.addToHead(data);
        this.size++;
        System.out.println("Pushed: " + data);
    }

    public void pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        this.stack.removeHead();
        this.size--;
        System.out.println("Popped: " + this.stack.head.data);
    }

    public String peek(){
        return this.stack.head.data;
    }

    public boolean hasSpace(){
        return this.size < this.maxSize;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }


    public static void main(String[] args) {
        
    }
}
