public class ClasaExecutorie {

    public static void main(String[] args) {

        // obiecte
        Om om = new Om();
        Cantaret cantaret       = new Cantaret();
        NonCantaret nonCantaret = new NonCantaret();

        om.canta();

        System.out.println("---------------");
        System.out.println("---------------");

        cantaret.canta();

        System.out.println("---------------");
        System.out.println("---------------");

        nonCantaret.canta();

    }

}
