package com.servicetabanliprogramlama.mortal;

import com.servicetabanliprogramlama.mortal.Silahlar.RoketAtar;
import com.servicetabanliprogramlama.mortal.Silahlar.Yumruk;

public class Arena {
    public Arena() {
    }

    public static void main(String[] args) {
        Player p1 = new Player("Aziz");
        Player p2 = new Player("Cemil");
        int i = 0;

        while(p1.isAlive() && p2.isAlive()) {
            System.out.println(p1.getName() + " Saldırıyor");
            if (p1.Attack(p2)) {
                System.out.println(p1.getName() + " Perfect");
            } else {
                System.out.println(p1.getName() + " Miss");
            }

            System.out.println(p2.getName() + " Saldırıyor");
            if (p2.Attack(p1)) {
                System.out.println(p2.getName() + " Perfect");
            } else {
                System.out.println(p2.getName() + " Miss");
            }

            ++i;
            Silah s;
            switch (i % 3) {
                case 0:
                    s = new RoketAtar();
                    break;
                default:
                    s = new Yumruk();
            }

            p1.setSilah(s);
            p2.setSilah(s);

        }

    }


    private static void select(int i) {
    }
}
