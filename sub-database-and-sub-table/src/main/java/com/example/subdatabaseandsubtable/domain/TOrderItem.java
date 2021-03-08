package com.example.subdatabaseandsubtable.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TOrderItem {

    @TableId
    private Long orderItemId;

    private Long orderId;

    private String item;

    private Long userId;
}