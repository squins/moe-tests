package org.moe.xosrt.binding.test.xib;

import org.moe.xosrt.binding.test.xib.controllers.XIBTestSingleViewAppViewController;
import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

public class XIBTestSingleViewAppTests {

    static XIBTestSingleViewAppViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = (XIBTestSingleViewAppViewController)XIBTestSingleViewAppViewController.alloc()
                        .initWithNibNameBundle("XIBTestSingleViewAppViewController", null);
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testSingleViewApplication441Test1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestSingleViewAppViewController.testSingleViewApplication441Test1;
            }
        }));
    }

}
