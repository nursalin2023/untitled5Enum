import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Week rg = Week.valueOf(scanner.nextLine().toUpperCase());
        switch (rg) {
            case PANIDELNIK -> System.out.println(Week.PANIDELNIK);
            case FTORNIK -> System.out.println(Week.FTORNIK);
            case CREDA -> System.out.println(Week.CREDA);
            case CHETVERT -> System.out.println(Week.CHETVERT);
            case PIATNISA -> System.out.println(Week.PIATNISA);
            case SUBOTA -> System.out.println(Week.SUBOTA);
            case VOSKRESENIE -> System.out.println(Week.VOSKRESENIE);
        }
    }
}