package Array;

public class class3 {
    public static void main(String[] args) {
//        int [] arrName ={1,2,3,4,5,6,7,8,9};
//        arrName[3]=45;

        int [] arrName = new int[5];
          arrName[0] = 1;
          arrName[1] = 12;
          arrName[2] = 34;
          arrName[3] = 56;
          arrName[4] = 23;
//          arrName[5] = 13;

        for( int x  : arrName ){
            System.out.println(x);
        }

    }
}
