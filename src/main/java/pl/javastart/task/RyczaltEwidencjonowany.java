package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    public RyczaltEwidencjonowany(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        super(nazwa, formaOpodatkowania);
    }

    @Override
    public double wyliczPodatek(double przychody) {
        return przychody * 0.15;
    }
}