/*
* NAMA              : M Islahul Umam djasuta
 * KELAS             : IF-01
 * NIM               : 10118027
 * DESKRIPSI PROGRAM : Daftar Film yg akan di putar
 */
package pkg10118027_if.pkg1_latihan32_daftarfilm;

/**
 *
 * @author RYZEN
 */
public class Main {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film nonton = new Film();

        System.out.println("===Daftar Film Sedang Tayang===");
        nonton.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120);
        nonton.nowPlaying("Civil war", "action", 9.0, 96);
        nonton.nowPlaying("NARUTO", "action", 7.8, 119);
        nonton.nowPlaying("Ironman", "action", 6.0, 100);
    }

}