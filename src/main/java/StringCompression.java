public class StringCompression {

    public int compress(char[] chars) {
        int n = chars.length;
        int start=0;
        int index=0;

        while(start<n){
            char streakChar=chars[start];

            int end=start;
            int count=1;
            while(end + 1 < n && chars[end]==streakChar ){
                end++;
                count++;
            }

            chars[index]=streakChar;
            index++;

            if(count>1){
                char[] countAsChars=Integer.toString(count).toCharArray();
                for(char digit:countAsChars){
                    chars[index] = digit;
                    index++;
                }
            }

            start=end+1;

        }
        return index;
    }
}
