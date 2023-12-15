public class Acepts two numbers {
    // Class A: Accepts two numbers
class A {
    private int number1;
    private int number2;
    
    public A(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    public int getNumber1() {
        return number1;
    }
    
    public int getNumber2() {
        return number2;
    }
}

// Class B: Fetches the last digits of the numbers
class B {
    private int lastDigit1;
    private int lastDigit2;
    
    public B(A input) {
        lastDigit1 = input.getNumber1() % 10;
        lastDigit2 = input.getNumber2() % 10;
    }
    
    public int getLastDigit1() {
        return lastDigit1;
    }
    
    public int getLastDigit2() {
        return lastDigit2;
    }
}

// Class C: Multiplies the last two digits
class C {
    private int result;
    
    public C(B input) {
        result = input.getLastDigit1() * input.getLastDigit2();
    }
    
    public int getResult() {
        return result;
    }
}

// Usage example
public class Main {
    public static void main(String[] args) {
        A input = new A(123, 456);
        B b = new B(input);
        C c = new C(b);
        
        System.out.println("Last digit of number 1: " + b.getLastDigit1());
        System.out.println("Last digit of number 2: " + b.getLastDigit2());
        System.out.println("Result of multiplying the last digits: " + c.getResult());
    }
}

}
