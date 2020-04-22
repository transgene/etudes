package net.transgene.java9.features.varhandle;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class VarHandleTester {

    public void testAndPrint() throws NoSuchFieldException, IllegalAccessException {
        VarHandle publicIntVarHandle = MethodHandles.lookup()
                .in(VarHandleSubject.class)
                .findVarHandle(VarHandleSubject.class, "publicIntVar", int.class);

        VarHandleSubject subject = new VarHandleSubject();

        System.out.println("Getting public int field: " + publicIntVarHandle.get(subject));
        publicIntVarHandle.setRelease(subject, 9001);
        System.out.println("Read public int field after setting it (should be 9001): " + subject.publicIntVar);

        VarHandle privateStringVarHandle = MethodHandles
                .privateLookupIn(VarHandleSubject.class, MethodHandles.lookup())
                .findVarHandle(VarHandleSubject.class, "privateStringVar", String.class);

        System.out.println("Reading private String field: " + privateStringVarHandle.get(subject));
        privateStringVarHandle.setRelease(subject, "not so hidden");
        System.out.println("Reading private String field after set: " + privateStringVarHandle.get(subject));
    }
}
