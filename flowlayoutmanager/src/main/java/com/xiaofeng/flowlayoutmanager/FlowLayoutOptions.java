package com.xiaofeng.flowlayoutmanager;

/**
 * Created by xhan on 4/11/16.
 */
public class FlowLayoutOptions {
	public static final int ITEM_PER_LINE_NO_LIMIT = 0;
    public Alignment alignment = Alignment.CENTER;
    public int itemsPerLine = ITEM_PER_LINE_NO_LIMIT;
	/**
	 * max line to show ,
	 *
	 * if maxLineCount<=0 ,show all lines
	 */
    public int maxLineCount=0;

	public static FlowLayoutOptions clone(FlowLayoutOptions layoutOptions) {
		FlowLayoutOptions result = new FlowLayoutOptions();
		result.alignment = layoutOptions.alignment;
		result.itemsPerLine = layoutOptions.itemsPerLine;
		result.maxLineCount = layoutOptions.maxLineCount;
		return result;
	}
}
