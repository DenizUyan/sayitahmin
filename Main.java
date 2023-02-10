import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        System.out.println(a);

        int hak = 5;
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("1 ile 100 Arasinda Bir Sayi Giriniz:");

        while(hak != 0){


            sayi = input.nextInt();

            if(sayi>100 || sayi<0){
                System.out.println("Lutfen 1 ile 100 Arasinda Bir Sayi Giriniz:");
                hak = hak - 1;
            }
            else{

                if(sayi == a){
                    System.out.println("Tebrikler Sayiyi Buldunuz");
                    System.out.println("Sayi:"+a);
                }

                else if(sayi>a){
                    if(hak > 1){
                        System.out.println("Daha kucuk bir sayi dene");
                    }
                    hak = hak - 1;
                }
                else if(sayi<a){
                   if(hak > 1){
                       System.out.println("Daha buyuk bir sayi dene");
                   }
                    hak = hak - 1;
                }
            }
        }
        System.out.println("Kaybettiniz");
        System.out.println("Sayi: "+a);
    }
}