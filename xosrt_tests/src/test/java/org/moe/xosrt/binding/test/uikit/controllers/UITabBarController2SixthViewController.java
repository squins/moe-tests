package org.moe.xosrt.binding.test.uikit.controllers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.Selector;

import org.moe.xosrt.binding.test.uikit.UITabBarController2Tests;

import apple.coregraphics.c.CoreGraphics;
import apple.uikit.UIButton;
import apple.uikit.UIColor;
import apple.uikit.UIScreen;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import apple.uikit.enums.UIButtonType;
import apple.uikit.enums.UIControlEvents;
import apple.uikit.enums.UIControlState;

public class UITabBarController2SixthViewController extends UIViewController {


    static {
        NatJ.register();
    }

    protected UITabBarController2SixthViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native UITabBarController2SixthViewController alloc();

    @Selector("init")
    public native UITabBarController2SixthViewController init();

    private boolean runTest = true;

    public static volatile boolean testSetViewControllers_animated1 = false;

    @Selector("loadView")
    @Override
    public void loadView() {
        setView(UIView.alloc().initWithFrame(UIScreen.mainScreen().bounds()));
        view().setBackgroundColor(UIColor.orangeColor());
    }
}
