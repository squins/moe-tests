package org.moe.xosrt.binding.test.xib.controllers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.foundation.*;
import apple.uikit.*;

public class XIBTestTabBarController0ViewController extends UIViewController {

    static {
        NatJ.register();
    }

    protected XIBTestTabBarController0ViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native XIBTestTabBarController0ViewController alloc();

    @Selector("init")
    public native XIBTestTabBarController0ViewController init();

    public void viewDidLoad() {
        super.viewDidLoad();
    }

}
