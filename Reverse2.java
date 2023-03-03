public class Reverse2 {
    public static void main(String[] args) {
        String str1 = "Think Twice";
        String str2 = "";
        str1=str1.toLowerCase();
        String[] arr = str1.split(" ");
        for(String element:arr){
            for(int i=element.length()-1;i>=0;i--){
                str2+=element.charAt(i);
            }
              str2+=" ";
        }
        System.out.println(str2);
    }
}
