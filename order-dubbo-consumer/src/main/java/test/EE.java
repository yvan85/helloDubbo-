package test;

import org.apache.poi.ss.formula.functions.T;

public class EE {

    public static void main(String[] args) {
        EE ee = new EE();
        ee.xxx();
    }

    public void xxx() {
        System.out.println(TT.bb);
        System.out.println(TT.main2(2, 3));
        TT tt = new TT();
        System.out.println(tt.main1(2, 3));
    }

    public static void yyy() {
        System.out.println(TT.bb);
        System.out.println(TT.main2(2, 3));
        TT tt = new TT();
        System.out.println(tt.main1(2, 3));
    }
}
