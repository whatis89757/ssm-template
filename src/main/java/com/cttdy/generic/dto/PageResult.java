package com.cttdy.generic.dto;

import java.util.List;

public class PageResult<T> {
    private int totalCount;
    private List<T> rows;
    private int maxpage;
    private int page;
    private int limit;
    private int prevpage;
    private int nextpage;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getMaxpage() {
        return maxpage;
    }

    public void setMaxpage(int maxpage) {
        this.maxpage = maxpage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPrevpage() {
        return prevpage;
    }

    public void setPrevpage(int prevpage) {
        this.prevpage = prevpage;
    }

    public int getNextpage() {
        return nextpage;
    }

    public void setNextpage(int nextpage) {
        this.nextpage = nextpage;
    }
}
