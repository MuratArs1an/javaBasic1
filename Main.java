import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fiz, kim, tarih, turkce;
        Scanner input=new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat=input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fiz=input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kim=input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih=input.nextInt();

        System.out.println("turkce Notunuz: ");
        turkce=input.nextInt();

        int ortalama=(mat+fiz+kim+turkce+tarih)/5;

        System.out.println("Not ortalamaniz : "+ ortalama);
    }
}