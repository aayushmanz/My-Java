import javax.imageio.stream.ImageInputStream;
import java.util.*;

public class p2_varargs {
    static void sumAll(int... num) {
        int sum = 0;
        for (int n : num) {
            sum += n;

        }
        System.out.println(sum);


    }

    static void main(String[] args) {
           sumAll(34, 56, 78);
           sumAll(34,67);
    }

}

