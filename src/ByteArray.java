import java.util.Arrays;

/**
 * Created by User on 17 Март, 2020
 */
public class ByteArray {
    private byte[] array;

    public ByteArray(byte[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ByteArray)) return false;
        ByteArray byteArray = (ByteArray) o;
        return Arrays.equals(array, byteArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
