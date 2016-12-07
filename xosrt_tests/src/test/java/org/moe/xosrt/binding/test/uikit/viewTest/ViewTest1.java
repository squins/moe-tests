package org.moe.xosrt.binding.test.uikit.viewTest;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSMutableArray;
import apple.foundation.NSString;
import apple.uikit.UIView;
import apple.uikit.UIWindow;


public class ViewTest1 extends UIView {

    NSMutableArray arrayOfMethodNames = null;

    static {
        NatJ.register();
    }

    protected ViewTest1(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native ViewTest1 alloc();

    @Selector("init")
    public native ViewTest1 init();

    @Override
    @Selector("initWithFrame:")
    public UIView initWithFrame(CGRect frame) {
        super.initWithFrame(frame);
        arrayOfMethodNames = (NSMutableArray)NSMutableArray.array();
        return this;
    }

    @Override
    @Selector("didAddSubview:")
    public void didAddSubview(UIView subview) {
        arrayOfMethodNames.addObject(NSString.stringWithString("didAddSubview"));
    }

    @Override
    @Selector("didMoveToSuperview")
    public void didMoveToSuperview() {
        arrayOfMethodNames.addObject(NSString.stringWithString("didMoveToSuperview"));
    }

    @Override
    @Selector("didMoveToWindow")
    public void didMoveToWindow() {
        arrayOfMethodNames.addObject(NSString.stringWithString("didMoveToWindow"));
    }

    @Override
    @Selector("willMoveToSuperview:")
    public void willMoveToSuperview(UIView newSuperview) {
        arrayOfMethodNames.addObject(NSString.stringWithString("willMoveToSuperview"));
    }

    @Override
    @Selector("willMoveToWindow:")
    public void willMoveToWindow(UIWindow newSuperview) {
        arrayOfMethodNames.addObject(NSString.stringWithString("willMoveToWindow"));
    }

    @Override
    @Selector("willRemoveSubview:")
    public void willRemoveSubview(UIView subview) {
        arrayOfMethodNames.addObject(NSString.stringWithString("willRemoveSubview"));
    }

    @Override
    @Selector("drawRect:")
    public void drawRect(CGRect rect) {
        if (arrayOfMethodNames != null) {
            arrayOfMethodNames.addObject(NSString.stringWithString("drawRect"));
        }
    }
}
