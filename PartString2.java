class PartString2 {
    public int PartString2(String str1, String str2) {
        int answer = 0;
        
        if(str2.contains(str1)){
            answer = 1;
        }
        return answer;
    }
}