package test;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

@Data
public class TT {
   public static Integer bb = 100;
   public static final Integer cc=1000;


    public static Integer main2(int bb, int cc) {

        Integer aa = 1000;
        return aa + bb + cc;
    }


    public Integer main1(int bb, int cc) {
        Integer aa = 1000;
        return aa - bb - cc;
    }

    public static void main(String[] args) {
        TT ee = new TT();
        ee.main1(1, 2);
        main2(1, 2);
    }
}
