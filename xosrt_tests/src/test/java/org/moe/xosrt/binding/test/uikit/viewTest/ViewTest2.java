package org.moe.xosrt.binding.test.uikit.viewTest;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSMutableArray;
import apple.foundation.NSString;
import apple.uikit.UIView;


public class ViewTest2 extends UIView {

    NSMutableArray arrayOfMethodNames = null;

    static {
        NatJ.register();
    }

    protected ViewTest2(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native ViewTest2 alloc();

    @Selector("init")
    public native ViewTest2 init();

    @Override
    @Selector("initWithFrame:")
    public UIView initWithFrame(CGRect frame) {
        super.initWithFrame(frame);
        arrayOfMethodNames = (NSMutableArray)NSMutableArray.array();
        return this;
    }

    @Override
    @Selector("drawRect:")
    public void drawRect(CGRect rect) {
        if (arrayOfMethodNames != null) {
            arrayOfMethodNames.addObject(NSString.stringWithString("drawRect"));
        }
    }

}
