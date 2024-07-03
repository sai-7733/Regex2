
import java.util.regex.*;
class A{
    public static void main(String args[]){
        Pattern p=Pattern.compile("[^a-z A-Z 0-9]");
        Matcher m=p.matcher("@7g#bhs9$");
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}