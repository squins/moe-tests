package org.moe.xosrt.binding.test.uikit.testhelpers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.coregraphics.c.CoreGraphics;
import apple.uikit.UIColor;
import apple.uikit.UIView;
import apple.uikit.UIViewController;

public class UISplitDetailViewController extends UIViewController {


    static {
        NatJ.register();
    }

    protected UISplitDetailViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native UISplitDetailViewController alloc();

    @Selector("init")
    public native UISplitDetailViewController init();

    @Selector("loadView")
    @Override
    public void loadView() {
        UIView newView = UIView.alloc().initWithFrame(CoreGraphics.CGRectMake(0, 20, 319, 480));
        newView.setBackgroundColor(UIColor.blueColor());
        setView(newView);
    }
}
