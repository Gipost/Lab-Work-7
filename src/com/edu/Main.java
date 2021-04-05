package com.edu;
import java.util.Arrays;
import java.util.Scanner;
import com.edu.nodes.*;


public class Main {
    private static AbstractNode generateFirst() {
        return new AddNode(Arrays.asList(new SimpleNode(5),
                new DivideNode(new SimpleNode(0), new AddNode(Arrays.asList(new SimpleNode(15), new SimpleNode(2), new SimpleNode(3),
                        new SimpleNode(4)))), new SimpleNode(6), new SimpleNode(7))
        );
    }
    private static AbstractNode generateSecond() {
        return new DivideNode(
                new AddNode(Arrays.asList(new SimpleNode(5), new SimpleNode(2), new SimpleNode(1), new SimpleNode(3))),
                new AddNode(Arrays.asList(new SimpleNode(7), new SimpleNode(3), new SimpleNode(4), new SimpleNode(5))));
    }
    public static void main(String[] args) {
        AbstractNode first = generateFirst();
        AbstractNode second = generateSecond();
        System.out.println("The first expression is: \n" + first.toString()
                + " = " + first.calculate());
        System.out.println("The second expression is: \n" + second.toString()
                + " = " + second.calculate());
    }
}