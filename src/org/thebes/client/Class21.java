package org.thebes.client;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public class Class21 {

    public static int anInt428 = 217;
    public static boolean aBoolean429;
    public static Class21 aClass21Array430[];
    public static boolean aBooleanArray438[];
    public int anInt431;
    public Class41 aClass41_432;
    public int anInt433;
    public int anIntArray434[];
    public int anIntArray435[];
    public int anIntArray436[];
    public int anIntArray437[];
    public Class21() {
    }

    public static void method235(int i) {
        aClass21Array430 = new Class21[i + 1];
        aBooleanArray438 = new boolean[i + 1];
        for (int j = 0; j < i + 1; j++)
            aBooleanArray438[j] = true;

    }

    public static void method236(byte abyte0[], boolean flag) {
        Stream class50_sub1_sub2 = new Stream(true, abyte0);
        class50_sub1_sub2.anInt1454 = abyte0.length - 8;
        int i = class50_sub1_sub2.method523();
        int j = class50_sub1_sub2.method523();
        int k = class50_sub1_sub2.method523();
        if (!flag)
            return;
        int l = class50_sub1_sub2.method523();
        int i1 = 0;
        Stream class50_sub1_sub2_1 = new Stream(true, abyte0);
        class50_sub1_sub2_1.anInt1454 = i1;
        i1 += i + 2;
        Stream class50_sub1_sub2_2 = new Stream(true, abyte0);
        class50_sub1_sub2_2.anInt1454 = i1;
        i1 += j;
        Stream class50_sub1_sub2_3 = new Stream(true, abyte0);
        class50_sub1_sub2_3.anInt1454 = i1;
        i1 += k;
        Stream class50_sub1_sub2_4 = new Stream(true, abyte0);
        class50_sub1_sub2_4.anInt1454 = i1;
        i1 += l;
        Stream class50_sub1_sub2_5 = new Stream(true, abyte0);
        class50_sub1_sub2_5.anInt1454 = i1;
        Class41 class41 = new Class41(class50_sub1_sub2_5, 0);
        int j1 = class50_sub1_sub2_1.method523();
        int ai[] = new int[500];
        int ai1[] = new int[500];
        int ai2[] = new int[500];
        int ai3[] = new int[500];
        for (int k1 = 0; k1 < j1; k1++) {
            int l1 = class50_sub1_sub2_1.method523();
            Class21 class21 = aClass21Array430[l1] = new Class21();
            class21.anInt431 = class50_sub1_sub2_4.method521();
            class21.aClass41_432 = class41;
            int i2 = class50_sub1_sub2_1.method521();
            int j2 = -1;
            int k2 = 0;
            for (int l2 = 0; l2 < i2; l2++) {
                int i3 = class50_sub1_sub2_2.method521();
                if (i3 > 0) {
                    if (class41.anIntArray698[l2] != 0) {
                        for (int k3 = l2 - 1; k3 > j2; k3--) {
                            if (class41.anIntArray698[k3] != 0)
                                continue;
                            ai[k2] = k3;
                            ai1[k2] = 0;
                            ai2[k2] = 0;
                            ai3[k2] = 0;
                            k2++;
                            break;
                        }

                    }
                    ai[k2] = l2;
                    char c = '\0';
                    if (class41.anIntArray698[l2] == 3)
                        c = '\200';
                    if ((i3 & 1) != 0)
                        ai1[k2] = class50_sub1_sub2_3.method534();
                    else
                        ai1[k2] = c;
                    if ((i3 & 2) != 0)
                        ai2[k2] = class50_sub1_sub2_3.method534();
                    else
                        ai2[k2] = c;
                    if ((i3 & 4) != 0)
                        ai3[k2] = class50_sub1_sub2_3.method534();
                    else
                        ai3[k2] = c;
                    j2 = l2;
                    k2++;
                    if (class41.anIntArray698[l2] == 5)
                        aBooleanArray438[l1] = false;
                }
            }

            class21.anInt433 = k2;
            class21.anIntArray434 = new int[k2];
            class21.anIntArray435 = new int[k2];
            class21.anIntArray436 = new int[k2];
            class21.anIntArray437 = new int[k2];
            for (int j3 = 0; j3 < k2; j3++) {
                class21.anIntArray434[j3] = ai[j3];
                class21.anIntArray435[j3] = ai1[j3];
                class21.anIntArray436[j3] = ai2[j3];
                class21.anIntArray437[j3] = ai3[j3];
            }

        }

    }

    public static void method237(boolean flag) {
        if (flag)
            anInt428 = 189;
        aClass21Array430 = null;
    }

    public static Class21 method238(int i) {
        if (aClass21Array430 == null)
            return null;
        else
            return aClass21Array430[i];
    }

    public static boolean method239(boolean flag, int i) {
        if (!flag)
            aBoolean429 = !aBoolean429;
        return i == -1;
    }

}
