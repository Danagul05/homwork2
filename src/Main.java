public class Main {
    public static void main(String[] args) {
        System.out.println(walk(20,10));
        System.out.println(walk(10,40));
        System.out.println(walk(45,25));
        System.out.println(walk(30,35));
        System.out.println(walk(60,-5));
    }


    public static String walk(int age, int temperatyre) {
       String walk = "Можно идти гулять";
        if (age > 20 && age < 45 && temperatyre > -20 && temperatyre < 30) {
            return walk;
        }else if (age < 20 && temperatyre > 0 && temperatyre < 28) {
            return walk;
        }else if (age > 45 && temperatyre > -10 && temperatyre < 25) {
            return walk;
        }else
                   return "Оставайтесь дома";
                }
            }


