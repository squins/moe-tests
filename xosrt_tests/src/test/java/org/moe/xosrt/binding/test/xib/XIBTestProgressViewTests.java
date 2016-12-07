package org.moe.xosrt.binding.test.xib;

import org.moe.xosrt.binding.test.xib.controllers.XIBTestProgressViewViewController;
import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

public class XIBTestProgressViewTests {

    static XIBTestProgressViewViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = (XIBTestProgressViewViewController)XIBTestProgressViewViewController.alloc()
                        .initWithNibNameBundle("XIBTestProgressViewViewController", null);
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Ignore //TODO: fails in xcode as well
    @Test
    public void testFrame1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestProgressViewViewController.testFrame1;
            }
        }));
    }

    @Test
    public void testProgress1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestProgressViewViewController.testProgress1;
            }
        }));
    }

    @Ignore //TODO: fails in xcode as well
    @Test
    public void testFrame2() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestProgressViewViewController.testFrame2;
            }
        }));
    }

    @Test
    public void testProgress2() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestProgressViewViewController.testProgress2;
            }
        }));
    }

    @Test
    public void testProgress3() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestProgressViewViewController.testProgress3;
            }
        }));
    }

    @Test
    public void testAlpha1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestProgressViewViewController.testAlpha1;
            }
        }));
    }

    @Test
    public void testAlpha2() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestProgressViewViewController.testAlpha2;
            }
        }));
    }

}
