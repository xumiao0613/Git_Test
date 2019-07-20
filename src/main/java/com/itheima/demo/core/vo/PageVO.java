package com.itheima.demo.core.vo;

/**
 * @Author: Miao
 * @Date: 2019/3/27 21:51
 * @Desc:
 */
public class PageVO {

    private int curPage;
    private int pageSize;
    private int totalRows;
    private int totalPage;
    private int startIndex;
    private int endIndex;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPage() {
        totalPage = (totalRows + pageSize -1) / pageSize;
        return totalPage;
    }

    public int getStartIndex() {
        return pageSize*(curPage-1);
    }

    public int getEndIndex() {
        return pageSize*curPage;
    }
}
