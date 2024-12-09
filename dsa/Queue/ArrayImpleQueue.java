public class ArrayImpleQueue {
    public static class QueueA {
        int arr[] = new int[5];
        int r = -1;
        int f = -1;
        int size = 0;

        void add(int val) {
            if (r == arr.length - 1) {
                if (f > 0) {
                    // Shift all elements to the front to create space
                    for (int i = f; i <= r; i++) {
                        arr[i - f] = arr[i];
                    }
                    r = r - f;  // Adjust rear after shifting
                    f = 0;  // Reset front to the start
                } else {
                    System.out.println("Queue is full");
                    return;
                }
            }
            if (f == -1) {
                r = f = 0;
                arr[0] = val;
            } else {
                r++;
                arr[r] = val;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return 0;
            } else {
                int removedVal = arr[f]; 
                f++;
                size--;
                return removedVal;
            }
        }

        int peek() {
            if (size == 0) {
                System.out.println("empty Queue");
                return 0;
            } 
                return arr[f];
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.add(1);
        int result = q.peek();
        System.out.println("peek is :" + result);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        result = q.peek();
        System.out.println("peek is :" + result);
        q.remove();
        q.display();
        System.out.println("size is :" + q.size);
        q.add(1);
        q.display();
        System.out.println("size is :" + q.size);
        result = q.peek();
        System.out.println("peek is :" + result);

    }

}
