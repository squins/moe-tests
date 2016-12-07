package org.moe.xosrt.binding.test.uikit;

import org.moe.xosrt.binding.test.uikit.controllers.UITabBarViewController;

import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

//@Ignore // May cause crush
public class UITabBarTests {

    static UITabBarViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = UITabBarViewController.alloc().init();
                //UIKit.UIApplicationMain(0, null, null, TestAppDelegate.class.getSimpleName());
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testDelegate1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UITabBarViewController.testDelegate1;
            }
        }));
    }

    @Test
    public void testItems1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UITabBarViewController.testItems1;
            }
        }));
    }

    @Test
    public void testSelectedItem1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UITabBarViewController.testSelectedItem1;
            }
        }));
    }

    @Test
    public void testSetUserInteractionEnabled1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UITabBarViewController.testSetUserInteractionEnabled1;
            }
        }));
    }

}
