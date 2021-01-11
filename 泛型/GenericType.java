package com.example.mytest;

public class GenericType {

    public  static <T extends Number> T add (T a, T b) throws Exception {
        if ((a instanceof Integer) && (b instanceof Integer)){
            return (T)Integer.valueOf(((Integer) a).intValue() + ((Integer) b).intValue());
        } else if ((a instanceof Long) && (b instanceof Long)){
            return (T)Long.valueOf(((Long) a).longValue() + ((Long) b).longValue());
        } else if ((a instanceof Double) && (b instanceof Double)){
            return (T)Double.valueOf(((Double) a).doubleValue() + ((Double) b).doubleValue());
        } else if ((a instanceof Float) && (b instanceof Float)){
            return (T)Float.valueOf(((Float) a).floatValue() + ((Float) b).floatValue());
        } else {
            throw new Exception("类型不支持加法！");
        }
    }
}
