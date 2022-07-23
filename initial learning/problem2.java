class problem2 {
    public static void main(String[] args) {
        String input = "-5,7,1,-2,8";

        int com = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ',') {
                com++;
            }
        }

        String arr[] = new String[com];
        arr = input.split(",");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Integer.parseInt(String.valueOf(arr[i])) >= 0 && Integer.parseInt(String.valueOf(arr[j])) < 0) {
                    String temp = arr[j];
                    int k;
                    for (k = j; k > i; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[k] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(Integer.parseInt(String.valueOf(arr[i + 1])) - Integer.parseInt(String.valueOf(arr[i])));
        }
    }

}
