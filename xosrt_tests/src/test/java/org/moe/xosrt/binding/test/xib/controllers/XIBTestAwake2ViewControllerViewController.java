package org.moe.xosrt.binding.test.xib.controllers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import org.moe.xosrt.binding.test.xib.testhelpers.View1;

import apple.NSObject;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.foundation.*;
import apple.uikit.*;

public class XIBTestAwake2ViewControllerViewController extends UIViewController {

    static {
        NatJ.register();
    }

    protected XIBTestAwake2ViewControllerViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native XIBTestAwake2ViewControllerViewController alloc();

    @Selector("init")
    public native XIBTestAwake2ViewControllerViewController init();

    public static View1 view1;

    @Selector("setValue:forUndefinedKey:")
    @Override
    public void setValueForUndefinedKey(Object value, String key) {
        switch(key) {
            case "view1":
                view1 = (View1)value;
                break;
            default:
                super.setValueForUndefinedKey(value, key);
        }
    }

    @Selector("valueForKey:")
    @Override
    public Object valueForKey(String key) {
        switch(key) {
            case "view1":
                return view1;
            default:
                return super.valueForKey(key);
        }
    }


    public static volatile boolean testAwakeFromNib1 = false;

    @Selector("awakeFromNib")
    @Override
    public void awakeFromNib() {
        testAwakeFromNib1 = (view1 != null);
    }

    public void viewDidLoad() {
        super.viewDidLoad();
    }

    public void viewDidUnload() {
        super.viewDidUnload();
        // Release any retained subviews of the main view. // e.g. myOutlet = nil;
    }

    public void viewWillAppear(boolean animated) {
        super.viewWillAppear(animated);
    }

    @Selector("viewDidAppear:")
    @Override
    public void viewDidAppear(boolean animated) {
        super.viewDidAppear(animated);
    }

    public void viewWillDisappear(boolean animated) {
        super.viewWillDisappear(animated);
    }

    public void viewDidDisappear(boolean animated) {
        super.viewDidDisappear(animated);
    }

}
