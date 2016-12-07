//package org.moe.xosrt.binding.test.uikit.testhelpers;
//
//import org.moe.natj.general.NatJ;
//import org.moe.natj.general.Pointer;
//import org.moe.natj.objc.ann.Selector;
//
//import apple.coregraphics.c.CoreGraphics;
//import apple.foundation.NSMutableArray;
//import apple.uikit.UIColor;
//import apple.uikit.UIView;
//import apple.uikit.UIViewController;
//
//public class UIPopoverNewViewController extends UIViewController {
//
//    static {
//        NatJ.register();
//    }
//
//    protected UIPopoverNewViewController(Pointer peer) {
//        super(peer);
//    }
//
//    @Selector("alloc")
//    public static native UIPopoverNewViewController alloc();
//
//    @Selector("init")
//    public native UIPopoverNewViewController init();
//
//    public NSMutableArray colors;
//    public UIPopoverDetailViewController detailViewController;
//
//    @Selector("loadView")
//    @Override
//    public void loadView() {
//        UIView newView = UIView.alloc().initWithFrame(CoreGraphics.CGRectMake(0, 20, 319, 200));
//        newView.setBackgroundColor(UIColor.blueColor());
//        setView(newView);
//    }
//}
