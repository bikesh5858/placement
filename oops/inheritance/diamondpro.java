package oops.inheritance;
class A {
    void display() {
        System.out.println("Class A");
    }
}
class B {
    void display() {
        System.out.println("Class B");
    }
}
// IF class diamondpro extends A , B THEN PROBLEM ARISE
class diamondpro extends A { // Hypothetical multiple inheritance
    public static void main(String[] args) {
        diamondpro obj = new diamondpro();
        obj.display(); // Ambiguity: Should it call A's display() or B's display()?
    }
}


