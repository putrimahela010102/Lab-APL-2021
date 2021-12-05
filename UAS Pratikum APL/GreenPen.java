public class GreenPen implements Pen
{
    @Override
    public void color()
    {
        System.out.println("Pena hijau"); //menampilkan warna dari pena
    }

    public double getPanjang()
    {
        return 7.0; //menentukan panjang pena yang akan di return
    }
}
