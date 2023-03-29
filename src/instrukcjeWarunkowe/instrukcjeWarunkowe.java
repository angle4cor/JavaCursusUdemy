package instrukcjeWarunkowe;

public class instrukcjeWarunkowe {
    public static void main(String[] args){
        // switch
        int zmienna = 5;
        switch (zmienna) {
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Nie spełniono żadnego przypadku powyższego.");
                break;
            case 5:
                System.out.println("Pięć");
                break;
        }
    }
}
