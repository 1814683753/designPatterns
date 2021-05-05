package com.hjl.designpatterns.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ：hjl
 * @date ：2021/5/5 20:25
 * @description：自定义的装饰流（输入的大写转成小写）
 * @modified By：
 */
public class LowerCaseFileInputStream extends FilterInputStream {



    public LowerCaseFileInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int res = super.read();
        return res == -1 ? res : Character.toLowerCase(res);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res = super.read(b, off, len);
        for (int i = off; i < off + res; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return res;
    }
}
