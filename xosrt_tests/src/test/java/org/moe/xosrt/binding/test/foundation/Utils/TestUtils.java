package org.moe.xosrt.binding.test.foundation.Utils;

public class TestUtils {

    public static Class checkClassExists(String className) throws Exception {
        return checkClassExists(className, "apple.foundation");
    }

    public static Class checkClassExists(String className, String pkg) throws Exception {
        return Class.forName(pkg + "" + className);
    }
}
