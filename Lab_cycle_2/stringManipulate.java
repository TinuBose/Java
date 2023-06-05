
public class stringManipulate {
    public static void main(String args[]) {
        String str1 = "Have a good ";
        String str2 = "day";
	System.out .println("string 1 : "+str1);
	System.out.println("string 2 : "+str2);
        System.out.println("String concatination : "+str1.concat(str2));
        System.out.println("Length of first string : "+str1.length());
        System.out.println("Upper case : "+str1.toUpperCase());
        System.out.println("Lower case : "+str1.toLowerCase());

        System.out.println("index of good : "+str1.indexOf("good "));

        StringBuffer sbf = new StringBuffer("hiii ");
        System.out.println("sbf : "+sbf);
        sbf.append("guyzzz");
        System.out.println("appended by guyzzz : "+sbf);
        sbf.insert(5, "where r u ");
        System.out.println("inserting at 5th position : "+sbf);
        System.out.println("replace a with more: "+str1.replace("a", "more"));
        System.out.println("replace all a with b : "+str2.replaceAll("a", "b"));
        sbf.replace(5, 8, " now ");
        System.out.println("replace 5th and 8th with now : "+sbf);

        char arr1[] = { '1', '2', '3', '4', '5' };
        char arr2[] = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println("array equal or not : "+arr1.equals(arr2));
  
        System.out.println("length of the array : "+arr2.length);

    }

}
