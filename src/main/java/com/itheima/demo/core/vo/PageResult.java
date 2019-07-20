package com.itheima.demo.core.vo;

import java.util.List;

/**
 * @Author: Miao
 * @Date: 2019/3/27 21:24
 * @Desc:
 */
public class PageResult<T> {

    private PageVO pageVO;
    private List<T> record;

    public PageVO getPageVO() {
        return pageVO;
    }

    public void setPageVO(PageVO pageVO) {
        this.pageVO = pageVO;
    }

    public List<T> getRecord() {
        return record;
    }

    public void setRecord(List<T> record) {
        this.record = record;
    }
}
