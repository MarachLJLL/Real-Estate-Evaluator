package FileObjectConversion;

import java.util.Iterator;

public interface Fileable<E> {
    public static Object loadFile(String filepath) {
        return null;
    }

    public static Object loadTxt(String filepath) {
        return null;
    }

    public static Object loadCSV(String filepath) {
        return null;
    }

    public static void saveFile(Object obj) {
        Iterable<?> iterable;
        if (obj instanceof Iterable<?>) {
            iterable = (Iterable) obj;
            for (Object o : iterable) {

            }
        } else {

        }
    }

    private static String fileNameToClass() {
        return null;
    }
}
