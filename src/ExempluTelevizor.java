public class ExempluTelevizor {


    public static void main(String[] args) {

        // obiect, instanta, exemplar
        Televizor tv1  = new Televizor();
        Televizor tv2  = new Televizor();
        NewTVModel tv3 = new NewTVModel();

        tv1.brandName = "Samsung";
        tv1.hasRemoteController = true;
        tv1.diagonal = 55;

        tv2.brandName = "LG";
        tv2.hasRemoteController = false;
        tv2.diagonal = 60;


        tv3.brandName = "LG";
        tv3.hasRemoteController = true;
        tv3.diagonal = 110;
        tv3.hasDVDPlayer = true;

       // tv1.switchOnTV();
        //tv2.switchOnTV();
        tv3.switchOnTV();





    }
}
