public class ExempluTelevizor {


    public static void main(String[] args) {

        // obiect, instanta, exemplar
        Televizor tv1 = new Televizor();
        Televizor tv2 = new Televizor();

        tv1.brandName = "Samsung";
        tv1.hasRemoteController = true;
        tv1.diagonal = 55;

        tv2.brandName = "LG";
        tv2.hasRemoteController = false;
        tv2.diagonal = 60;

        tv1.switchOnTV();
        tv2.switchOnTV();





    }
}
