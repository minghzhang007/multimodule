package com.lewis.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author zhangminghua
 */
@Data
@NoArgsConstructor
public class PayCost {

    private Long id;

    /**
     * 支付渠道Id
     */
    private String payId;

    /**
     * 支付渠道名称
     */
    private String payName;

    /**
     * 当前渠道成本
     */
    private BigDecimal currentCost;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long updateTime;
}
