import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        int r;
        int alpha;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap Değerini giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez Açı Değerini giriniz : ");
        alpha = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi *r;
        double dilim = (pi * (r*r)*alpha)/360;

        System.out.println("Alan : "+ alan);
        System.out.println("Çevre : "+cevre);
        System.out.println("Daire Dilimin Alanı :" + dilim);


    }
}