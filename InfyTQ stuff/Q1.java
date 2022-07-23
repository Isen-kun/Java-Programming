class Q1{
    public static void main(String args[]){
        String input="3,1,6,4,2,3,7,2";
        int num1=0, num2=0;
        String str="";
        for(int i=0; i<input.length(); i+=2){
            if(input.charAt(i)=='4'){
                while(input.charAt(i)!='7'){
                    str+=input.charAt(i);
                    i+=2;
                }
                str+='7';
            }
            else{
                num1+=Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        num2=Integer.parseInt(str);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1+num2);
    }
}