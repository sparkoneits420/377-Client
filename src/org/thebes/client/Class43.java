package org.thebes.client;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)


public class Class43 {

    public static int anInt703;
    public static Class43 aClass43Array704[];
    public static int anInt705;
    public static int anIntArray706[];
    public String aString707;
    public int anInt708;
    public int anInt709;
    public boolean aBoolean710;
    public boolean aBoolean711;
    public int anInt712;
    public boolean aBoolean713;
    public int anInt714;
    public int anInt715;
    public boolean aBoolean716;
    public int anInt717;
    public boolean aBoolean718;
    public Class43() {
        aBoolean710 = false;
        aBoolean711 = true;
        aBoolean713 = false;
        aBoolean716 = false;
        anInt717 = -1;
        aBoolean718 = true;
    }

    public static void method371(Class2 class2, int i) {
        Stream class50_sub1_sub2 = new Stream(true, class2.method154("varp.dat", null));
        if (i != 36135)
            return;
        anInt705 = 0;
        anInt703 = class50_sub1_sub2.method523();
        if (aClass43Array704 == null)
            aClass43Array704 = new Class43[anInt703];
        if (anIntArray706 == null)
            anIntArray706 = new int[anInt703];
        for (int j = 0; j < anInt703; j++) {
            if (aClass43Array704[j] == null)
                aClass43Array704[j] = new Class43();
            aClass43Array704[j].method372(-954, j, class50_sub1_sub2);
        }

        if (class50_sub1_sub2.anInt1454 != class50_sub1_sub2.aByteArray1453.length)
            System.out.println("varptype load mismatch");
    }

    public void method372(int i, int j, Stream class50_sub1_sub2) {
        if (i >= 0)
            return;
        do {
            int k = class50_sub1_sub2.method521();
            if (k == 0)
                return;
            if (k == 1)
                anInt708 = class50_sub1_sub2.method521();
            else if (k == 2)
                anInt709 = class50_sub1_sub2.method521();
            else if (k == 3) {
                aBoolean710 = true;
                anIntArray706[anInt705++] = j;
            } else if (k == 4)
                aBoolean711 = false;
            else if (k == 5)
                anInt712 = class50_sub1_sub2.method523();
            else if (k == 6)
                aBoolean713 = true;
            else if (k == 7)
                anInt714 = class50_sub1_sub2.method526();
            else if (k == 8) {
                anInt715 = 1;
                aBoolean716 = true;
            } else if (k == 10)
                aString707 = class50_sub1_sub2.method528();
            else if (k == 11)
                aBoolean716 = true;
            else if (k == 12)
                anInt717 = class50_sub1_sub2.method526();
            else if (k == 13) {
                anInt715 = 2;
                aBoolean716 = true;
            } else if (k == 14)
                aBoolean718 = false;
            else
                System.out.println("Error unrecognised config code: " + k);
        } while (true);
    }
}
