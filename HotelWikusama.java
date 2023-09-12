import java.util.Scanner;

public class HotelWikusama {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int weekday, weekend, holiday, malam;
        
        String pilih ="";
        
        do {
            System.out.println("1.Duku\n harga Permalam: \n weekday: 915.000 \n weekend: 1.025.000 \n holiday: 1.225.000");
            System.out.println("\n2.Jeruk\n harga permalam: \n weekday: 915.000 \n weekend: 1.025.000 \n holiday: 1.225.000");
            System.out.println("\n3.Alpukat\n harga permalam: \n weekday: 575.000 \n weekend: 695.000 \n holiday: 895.000");
            System.out.println("\n4.Jambu Air\n harga permalam: \n weekday: 575.000 \n weekend: 695.000 \n holiday: 895.000");
            System.out.println("\n5.Durian\n harga permalam: \n weekday: 595.000 \n weekend: 715.000 \n holiday: 915.000");
            System.out.println("\n6.Melon\n harga permalam: \n weekday: 595.000 \n weekend: 715.000 \n holiday: 915.000");
            System.out.println("\n7.Belimbing\n harga permalam: \n weekday: 495.000 \n weekend: 575.000 \n holiday: 755.000");
            System.out.println("\n8.mangga\n harga permalam: \n weekday: 495.000 \n weekend: 575.000 \n holiday: 755.000");
            System.out.println("\n9.kedondong\n harga permalam: \n weekday: 495.000 \n weekend: 575.000 \n holiday: 755.000");

            System.out.print("\n\npilih Cottage Yang Akan Di pesan: ");
            int kamar = x.nextInt();

            if (kamar == 1) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam: Rp.915.000");
                    String beli = "";
                    do{
                    System.out.println("apakah jadi menyewa kamar: (y/n)");
                         beli = x.next();}
                    while (beli.equalsIgnoreCase("n"));
                    
                     System.out.print("akan bermalam berapa lama: ");
                       malam = x.nextInt();

                       weekday = 915000 * malam;

                       System.out.println("total: " + weekday);}
                
                 else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.1.025.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                      weekend = 1025000 * malam;

                      System.out.println("total: " + weekend);
                }
                 else {
                    System.out.println("Harga permalam: Rp.1.225.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                      holiday = 1225000 * malam;

                      System.out.println("total: " + holiday);
                }
            } 
            else if (kamar == 2) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam: Rp.915.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekday = 915000 * malam;

                       System.out.println("total: " + weekday);
                }
                 else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.1.025.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekend = 1025000 * malam;

                       System.out.println("total: " + weekend);
                }
                 else {
                    System.out.println("Harga permalam: Rp.1.225.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       holiday = 1225000 * malam;

                       System.out.println("total: " + holiday);
                }
            } 
            else if (kamar == 3) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam:  Rp.575.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekday = 575000 * malam;

                       System.out.println("total: " + weekday);
                }  
                else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.695.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekend = 695000 * malam;

                       System.out.println("total: " + weekend);
                }
                 else {
                    System.out.println("Harga permalam: Rp.859.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       holiday = 859000 * malam;

                       System.out.println("total: " + holiday);
                }
            } 
            else if (kamar == 4) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam:  Rp. 575.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekday = 575000 * malam;

                       System.out.println("total: " + weekday);
                }
                 else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.695.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekend = 695000 * malam;

                       System.out.println("total: " + weekend);
                }
                 else {
                    System.out.println("Harga permalam: Rp. 859.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       holiday = 859000 * malam;

                       System.out.println("total: " + holiday);
                }

            } 
            else if (kamar == 5) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam:  Rp. 595.000");
                     System.out.print("akan bermalam berapa lama: ");
                       malam = x.nextInt();

                        weekday = 595000 * malam;

                        System.out.println("total: " + weekday);
                }
                 else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.715.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekend = 715000 * malam;

                       System.out.println("total: " + weekend);
                } 
                else {
                    System.out.println("Harga permalam: Rp. 915.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       holiday = 915000 * malam;

                       System.out.println("total: " + holiday);
                }
            }
             else if (kamar == 6) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam:  Rp. 595.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekday = 595000 * malam;

                       System.out.println("total: " + weekday);
                } 
                else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.715.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekend = 715000 * malam;

                       System.out.println("total: " + weekend);
                } 
                else {
                    System.out.println("Harga permalam: Rp. 915.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       holiday = 915000 * malam;

                       System.out.println("total: " + holiday);
                }
            }
             else if (kamar == 7) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam:  Rp. 595.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekday = 595000 * malam;

                       System.out.println("total: " + weekday);
                }
                 else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.715.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekend = 715000 * malam;

                       System.out.println("total: " + weekend);
                }
                 else {
                    System.out.println("Harga permalam: Rp. 915.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                        holiday = 915000 * malam;

                        System.out.println("total: " + holiday);
                }
            }
             else if (kamar == 8) {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();

                // pilih variabel yang mau dicek
                switch (hari) {
                    case 1: //kasus 1
                        System.out.println("Harga permalam:  Rp. 595.000");
                        System.out.print("akan bermalam berapa lama: ");
                         malam = x.nextInt();

                          weekday = 595000 * malam;
                           System.out.println("total: " + weekday);
                        break;
                    case 2://kasus 2
                        System.out.println("Harga permalam: Rp.715.000");
                        System.out.print("akan bermalam berapa lama: ");
                         malam = x.nextInt();

                          weekend = 715000 * malam;
                           System.out.println("total: " + weekend);
                        break;
                    default:// gk masuk kasus
                        System.out.println("Harga permalam: Rp. 915.000");
                        System.out.print("akan bermalam berapa lama: ");
                         malam = x.nextInt();

                          holiday = 915000 * malam;
                           System.out.println("total: " + holiday);
                        break;
                }
            }
             else {
                System.out.println("1. weekday");
                System.out.println("2. weekend");
                System.out.println("3. holiday");
                System.out.print("menginap di hari apa:");
                int hari = x.nextInt();
                if (hari == 1) {
                    System.out.println("Harga permalam:  Rp. 595.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekday = 595000 * malam;

                       System.out.println("total: " + weekday);
                }
                 else if (hari == 2) {
                    System.out.println("Harga permalam: Rp.715.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       weekend = 715000 * malam;
                       System.out.println("total: " + weekend);
                }
                 else {
                    System.out.println("Harga permalam: Rp. 915.000");
                     System.out.print("akan bermalam berapa lama: ");
                      malam = x.nextInt();

                       holiday = 915000 * malam;
                       System.out.println("total: " + holiday);
                }

            }
            
            System.out.print("Apakah mau pesan lagi? (y/n)\n> ");
            pilih = x.next();
            
        } 
        while (pilih.equalsIgnoreCase("y"));
        

    }
}
