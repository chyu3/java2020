public class BST
{
    private BinaryNode root;

    //public BST(BinaryNode root) { this.root = root; }

    public BST(int root)
    {
        this.root = new BinaryNode(root);
        System.out.println("BST created with " + root + " as its root.");
    }

    public boolean isEmpty()
    {
        return this.root == null;
    }

    public void add(BinaryNode node, BinaryNode newNode)
    {
        if (newNode.getData() < node.getData())
        {
            if (node.getLeft() != null)
                add(node.getLeft(), newNode);
            else
            {
                node.setLeft(newNode);
                System.out.println(newNode + " added to the left of " + node);
            }
        } else if (newNode.getData() > node.getData())
        {
            if (node.getRight() != null)
                add(node.getRight(), newNode);
            else
            {
                node.setRight(newNode);
                System.out.println(newNode + " added to the right of " + node);
            }
        }
    }

    public void add(int data)
    {
        BinaryNode n = new BinaryNode(data);
        add(this.root, n);
    }

    private void inOrder(BinaryNode node)
    {
        if (node.getLeft() != null)
            inOrder(node.getLeft());
        System.out.print(node + " ");
        if (node.getRight() != null)
            inOrder(node.getRight());
    }

    private void preOrder(BinaryNode node)
    {
        System.out.print(node + " ");
        if (node.getLeft() != null)
            preOrder(node.getLeft());

        if (node.getRight() != null)
            preOrder(node.getRight());
    }

    private void postOrder(BinaryNode node)
    {
        if (node.getLeft() != null)
            postOrder(node.getLeft());

        if (node.getRight() != null)
            postOrder(node.getRight());

        System.out.print(node + " ");
    }


    private void descOrder(BinaryNode node)
    {
        if (node.getRight() != null)
            descOrder(node.getRight());
        System.out.print(node + " ");
        if (node.getLeft() != null)
            descOrder(node.getLeft());
    }

    public boolean search(BinaryNode node)
    {


    }

    public static void main(String[] args)
    {
        BST b = new BST(5);
        b.add(12);
        b.add(3);
        b.add(9);
        b.add(2);
        System.out.println("preOrder traversal: ");
        b.preOrder(b.root);
        System.out.println("\nInOrder traversal: ");
        b.inOrder(b.root);
        System.out.println("\npostOrder traversal: ");
        b.postOrder(b.root);
        System.out.println("\ndescending Order traversal: ");
        b.descOrder(b.root);
    }

}

/*
    BST created with 5 as its root.
        (12) added to the right of (5)
        (3) added to the left of (5)
        (9) added to the left of (12)
        (2) added to the left of (3)
        preOrder traversal:
        (5) (3) (2) (12) (9)
        InOrder traversal:
        (2) (3) (5) (9) (12)
        postOrder traversal:
        (2) (3) (9) (12) (5)
        descending Order traversal:
        (12) (9) (5) (3) (2)

*/