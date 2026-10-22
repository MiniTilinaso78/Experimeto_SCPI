public class ExperimentoStringPool {
    public static void main(String[] args) {
        String s1 = "Java21";
        String s2 = "Java21";
        String s3 = new String("Java21");
        s1.concat(" Moderno");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println("Comparaciones " + s1.equals(s3));
        System.out.println("Comparaciones " + s1);

    }
}
