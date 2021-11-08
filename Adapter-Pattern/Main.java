class Main {
    public static void main (String[] args) 
    {
        Suara kucing = new Kucing();
        SuaraAdapter kucingAdaptern = new Ubah(kucing);
        System.out.println("Suara kucing : " + kucingAdaptern.getSuara());
    }
}