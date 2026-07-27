public class stringBuffer_stringBuilder {

    static void main() {
        //string literal
     String a = "shrey p ";
     //string object
     String b = new String("modh");
        System.out.println(a+b);
        System.out.println(a.trim()+b);

        //STRINGBUFFER (mutable)
        StringBuffer sb = new StringBuffer("a");
        System.out.println(sb);
        System.out.println("capacity: "+ sb.capacity());
        System.out.println(sb.append("las"));

        //checking the performance time of stringbuffer
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append("world");
        }
        System.out.println("Time taken by buffer: " + (System.currentTimeMillis() - startTime));

        /* StringBuilder is also a class which provide us with the mutable things, but with a lack of thread safety, it cannot be used by multiple threads. That's a major difference.  */

        //STRINGBUILDER (mutable)
        StringBuilder sbuild = new StringBuilder("a");
        System.out.println("capacity: " + sbuild.capacity());
        sbuild.append("las");
        System.out.println(sbuild);

        //checking performance time of stringbuilder
        double startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sbuild.append("world");
        }
        System.out.println("Time taken by builder: "+ (System.currentTimeMillis() - startTime2));


    }
}

/*
 public static long currentTimeMillis():
Returns the current time in milliseconds. Note that while the unit of time of the return value is a millisecond, the granularity of the value depends on the underlying operating system and may be larger.

by default, strings are immutable.
But, what is the actual diff b/w mutable and immutable strings?

 */
