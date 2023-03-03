public class Reverse1{
    public static void main(String[] args) {
        
        String str1 = "PWSKILLS";
        String str2 = "";

        for(int i=str1.length()-1;i>=2;i--){
            str2+=str1.charAt(i);
        }
        System.out.println(str2+str1.substring(0,2));
    }
}