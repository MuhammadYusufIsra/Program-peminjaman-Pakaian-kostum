package peminjaman.kostum;

import java.util.Scanner;

public class PeminjamanKostum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----PEMINJAMAN KOSTUM-----");
        System.out.println("Pilihan kostum : ");
        System.out.println("1. Baju Daerah (60.000 per hari)");
        System.out.println("2. Kostum Pahlawan super (50.000 per hari)");
        System.out.println("3. Kostum Pekerjaan (65.000 per hari)");
        
        System.out.println("----------");
        System.out.print("Nomor Pakaian yang anda pilih (1/2/3): ");
        int pakaian = input.nextInt();
        System.out.println("----------");
        switch (pakaian){
            
            case 1 :
                System.out.print("lama peminjaman (hari): ");
                int hari1 = input.nextInt();
                int harga1 = 60000*hari1;
                System.out.println("Total Harga : "+harga1);
                
                System.out.println("-----------");
                System.out.print("Total uang anda : ");
                int uang1 = input.nextInt();
                    
                    if(uang1 > 60000){
                        System.out.println("----------");
                        int kembalian1= uang1 - harga1;
                        System.out.println("Kembalian = "+kembalian1);
                    }else if(uang1 == 60000){
                        System.out.println("Uang anda pas, tidak ada kembalian");
                    }else{
                        System.out.println("Mohon maaf uang anda tidak mencukupi");
                    }
                
                
                break;
            case 2 :
                System.out.print("lama peminjaman (hari): ");
                int hari2 = input.nextInt();
                int harga2 = 50000*hari2;
                System.out.println("Total Harga : "+harga2);
                                
                System.out.println("-----------");
                System.out.print("Total uang anda : ");
                int uang2 = input.nextInt();
                    
                    if(uang2 > 50000){
                        System.out.println("----------");
                        int kembalian2= uang2 - harga2;
                        System.out.println("Kembalian = "+kembalian2);
                    }else if(uang2 == 50000){
                        System.out.println("Uang anda pas, tidak ada kembalian");
                    }else{
                        System.out.println("Mohon maaf uang anda tidak mencukupi");
                    }
                
                break;
            case 3 :
                System.out.print("lama peminjaman (hari): ");
                int hari3 = input.nextInt();
                int harga3= 65000*hari3;
                System.out.println("Total Harga : "+harga3);
                                                
                System.out.println("----------");
                System.out.print("Total uang anda : ");
                int uang3 = input.nextInt();
                    
                    if(uang3 > 65000){
                        System.out.println("----------");
                        int kembalian3= uang3 - harga3;
                        System.out.println("Kembalian = "+kembalian3);
                    }else if(uang3 == 65000){
                        System.out.println("Uang anda pas, tidak ada kembalian");
                    }else{
                        System.out.println("Mohon maaf uang anda tidak mencukupi");
                    }
                    
                break;
                
            default :
                System.out.println("Mohon maaf kostum yang anda cari tidak ada disini");
                
        }
    }
    
}
