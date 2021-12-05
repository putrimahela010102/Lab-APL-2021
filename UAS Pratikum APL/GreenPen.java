public class GreenPen implements Pen
{
    @Override
    public void color()
    {
        System.out.println("Pena hijau");
    }

    public double getPanjang()
    {
        return 7.0;
    }
}