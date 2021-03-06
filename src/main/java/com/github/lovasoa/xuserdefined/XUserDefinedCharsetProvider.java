package com.github.lovasoa.xuserdefined;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;

import static java.util.Collections.singleton;

public class XUserDefinedCharsetProvider extends CharsetProvider {
    private static final Charset charset = XUserDefined.X_USER_DEFINED;

    @Override
    public Iterator<Charset> charsets() {
        return singleton(charset).iterator();
    }

    @Override
    public Charset charsetForName(String charsetName) {
        return charset.name().equalsIgnoreCase(charsetName) ? charset : null;
    }
}
