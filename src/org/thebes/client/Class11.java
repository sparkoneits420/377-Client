package org.thebes.client;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public class Class11 {

    public static int anIntArray200[];
    public static int anIntArray201[];
    public static int anIntArray202[];
    public static int anIntArray203[] = new int[5];
    public static int anIntArray204[] = new int[5];
    public static int anIntArray205[] = new int[5];
    public static int anIntArray206[] = new int[5];
    public static int anIntArray207[] = new int[5];
    public byte aByte181;
    public int anInt182;
    public Class29 aClass29_183;
    public Class29 aClass29_184;
    public Class29 aClass29_185;
    public Class29 aClass29_186;
    public Class29 aClass29_187;
    public Class29 aClass29_188;
    public Class29 aClass29_189;
    public Class29 aClass29_190;
    public int anIntArray191[];
    public int anIntArray192[];
    public int anIntArray193[];
    public int anInt194;
    public int anInt195;
    public Class36 aClass36_196;
    public Class29 aClass29_197;
    public int anInt198;
    public int anInt199;
    public Class11() {
        aByte181 = 6;
        anInt182 = 8;
        anIntArray191 = new int[5];
        anIntArray192 = new int[5];
        anIntArray193 = new int[5];
        anInt195 = 100;
        anInt198 = 500;
    }

    public static void method190() {
        anIntArray201 = new int[32768];
        for (int i = 0; i < 32768; i++)
            if (Math.random() > 0.5D)
                anIntArray201[i] = 1;
            else
                anIntArray201[i] = -1;

        anIntArray202 = new int[32768];
        for (int j = 0; j < 32768; j++)
            anIntArray202[j] = (int) (Math.sin((double) j / 5215.1903000000002D) * 16384D);

        anIntArray200 = new int[0x35d54];
    }

    public int[] method191(int i, int j) {
        for (int k = 0; k < i; k++)
            anIntArray200[k] = 0;

        if (j < 10)
            return anIntArray200;
        double d = (double) i / ((double) j + 0.0D);
        aClass29_183.method310(true);
        aClass29_184.method310(true);
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        if (aClass29_185 != null) {
            aClass29_185.method310(true);
            aClass29_186.method310(true);
            l = (int) (((double) (aClass29_185.anInt578 - aClass29_185.anInt577) * 32.768000000000001D) / d);
            i1 = (int) (((double) aClass29_185.anInt577 * 32.768000000000001D) / d);
        }
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        if (aClass29_187 != null) {
            aClass29_187.method310(true);
            aClass29_188.method310(true);
            k1 = (int) (((double) (aClass29_187.anInt578 - aClass29_187.anInt577) * 32.768000000000001D) / d);
            l1 = (int) (((double) aClass29_187.anInt577 * 32.768000000000001D) / d);
        }
        for (int j2 = 0; j2 < 5; j2++)
            if (anIntArray191[j2] != 0) {
                anIntArray203[j2] = 0;
                anIntArray204[j2] = (int) ((double) anIntArray193[j2] * d);
                anIntArray205[j2] = (anIntArray191[j2] << 14) / 100;
                anIntArray206[j2] = (int) (((double) (aClass29_183.anInt578 - aClass29_183.anInt577) * 32.768000000000001D * Math.pow(1.0057929410678534D, anIntArray192[j2])) / d);
                anIntArray207[j2] = (int) (((double) aClass29_183.anInt577 * 32.768000000000001D) / d);
            }

        for (int k2 = 0; k2 < i; k2++) {
            int l2 = aClass29_183.method311(0, i);
            int j4 = aClass29_184.method311(0, i);
            if (aClass29_185 != null) {
                int j5 = aClass29_185.method311(0, i);
                int j6 = aClass29_186.method311(0, i);
                l2 += method192(-887, j1, aClass29_185.anInt579, j6) >> 1;
                j1 += (j5 * l >> 16) + i1;
            }
            if (aClass29_187 != null) {
                int k5 = aClass29_187.method311(0, i);
                int k6 = aClass29_188.method311(0, i);
                j4 = j4 * ((method192(-887, i2, aClass29_187.anInt579, k6) >> 1) + 32768) >> 15;
                i2 += (k5 * k1 >> 16) + l1;
            }
            for (int l5 = 0; l5 < 5; l5++)
                if (anIntArray191[l5] != 0) {
                    int l6 = k2 + anIntArray204[l5];
                    if (l6 < i) {
                        anIntArray200[l6] += method192(-887, anIntArray203[l5], aClass29_183.anInt579, j4 * anIntArray205[l5] >> 15);
                        anIntArray203[l5] += (l2 * anIntArray206[l5] >> 16) + anIntArray207[l5];
                    }
                }

        }

        if (aClass29_189 != null) {
            aClass29_189.method310(true);
            aClass29_190.method310(true);
            int i3 = 0;
            boolean flag = false;
            boolean flag1 = true;
            for (int i7 = 0; i7 < i; i7++) {
                int k7 = aClass29_189.method311(0, i);
                int i8 = aClass29_190.method311(0, i);
                int k4;
                if (flag1)
                    k4 = aClass29_189.anInt577 + ((aClass29_189.anInt578 - aClass29_189.anInt577) * k7 >> 8);
                else
                    k4 = aClass29_189.anInt577 + ((aClass29_189.anInt578 - aClass29_189.anInt577) * i8 >> 8);
                if ((i3 += 256) >= k4) {
                    i3 = 0;
                    flag1 = !flag1;
                }
                if (flag1)
                    anIntArray200[i7] = 0;
            }

        }
        if (anInt194 > 0 && anInt195 > 0) {
            int j3 = (int) ((double) anInt194 * d);
            for (int l4 = j3; l4 < i; l4++)
                anIntArray200[l4] += (anIntArray200[l4 - j3] * anInt195) / 100;

        }
        if (aClass36_196.anIntArray613[0] > 0 || aClass36_196.anIntArray613[1] > 0) {
            aClass29_197.method310(true);
            int k3 = aClass29_197.method311(0, i + 1);
            int i5 = aClass36_196.method355(0, true, (float) k3 / 65536F);
            int i6 = aClass36_196.method355(1, true, (float) k3 / 65536F);
            if (i >= i5 + i6) {
                int j7 = 0;
                int l7 = i6;
                if (l7 > i - i5)
                    l7 = i - i5;
                for (; j7 < l7; j7++) {
                    int j8 = (int) ((long) anIntArray200[j7 + i5] * (long) Class36.anInt620 >> 16);
                    for (int k8 = 0; k8 < i5; k8++)
                        j8 += (int) ((long) anIntArray200[(j7 + i5) - 1 - k8] * (long) Class36.anIntArrayArray618[0][k8] >> 16);

                    for (int j9 = 0; j9 < j7; j9++)
                        j8 -= (int) ((long) anIntArray200[j7 - 1 - j9] * (long) Class36.anIntArrayArray618[1][j9] >> 16);

                    anIntArray200[j7] = j8;
                    k3 = aClass29_197.method311(0, i + 1);
                }

                char c = '\200';
                l7 = c;
                do {
                    if (l7 > i - i5)
                        l7 = i - i5;
                    for (; j7 < l7; j7++) {
                        int l8 = (int) ((long) anIntArray200[j7 + i5] * (long) Class36.anInt620 >> 16);
                        for (int k9 = 0; k9 < i5; k9++)
                            l8 += (int) ((long) anIntArray200[(j7 + i5) - 1 - k9] * (long) Class36.anIntArrayArray618[0][k9] >> 16);

                        for (int i10 = 0; i10 < i6; i10++)
                            l8 -= (int) ((long) anIntArray200[j7 - 1 - i10] * (long) Class36.anIntArrayArray618[1][i10] >> 16);

                        anIntArray200[j7] = l8;
                        k3 = aClass29_197.method311(0, i + 1);
                    }

                    if (j7 >= i - i5)
                        break;
                    i5 = aClass36_196.method355(0, true, (float) k3 / 65536F);
                    i6 = aClass36_196.method355(1, true, (float) k3 / 65536F);
                    l7 += c;
                } while (true);
                for (; j7 < i; j7++) {
                    int i9 = 0;
                    for (int l9 = (j7 + i5) - i; l9 < i5; l9++)
                        i9 += (int) ((long) anIntArray200[(j7 + i5) - 1 - l9] * (long) Class36.anIntArrayArray618[0][l9] >> 16);

                    for (int j10 = 0; j10 < i6; j10++)
                        i9 -= (int) ((long) anIntArray200[j7 - 1 - j10] * (long) Class36.anIntArrayArray618[1][j10] >> 16);

                    anIntArray200[j7] = i9;
                    int l3 = aClass29_197.method311(0, i + 1);
                }

            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (anIntArray200[i4] < -32768)
                anIntArray200[i4] = -32768;
            if (anIntArray200[i4] > 32767)
                anIntArray200[i4] = 32767;
        }

        return anIntArray200;
    }

    public int method192(int i, int j, int k, int l) {
        while (i >= 0)
            anInt182 = -409;
        if (k == 1)
            if ((j & 0x7fff) < 16384)
                return l;
            else
                return -l;
        if (k == 2)
            return anIntArray202[j & 0x7fff] * l >> 14;
        if (k == 3)
            return ((j & 0x7fff) * l >> 14) - l;
        if (k == 4)
            return anIntArray201[j / 2607 & 0x7fff] * l;
        else
            return 0;
    }

    public void method193(byte byte0, Stream class50_sub1_sub2) {
        aClass29_183 = new Class29();
        aClass29_183.method308(aByte181, class50_sub1_sub2);
        aClass29_184 = new Class29();
        aClass29_184.method308(aByte181, class50_sub1_sub2);
        int i = class50_sub1_sub2.method521();
        if (i != 0) {
            class50_sub1_sub2.anInt1454--;
            aClass29_185 = new Class29();
            aClass29_185.method308(aByte181, class50_sub1_sub2);
            aClass29_186 = new Class29();
            aClass29_186.method308(aByte181, class50_sub1_sub2);
        }
        i = class50_sub1_sub2.method521();
        if (byte0 != 6) {
            for (int j = 1; j > 0; j++) ;
        }
        if (i != 0) {
            class50_sub1_sub2.anInt1454--;
            aClass29_187 = new Class29();
            aClass29_187.method308(aByte181, class50_sub1_sub2);
            aClass29_188 = new Class29();
            aClass29_188.method308(aByte181, class50_sub1_sub2);
        }
        i = class50_sub1_sub2.method521();
        if (i != 0) {
            class50_sub1_sub2.anInt1454--;
            aClass29_189 = new Class29();
            aClass29_189.method308(aByte181, class50_sub1_sub2);
            aClass29_190 = new Class29();
            aClass29_190.method308(aByte181, class50_sub1_sub2);
        }
        for (int k = 0; k < 10; k++) {
            int l = class50_sub1_sub2.method535();
            if (l == 0)
                break;
            anIntArray191[k] = l;
            anIntArray192[k] = class50_sub1_sub2.method534();
            anIntArray193[k] = class50_sub1_sub2.method535();
        }

        anInt194 = class50_sub1_sub2.method535();
        anInt195 = class50_sub1_sub2.method535();
        anInt198 = class50_sub1_sub2.method523();
        anInt199 = class50_sub1_sub2.method523();
        aClass36_196 = new Class36();
        aClass29_197 = new Class29();
        aClass36_196.method356(-954, aClass29_197, class50_sub1_sub2);
    }

}
