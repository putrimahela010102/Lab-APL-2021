public class ImplPenAdapter implements PenAdapter
{
    private Pen pena;

    public ImplPenAdapter (Pen pena)
    {
        this.pena = pena; //mengembalikan pena
    }

    @Override
    public double getPanjang()
    {
        double cm = pena.getPanjang();
        return convertCMtoM(cm);
    }

    private double convertCMtoM (double cm)
    {
        return cm / 100; //conversi cm ke m
    }

    @Override
    public void color()
    {
        //biarkan kosong
    }
}
