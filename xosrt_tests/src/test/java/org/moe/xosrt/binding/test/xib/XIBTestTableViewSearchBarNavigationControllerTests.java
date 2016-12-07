package org.moe.xosrt.binding.test.xib;

import org.moe.xosrt.binding.test.xib.controllers.XIBTestTableViewSearchBarNavigationControllerViewController;
import org.junit.BeforeClass;
import org.junit.Test;

import apple.foundation.NSOperationQueue;
import apple.uikit.UIApplication;
import apple.uikit.UINavigationController;
import apple.uikit.UIScreen;
import apple.uikit.UIWindow;
import apple.uikit.enums.UIBarStyle;
import apple.uikit.protocol.UIApplicationDelegate;
import tools.ConditionWait;

import static org.junit.Assert.assertTrue;

public class XIBTestTableViewSearchBarNavigationControllerTests {

    static XIBTestTableViewSearchBarNavigationControllerViewController controller = null;
    private static volatile UIWindow main;

    @BeforeClass
    public static void starter() {
        ConditionWait.prepareConditionWait();
        NSOperationQueue.mainQueue().addOperationWithBlock(new NSOperationQueue.Block_addOperationWithBlock() {
            @Override
            public void call_addOperationWithBlock() {
                main = (UIWindow)UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());
                controller = (XIBTestTableViewSearchBarNavigationControllerViewController) XIBTestTableViewSearchBarNavigationControllerViewController.alloc()
                        .initWithNibNameBundle("XIBTestTableViewSearchBarNavigationControllerViewController", null);
                UINavigationController navController = UINavigationController.alloc().initWithRootViewController(controller);
                navController.navigationBar().setBarStyle(UIBarStyle.Black);
                main.setRootViewController(navController);
                ((UIApplicationDelegate) UIApplication.sharedApplication().delegate()).setWindow(main);
                main.makeKeyAndVisible();
            }
        });
    }

    @Test
    public void testSearchBarDelegateMethodCalled() {
        assertTrue(ConditionWait.tillGlobalTime(new ConditionWait.Condition() {
            @Override
            public boolean check() {
                return XIBTestTableViewSearchBarNavigationControllerViewController.testSearchBarDelegateMethodCalled;
            }
        }));
    }

    @Test
    public void testTableViewHeightForRowAtIndexPathCalled() {
        assertTrue(ConditionWait.tillGlobalTime(new ConditionWait.Condition() {
            @Override
            public boolean check() {
                return XIBTestTableViewSearchBarNavigationControllerViewController.testTableViewHeightForRowAtIndexPathCalled;
            }
        }));
    }

    @Test
    public void testTableViewCellForRowAtIndexPathCalled() {
        assertTrue(ConditionWait.tillGlobalTime(new ConditionWait.Condition() {
            @Override
            public boolean check() {
                return XIBTestTableViewSearchBarNavigationControllerViewController.testTableViewCellForRowAtIndexPathCalled;
            }
        }));
    }

    @Test
    public void testTableNumberOfRowsInSectionCalled() {
        assertTrue(ConditionWait.tillGlobalTime(new ConditionWait.Condition() {
            @Override
            public boolean check() {
                return XIBTestTableViewSearchBarNavigationControllerViewController.testTableNumberOfRowsInSectionCalled;
            }
        }));
    }

}
