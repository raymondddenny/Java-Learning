public class SwitchLambda {

    public static void main(String[] args) {
        String nilai = "A";

        switch (nilai){
            case "A" -> System.out.println("Selamat anda mendapat nilai terbaik");
            case "B","C" -> System.out.println("Nilai anda baik");
            default -> System.out.println("anda tidak lulus");
        }


        String ucapan = switch (nilai){
            case "A" :
                yield "nilai mu bagus";
            case "B":
            case "C":
                yield "Nilaimu oke";
            default:
                yield "anda tidak lulus";

        };

        System.out.println(ucapan);
    }
}
