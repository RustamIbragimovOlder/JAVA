package Java_Lectures.Lecture2_23nov;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example4 {
    static ByteOrder bOrder = ByteOrder.LITTLE_ENDIAN;
    static Map<String, String> data = new HashMap<>();
    static Charset charset = StandardCharsets.UTF_8;

    static void loadFile(String path) throws IOException {
        try (InputStream stream = 
        new BufferedInputStream(new FileInputStream(path))) {
            int n = readInt(stream);
            int b1;
            int b2;
            byte binWord[];
            byte binText[];
            for (int i = 0; i < n; i++) {
                binWord = new byte[readInt(stream)];
                binText = new byte[readInt(stream)];
                b1 = stream.read(binWord);
                b2 = stream.read(binText);
                if (b1 != binWord.length || b2 != binText.length)
                    throw new IOException("Error read file");
                data.put(new String(binWord, charset), 
                         new String(binText, charset));
            }
        }
    }

    static void saveFile(String path) throws IOException {
        if (data.size() == 0)
            throw new IOException("Nothing to write");
        try (OutputStream stream = new BufferedOutputStream(new FileOutputStream(path, false))) {
            writeInt(stream, data.size());
            byte binWord[];
            byte binText[];
            for (Entry<String, String> entry : data.entrySet()) {
                binWord = entry.getKey().getBytes(charset);
                writeInt(stream, binWord.length);
                binText = entry.getValue().getBytes(charset);
                writeInt(stream, binText.length);
                stream.write(binWord);
                stream.write(binText);
            }
        }
    }

    static void delete(String word) {
        data.remove(word);
    }

    static void add(String word, String text) throws Exception {
        if (data.get(word) != null)
            throw new Exception("Word already exist");
        data.put(word, text);
    }

    static String find(String word) {
        String out = data.get(word);
        if (out == null)
            return "не найдено";
        else
            return out;
    }

    static int readInt(InputStream in) throws IOException {
        byte out[] = new byte[4];
        int i = in.read(out);
        if (i != 4)
            throw new IOException("Error read file");
        return ByteBuffer.wrap(out).order(bOrder).getInt();
    }

    static void writeInt(OutputStream out, int num) throws IOException {
        ByteBuffer dbuf = ByteBuffer.allocate(4);
        dbuf.order(bOrder).putInt(num);
        out.write(dbuf.array());
    }

    public static void main(String[] args) {
        String file = "test.bin";
        //create file
        
        try {
            add("key1", "значение 1");
            add("key2", "значение 2");
            add("key4", "значение 3");
            saveFile(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //read file
        
        try {
            loadFile(file);
            String key1 = "key1";
            String key2 = "key2";
            String key3 = "key3";
            System.out.printf("%s: %s\n", key1, find(key1));
            System.out.printf("%s: %s\n", key2, find(key2));
            System.out.printf("%s: %s\n", key3, find(key3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
