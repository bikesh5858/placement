package oops.inheritance;
interface A {
    void display();
}

interface B {
    void display();
}

class RemoveDiamond implements A, B {
    public void display() {
        System.out.println("Class C implementing display");
    }
    public static void main(String[] args) {
        RemoveDiamond obj = new RemoveDiamond();
        obj.display(); // No ambiguity, Class C provides the implementation.
    }
}

