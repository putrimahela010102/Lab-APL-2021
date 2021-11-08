public class Ubah implements SuaraAdapter 
{
    Suara suara;
    
    public Ubah(Suara suara) 
    {
        this.suara = suara;
    }

    @Override
    public String getSuara() 
    {
        String bunyi = suara.getSuara();
        return ubahBunyi(bunyi);
    }

    public String ubahBunyi(String bunyi) 
    {
        Suara bebek = new Bebek();
        return bebek.getSuara();
    }
}