package org.moe.xosrt.binding.test.uikit;

import org.moe.xosrt.binding.test.uikit.controllers.UISliderViewController;

import apple.foundation.*;
import apple.foundation.NSOperationQueue.Block_addOperationWithBlock;
import apple.uikit.*;
import apple.uikit.protocol.UIApplicationDelegate;

import org.junit.BeforeClass;
import org.junit.Test;

import tools.ConditionWait;
import tools.ConditionWait.Condition;

import static org.junit.Assert.*;

public class UISliderTests {

    static UISliderViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = UISliderViewController.alloc().init();
                //UIKit.UIApplicationMain(0, null, null, TestAppDelegate.class.getSimpleName());
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testSliderValueChanged1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISliderViewController.testSliderValueChanged1;
            }
        }));
    }

    @Test
    public void testMinimumValue1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISliderViewController.testMinimumValue1;
            }
        }));
    }

    @Test
    public void testMaximumValue1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISliderViewController.testMaximumValue1;
            }
        }));
    }

    @Test
    public void testValue1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISliderViewController.testValue1;
            }
        }));
    }

    @Test
    public void testSetValue1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISliderViewController.testSetValue1;
            }
        }));
    }

    @Test
    public void testSetContinuous1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISliderViewController.testSetContinuous1;
            }
        }));
    }

    @Test
    public void testSetUserInteractionEnabled1() {
        assertTrue(ConditionWait.tillGlobalTime(new Condition() {
            @Override
            public boolean check() {
                return UISliderViewController.testSetUserInteractionEnabled1;
            }
        }));
    }

}
