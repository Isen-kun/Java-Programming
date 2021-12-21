class MyThread extends Thread {
  public void run() {
    System.out.println("\n\nChild Thread Started");
    try {
      for (int c = 0; c < 5; c++) {
        System.out.println("\n" + Thread.currentThread().getName() + " - " + c);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class fourth {
  public static void main(String[] args) {
    System.out.println("\n\nMain Thread Started");

    MyThread t1 = new MyThread();
    t1.setName("Child-1");
    t1.start();

    MyThread t2 = new MyThread();
    t2.setName("Child-2");
    t2.start();

    try {
      for (int c = 100; c < 107; c++) {
        System.out.println("\n" + Thread.currentThread().getName() + " - " + c);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
