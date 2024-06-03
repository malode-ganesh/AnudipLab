public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    public void insert(int item) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[++size] = item;
        int current = size;
        while (current > 1 && heap[current] < heap[current / 2]) {
            swap(current, current / 2);
            current = current / 2;
        }
    }

    public int deleteMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return min;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void heapify(int pos) {
        int smallest = pos;
        int leftChild = 2 * pos;
        int rightChild = 2 * pos + 1;

        if (leftChild <= size && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }

        if (rightChild <= size && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }

        if (smallest != pos) {
            swap(pos, smallest);
            heapify(smallest);
        }
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public static void main(String[] args) {
        MinHeap priorityQueue = new MinHeap(10);

        priorityQueue.insert(15);
        priorityQueue.insert(10);
        priorityQueue.insert(20);
        priorityQueue.insert(5);

        System.out.println("Priority queue size: " + priorityQueue.size());
        System.out.println("Delete min: " + priorityQueue.deleteMin());
        System.out.println("Priority queue size after deleteMin: " + priorityQueue.size());
        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());

        while (!priorityQueue.isEmpty()) {
            System.out.println("Delete min: " + priorityQueue.deleteMin());
        }

        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());
    }
}
