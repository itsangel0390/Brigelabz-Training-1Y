import java.util.Scanner;

class VowelConsonantCount {
public static String checkChar(char ch){
if(ch>='A' && ch<='Z'){
ch=(char)(ch +32);
}
if(ch>='a' && ch<='z'){
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
return "vowel";
}
else {
return "consonant";
}
}

return "not a letter";
}


    public static int[] countVC(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkChar(ch);
            if (result.equals("vowel")) {
                vowelCount++;
            } else if (result.equals("consonant")) {
                consonantCount++;
            }
        }
        int[] count = new int[2];
        count[0] = vowelCount;
        count[1] = consonantCount;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String s = sc.nextLine();
        int[] result = countVC(s);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonant: " + result[1]);
    }
}