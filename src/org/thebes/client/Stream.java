package org.thebes.client;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.math.BigInteger;


public class Stream extends Class50_Sub1 {

    public static final int anIntArray1457[] = {
            0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
            1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, -1
    };
    public static boolean aBoolean1451 = true;
    public static int anIntArray1456[];
    public static int anInt1459;
    public static int anInt1460;
    public static int anInt1461;
    public static Class6 aClass6_1462 = new Class6(true);
    public static Class6 aClass6_1463 = new Class6(true);
    public static Class6 aClass6_1464 = new Class6(true);
    public static char aCharArray1465[] = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', '+', '/'
    };
    public static boolean aBoolean1466;

    static {
        anIntArray1456 = new int[256];
        for (int j = 0; j < 256; j++) {
            int i = j;
            for (int k = 0; k < 8; k++)
                if ((i & 1) == 1)
                    i = i >>> 1 ^ 0xedb88320;
                else
                    i >>>= 1;

            anIntArray1456[j] = i;
        }

    }

    public boolean aBoolean1435;
    public int anInt1436;
    public boolean aBoolean1437;
    public boolean aBoolean1438;
    public byte aByte1439;
    public int anInt1440;
    public boolean aBoolean1441;
    public int anInt1442;
    public int anInt1443;
    public boolean aBoolean1444;
    public int anInt1445;
    public int anInt1446;
    public byte aByte1447;
    public byte aByte1448;
    public byte aByte1449;
    public boolean aBoolean1450;
    public int anInt1452;
    public byte aByteArray1453[];
    public int anInt1454;
    public int anInt1455;
    public StreamSecurity aStreamSecurity_1458;

    public Stream(int i) {
        aBoolean1435 = false;
        anInt1436 = 8;
        aBoolean1437 = false;
        aBoolean1438 = true;
        aByte1439 = 5;
        anInt1440 = -29290;
        aBoolean1441 = false;
        anInt1442 = 217;
        anInt1443 = 236;
        aBoolean1444 = false;
        aByte1447 = 17;
        aByte1448 = 89;
        aByte1449 = -16;
        aBoolean1450 = false;
        for (anInt1452 = 1; i >= 0; )
            throw new NullPointerException();

    }

    public Stream(boolean flag, byte abyte0[]) {
        aBoolean1435 = false;
        anInt1436 = 8;
        aBoolean1437 = false;
        aBoolean1438 = true;
        aByte1439 = 5;
        anInt1440 = -29290;
        aBoolean1441 = false;
        anInt1442 = 217;
        anInt1443 = 236;
        aBoolean1444 = false;
        aByte1447 = 17;
        aByte1448 = 89;
        aByte1449 = -16;
        aBoolean1450 = false;
        anInt1452 = 1;
        aByteArray1453 = abyte0;
        anInt1454 = 0;
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
    }

    public static Stream method509(byte byte0, int i) {
        synchronized (aClass6_1463) {
            Stream class50_sub1_sub2_2 = null;
            if (i == 0 && anInt1459 > 0) {
                anInt1459--;
                class50_sub1_sub2_2 = (Stream) aClass6_1462.method157();
            } else if (i == 1 && anInt1460 > 0) {
                anInt1460--;
                class50_sub1_sub2_2 = (Stream) aClass6_1463.method157();
            } else if (i == 2 && anInt1461 > 0) {
                anInt1461--;
                class50_sub1_sub2_2 = (Stream) aClass6_1464.method157();
            }
            if (class50_sub1_sub2_2 != null) {
                class50_sub1_sub2_2.anInt1454 = 0;
                Stream class50_sub1_sub2 = class50_sub1_sub2_2;
                return class50_sub1_sub2;
            }
        }
        Stream class50_sub1_sub2_1 = new Stream(-211);
        if (byte0 != 0)
            aBoolean1451 = !aBoolean1451;
        class50_sub1_sub2_1.anInt1454 = 0;
        if (i == 0)
            class50_sub1_sub2_1.aByteArray1453 = new byte[100];
        else if (i == 1)
            class50_sub1_sub2_1.aByteArray1453 = new byte[5000];
        else
            class50_sub1_sub2_1.aByteArray1453 = new byte[30000];
        return class50_sub1_sub2_1;
    }

    public void method510(byte byte0, int i) {
        aByteArray1453[anInt1454++] = (byte) (i + aStreamSecurity_1458.method296());
        if (byte0 != 4) {
            for (int j = 1; j > 0; j++) ;
        }
    }

    public void method511(int i) {
        aByteArray1453[anInt1454++] = (byte) i;
    }

    public void method512(int i) {
        aByteArray1453[anInt1454++] = (byte) (i >> 8);
        aByteArray1453[anInt1454++] = (byte) i;
    }

    public void method513(int i, boolean flag) {
        aByteArray1453[anInt1454++] = (byte) i;
        if (flag) {
            return;
        } else {
            aByteArray1453[anInt1454++] = (byte) (i >> 8);
            return;
        }
    }

    public void method514(int i) {
        aByteArray1453[anInt1454++] = (byte) (i >> 16);
        aByteArray1453[anInt1454++] = (byte) (i >> 8);
        aByteArray1453[anInt1454++] = (byte) i;
    }

    public void method515(int i) {
        aByteArray1453[anInt1454++] = (byte) (i >> 24);
        aByteArray1453[anInt1454++] = (byte) (i >> 16);
        aByteArray1453[anInt1454++] = (byte) (i >> 8);
        aByteArray1453[anInt1454++] = (byte) i;
    }

    public void method516(int i, boolean flag) {
        aByteArray1453[anInt1454++] = (byte) i;
        aByteArray1453[anInt1454++] = (byte) (i >> 8);
        if (flag)
            anInt1436 = 306;
        aByteArray1453[anInt1454++] = (byte) (i >> 16);
        aByteArray1453[anInt1454++] = (byte) (i >> 24);
    }

    public void method517(long l, boolean flag) {
        try {
            aByteArray1453[anInt1454++] = (byte) (int) (l >> 56);
            aByteArray1453[anInt1454++] = (byte) (int) (l >> 48);
            aByteArray1453[anInt1454++] = (byte) (int) (l >> 40);
            aByteArray1453[anInt1454++] = (byte) (int) (l >> 32);
            aByteArray1453[anInt1454++] = (byte) (int) (l >> 24);
            aByteArray1453[anInt1454++] = (byte) (int) (l >> 16);
            aByteArray1453[anInt1454++] = (byte) (int) (l >> 8);
            aByteArray1453[anInt1454++] = (byte) (int) l;
            if (!flag)
                return;
        } catch (RuntimeException runtimeexception) {
            SignLink.reporterror("88423, " + l + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method518(String s) {
        s.getBytes(0, s.length(), aByteArray1453, anInt1454);
        anInt1454 += s.length();
        aByteArray1453[anInt1454++] = 10;
    }

    public void method519(byte abyte0[], int i, int j, int k) {
        if (i != 0)
            aBoolean1451 = !aBoolean1451;
        for (int l = k; l < k + j; l++)
            aByteArray1453[anInt1454++] = abyte0[l];

    }

    public void method520(int i, int j) {
        aByteArray1453[anInt1454 - i - 1] = (byte) i;
        if (j == 0) ;
    }

    public int method521() {
        return aByteArray1453[anInt1454++] & 0xff;
    }

    public byte method522() {
        return aByteArray1453[anInt1454++];
    }

    public int method523() {
        anInt1454 += 2;
        return ((aByteArray1453[anInt1454 - 2] & 0xff) << 8) + (aByteArray1453[anInt1454 - 1] & 0xff);
    }

    public int method524() {
        anInt1454 += 2;
        int i = ((aByteArray1453[anInt1454 - 2] & 0xff) << 8) + (aByteArray1453[anInt1454 - 1] & 0xff);
        if (i > 32767)
            i -= 0x10000;
        return i;
    }

    public int method525() {
        anInt1454 += 3;
        return ((aByteArray1453[anInt1454 - 3] & 0xff) << 16) + ((aByteArray1453[anInt1454 - 2] & 0xff) << 8) + (aByteArray1453[anInt1454 - 1] & 0xff);
    }

    public int method526() {
        anInt1454 += 4;
        return ((aByteArray1453[anInt1454 - 4] & 0xff) << 24) + ((aByteArray1453[anInt1454 - 3] & 0xff) << 16) + ((aByteArray1453[anInt1454 - 2] & 0xff) << 8) + (aByteArray1453[anInt1454 - 1] & 0xff);
    }

    public long method527(int i) {
        long l = (long) method526() & 0xffffffffL;
        if (i >= 0) {
            throw new NullPointerException();
        } else {
            long l1 = (long) method526() & 0xffffffffL;
            return (l << 32) + l1;
        }
    }

    public String method528() {
        int i = anInt1454;
        while (aByteArray1453[anInt1454++] != 10) ;
        return new String(aByteArray1453, i, anInt1454 - i - 1);
    }

    public byte[] method529(int i) {
        int j = anInt1454;
        if (i <= 0)
            throw new NullPointerException();
        while (aByteArray1453[anInt1454++] != 10) ;
        byte abyte0[] = new byte[anInt1454 - j - 1];
        for (int k = j; k < anInt1454 - 1; k++)
            abyte0[k - j] = aByteArray1453[k];

        return abyte0;
    }

    public void method530(int i, int j, int k, byte abyte0[]) {
        if (k >= 0)
            aBoolean1438 = !aBoolean1438;
        for (int l = j; l < j + i; l++)
            abyte0[l] = aByteArray1453[anInt1454++];

    }

    public void method531(byte byte0) {
        anInt1455 = anInt1454 * 8;
        if (byte0 == 6)
            byte0 = 0;
    }

    public int method532(int i, int j) {
        int k = anInt1455 >> 3;
        int l = 8 - (anInt1455 & 7);
        int i1 = 0;
        anInt1455 += j;
        if (i <= 0)
            return anInt1452;
        for (; j > l; l = 8) {
            i1 += (aByteArray1453[k++] & anIntArray1457[l]) << j - l;
            j -= l;
        }

        if (j == l)
            i1 += aByteArray1453[k] & anIntArray1457[l];
        else
            i1 += aByteArray1453[k] >> l - j & anIntArray1457[j];
        return i1;
    }

    public void method533(int i) {
        if (i != anInt1440)
            anInt1440 = -448;
        anInt1454 = (anInt1455 + 7) / 8;
    }

    public int method534() {
        int i = aByteArray1453[anInt1454] & 0xff;
        if (i < 128)
            return method521() - 64;
        else
            return method523() - 49152;
    }

    public int method535() {
        int i = aByteArray1453[anInt1454] & 0xff;
        if (i < 128)
            return method521();
        else
            return method523() - 32768;
    }

    public void method536(int i, BigInteger biginteger, BigInteger biginteger1) {
        int j = anInt1454;
        anInt1454 = 0;
        byte abyte0[] = new byte[j];
        method530(j, 0, -21, abyte0);
        BigInteger biginteger2 = new BigInteger(abyte0);
        BigInteger biginteger3 = biginteger2.modPow(biginteger1, biginteger);
        byte abyte1[] = biginteger3.toByteArray();
        if (i < 0 || i > 0) {
            return;
        } else {
            anInt1454 = 0;
            method511(abyte1.length);
            method519(abyte1, 0, abyte1.length, 0);
            return;
        }
    }

    public void method537(boolean flag, int i) {
        aByteArray1453[anInt1454++] = (byte) (i + 128);
        if (flag) {
            for (int j = 1; j > 0; j++) ;
        }
    }

    public void method538(byte byte0, int i) {
        if (byte0 == 0) {
            byte0 = 0;
        } else {
            for (int j = 1; j > 0; j++) ;
        }
        aByteArray1453[anInt1454++] = (byte) (-i);
    }

    public void method539(int i, int j) {
        if (j != 1) {
            return;
        } else {
            aByteArray1453[anInt1454++] = (byte) (128 - i);
            return;
        }
    }

    public int method540(int i) {
        if (i != anInt1445)
            return anInt1442;
        else
            return aByteArray1453[anInt1454++] - 128 & 0xff;
    }

    public int method541(int i) {
        if (i != -34545)
            return anInt1436;
        else
            return -aByteArray1453[anInt1454++] & 0xff;
    }

    public int method542(int i) {
        i = 77 / i;
        return 128 - aByteArray1453[anInt1454++] & 0xff;
    }

    public byte method543(int i) {
        if (i != 0) {
            for (int j = 1; j > 0; j++) ;
        }
        return (byte) (aByteArray1453[anInt1454++] - 128);
    }

    public byte method544(int i) {
        if (i != 0)
            anInt1452 = 54;
        return (byte) (-aByteArray1453[anInt1454++]);
    }

    public byte method545(int i) {
        if (i != 43428) {
            for (int j = 1; j > 0; j++) ;
        }
        return (byte) (128 - aByteArray1453[anInt1454++]);
    }

    public void method546(int i, int j) {
        aByteArray1453[anInt1454++] = (byte) j;
        aByteArray1453[anInt1454++] = (byte) (j >> 8);
        if (i != 0)
            anInt1446 = 403;
    }

    public void method547(int i, int j) {
        aByteArray1453[anInt1454++] = (byte) (i >> 8);
        aByteArray1453[anInt1454++] = (byte) (i + 128);
        if (j == 0) ;
    }

    public void method548(int i, int j) {
        if (i < 3 || i > 3)
            aBoolean1435 = !aBoolean1435;
        aByteArray1453[anInt1454++] = (byte) (j + 128);
        aByteArray1453[anInt1454++] = (byte) (j >> 8);
    }

    public int method549(int i) {
        anInt1454 += 2;
        if (i >= 0)
            return 3;
        else
            return ((aByteArray1453[anInt1454 - 1] & 0xff) << 8) + (aByteArray1453[anInt1454 - 2] & 0xff);
    }

    public int method550(byte byte0) {
        anInt1454 += 2;
        if (byte0 != 9)
            return anInt1446;
        else
            return ((aByteArray1453[anInt1454 - 2] & 0xff) << 8) + (aByteArray1453[anInt1454 - 1] - 128 & 0xff);
    }

    public int method551(int i) {
        anInt1454 += 2;
        if (i >= 0)
            anInt1446 = 68;
        return ((aByteArray1453[anInt1454 - 1] & 0xff) << 8) + (aByteArray1453[anInt1454 - 2] - 128 & 0xff);
    }

    public int method552(int i) {
        anInt1454 += 2;
        int j = ((aByteArray1453[anInt1454 - 1] & 0xff) << 8) + (aByteArray1453[anInt1454 - 2] & 0xff);
        while (i >= 0) {
            for (int k = 1; k > 0; k++) ;
        }
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int method553(byte byte0) {
        anInt1454 += 2;
        if (byte0 != aByte1447)
            aBoolean1441 = !aBoolean1441;
        int i = ((aByteArray1453[anInt1454 - 2] & 0xff) << 8) + (aByteArray1453[anInt1454 - 1] - 128 & 0xff);
        if (i > 32767)
            i -= 0x10000;
        return i;
    }

    public int method554(int i) {
        anInt1454 += 3;
        if (i >= 0)
            return 1;
        else
            return ((aByteArray1453[anInt1454 - 2] & 0xff) << 16) + ((aByteArray1453[anInt1454 - 3] & 0xff) << 8) + (aByteArray1453[anInt1454 - 1] & 0xff);
    }

    public int method555(int i) {
        if (i <= 0)
            anInt1446 = -453;
        anInt1454 += 4;
        return ((aByteArray1453[anInt1454 - 1] & 0xff) << 24) + ((aByteArray1453[anInt1454 - 2] & 0xff) << 16) + ((aByteArray1453[anInt1454 - 3] & 0xff) << 8) + (aByteArray1453[anInt1454 - 4] & 0xff);
    }

    public int method556(int i) {
        if (i < 3 || i > 3)
            anInt1446 = -258;
        anInt1454 += 4;
        return ((aByteArray1453[anInt1454 - 2] & 0xff) << 24) + ((aByteArray1453[anInt1454 - 1] & 0xff) << 16) + ((aByteArray1453[anInt1454 - 4] & 0xff) << 8) + (aByteArray1453[anInt1454 - 3] & 0xff);
    }

    public int method557(boolean flag) {
        anInt1454 += 4;
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
        return ((aByteArray1453[anInt1454 - 3] & 0xff) << 24) + ((aByteArray1453[anInt1454 - 4] & 0xff) << 16) + ((aByteArray1453[anInt1454 - 1] & 0xff) << 8) + (aByteArray1453[anInt1454 - 2] & 0xff);
    }

    public void method558(byte byte0, byte abyte0[], int i, int j) {
        if (byte0 != -73)
            return;
        for (int k = (j + i) - 1; k >= j; k--)
            abyte0[k] = aByteArray1453[anInt1454++];

    }

    public void method559(byte abyte0[], int i, int j, int k) {
        if (j != 0)
            aBoolean1438 = !aBoolean1438;
        for (int l = k; l < k + i; l++)
            abyte0[l] = (byte) (aByteArray1453[anInt1454++] - 128);

    }
}
