public class Main {

    public static void main(String[] args) {

        SuperList prueba = new SuperList();
        prueba.addElement(5);
        prueba.addElement(6);
        prueba.addElement(7);
        prueba.addElement(10);

        System.out.println(prueba.removeElement(0));

        System.out.println(prueba);
        prueba.showElements();

    }
}
