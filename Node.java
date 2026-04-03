public class Node {
    public String data;
    private Node next;
    private Node previus;
    public String key;
    
    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public Node(String key, String value){
        this.key= key;
        this(value);
    }

    public void setNextNode(Node node){
        this.next = node;
    }

    public void setKeyValue(String key, String value){
        this.key = key;
        this.data = value;
    }
    
    public Node getNextNode(){
        return this.next;
    }

    public Node getPreviousNode(){
        return this.previus;
    }

    public void setPreviousNode(Node node){
        this.previus = node;
    }

    public static void main(String[] args) {
        Node strawberry = new Node("Berry Testy");
        Node banana = new Node("Banana-rama");
        Node coconut = new Node("Nuts for coconut");

        strawberry.setNextNode(banana);
        banana.setNextNode(coconut);

        Node currentNode = strawberry;

        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.getNextNode();
        }
    }
}   