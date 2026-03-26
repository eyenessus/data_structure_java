public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;

        this.head = newHead;

        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tailNode = new Node(data);
        Node currentNode = this.head;

        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(tailNode);
    }

    public String removeHead(){
        Node removedHead = this.head;
        if(removedHead ==null){
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String printList(){
        Node head = this.head;
        String output = "<head> ";
        while (head != null) {
            output += head.data + " ";
        }
        output += "<tail>";
        return output;
    }

    public static void main(String[] args) {

    }
}
