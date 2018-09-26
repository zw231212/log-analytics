package cn.org.escience.log.api;

import java.text.SimpleDateFormat;

public class ThreadLocalTest {

  private static final ThreadLocal<SimpleDateFormat> THREAD_LOCAL= ThreadLocal
      .withInitial(SimpleDateFormat::new);

  public static void main(String[] args) {
    System.out.println(THREAD_LOCAL);
    for (int i = 0; i < 20; i++) {

      new Thread(() -> {
        SimpleDateFormat dateFormat = THREAD_LOCAL.get();

        System.out.println(dateFormat);
        System.out.println(Thread.currentThread().getId() + " : " + dateFormat.hashCode());
      }).start();
    }
  }


}
