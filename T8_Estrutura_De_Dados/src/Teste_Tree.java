/*  Gabriel Prande Bernardello  RA: 20.01288-8
    Jonathan Martins Gomes      RA: 20.00862-7 
    Matheus Marins Bernardello  RA: 20.00286-6
 */

public class Teste_Tree {
    public static void main(String[] args) {
        Tree x = new Tree();
        x.insert_root(5);
        Node_Tree no_1 = new Node_Tree(1);
        Node_Tree no_2 = new Node_Tree(2);
        Node_Tree no_3 = new Node_Tree(3);
        Node_Tree no_4 = new Node_Tree(4);
        Node_Tree no_6 = new Node_Tree(6);
        Node_Tree no_7 = new Node_Tree(7);
        Node_Tree no_8 = new Node_Tree(8);
        Node_Tree no_0 = new Node_Tree(0);
        Node_Tree no_21 = new Node_Tree(21);
        Node_Tree no_12 = new Node_Tree(12);

        x.root.firstChild = no_4;

        no_4.parent = x.root;
        no_4.next = no_3;
        no_4.firstChild = no_1;
        no_1.parent = no_4;
        no_1.next = no_2;
        no_2.parent = no_4;

        no_3.parent = x.root;
        no_3.next = no_7;
        no_3.firstChild = no_8;
        no_8.parent = no_3;
        no_8.firstChild = no_21;
        no_21.parent = no_8;
        no_21.next = no_12;
        no_12.parent = no_8;

        no_7.parent = x.root;
        no_7.firstChild = no_0;
        no_0.parent = no_7;
        no_0.next = no_6;
        no_6.parent = no_7;

        System.out.println("Resposta a) Filhos do no 5: ");
        x.root.imprimeFilhos();
        System.out.println();
        System.out.println("Resposta b) Valor armazenado no pai do no 8: ");
        no_8.imprime_Parent();
        System.out.println();
        System.out.println("Resposta c) Valor dobrado dos filhos do no 8: ");
        no_8.DobraFilhos();
        System.out.println();
        System.out.println("Resposta c) Valor dobrado do pai do no 2: ");
        no_2.DobraPai();
        System.out.println();

    }

}
