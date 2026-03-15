import java.util.Scanner;

class SplitText {
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
}

public static String[] manualSplit(String text) {
    int length = findLength(text);
    int wordCount = 1;
    for (int i = 0; i < length; i++) {
        if (text.charAt(i) == ' ')
            wordCount++;
    }
    int[] spaceIndex = new int[wordCount - 1];
    int index = 0;
    for (int i = 0; i < length; i++) {
        if (text.charAt(i) == ' ') {
            spaceIndex[index] = i;
            index++;
        }
    }
    String[] words = new String[wordCount];
    int start = 0;
    for (int i = 0; i < wordCount - 1; i++) {
        int end = spaceIndex[i];
        String word = "";
        for (int j = start; j < end; j++) {
            word = word + text.charAt(j);
        }
        words[i] = word;
        start = end + 1;
    }
    String lastWord = "";
    for (int j = start; j < length; j++) {
        lastWord += text.charAt(j);
    }
    words[wordCount - 1] = lastWord;
    return words;
}

static boolean compareArrays(String [] arr1, String[]arr2){
if(arr1.length != arr2.length){
return false;
for(int i=0; i<arr1.length;i++){
if(!arr1[i].equals(arr2[i]))
return false;
}
}
return true;
}
public static void main(String []args){
Scanner sc= new Scanner(System.in);
System.out.println("enter text: ");
String text= sc.nextLine();
String [] manualWords= manualSplit(text);
String [] builtInWords= text.split(" ");
boolean result = compareArrays(manualWords, builtInWords);
System.out.println("Manual Split: ");
for(String word : manualWords){
System.out.println(word);
}
System.out.println("Built-in Split: ");
for(String word : builtInWords){
System.out.println(word);
}
System.out.println("Result comparison: "+result);
}

