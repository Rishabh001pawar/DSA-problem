package String;

public class str6 {
    public static boolean isValid(String s) {
        while(true){
            if(s.contains("()")){
                s=s.replace("()"," ");
            }
            if(s.contains("[]")){
                s=s.replace("[]"," ");
            }
            if(s.contains("{}")){
                s=s.replace("{}"," ");
            }
            else{
                return s.isEmpty();
            }
        }
    }
}
