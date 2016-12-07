package org.moe.xosrt.binding.test.uikit;

import org.moe.xosrt.binding.test.uikit.controllers.UISwitchViewController;

import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

public class UISwitchTests {

    static UISwitchViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = UISwitchViewController.alloc().init();
                //UIKit.UIApplicationMain(0, null, null, TestAppDelegate.class.getSimpleName());
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testInitWithFrame1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISwitchViewController.testInitWithFrame1;
            }
        }));
    }

    @Test
    public void testSetOn1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISwitchViewController.testSetOn1;
            }
        }));
    }

    @Test
    public void testSetOn2() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISwitchViewController.testSetOn2;
            }
        }));
    }

    @Test
    public void testSetOn_animated1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISwitchViewController.testSetOn_animated1;
            }
        }));
    }

    @Test
    public void testSetUserInteractionEnabled1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISwitchViewController.testSetUserInteractionEnabled1;
            }
        }));
    }

}
