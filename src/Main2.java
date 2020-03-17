import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by User on 17 Март, 2020
 */
public class Main2 {
    public static void main(String[] args) {
        ByteArray array1 = null;
        ByteArray array2 = null;
        String str = "Мама мыла раму";
        try {
            array1 = new ByteArray(str.getBytes("windows-1251"));
            array2 = new ByteArray(str.getBytes("windows-1251"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("array1.equals(array2) = " + array1.equals(array2));

        HashMap<ByteArray, Integer> hashMap = new HashMap<>();

        hashMap.put(array1, 0);
        hashMap.put(array2, 1);

        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("array1.hashCode() = " + (Object) array1.hashCode());
        System.out.println("array2.hashCode() = " + (Object) array2.hashCode());
    }
}
