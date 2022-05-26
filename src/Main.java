public class Main {

    public static void main(String[] args) {

        SuperList prueba = new SuperList();
        prueba.addElement(5);
        prueba.addElement(6);
        prueba.addElement(7);
        prueba.addElement(10);

        System.out.println(prueba);


        System.out.println("se borra el elemento " + prueba.removeElement(3));

        System.out.println(prueba);
        System.out.println("de forma vertical:");
        prueba.showElements();
        System.out.println("de forma inversa:");
        prueba.showReversedElements();

    }
}
