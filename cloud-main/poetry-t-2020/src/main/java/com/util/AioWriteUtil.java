package com.util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Future;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 * User: wangtao
 * Date: 2020/8/5
 *
 * @author false
 * Description:异步io 写入
 */
public class AioWriteUtil {

    public static ByteBuffer getDataBuffer() {
        String lineSeparator = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append("test");
        sb.append(lineSeparator);
        String str = sb.toString();
        Charset cs = Charset.forName("UTF-8");
        ByteBuffer bb = ByteBuffer.wrap(str.getBytes(cs));
        return bb;
    }

    public static void main(String[] args) throws Exception {
        Path path = Paths.get("C:\\Users\\Administrator\\Desktop\\AIO.txt");
        try {
            AsynchronousFileChannel afc = AsynchronousFileChannel.open(path,WRITE,CREATE);
            ByteBuffer dataBuffer = getDataBuffer();
            Future<Integer> result = afc.write(dataBuffer, 0);
            while (!result.isDone()) {
                System.out.println("Sleeping for 2  seconds...");
                Thread.sleep(2000);
            }
            int writtenBytes = result.get();
            System.out.format("%s bytes written  to  %s%n", writtenBytes,
                    path.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
