import java.util.LinkedList;

public class BinaryTreeNode {
    int item;
    BinaryTreeNode parent;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int item) {
        this.item = item;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public BinaryTreeNode left() {
        if (this.left == null)
            return null;
        else
            return this.left;
    }

    public boolean isLeft() {
        if (this.left == null)
            return false;
        else
            return true;
    }

    public BinaryTreeNode right() {
        if (this.right == null)
            return null;
        else
            return this.right;
    }

    public boolean isRight() {
        if (this.right == null)
            return false;
        else
            return true;
    }

    public void binaryPreorder() {
        System.out.println(this.item);
        if (this.isLeft())
            this.left.binaryPreorder();
        if (this.isRight())
            this.right.binaryPreorder();
    }

    public void binaryPostorder() {
        if (this.isLeft())
            this.left.binaryPostorder();
        if (this.isRight())
            this.right.binaryPostorder();
        System.out.println(this.item);
    }

    public void binaryInorder() {
        if (this.isLeft())
            this.left.binaryInorder();
        System.out.println(this.item);
        if (this.isRight())
            this.right.binaryInorder();
    }

    public boolean In(LinkedList<Integer> nodes) {
        nodes.add(this.item);
        if (this.isLeft()) {
            // System.out.println(this.item + " esquerda");
            this.left.In(nodes);
        }
        if (this.isRight()) {
            // System.out.println(this.item + " direita");
            this.right.In(nodes);
        }
        return true;
    }

    public void isIn(int K) {
        LinkedList<Integer> nodes = new LinkedList<Integer>();
        this.In(nodes);
        int tamanho = nodes.size();
        int achou = 0;
        for (int i = 0; i < tamanho; i++) {
            int no = nodes.removeFirst();
            if (no == K) {
                System.out.println("O valor = " + K + " esta presente.");
                achou = 1;
            }
        }
        if (achou != 1) {
            System.out.println("O Valor = " + K + " nao esta presente.");
        }
    }

    public void MaxIn() {
        LinkedList<Integer> nodes = new LinkedList<Integer>();
        this.In(nodes);
        int tamanho = nodes.size();
        int aux = 0;
        for (int i = 0; i < tamanho; i++) {
            int no = nodes.removeFirst();
            if (aux < no) {
                aux = no;
            }
        }
        System.out.println("O maior valor armazenado na arvore e: " + aux);
    }

    public void MinIn() {
        LinkedList<Integer> nodes = new LinkedList<Integer>();
        this.In(nodes);
        int aux = nodes.removeFirst();
        int tamanho = nodes.size();
        for (int i = 0; i < tamanho; i++) {
            int no = nodes.removeFirst();
            if (aux > no) {
                aux = no;
            }
        }
        System.out.println("O menor valor armazenado na arvore e: " + aux);
    }

    public void MediaIn() {
        LinkedList<Integer> nodes = new LinkedList<Integer>();
        this.In(nodes);
        int aux = 0;
        int tamanho = nodes.size();
        for (int i = 0; i < tamanho; i++) {
            aux += nodes.removeFirst();
        }
        int media = aux / tamanho;
        System.out.println("A media dos valores armazenados na arvore e de: " + media);
    }

    public boolean Null(LinkedList<Integer> nulos) {
        int contador = 0;
        if (this.parent == null) {
            contador += 1;
        }
        if (this.left == null) {
            contador += 1;
        }
        if (this.right == null) {
            contador += 1;
        }
        nulos.add(contador);
        if (this.isLeft()) {
            this.left.Null(nulos);
        }
        if (this.isRight()) {
            this.right.Null(nulos);
        }
        return true;
    }

    public void NullIn() {
        LinkedList<Integer> nulos = new LinkedList<Integer>();
        this.Null(nulos);
        int tamanho = nulos.size();
        int aux = 0;
        for (int i = 0; i < tamanho; i++)
            aux += nulos.removeFirst();
        System.out.println("O numero de null's e igual a: " + aux);
    }

    public void SizeIn() {
        LinkedList<Integer> nodes = new LinkedList<Integer>();
        this.In(nodes);
        int tamanho = nodes.size();
        System.out.println("A Quantidade de nos e: " + tamanho);
    }

    public void LeafIn() {
        LinkedList<Integer> nulos = new LinkedList<Integer>();
        this.Null(nulos);
        int tamanho = nulos.size();
        int aux = 0;
        int no = 0;
        // System.out.println(nulos);
        for (int i = 0; i < tamanho; i++) {
            no = nulos.removeFirst();
            if (no == 2)
                aux++;
        }
        System.out.println("O numero de folhas e igual a: " + aux);
    }

    public int Height() {
        if ((this.left ==null) && (this.right ==null)) {
            return 0;
        }
        int lefHeight = this.left.Height();
        int rightHeight = this.right.Height();
        int greatestHeight = Math.max(lefHeight, rightHeight);
        return greatestHeight + 1;
    }
    public void HeightIn(){
        System.out.println("A altura desta arvore e: " + this.Height());
    }
}
