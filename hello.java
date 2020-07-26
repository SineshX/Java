public class hello{                                                                   //public is aaccess specifier (more : private , protected)
    public static void main(String[] args){                                          // compiler sabse pahle main method (same as function  ) ko dekhega 
        System.out.println("Hello world");
        System.out.println("using online compiler : jdoddle.com/online-java-compiler");   //learnt to print babe :)
        
         int a = 30;
         int b = 41;
        double average;              //lol maine float = average ; //likha tha tum mat likhna // and noe // float lene par pata nahikyu dikkat kar raha hai
        //average = (a+b)/2;         // it will give 35.0 not 
        average = (a+b)/2.0; // now it will give 35.5 // we may use 2.0 or 2d or 2f // sadly 2(double) or (float) is giving error        
        System.out.println(average); //direct print
        System.out.println("average : " + average ); //here string + value // here + is not an addition operator ...yaha concatenatiate ho raha hai.. by system deafult LOL XDD
        
        String first , last;
        first="Sinesh";
        last="Kumar";
        
        System.out.println(first  + last);  // + k bina kaam nahi chalega // comma(,) v nahi chalega aur sune isne space v nahi diya SineshKumar diya
        System.out.println(first + " " + last ); //string double "" k andar aur char single '';
        
        System.out.println('A'); // A4 nahi lega
        char sigle = 'X'; //fucchak X ko '' me lana bhul gaya tha
        System.out.println(sigle);  // variable k liye direct andar likh do
        
        boolean name1;
        name1=true;
        System.out.println(name1);
        
        //Literals
        
        final int N1;   //programmer code XD : final int FIRST_NUM; (in general)
         N1 = 30;
        //N1 = 40;  //gives error coz it is fixed (variable)
                
        //
    }
}
