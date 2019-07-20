package com.itheima.demo.core.vo;

import java.util.Date;

/**
 * @Author: Miao
 * @Date: 2019/3/17 23:31
 * @Desc:
 */
public class BaseVO {

    private Date creationDate;
    private Date lastUpdateDate;
    private Long creationBy;
    private Date lastUpdateBy;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getCreationBy() {
        return creationBy;
    }

    public void setCreationBy(Long creationBy) {
        this.creationBy = creationBy;
    }

    public Date getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Date lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
}
