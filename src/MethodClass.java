public class MethodClass {
    public static void main(String[] args) {

//        sayHelloWorld();
//
//        sayThere("Denny","Raymond");
//
//        String res = returnString("Den");
//
//
//        System.out.println(res);

        int[] nilai = {50,100,70,100};


//        sayCongrats("Den",nilai);
        sayCongratsVarArguments("Den", 50,100,80,100);

    }

    private static void sayThere(String firstName,String lastName) {
        System.out.println("Hello " + firstName + " " +  lastName);
    }

    static void sayHelloWorld(){
        System.out.println("Hello there");
    }

    private static String returnString(String returnValue){
        return "Hello" + returnValue;
    }

    //use array
    private static void sayCongrats(String name, int[] values){
        int total = 0;
            for(int value : values){
                total +=value;
            }

            int finalValue = total/values.length;

            if(finalValue>=75){
                System.out.println("Selamat " + name +" kamu lulus");
            }else{
                System.out.println("Maaf " + name + " anda belum lulus");
            }
    }

    //use variable arguments
    private static void sayCongratsVarArguments(String name, int... values){
        int total = 0;
        for(int value : values){
            total +=value;
        }

        int finalValue = total/values.length;

        if(finalValue>=75){
            System.out.println("Selamat " + name +" kamu lulus");
        }else{
            System.out.println("Maaf " + name + " anda belum lulus");
        }
    }
}
