/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360 */

import java.util.Scanner;

public class PatikaProje5 {
    public static void main(String[] args){

        //Değişkenleri tanımlayalım
        double pi = 3.14, a, r, alan;

        //Scanner sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alalım
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextDouble();

        System.out.print("Dairenin merkez açısını giriniz : ");
        a = input.nextDouble();

        //Dairenin alanını hesaplama
        alan = (pi * (r*r) * a) / 360;
        System.out.print("Dairenin Alanı : " + alan);
    }
}
