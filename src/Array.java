public class Array {
    public static void main(String[] args) {
        String[] arrString = new String[3];
        arrString[0] = "Denny";
        arrString[1] = "Raymond";

        System.out.println(arrString[2]);

        String[] namaNama = {
                "Denny","Raymond"
        };

        System.out.println(namaNama);

        String[][] arrInside = {
                {"Denny","Raymond"},
                {"Ivan","Gunawan"}
        };

        System.out.println(arrInside[0]);

    }
}
