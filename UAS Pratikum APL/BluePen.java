public class BluePen implements Pen
{
    @Override
    public void color()
    {
        System.out.println("Biru"); //menampilkan warna dari pena
    }

    public double getPanjang()
    {
        return 8.0; //menentukan panjang pena yang akan di return
    }
}
