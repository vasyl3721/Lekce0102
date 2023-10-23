import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name="Vasyl Mel";
        LocalDate datNar= LocalDate.of(1989,02,06);
        String mesto= "Liberec";
        String spz= "4V4 333";
        Double spotreba= (5.6);
        String IP="192.168.48.39";
        int contractId;
        int total;
        int prodejPrumer;
        contractId=4;
        total=24;
        prodejPrumer=total/contractId;
        System.out.println("Prumerné množstvi prodené mpkve je " +prodejPrumer+" ks");

    }
}