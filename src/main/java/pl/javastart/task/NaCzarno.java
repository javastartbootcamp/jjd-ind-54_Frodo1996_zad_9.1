package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    public static double NA_CZARNO = 0;

    public NaCzarno(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        super(nazwa, formaOpodatkowania);
    }

    @Override
    public double wyliczPodatek(double przychody) {
        return przychody;
    }
}