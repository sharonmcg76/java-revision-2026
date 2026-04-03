package org.example.mockexam.questionfive;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this(data, null, null);
    }

    public int countNodesWith(int number) {
        int result = 0;
        if (number == this.data) {
            result++;
        }
        if (left != null) {
            result += left.countNodesWith(number);
        }
        if (right != null) {
            result += right.countNodesWith(number);
        }
        return result;
    }
}
