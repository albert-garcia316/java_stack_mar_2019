public class SLList {
    public Node head;
    public SLList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        if(this.head != null){
            Node runner = this.head;
            while(runner.next.next != null){
                runner = runner.next;
            }
            if(runner == this.head){
                this.head = null;
            }
            else {
                runner.next = null;
            }
        }
        else{
            System.out.println("This list is empty, cannot remove any nodes");
        }
    }
    public void printValues(){
        if(this.head != null){
            Node runner = head;
            System.out.println(runner.value);
            while(runner.next != null) {
                runner = runner.next;
                System.out.println(runner.value);
            }
        }
    }
    public Node find(int value){
        if(this.head != null){
            Node runner = this.head;
            if(runner.value == value){
                return runner;
            }
            while(runner.next != null) {
                runner = runner.next;
                if(runner.value == value){
                    return runner;
                }
            }
            System.out.println("No nodes in this list had a value of: " + value);
            return null;
        }
        System.out.println("This list is empty");
        return null;
    }
}