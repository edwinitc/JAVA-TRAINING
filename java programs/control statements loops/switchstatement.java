public class switchstatement {
    static int num = 5;
    public static void main(String args[]){
        switch(num = 5){
            case 1:
                System.out.println("new idea ok");
                break;
            case 2:
                System.out.println("no ideas sorry");
                break;
            case 3:
                System.out.println("you are in place");
                break;
            default:
                System.out.println("better luck next time");
        }
    }
}
