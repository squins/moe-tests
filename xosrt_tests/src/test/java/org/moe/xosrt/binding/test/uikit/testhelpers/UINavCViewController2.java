package org.moe.xosrt.binding.test.uikit.testhelpers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.coregraphics.c.CoreGraphics;
import apple.foundation.NSMutableArray;
import apple.uikit.UIColor;
import apple.uikit.UIView;
import apple.uikit.UIViewController;

public class UINavCViewController2 extends UIViewController {
    static {
        NatJ.register();
    }

    protected UINavCViewController2(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native UINavCViewController2 alloc();

    @Selector("init")
    public native UINavCViewController2 init();

    @Selector("loadView")
    @Override
    public void loadView() {
        setView(UIView.alloc().initWithFrame(CoreGraphics.CGRectMake(0, 0, 320, 480)));
        view().setBackgroundColor(UIColor.whiteColor());
    }
}
