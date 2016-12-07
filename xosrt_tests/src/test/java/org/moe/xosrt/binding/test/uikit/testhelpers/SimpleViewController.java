package org.moe.xosrt.binding.test.uikit.testhelpers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.coregraphics.c.CoreGraphics;
import apple.uikit.UIColor;
import apple.uikit.UIScreen;
import apple.uikit.UISwitch;
import apple.uikit.UIView;
import apple.uikit.UIViewController;

public class SimpleViewController extends UIViewController {

    static {
        NatJ.register();
    }

    protected SimpleViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native SimpleViewController alloc();

    @Selector("init")
    public native SimpleViewController init();

    @Selector("loadView")
    @Override
    public void loadView() {
        setView(UIView.alloc().initWithFrame(UIScreen.mainScreen().bounds()));
    }
}
