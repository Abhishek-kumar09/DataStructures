

public class Queue {
    LinkedLists ls = new LinkedLists();
    void enQueue(int key) {
        ls.pushBegin(key);
    }
    int deQueue() {
        int temp = ls.popEnd().data;
        return temp;
    }
}
