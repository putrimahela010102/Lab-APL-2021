public class PilihPena 
{
    private Pen pen;

    public void setPen (Pen pena)
    {
        this.pen = pena; //mengembalikan pena
    }

    public Pen getPen()
    {
        return pen; 
    }

    public void color()
    {
        pen.color(); //menampilkan warna pena yang dipilih
    }
}
