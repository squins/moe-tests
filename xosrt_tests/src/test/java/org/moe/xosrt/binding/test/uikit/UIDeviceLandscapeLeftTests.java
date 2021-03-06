package org.moe.xosrt.binding.test.uikit;

import org.moe.xosrt.binding.test.uikit.controllers.UIDeviceOrientationTestViewController;

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

public class UIDeviceLandscapeLeftTests {

    static UIDeviceOrientationTestViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = UIDeviceOrientationTestViewController.alloc().init();
                //UIKit.UIApplicationMain(0, null, null, TestAppDelegate.class.getSimpleName());
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Ignore
    @Test
    public void testOrientation_landscape_left1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIDeviceOrientationTestViewController.testOrientation_landscape_left1;
            }
        }));
    }

    //TODO: fails on simulator!
    @Ignore
    @Test
    public void testOrientation_without_notification1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIDeviceOrientationTestViewController.testOrientation_without_notification1;
            }
        }));
    }

    @Ignore
    @Test
    public void testOrientation_with_begin_notification1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIDeviceOrientationTestViewController.testOrientation_with_begin_notification1;
            }
        }));
    }

    @Test
    public void testGeneratesDeviceOrientationNotifications1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIDeviceOrientationTestViewController.testGeneratesDeviceOrientationNotifications1;
            }
        }));
    }

    @Ignore
    @Test
    public void testOrientation_with_end_notification1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UIDeviceOrientationTestViewController.testOrientation_with_end_notification1;
            }
        }));
    }

}
