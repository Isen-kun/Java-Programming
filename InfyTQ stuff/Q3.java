class Q3{
    public static void main(String args[]){
        String input ="5624381275";
        String otp="";
        for(int i=1; i<input.length(); i+=2){
            otp+=(Integer.parseInt(String.valueOf(input.charAt(i)))*Integer.parseInt(String.valueOf(input.charAt(i))));
        }
        String result = otp.substring(0,4);
        System.out.println(result);
    }
}