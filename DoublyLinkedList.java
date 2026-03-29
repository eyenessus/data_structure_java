public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        Node newTail = new Node(data);
        Node currentTail = this.tail;

        if (currentTail != null) {
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }

        this.tail = newTail;

        if (this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }

        this.head = removedHead.getNextNode();
        if (this.head != null) {
            this.head.setPreviousNode(null);
        }

        if (removedHead == this.tail) {
            this.tail = null;
        }
        return removedHead.data;

    }

    public String removeTail() {
        Node removeTail = this.tail;
        if (removeTail == null) {
            return null;
        }
        this.tail = removeTail.getPreviousNode();
        if (this.tail != null) {
            this.tail.setNextNode(null);
        }

        if (removeTail == this.head) {
            this.head = null;
        }

        return removeTail.data;
    }

    public Node removeByData(String data) {
        Node removeData = null;
        Node currentHead = this.head;

        while (currentHead != null) {
            if (currentHead.data == data) {
                break;
            }
            removeData = removeData.getNextNode();
        }

        if (removeData == null) {
            return null;
        }

        Node previousNode = removeData.getPreviousNode();
        Node nextNode = removeData.getNextNode();

        if (nextNode == null) {
            this.removeTail();
        } else if (previousNode == null) {
            this.removeHead();
        } else {
            previousNode.setNextNode(nextNode);
            nextNode.setPreviousNode(previousNode);
        }

        return removeData;
    }

    // Troca de ponteiros de Nodes
    public void swapNodes(String data1, String data2) {
        Node node1 = this.head;
        Node node2 = this.head;

        if (data1.equals(data2)) {
            return;
        }

        while (node1 != null) {
            if (node1.data.equals(data1)) {
                break;
            }
            node1 = node1.getNextNode();
        }

        while (node2 != null) {
            if (node2.data.equals(data2)) {
                break;
            }
            node2 = node2.getNextNode();
        }

        if (node2 == null || node1 == null) {
            System.out.println("Valide os nomes por favor!");
            return;
        }

        // <>Node1
        Node prevNode1 = node1.getPreviousNode();
        Node nextNode1 = node1.getNextNode();

        // <>Node2
        Node prevNode2 = node2.getPreviousNode();
        Node nextNode2 = node2.getNextNode();

        // Validação de bordas Head e Tail
        if (prevNode1 == null) {
            this.head = node2;
        } else {
            prevNode1.setNextNode(node2);
        }

        if (prevNode2 == null) {
            this.head = node1;
        } else {
            prevNode2.setNextNode(node1);
        }

        if (nextNode1 == null) {
            this.tail = node2;
        } else {
            nextNode1.setPreviousNode(node2);
        }

        if (nextNode2 == null) {
            this.tail = node1;
        } else {
            nextNode2.setPreviousNode(node1);
        }

        if (nextNode1 == node2) {
            node2.setPreviousNode(prevNode1);
            node2.setNextNode(node1);

            node1.setPreviousNode(node2);
            node1.setNextNode(nextNode2);
            return;
        }

        if(nextNode2 == node1){
           node1.setPreviousNode(prevNode2);
           node1.setNextNode(node2);

           node2.setPreviousNode(node1);
           node2.setNextNode(nextNode1);
           return;
        }

        node1.setNextNode(nextNode2);
        node2.setNextNode(nextNode1);

        node1.setPreviousNode(prevNode2);
        node2.setPreviousNode(prevNode1);
    }

    public String printList() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ->  ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        DoublyLinkedList subway = new DoublyLinkedList();
        subway.addToHead("Faria Lima");
        subway.addToHead("Pinheiros");
        subway.addToTail("Fradique Coutinho");
        subway.addToTail("Oscar Freire");
        subway.addToHead("Hebraica-Rebouças");
        subway.addToHead("Butantã");
        subway.addToHead("São Paulo - Morumbi");

        subway.printList();
        subway.swapNodes("São Paulo - Morumbi", "Pinheiros");
        subway.printList();
    }
}
