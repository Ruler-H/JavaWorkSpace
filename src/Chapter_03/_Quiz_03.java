package Chapter_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String birth = "901231-1234567";
        System.out.println(birth.substring(0, 8));
        birth = "030708-4567890";
        System.out.println(birth.substring(0, birth.indexOf("-")+2));
    }
}
