package pl.javastart.task;

public class FormaOpodatkowania extends Firma {

    static final int KOWTA_WOLNA_OD_PODATKU1 = 10_000;
    static final int KOWTA_WOLNA_OD_PODATKU2 = 100_000;
    static final double PIERWSZY_PROG_PODATKU = 0.18;
    static final double DRUGI_PROG_PODATKU = 0.32;

    public FormaOpodatkowania(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        super(nazwa, formaOpodatkowania);
    }

    public double wyliczPodatek(double przychody) {
        if (przychody < KOWTA_WOLNA_OD_PODATKU1) {
            return przychody;
        }
        if (przychody < KOWTA_WOLNA_OD_PODATKU2) {
            return (PIERWSZY_PROG_PODATKU * przychody) + KOWTA_WOLNA_OD_PODATKU1;
        }
        if (przychody > KOWTA_WOLNA_OD_PODATKU2) {
            return (DRUGI_PROG_PODATKU * przychody) + KOWTA_WOLNA_OD_PODATKU1;
        }
        return przychody;
    }

    private double zsumujPrzychody() {
        return 1;
    }
}
