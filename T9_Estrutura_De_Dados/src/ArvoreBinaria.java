/* Gabriel Prande Bernardello   RA: 20.01288-8
    Jonathan Martins Gomes      RA: 20.00862-7 
    Matheus Marins Bernardello  RA: 20.00286-6 
 */

public class ArvoreBinaria {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);
        BinaryTreeNode no_1 = new BinaryTreeNode(1);
        BinaryTreeNode no_2 = new BinaryTreeNode(2);
        BinaryTreeNode no_3 = new BinaryTreeNode(3);
        BinaryTreeNode no_4 = new BinaryTreeNode(4);
        BinaryTreeNode no_5 = new BinaryTreeNode(5);
        BinaryTreeNode no_6 = new BinaryTreeNode(6);

        x.root.left = no_1;
        x.root.right = no_2;
        no_1.parent = x.root;
        no_2.parent = x.root;
        no_2.left = no_3;
        no_2.right = no_4;
        no_3.parent = no_2;
        no_3.left = no_5;
        no_3.right = no_6;
        no_4.parent = no_2;
        no_5.parent = no_3;
        no_6.parent = no_3;

        System.out.println("Resposta do item 2.");
        x.root.binaryPreorder();
        System.out.println();
        x.root.binaryPostorder();
        System.out.println();
        x.root.binaryInorder();
        System.out.println();

        System.out.println("Resposta do item 3.");
        x.root.isIn(6);
        System.out.println();

        System.out.println("Resposta do item 4.");
        x.root.MaxIn();
        System.out.println();

        System.out.println("Resposta do item 5.");
        x.root.MinIn();
        System.out.println();

        System.out.println("Resposta do item 6.");
        x.root.MediaIn();
        System.out.println();

        System.out.println("Resposta do item 7.");
        x.root.NullIn();
        System.out.println();

        System.out.println("Resposta do item 8.");
        x.root.SizeIn();
        System.out.println();

        System.out.println("Resposta do item 9.");
        x.root.LeafIn();
        System.out.println();

        System.out.println("Resposta do item 10.");
        x.root.HeightIn();   
        System.out.println();
    }
}
