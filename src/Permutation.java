public class Permutation {
    public static String swapString(String a, int i, int j){
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
    public static void main(String[] args){
        String str = "STOP";
        int len = str.length();
        System.out.println("All the permutations of the String are:");
        generatePermuatios(str, 0, len);

    }

    private static void generatePermuatios(String str, int start, int end) {
        if(start == end)
            System.out.println(str);
        else{
            for(int i = start; i < end; i++){
                str = swapString(str, start, i);
                generatePermuatios(str, start + 1, end);
                str = swapString(str, start,i);
            }
        }
    }
}
