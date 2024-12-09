
public class circularQueueimp {
    public static class QueueCC {
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[5];
        void add(int val) {
            if(size==arr.length){
                System.out.println("Queue is full");
                return;
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                rear++;
                arr[rear]=val; 
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val; 
            }
            size++;  
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            else if(front==arr.length-1){
                int val=arr[front];
                size--;
                return val;
                
            }
            else{
                int val1=arr[front];
                front++;
                size--;
                return val1;
            } 
        }
        void peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return ;
            }
            else
            System.out.println("peek is : "+arr[front]);
        }
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else{
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.err.print(arr[i]+" ");
                }
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        QueueCC q = new QueueCC();
        q.display();
        q.add(1);
        q.add(2);
        q.display();
        q.peek();
        System.out.println("Size is :"+q.size);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println("Size is :"+q.size);
        q.add(6);
        q.remove();
        System.out.println("Size is :"+q.size);
        q.display();
        q.peek();

    }

}
