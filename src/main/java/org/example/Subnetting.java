package org.example;

import java.util.Scanner;

public class Subnetting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//------------------------------------------------------------------Input einlesen----------------------------------------------------------------------------
        System.out.println("Bitte gib das erste Oktett der Ip-Addresse an:");
        long erstesOktet = scanner.nextLong();
        long[] Oktet1 = {
                0, 0, 0, 0, 0, 0, 0, 0
        };

        System.out.println("Bitte gib das zweite Oktett der Ip-Addresse an:");
        long zweitesOktet = scanner.nextLong();
        long[] Oktet2 = {
                0, 0, 0, 0, 0, 0, 0, 0
        };

        System.out.println("Bitte gib das dritte Oktett der Ip-Addresse an:");
        long drittesOktet = scanner.nextLong();
        long[] Oktet3 = {
                0, 0, 0, 0, 0, 0, 0, 0
        };

        System.out.println("Bitte gib das vierte Oktett der Ip-Addresse an:");
        long viertesOktet = scanner.nextLong();
        long[] Oktet4 = {
                0, 0, 0, 0, 0, 0, 0, 0
        };

        System.out.println("Bitte gib die Subnetzmaske an:");
        long subMaske = scanner.nextLong();
        long hostAnteil = 32 - subMaske;

        //--------------------------------------------erste Umrechnung in binär------------------------------------------------------
        int i = 0;
        long bitwert = 128;
        while (i <= 7) {
            while (erstesOktet >= bitwert) {
                erstesOktet -= bitwert;
                bitwert /= 2;
                Oktet1[i] = 1;
            }
            i++;
        }
        i = 0;
        bitwert = 128;
        while (i <= 7) {
            while (zweitesOktet >= bitwert) {
                zweitesOktet -= bitwert;
                Oktet2[i] = 1;
            }

            i++;
        }
        i = 0;
        bitwert = 128;
        while (i <= 7) {
            while (drittesOktet >= bitwert) {
                drittesOktet -= bitwert;
                Oktet3[i] = 1;
            }

            i++;
        }
        i = 0;
        bitwert = 128;
        while (i <= 7) {
            while (viertesOktet >= bitwert) {
                viertesOktet -= bitwert;
                Oktet4[i] = 1;
            }

            i++;
        }

        //------------------------------------------------------------subnetzmaske durch 8 teilen----------------------------


        int skipOktets = 0;
        while (hostAnteil > 8) {
            hostAnteil -= 8;
            skipOktets++;
        }
        int skipOktetsSave = skipOktets;
        while (skipOktets > 1) {
            i = 0;
            while (i < 7) {
                Oktet4[i] = 0;
                i++;
            }
            while (skipOktets > 2) {
                i = 0;
                while (i < 7) {
                    Oktet3[i] = 0;
                    i++;
                }
                while (skipOktets > 3) {
                    i = 0;
                    while (i < 7) {
                        Oktet2[i] = 0;
                        i++;
                        skipOktets--;
                    }
                }
            }
        }

        while (skipOktetsSave == 3) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                while (hostAnteil >= bitwert) {
                    hostAnteil -= bitwert;
                    bitwert /= 2;
                    Oktet1[i] = 1;
                }
                i++;
            }
            skipOktetsSave = 4;
        }
        while (skipOktetsSave == 2) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                while (hostAnteil >= bitwert) {
                    hostAnteil -= bitwert;
                    bitwert /= 2;
                    Oktet2[i] = 1;
                }
                i++;
            }
            skipOktetsSave = 4;
        }
        while (skipOktetsSave == 1) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                while (hostAnteil >= bitwert) {
                    hostAnteil -= bitwert;
                    bitwert /= 2;
                    Oktet3[i] = 1;
                }
                i++;
            }
            skipOktetsSave = 4;
        }
        while (skipOktetsSave == 0) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                boolean bitDone =false;
                while (hostAnteil >= bitwert) {
                    Oktet4[i] = 1;
                    hostAnteil = hostAnteil- bitwert;
                    bitwert /= 2;
                    bitDone=true;
                    i++;
                }
                while(!bitDone){
                i++;
                bitDone=true;
                }

            }
            skipOktetsSave = 4;
        }


        int oktetcounter = 1;
        while (oktetcounter <= 4) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                erstesOktet += Oktet1[i] * bitwert;
                bitwert /= 2;
                i++;
            }
            oktetcounter++;
        }
        oktetcounter=1;
        while (oktetcounter <= 4) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                zweitesOktet += Oktet2[i] * bitwert;
                bitwert /= 2;
                i++;
            }
            oktetcounter++;
        }
        oktetcounter=1;
        while (oktetcounter <= 4) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                drittesOktet += Oktet3[i] * bitwert;
                bitwert /= 2;
                i++;
            }
            oktetcounter++;
        }
        oktetcounter=1;
        while (oktetcounter <= 4) {
            i = 0;
            bitwert = 128;
            while (i <= 7) {
                viertesOktet += Oktet4[i] * bitwert;
                bitwert /= 2;
                i++;
            }
            oktetcounter++;
        }



        System.out.println("Die Netzadresse ist " +erstesOktet+"."+zweitesOktet+"."+drittesOktet+"."+viertesOktet);


    }
}
