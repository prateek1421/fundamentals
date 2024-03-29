package interviewQuestions.sorting;


import java.util.Objects;

/**
 * Input is a String. The method should return the sorted string.
 * that means the words which have less number of characters should come first.
 * if there are two words having same count . then they should be sorted in alphabetical order.
 *
 * Ex: Input: my name is prateek.
 * Output: is my name prateek.
 *
 */
public class SortASentence {


    public static void main(String args[]) {
        System.out.println(sortASentence("my name is prateek."));
    }
    public static String sortASentence(String str) {
        if (Objects.isNull(str) || str.isEmpty()) {
            return "";
        }
        if (str.trim().split(" ").length == 1) {
            return str;
        }
        String strWithoutDot = str.substring(0,str.length()-1);
        String[] words = strWithoutDot.split(" ");
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words.length-i-1;j++) {
                if(words[j].length() > words[j+1].length()) {
                    swap(words,j,j+1);
                } else if (words[j].length() == words[j+1].length()) {
                    if(words[j].compareTo(words[j+1]) > 0) {
                        swap(words,j,j+1);
                    }
                }
            }
        }
        String response = "";
        for(int i=0;i<words.length;i++){
            if(i==words.length-1)
            response = response + words[i]+".";
            else response = response + words[i]+" ";
        }
        return response;
    }

    private static void swap(String[] array,int first,int second) {
        String temp = array[first];
        array[first] = array[second];
        array[second] =  temp;
    }
}
