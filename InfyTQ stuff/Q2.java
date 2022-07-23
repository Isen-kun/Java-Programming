class Q2{
    public static void main(String args[]){
        String input="infosys";
        String result="";
        for(int i=0; i<input.length(); i++){
            if(result.indexOf(input.charAt(i))<0){
                result+=input.charAt(i);
            }
        }
        StringBuilder rev = new StringBuilder();
        rev.append(result);
        rev.reverse();
        System.out.println(rev);
    }
}