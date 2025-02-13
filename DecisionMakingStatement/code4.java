package DecisionMakingStatement;

public class code4 {
    public static void main(String[] args) {
        int days = 6;
        switch (days){
            case 1:
                case 2:
                case 3:
                    case 4:
                    case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
