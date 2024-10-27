import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String input = "mphasis";
        StringBuilder sb = new StringBuilder();
        for(Character ch:input.toCharArray()){

            sb.append(ch);
            if(ch == 'a'){
                sb.append("abc");

            }

        }
        System.out.println(sb.toString());

        System.out.println("I am in Main Class");


    }


}
