class second {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    System.out.println("Current Thread  = " + t);
    t.setName("Test Thread");
    System.out.println("After name change Current thread: " + t);
    try {
      for (int c = 0; c < 5; c++) {
        System.out.println(Thread.currentThread().getName() + " - " + c);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
