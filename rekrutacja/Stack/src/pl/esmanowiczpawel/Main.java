package pl.esmanowiczpawel;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(1.6);
        stack.push(6.2);
        stack.push(3.2);
        stack.push(2.2);
        stack.push(9.2);
        stack.push(11.2);
        stack.push(22.2);
        stack.push(7.2);
        stack.push(4.2);
        stack.push(0.2);

        System.out.println("------Size stack--------------");
        System.out.println(stack.size());
        System.out.println("------All elements------------");
        stack.printElement();
        System.out.println("------Reverse stack-----------");
        stack.reverse();
        System.out.println("------All elements------------");
        stack.printElement();
        System.out.println("------Pop element-------------");
        stack.pop();
        System.out.println("------All elements------------");
        stack.printElement();
        System.out.println("------Size stack--------------");
        System.out.println(stack.size());
        System.out.println("------Min element-------------");
        System.out.println(stack.PeekMin());
        System.out.println("------Clear-------------------");
        stack.clear();
        System.out.println("------Size stack--------------");
        System.out.println(stack.size());
        System.out.println("------Exception---------------");
        stack.clear();
    }
}
