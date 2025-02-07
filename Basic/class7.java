package Basic;



public class class7 {
    public static void main(String[] args) {

        int value =101;

        if(value >= 60 && value <=100){
            System.out.println("Passed with 1st");
        }
        else if (value >= 40 && value <= 59){
            System.out.println("Passed with 2nd");
        }
        else if(value >= 30 && value <= 39){
            System.out.println("Passed with 3rd");
        }
        else if(value >= 0 && value <= 29){
            System.out.println("Fail");
        }
        else {
            System.out.println("invalid value");
        }
    }
}
