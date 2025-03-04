package String;

public class class1 {
    public static void main(String[] args) {
//        String name = "Ganesh Dutt";
//        String name1 = "Ganesh Dutt";
//        System.out.println(name  + name1);

//        String name = new String("Ganesh Dutt");
//        System.out.println(name);


        String name = " Raghav ";
        String name1 = "raghav";
        String last = "Sharma";
        System.out.println(name.length());
        System.out.println(name + " "+  last);
        System.out.println(name.concat(" ").concat(last));
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,5));

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('a',2));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));

        System.out.println(name.startsWith("R"));
        System.out.println(name.endsWith("v"));

        System.out.println(name.replaceFirst("a", "o"));
        String newName = name.trim();
        System.out.println(newName.length());

         String names = "Raghav,Divyanshu,Rahul,Sparsh";
         String nameValue[] = names.split(",");
         for (String name2 : nameValue) {
             System.out.println(name2);
         }

//        System.out.println(names.split(", "));
//        String names[] =  {"Raghav",  "Divyanshu", "Rahul", "Sparsh" };
//
//        for (String name2 : names) {
//            System.out.println(name2.split(","));
//        }

    }
}
