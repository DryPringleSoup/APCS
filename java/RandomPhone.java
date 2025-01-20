public class RandomPhone {
    public static void main(String[] args) {
        String phone = "";
        for (int i = 1; i <= 3; i++) phone += (int) (Math.random()*8); phone += "-";
        phone += (""+((int) (Math.random()*743)+1000)).substring(1);  phone += "-";
        phone += (int) (Math.random()*10000);
        System.out.println(phone);
    }
}