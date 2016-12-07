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

public class XIBTestDrawRectViewController extends UIViewController {

    static {
        NatJ.register();
    }

    protected XIBTestDrawRectViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native XIBTestDrawRectViewController alloc();

    @Selector("init")
    public native XIBTestDrawRectViewController init();

    public void viewDidLoad() {
    }

    @Selector("shouldAutorotateToInterfaceOrientation:")
    @Override
    public boolean shouldAutorotateToInterfaceOrientation(long interfaceOrientation) {
        // Return YES for supported orientations
        return (interfaceOrientation == UIInterfaceOrientation.Portrait);
    }

    public void didReceiveMemoryWarning() {
    }

    public void dealloc() {
        super.dealloc();
    }

}
