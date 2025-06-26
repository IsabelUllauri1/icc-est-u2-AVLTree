public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nombres: Isabel Ullauri ");

        AVLtree aVLtree= new AVLtree();

        aVLtree.insert(10);
        aVLtree.insert(20);
        aVLtree.insert(15);

        System.out.println(aVLtree);


    }
}
