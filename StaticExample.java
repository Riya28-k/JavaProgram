class StaticExample {
static int count;
static {
        count = 10;
        System.out.println("Static block executed. Count initialized to " + count);
    }
    static void display() {
     System.out.println("Static method called. Count = " + count);
    }
    
    public static void main(String[] args) {
        StaticExample.display();
        StaticExample.count = 20;
        StaticExample.display();
    }
}
