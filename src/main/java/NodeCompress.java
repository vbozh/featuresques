// Huffman Coding in Java

import java.util.Comparator;
import java.util.PriorityQueue;

public class NodeCompress {
    int item;
    char c;
    NodeCompress left;
    NodeCompress right;
}

// For comparing the nodes
class ImplementComparator implements Comparator<NodeCompress> {
    public int compare(NodeCompress x, NodeCompress y) {
        return x.item - y.item;
    }
}

// IMplementing the huffman algorithm
class Huffman {
    public static void printCode(NodeCompress root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {

            System.out.println(root.c + "   |  " + s);

            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

        int n = 4;
        char[] charArray = {'A', 'B', 'C', 'D'};
        int[] charfreq = {5, 1, 6, 3};

        PriorityQueue<NodeCompress> q = new PriorityQueue<NodeCompress>(n, new ImplementComparator());

        for (int i = 0; i < n; i++) {
            NodeCompress hn = new NodeCompress();

            hn.c = charArray[i];
            hn.item = charfreq[i];

            hn.left = null;
            hn.right = null;

            q.add(hn);
        }

        NodeCompress root = null;

        while (q.size() > 1) {

            NodeCompress x = q.peek();
            q.poll();

            NodeCompress y = q.peek();
            q.poll();

            NodeCompress f = new NodeCompress();

            f.item = x.item + y.item;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;

            q.add(f);
        }
        System.out.println(" Char | Huffman code ");
        System.out.println("--------------------");
        printCode(root, "");
    }
}