package coding;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle="issippi";
        int ans=findFirstOccurrence(haystack,needle);
        System.out.println(ans);
    }

    static int findFirstOccurrence(String haystack, String needle){
        if(needle.length()>haystack.length()){
            return -1;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(i+needle.length()>haystack.length()){
                    return -1;
                }
                int index=0;
                for(int j=i;j<i+needle.length();j++){
                    if(haystack.charAt(j)==needle.charAt(index)){
                        index++;
                    }
                    if(index==needle.length()){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
