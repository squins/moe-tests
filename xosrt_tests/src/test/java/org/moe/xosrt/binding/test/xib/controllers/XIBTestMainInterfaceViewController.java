package org.moe.xosrt.binding.test.xib.controllers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.foundation.*;
import apple.uikit.*;

public class XIBTestMainInterfaceViewController extends UIViewController {

    static {
        NatJ.register();
    }

    protected XIBTestMainInterfaceViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native XIBTestMainInterfaceViewController alloc();

    @Selector("init")
    public native XIBTestMainInterfaceViewController init();

    public long viewDidAppearCount;
    @Selector("loadView")
    @Override
    public void loadView() {
        setView(UIView.alloc().initWithFrame(UIScreen.mainScreen().bounds()));
        view().setBackgroundColor(UIColor.blueColor());
        viewDidAppearCount = 0;
    }

    @Selector("viewDidAppear:")
    @Override
    public void viewDidAppear(boolean animated) {
viewDidAppearCount++;
    }

}
