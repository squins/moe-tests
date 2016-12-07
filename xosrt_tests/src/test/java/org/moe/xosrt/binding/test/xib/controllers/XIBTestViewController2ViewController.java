package org.moe.xosrt.binding.test.xib.controllers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.foundation.*;
import apple.uikit.*;

public class XIBTestViewController2ViewController extends UIViewController {

    static {
        NatJ.register();
    }

    protected XIBTestViewController2ViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native XIBTestViewController2ViewController alloc();

    @Selector("init")
    public native XIBTestViewController2ViewController init();


    public static volatile boolean testTitle1 = false;

    public void viewDidLoad() {
        super.viewDidLoad();

        testXIBFilesProperties();
    }

    public void testXIBFilesProperties() {
        testTitle1 =  (title().equals("ViewController title"));
    }

}
