import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        byte[] array1 = new byte[0];
        byte[] array2 = new byte[0];
        String str = "Мама мыла раму";
        try {
            array1 = str.getBytes("windows-1251");
            array2 = str.getBytes("windows-1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("Arrays.equals(array1, array2) = " + Arrays.equals(array1, array2));

        HashMap<byte[], Integer> hashMap = new HashMap<>();

        hashMap.put(array1, 0);
        hashMap.put(array2, 1);

        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("array1.hashCode() = " + (Object) array1.hashCode());
        System.out.println("array2.hashCode() = " + (Object) array2.hashCode());
    }
}
