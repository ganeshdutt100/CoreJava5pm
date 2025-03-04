package Array;

public class class1 {
    public static void main(String[] args) {
        String a = "Raghav";
        String b = "Divyanshu";

//        dataType [] refName = {"data" , "Data", "data"};

        String []myArray = {"Raghav", "Divyanshu", " Rahul", "Vardan "};
//        System.out.println(myArray[1]);

//        for(myArray:)
//        for(int i = 0; i<myArray.length; i++){
//            System.out.println(myArray[i]);
//        }

        for(String x  : myArray){
            System.out.println(x);
        }

    }
}
