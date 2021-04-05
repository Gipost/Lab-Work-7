package com.edu.nodes;
import java.util.*;
public class AddNode implements AbstractNode {
    private final Collection<AbstractNode> list;
         public AddNode(Collection<AbstractNode> list)
             {
                this.list = list;
             }
 @Override
 public double calculate() {
         double result = 0;
         for (AbstractNode node : list) {
             result += node.calculate();
             }
         return result;
         }

    @Override
    public String toString()
    {
         String result = "";
         boolean first = true;
         for (AbstractNode node : list) {
             if (!first) result += " + ";
             first = false;
             if (node instanceof SimpleNode)
             {
                 result += " " + node + " ";
             }
             else
                result += "(" + node + ")";
             }
         return result;
    }

}
