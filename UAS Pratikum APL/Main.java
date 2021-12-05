import java.util.Scanner;

public class Main
{
    private static Scanner scanner; 

    public static void main (String[] args)
    {
        String ulang = "y";

        while (ulang.equals("y"))
        {
            Scanner input = new Scanner (System.in);
            String ul = "",lagi;
            System.out.println("\nMENU");
            System.out.println("1. Memilih pena");
            System.out.println("2. Melihat ukuran panjang pena");
            System.out.println("0. Keluar");
            System.out.println("\nMasukkan Pilihan: ");
            int pilih = input.nextInt();

            switch (pilih){
                case 1:{
                    System.out.println("\nVarian Warna Pena: ");
                    System.out.println(" => Merah \n => Biru \n => Hijau");
                    System.out.println("Masukkan warna pena yang anda sukai: ");

                    scanner = new Scanner(System.in);
                    String varianWarnaPena = scanner.next();
                    System.out.println("\nPena yang anda pilih berwarna: " + varianWarnaPena);

                    //PilihPena pilihPena = null;
                    PilihPena pilihPena = new PilihPena();

                    if("Pena Merah".equalsIgnoreCase(varianWarnaPena)){
                        pilihPena.setPen(new RedPen());
                    }else if("Pena Biru".equalsIgnoreCase(varianWarnaPena)){
                        pilihPena.setPen(new BluePen());
                    }else if("Pena Hijau".equalsIgnoreCase(varianWarnaPena)){
                        pilihPena.setPen(new GreenPen());
                    }

                    //pilihPena.color();
                    break;
                }
                case 2:{
                    Pen redPen = new RedPen();
                    PenAdapter redPenAdapter = new ImplPenAdapter(redPen);
                    System.out.println("Pena merah memiliki panjang " + redPenAdapter.getPanjang() + " m.");
                    
                    Pen bluePen = new BluePen();
                    PenAdapter bluePenAdapter = new ImplPenAdapter(bluePen);
                    System.out.println("Pena biru memiliki panjang " + bluePenAdapter.getPanjang() + " m.");

                    Pen greenPen = new GreenPen();
                    PenAdapter greenPenAdapter = new ImplPenAdapter(greenPen);
                    System.out.println("Pena hijau memiliki panjang " + greenPenAdapter.getPanjang() + " m.");

                    break;
                }
                case 0:{
                    System.exit(0);
                    System.out.println("tidak ada pilihan!!");
                }
                break;
            }
            System.out.println("\nApakah anda ingin mengulang (y/t)? ");
            ulang = input.next();
        }
    }
}