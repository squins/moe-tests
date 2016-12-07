package org.moe.xosrt.binding.test.xib.controllers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.foundation.*;
import apple.uikit.*;
import apple.uikit.enums.UIInterfaceOrientation;
import apple.uikit.enums.UIUserInterfaceIdiom;

public class XIBTestSingleViewAppViewController extends UIViewController {

    static {
        NatJ.register();
    }

    protected XIBTestSingleViewAppViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native XIBTestSingleViewAppViewController alloc();

    @Selector("init")
    public native XIBTestSingleViewAppViewController init();


    public static volatile boolean testSingleViewApplication441Test1 = false;

    public void viewDidLoad() {
        super.viewDidLoad();
        // Do any additional setup after loading the view, typically from a nib.
        testSingleViewApplication441Test1 = true;
    }

    public void viewDidUnload() {
        super.viewDidUnload();
    }

    @Selector("shouldAutorotateToInterfaceOrientation:")
    @Override
    public boolean shouldAutorotateToInterfaceOrientation(long interfaceOrientation) {
        if (UIDevice.currentDevice().userInterfaceIdiom() == UIUserInterfaceIdiom.Phone) {
            return (interfaceOrientation != UIInterfaceOrientation.PortraitUpsideDown);
        } else {
            return true;
        }
    }

}
