class MyThread extends Thread {
  public void run() {
    System.out.println("\n\nChild thread Started");
    try {
      for (int c = 0; c < 3; c++) {
        System.out.println("\n" + Thread.currentThread().getName() + " - " + c);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class third {
  public static void main(String[] args) {
    System.out.println("\n\nMain thread started");
    MyThread t1 = new MyThread();
    t1.start();

    try {
      for (int c = 100; c < 105; c++) {
        System.out.println("\n" + Thread.currentThread().getName() + " - " + c);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
