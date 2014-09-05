package com.lsurvila.utils;

import android.util.AttributeSet;

/**
 * Created by survilal on 05/09/2014.
 */
public class ViewUtils {

    public static boolean getBooleanAttribute(AttributeSet attrs, String attribute, boolean defaultValue) {
        return attrs.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", attribute, defaultValue);
    }

}
