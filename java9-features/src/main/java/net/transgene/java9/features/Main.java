package net.transgene.java9.features;

import net.transgene.java9.features.varhandle.VarHandleTester;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        VarHandleTester varHandleTester = new VarHandleTester();
        varHandleTester.testAndPrint();
    }
}
