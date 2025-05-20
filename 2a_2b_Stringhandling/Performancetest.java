
/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/


public class Performancetest {
    public static void main(String[] args) {
        // Measure performance of StringBuffer
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " nanoseconds");

        // Measure performance of StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " nanoseconds");

        // Justification: StringBuffer is synchronized, which makes it thread-safe but slower.
        // StringBuilder is not synchronized, which makes it faster for single-threaded use cases.
        if (stringBufferTime < stringBuilderTime) {
            System.out.println("StringBuffer is faster in this case.");
        } else {
            System.out.println("StringBuilder is faster in this case.");
        }
    }
}
