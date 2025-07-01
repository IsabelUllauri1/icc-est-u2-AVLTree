public class AVLtree {

    private Node root;

    public AVLtree() {
        this.root = null;
    }

    public int height(Node node) {// altura de el NODO
        if (node == null) {// para sacar la altura se pregunta a los hijos que altura teienen, se saca el
                           // maximo entre left&right y se suma 1
            return 0;

        }
        return node.getHeight();
    }

    public int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());

    }

    public void insert(int value) {

        System.out.println("Nodo a insertar: ");
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            System.out.println("Nodo insertado: " + newNode.getValue() + "Balance a insertar: " + getBalance(newNode));
            return newNode;
        }

        if (value < node.getValue()) {
            node.setLeft(insertRec(node.getLeft(), value));

        } else if (value > node.getHeight()) {
            node.setRight(insertRec(node.getRight(), value));

        } else {
            return node;
        }

        System.out.println("Node actual: " + node.getValue());

        // actualizar la altura de este anceestro Node
        int altura = 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        node.setHeight(altura);
        System.out.println("\t Altura = " + node.getHeight());

        int balance = getBalance(node);
        System.out.println("\t Balance = " + balance);

        // caso izquierda-izquierda diagonal izq
        if (balance > 1 && value < node.getLeft().getValue()) {
            System.out.println("rotacion derecha: ");
            rotateRight(node);

        }
        // caso derecha-derecha diagonal derecha
        if (balance < -1 && value > node.getRight().getValue()) {
            // si el balance es menor a -1 el nodo con mayor altura es
            System.out.println("rotacion izquierda: ");
            return rotateLeft(node);
        }
        // caso izq-derecha
        if (balance > 1 && value > node.getLeft().getValue()) {
            // si el balance es mayor a 1 el que tiene mayor altura es el de la derecha
            // (porque formula es izq-dere)
            System.out.println("rotacion izquierda derecha: ");
            node.setLeft(rotateLeft(node.getLeft()));
            return rotateLeft(node);
        }

        // caso derecha-izquierda
        if (balance < -1 && value < node.getRight().getValue()) {
            // si el balance es menor a -1 el nodo con mayor altura es
            System.out.println("rotacion derecha izquierda: ");
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);
        }
        return node;
    }

    private Node rotateRight(Node y) {
        Node x = y.getLeft();
        Node T2 = x.getRight();

        //rtacion
        x.setRight(y);
        y.setLeft(T2);

        //actualizar alturas
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.getRight();
        Node T2 = y.getLeft();

        //rotacion
        y.setLeft(x);
        x.setRight(T2);

        //actualizar alturas
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));

        return y;
    }

}