import java.lang.Thread;

class Child1 extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Child 1: " + i);
    }
  }
}

class Child2 extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Child 2: " + i);
    }
  }
}

class Child3 extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Child 3: " + i);
    }
  }
}

class first {
  public static void main(String[] args) {
    Child1 C1 = new Child1();
    Child2 C2 = new Child2();
    Child3 C3 = new Child3();
    C1.setPriority(Thread.MIN_PRIORITY);
    C2.setPriority(Thread.MAX_PRIORITY);
    C3.setPriority(Thread.NORM_PRIORITY);
    C1.start();
    C2.start();
    C3.start();
  }
}