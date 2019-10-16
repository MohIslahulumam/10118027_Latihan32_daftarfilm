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
class Film {

  public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration) {
        System.out.printf("%nJudul Film\t: %s%n", filmName);
        System.out.printf("Genre Film\t: %s%n", filmGenre);
        System.out.printf("Rating Film\t: %.1f%n", filmRating);
        System.out.printf("Duration Film\t: %d menit%n", filmDuration);
    }

}