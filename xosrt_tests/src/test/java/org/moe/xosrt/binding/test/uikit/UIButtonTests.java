package org.moe.xosrt.binding.test.uikit;

import org.moe.xosrt.binding.test.uikit.controllers.UIButtonViewController;

import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

public class UIButtonTests {

    static UIButtonViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = UIButtonViewController.alloc().init();
                //UIKit.UIApplicationMain(0, null, null, TestAppDelegate.class.getSimpleName());
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testButtonWithType1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIButtonViewController.testButtonWithType1;
            }
        }));
    }

    @Test
    public void testSetTitle_forState1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIButtonViewController.testSetTitle_forState1;
            }
        }));
    }

    @Test
    public void testTitleLabel1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIButtonViewController.testTitleLabel1;
            }
        }));
    }

    @Test
    public void testSetTitleColor_forState1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIButtonViewController.testSetTitleColor_forState1;
            }
        }));
    }

    @Test
    public void testFont1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIButtonViewController.testFont1;
            }
        }));
    }

    @Test
    public void testSetImage_forState1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIButtonViewController.testSetImage_forState1;
            }
        }));
    }

}
