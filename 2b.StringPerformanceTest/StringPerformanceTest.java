/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better*/

public class  StringPerformanceTest {
    public static void main(String[] args) {
        int count = 20000;
        String toAppend = "AI";

        // 1. StringBuffer benchmark (thread-safe)
        StringBuffer buf = new StringBuffer();
        long t0 = System.nanoTime();
        for (int i = 0; i < count; i++) {
            buf.append(toAppend);
        }
        long t1 = System.nanoTime();
        long timeBuffer = t1 - t0;
        System.out.println("1. StringBuffer append time: " + timeBuffer + " ns");

        // 2. StringBuilder benchmark (non-thread-safe, usually faster)
        StringBuilder bldr = new StringBuilder();
        long t2 = System.nanoTime();
        for (int i = 0; i < count; i++) {
            bldr.append(toAppend);
        }
        long t3 = System.nanoTime();
        long timeBuilder = t3 - t2;
        System.out.println("2. StringBuilder append time: " + timeBuilder + " ns");

        // 3. Verdict
        if (timeBuilder < timeBuffer) {
            System.out.println("3. Verdict: StringBuilder is faster in single‑threaded scenarios.");
        } else {
            System.out.println("3. Verdict: StringBuffer is safer for concurrency but slower.");
        }
    }
}
