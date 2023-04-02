
public class stringManipulate {
    public static void main(String args[]) {
        String str1 = "Have a good ";
        String str2 = "day";
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1.indexOf("good "));

        StringBuffer sbf = new StringBuffer("hiii ");
        System.out.println(sbf);
        sbf.append("guyzzz");
        System.out.println(sbf);
        sbf.insert(5, "where r u ");
        System.out.println(sbf);
        System.out.println(str1.replace("a", "more"));
        System.out.println(str2.replaceAll("a", "b"));
        sbf.replace(5, 8, " now ");
        System.out.println(sbf);

        char arr1[] = { '1', '2', '3', '4', '5' };
        char arr2[] = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println(arr1.equals(arr2));
        arr1.toString();
        System.out.println(arr1);
        System.out.println(arr2.length);

    }

}
