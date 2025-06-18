package com.spj.botdle.bean;

import java.util.List;

public class SoiListResponse extends BaseResponse{

    private List<SoiItem> items;

    public List<SoiItem> getItems() {
        return items;
    }

    public void setItems(List<SoiItem> items) {
        this.items = items;
    }
}

