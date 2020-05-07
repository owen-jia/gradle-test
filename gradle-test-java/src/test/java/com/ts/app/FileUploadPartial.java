package com.ts.app;

import org.junit.Test;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Calendar;

/**
 * 断掉续传测试用例
 * @author: Owen Jia
 * @time: 2019/6/6 18:16
 */
public class FileUploadPartial {

    @Test
    public void test1() throws Exception{
        //File content: 1234abc我
        File file = new File("F:\\tmp\\001.txt");
        long currentLength = file.length();
        System.out.println(currentLength);
        //输出：9
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(file.lastModified());
        System.out.println(calendar.getTime());

        String insert = "1tt1";
        byte[] bytes = insert.getBytes();
        System.out.println(bytes.length);

        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        raf.seek(currentLength+5);
        raf.write(bytes,0,bytes.length);
        System.out.println(file.length());


        insert+=",";
        bytes = insert.getBytes();
        raf.seek(currentLength);
        raf.write(bytes,0,bytes.length);
        System.out.println(file.length());
    }
}
