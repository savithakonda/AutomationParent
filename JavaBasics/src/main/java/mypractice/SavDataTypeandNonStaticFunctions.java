package mypractice;

public class SavDataTypeandNonStaticFunctions {

    int TotalParticipants = 100;
    static int Eachcountry = 15;

    // 1-function with input params and with return type
    public String inputandreturn(String countryName, int count) {
        return countryName + " " + count;
    }

    // 2-function without input params and with return type
    public static int noinput() {
        int totalcountries = 150;
        int impactedcountries = 120;
        int notimpacted = totalcountries - impactedcountries;
        return notimpacted;
    }

    // 3-function with input params and without return type
    public static void noreturnvalue(String country, int num) {
        System.out.println("Name" + country+num);
    }

    // 4-function without input params and without return type
    public void noinptnoreturn() {
        System.out.println("noinputnoreturn");
    }

    public static void main(String[] args) {
        /*int  num1;
        num1=10;
        int numbers= num1;
        System.out.println("numbers "+ num1);
        String Virus="Covid-19";
        System.out.println(Virus);
        char Source ='A';
        System.out.println(Source);
        boolean country= true;
        String A= "US";
        String B="US";

        boolean status=(A==B);
        System.out.println("country :" + status);*/

        //object created for non static variable
        SavDataTypeandNonStaticFunctions nonStatic = new SavDataTypeandNonStaticFunctions();
        /*1-function with input parameter and with return type
        public String inputandreturn(String countryName, int count) {
        return countryName + " " + count;*/
        // invoking the function with parameter and with return value
        String countryname = nonStatic.inputandreturn("Europe", 50);
        System.out.println("Countryandcount" + countryname);

        /*2-function without input parameter and with return type
            public static int noinput(){
            int totalcountries= 150;
            int impactedcountries= 120;
            int notimpacted = totalcountries-impactedcountries;
            return notimpacted;*/
        // invoking the fucntion without input parameter and with return value
        int notimpacted = noinput();
        System.out.println("SafeCountry" + notimpacted);

        /*3-function with input parameter and without return type
           public static void noreturnvalue (String country){
           System.out.println("Name" + country);*/
        // function with input parameter and without return value
        noreturnvalue("Asia", 5);

        /*4-function without input parameter and without return type
        public void noinptnoreturn(){
            System.out.println("noinputnoreturn");*/
        // function without input parameter and without return value
        nonStatic.noinptnoreturn();

    }


}
