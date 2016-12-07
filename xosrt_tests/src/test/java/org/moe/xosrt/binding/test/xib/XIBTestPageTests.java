package org.moe.xosrt.binding.test.xib;

import org.moe.xosrt.binding.test.xib.controllers.XIBTestPageViewController;
import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

public class XIBTestPageTests {

    static XIBTestPageViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = (XIBTestPageViewController)XIBTestPageViewController.alloc()
                        .initWithNibNameBundle("XIBTestPageViewController", null);
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testFrame1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestPageViewController.testFrame1;
            }
        }));
    }

    @Test
    public void testNumberOfPages1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestPageViewController.testNumberOfPages1;
            }
        }));
    }

    @Test
    public void testBackgroundColor1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestPageViewController.testBackgroundColor1;
            }
        }));
    }

    @Test
    public void testAlpha1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestPageViewController.testAlpha1;
            }
        }));
    }

    @Test
    public void testValueChanged1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return XIBTestPageViewController.testValueChanged1;
            }
        }));
    }

}
