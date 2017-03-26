public class Motor {
String aktifitas;
String merek;
String warna;
int kecepatan;
void cekKecepatan() {
if (kecepatan==0)
aktifitas="parkir";
}
void cetakAtribut() {
System.out.println("aktifitas = "+aktifitas);
System.out.println("merek = "+merek);
System.out.println("warna = "+warna);
System.out.println("Kecepatan = "+kecepatan);
}
public static void main(String [] args) {
Motor motorsaya = new Motor();
motorsaya.kecepatan=0;
motorsaya.warna="merah";
motorsaya.merek="Yamaha";
motorsaya.cekKecepatan();
motorsaya.cetakAtribut();
}
}