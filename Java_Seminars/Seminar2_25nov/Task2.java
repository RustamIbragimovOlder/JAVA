// Напишите метод, который сжимает строку. 
// Пример: aaaabbbcdd → a4b3cd2


package Java_Seminars.Seminar2_25nov;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(compressString("aaaabbbcdd"));
        
    }
    
    public static String compressString (String S) {
        if (S == null || S.length() <= 2) {
            return S;
        }
        int length = S.length ();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < length; i++) {
            if (S.charAt (i) == S.charAt (i-1)) {
                count ++;
            }
            else {
                sb.append(S.charAt(i-1)).append(count);
                count = 1;
            }

        }
        sb.append(S.charAt(length-1)).append(count);
        String answer = sb.toString();
        return answer.length() < length ? answer: S;
    }
}

