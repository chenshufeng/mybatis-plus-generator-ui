package com.example.entity;
import java.math.BigDecimal;
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
 * 用户信息表
 * </p>
 *
 * @author huomai
 * @since 2021-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("huomai_user")
@ApiModel(value="User对象", description="用户信息表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户Id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty(value = "用户火脉号Id")
    private Long uuid;

    @ApiModelProperty(value = "微信同一用户同一应用唯一标识")
    private String openid;

    @ApiModelProperty(value = "微信同一用户不同应用唯一标识")
    private String unionid;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @ApiModelProperty(value = "用户性别 (0未知 1男 2女)")
    private String sex;

    @ApiModelProperty(value = "用户生日")
    private Date birthday;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "星座")
    private String constellation;

    @ApiModelProperty(value = "省")
    private Long province;

    @ApiModelProperty(value = "市")
    private Long city;

    @ApiModelProperty(value = "区")
    private Long area;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "个人介绍")
    private String userDesc;

    @ApiModelProperty(value = "邀请码")
    private String inviteCode;

    @ApiModelProperty(value = "总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "可提现金额")
    private BigDecimal cashAmount;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "账号状态 (0禁用 1启用)")
    private String status;

    @ApiModelProperty(value = "可提现金额")
    private BigDecimal money;

    @ApiModelProperty(value = "累计收益	")
    private BigDecimal income;

}
