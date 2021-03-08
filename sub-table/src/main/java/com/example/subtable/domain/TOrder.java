package com.example.subtable.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class TOrder implements Serializable {

    @TableId
    private Long orderId;

    private Long userId;

    private String name;

    private static final long serialVersionUID = 1L;

}