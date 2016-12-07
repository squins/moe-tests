package org.moe.xosrt.binding.test.uikit;

import org.moe.xosrt.binding.test.uikit.controllers.UIMenuControllerViewController;

import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

public class UIMenuControllerTests {

    static UIMenuControllerViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = UIMenuControllerViewController.alloc().init();
                //UIKit.UIApplicationMain(0, null, null, TestAppDelegate.class.getSimpleName());
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testSharedMenuController1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIMenuControllerViewController.testSharedMenuController1;
            }
        }, 5000));
    }

    @Test
    public void testSetTargetRect_inView1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIMenuControllerViewController.testSetTargetRect_inView1;
            }
        }, 5000));
    }

    @Test
    public void testMenuVisible1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIMenuControllerViewController.testMenuVisible1;
            }
        }, 5000));
    }

    @Test
    public void testMenuItems1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIMenuControllerViewController.testMenuItems1;
            }
        }, 5000));
    }

}
