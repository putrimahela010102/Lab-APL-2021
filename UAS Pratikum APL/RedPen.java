public class RedPen implements Pen
{
    @Override
    public void color()
    {
        System.out.println("merah"); //menampilkan warna dari pena
    }

    public double getPanjang()
    {
        return 10.0; //menentukan panjang pena yang akan di return
    }
}
