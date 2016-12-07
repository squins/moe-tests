package org.moe.xosrt.binding.test.uikit.testhelpers;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.foundation.NSIndexPath;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.UITableViewController;
import apple.uikit.enums.UITableViewCellStyle;
import apple.uikit.protocol.UITableViewDataSource;

public class MyTableViewController extends UITableViewController implements UITableViewDataSource {

    static {
        NatJ.register();
    }

    protected MyTableViewController(Pointer peer) {
        super(peer);
    }

    @Selector("alloc")
    public static native MyTableViewController alloc();

    @Selector("init")
    public native MyTableViewController init();

    @Selector("numberOfSectionsInTableView")
    @Override
    public long numberOfSectionsInTableView(UITableView tableView) {
        return 1;
    }

    @Selector("tableView:titleForHeaderInSection:")
    @Override
    public String tableViewTitleForHeaderInSection(UITableView tableView , long section) {
        return "Colors";
    }

    @Selector("tableView:cellForRowAtIndexPath:")
    @Override
    public UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        UITableViewCell aCell = UITableViewCell.alloc().initWithStyleReuseIdentifier(UITableViewCellStyle.Subtitle, "cellIdentifier");
        aCell.textLabel().setText("title Label");
        aCell.detailTextLabel().setText("subtitle Label");
        return aCell;
    }
}
