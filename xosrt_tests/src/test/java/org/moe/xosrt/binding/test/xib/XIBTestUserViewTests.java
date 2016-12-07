package org.moe.xosrt.binding.test.xib;

import org.moe.xosrt.binding.test.xib.controllers.XIBTestUserViewViewController;
import org.moe.xosrt.binding.test.xib.testhelpers.UserView;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import apple.foundation.NSOperationQueue;
import apple.uikit.UIApplication;
import apple.uikit.UIScreen;
import apple.uikit.UIWindow;
import apple.uikit.protocol.UIApplicationDelegate;
import tools.ConditionWait;

import static org.junit.Assert.assertTrue;

@Ignore //TODO: fails on simulator, cannot load UserView class with xib
public class XIBTestUserViewTests {

    static XIBTestUserViewViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new NSOperationQueue.Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = (XIBTestUserViewViewController) XIBTestUserViewViewController.alloc()
                        .initWithNibNameBundle("XIBTestUserViewViewController", null);
                main.setRootViewController(controller);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testProperty1() {
        assertTrue(ConditionWait.tillGlobalTime(new ConditionWait.Condition() {
            @Override
            public boolean check() {
                return UserView.testUserView;
            }
        }));
    }
}
