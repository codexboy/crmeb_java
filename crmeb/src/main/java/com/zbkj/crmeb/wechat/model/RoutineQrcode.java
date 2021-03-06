package com.zbkj.crmeb.wechat.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 小程序二维码管理表
 * </p>
 *
 * @author Mr.Zhang
 * @since 2020-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_routine_qrcode")
@ApiModel(value="RoutineQrcode对象", description="小程序二维码管理表")
public class RoutineQrcode implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "微信二维码ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "二维码类型 spread(用户推广) product_spread(商品推广)")
    private String thirdType;

    @ApiModelProperty(value = "用户id")
    private Integer thirdId;

    @ApiModelProperty(value = "状态 0不可用 1可用")
    private Boolean status;

    @ApiModelProperty(value = "添加时间")
    private String addTime;

    @ApiModelProperty(value = "小程序页面路径带参数")
    private String page;

    @ApiModelProperty(value = "小程序二维码路径")
    private String qrcodeUrl;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
