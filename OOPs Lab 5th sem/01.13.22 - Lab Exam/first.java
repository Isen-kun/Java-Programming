public class first {
  public static void main(String[] args) {
    System.out.println("Student name: RAJORSHI GHOSH");
    System.out.println("Makaut Roll no: 14800119019");
    if (args.length == 0) {
      System.out.println("\nEnter some arguments from command line.");
      return;
    }
    System.out.println("\nThe number of arguments passed: " + args.length);
    System.out.println("The arguments in reverse are:");
    for (String a : args) {
      StringBuilder word = new StringBuilder();
      word.append(a);
      word.reverse();
      System.out.print(word + " ");
    }
    System.out.println();
  }
}