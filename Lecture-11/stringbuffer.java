public class stringbuffer {

    public static void main(String[] args){

        StringBuffer str = new StringBuffer("abc");

        str.setCharAt(0,'d');

        str.append("hola");

        System.out.println(str + " " + str.length());

    }

}
