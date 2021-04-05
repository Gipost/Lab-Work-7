package com.edu.nodes;

public class DivideNode implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;
    public DivideNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double calculate() {
        if (left.calculate() == 0)
        {
            return left.calculate();
        }
        else
            return left.calculate() / right.calculate();
    }
    public String toString() {
        if (left instanceof SimpleNode){
            if (!(right instanceof SimpleNode))
            {
                return " " + left.toString() + " / (" + right.toString() + ")";
            }
            else
            return " " + left.toString() + " / " + right.toString() + " ";
        }
        else
            return "(" + left.toString() + ") / (" + right.toString() + ")";
        }
    }
