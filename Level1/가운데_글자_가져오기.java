package Level1;

public class 가운데_글자_가져오기 {

    public static String solution(String s){

        int num = s.length()/2;

        if(s.length()%2==0){
            return s.substring(num-1, num+1);
        }else {
             return s.substring(num,num+1);
        }
    }

    public static void main(String[] args) {

        System.out.println(solution("abcde"));
    }
}
