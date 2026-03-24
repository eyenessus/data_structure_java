public class Node {
    public String data;
    public Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node){
        this.next = node;
    }
    
    public Node getNextNode(){
        return this.next;
    }

    public static void main(String[] args) {
        Node firstNode = new Node("Hello, I'm a node.");
        Node secondNode = new Node("I'm second node.");
        firstNode.setNextNode(secondNode);
        System.out.println(firstNode.next.data);
    }
}   