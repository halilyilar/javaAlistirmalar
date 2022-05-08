package alistirma2;

public class mukemmelsayi {
    public static void main(String[] args) {

        int input=6;
        int toplam=0;

        System.out.println("girilen sayi : " + input);

        for (int i = 1; i <input ; i++) {
            if (input%i==0){
                toplam+=i;

                System.out.println("sayinin bolenleri " + i);
            }

        }if(toplam==input){

            System.out.println("girilen sayi mükemmel sayidir");
        }else System.out.println("mükemmmel sayi degildir");

        }

    }

