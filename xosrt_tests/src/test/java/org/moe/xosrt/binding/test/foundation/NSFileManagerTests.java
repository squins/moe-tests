package org.moe.xosrt.binding.test.foundation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.xosrt.binding.test.foundation.Utils.TestFileManagerDelegate;
import org.moe.xosrt.binding.test.foundation.Utils.XOSTest;

import apple.foundation.NSBundle;
import apple.foundation.NSData;
import apple.foundation.NSFileManager;
import apple.foundation.protocol.NSFileManagerDelegate;

import static org.junit.Assert.assertTrue;

public class NSFileManagerTests extends XOSTest{

    private static final String FILE_NAME = NSBundle.mainBundle().bundlePath() + "/afile.txt";

    @Before
    public void initTests() {
        NSFileManager.defaultManager().createFileAtPathContentsAttributes(
                FILE_NAME, NSData.data(), null);
    }

    @Test
    public void testFileExistsAtPath1() {
        NSFileManager  aManager = NSFileManager.defaultManager();

        boolean i = aManager.fileExistsAtPath(FILE_NAME);
        assertTrue(i) ;
    }

    @Test
    public void testFileExistsAtPath_isDirectory1() {
        NSFileManager  aManager = NSFileManager.defaultManager();
        BoolPtr aBool = PtrFactory.newBoolReference(false);
        boolean aExist = aManager.fileExistsAtPathIsDirectory(FILE_NAME, aBool);

        assertTrue(aExist);
    }

    @Test
    public void testSetDelegate1() {
        NSFileManager  aManager = NSFileManager.defaultManager();
        aManager.setDelegate(TestFileManagerDelegate.alloc().init());
        NSFileManagerDelegate anId = (NSFileManagerDelegate)aManager.delegate();
        assertTrue(anId != null);
    }

    @After
    public void wrapUp() {
        NSFileManager.defaultManager().removeItemAtPathError(FILE_NAME, null);
    }
}
