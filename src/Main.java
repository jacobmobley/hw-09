public class Main {
    public static void main(String[] Args){
        Ride t1 = new Ride("batman", "Green", 5, 10);
        String t2 = new String();
        Ride t3 = new Ride("batman", "Green", 5, 10);
        System.out.println(t1.equals(t3));
    }
}
