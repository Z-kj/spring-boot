package com.example.demo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dadada
 * @since 2019-12-23
 */
@TableName("t_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 微信openid
     */
    @TableField("wx_openid")
    private String wxOpenid;
    /**
     * 微信快捷登录的 openid  （app）
     */
    @TableField("app_openid")
    private String appOpenid;
    /**
     * 支付宝小程序的  user_id
     */
    @TableField("ali_user_id")
    private String aliUserId;
    /**
     * 所属公司id
     */
    @TableField("company_id")
    private Long companyId;
    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 用户唯一编号 (一般用户用手机号)
     */
    @TableField("user_no")
    private String userNo;
    /**
     * 区分用户 1普通用户   2企业账户  
     */
    @TableField("user_type")
    private Integer userType;
    /**
     * 主账户id
     */
    @TableField("own_master_user_id")
    private Long ownMasterUserId;
    /**
     * 是否是主账户标识 1 主账户  0 子账户
     */
    @TableField("master_flag")
    private Integer masterFlag;
    /**
     * 0启用  1 禁用   2刪除
     */
    @TableField("user_state")
    private Integer userState;
    /**
     * 昵称（用于保存微信名）
     */
    @TableField("user_nickname")
    private String userNickname;
    /**
     * 性别 1 男 0 女 
     */
    @TableField("user_sex")
    private Integer userSex;
    /**
     * 电话
     */
    @TableField("user_phone")
    private String userPhone;
    /**
     * 生日
     */
    @TableField("user_birthday")
    private Date userBirthday;
    /**
     * 头像url
     */
    @TableField("user_avatar")
    private String userAvatar;
    /**
     * 所属城市代码
     */
    @TableField("user_city_code")
    private String userCityCode;
    /**
     * 所属城市名称
     */
    @TableField("user_city_name")
    private String userCityName;
    /**
     * 地址
     */
    @TableField("user_address")
    private String userAddress;
    /**
     * 0 普通用户  vip1  会员
     */
    @TableField("user_vip_level")
    private String userVipLevel;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 一号多冲标识 默认1   -1表示不限制
     */
    @TableField("multi_charge_num")
    private Integer multiChargeNum;
    /**
     * 注册渠道 wx 微信  sys 后台 app  
     */
    @TableField("reg_channel")
    private String regChannel;
    /**
     * 注册时间
     */
    @TableField("reg_time")
    private Date regTime;
    /**
     * 注册来源  red_packet_share 红包分享  invite_new 新人邀请
     */
    @TableField("reg_source")
    private String regSource;
    /**
     * 1 绑定 0 未绑定
     */
    @TableField("wx_bind_flag")
    private Integer wxBindFlag;
    /**
     * 邀请码
     */
    @TableField("invite_code")
    private String inviteCode;
    /**
     * app 类型 ios android (用于推送区分)
     */
    @TableField("login_type")
    private String loginType;
    /**
     * 是否是企业登录 0不是 1是
     */
    @TableField("company_login_flag")
    private Integer companyLoginFlag;
    /**
     * 微信同一用户标识
     */
    @TableField("union_id")
    private String unionId;
    /**
     * 用户类型：0非商用 1商用（网约车） 2商用（物流车） 3商用（公交车）
     */
    @TableField("user_account_type")
    private String userAccountType;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
    @TableField("operator_type")
    private Integer operatorType;
    /**
     * 操作人
     */
    @TableField("operator_id")
    private Long operatorId;
    @TableField("operator_name")
    private String operatorName;
    @TableField(exist = false)
    private String plateNo;

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getUserAccountType() {
        return userAccountType;
    }

    public void setUserAccountType(String userAccountType) {
        this.userAccountType = userAccountType;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    public String getAppOpenid() {
        return appOpenid;
    }

    public void setAppOpenid(String appOpenid) {
        this.appOpenid = appOpenid;
    }

    public String getAliUserId() {
        return aliUserId;
    }

    public void setAliUserId(String aliUserId) {
        this.aliUserId = aliUserId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Long getOwnMasterUserId() {
        return ownMasterUserId;
    }

    public void setOwnMasterUserId(Long ownMasterUserId) {
        this.ownMasterUserId = ownMasterUserId;
    }

    public Integer getMasterFlag() {
        return masterFlag;
    }

    public void setMasterFlag(Integer masterFlag) {
        this.masterFlag = masterFlag;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserCityCode() {
        return userCityCode;
    }

    public void setUserCityCode(String userCityCode) {
        this.userCityCode = userCityCode;
    }

    public String getUserCityName() {
        return userCityName;
    }

    public void setUserCityName(String userCityName) {
        this.userCityName = userCityName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserVipLevel() {
        return userVipLevel;
    }

    public void setUserVipLevel(String userVipLevel) {
        this.userVipLevel = userVipLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMultiChargeNum() {
        return multiChargeNum;
    }

    public void setMultiChargeNum(Integer multiChargeNum) {
        this.multiChargeNum = multiChargeNum;
    }

    public String getRegChannel() {
        return regChannel;
    }

    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegSource() {
        return regSource;
    }

    public void setRegSource(String regSource) {
        this.regSource = regSource;
    }

    public Integer getWxBindFlag() {
        return wxBindFlag;
    }

    public void setWxBindFlag(Integer wxBindFlag) {
        this.wxBindFlag = wxBindFlag;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Integer getCompanyLoginFlag() {
        return companyLoginFlag;
    }

    public void setCompanyLoginFlag(Integer companyLoginFlag) {
        this.companyLoginFlag = companyLoginFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", wxOpenid=" + wxOpenid +
        ", appOpenid=" + appOpenid +
        ", aliUserId=" + aliUserId +
        ", companyId=" + companyId +
        ", userName=" + userName +
        ", userNo=" + userNo +
        ", userType=" + userType +
        ", masterFlag=" + masterFlag +
        ", userState=" + userState +
        ", userNickname=" + userNickname +
        ", userSex=" + userSex +
        ", userPhone=" + userPhone +
        ", userBirthday=" + userBirthday +
        ", userAvatar=" + userAvatar +
        ", userCityCode=" + userCityCode +
        ", userCityName=" + userCityName +
        ", userAddress=" + userAddress +
        ", userVipLevel=" + userVipLevel +
        ", password=" + password +
        ", multiChargeNum=" + multiChargeNum +
        ", regChannel=" + regChannel +
        ", regTime=" + regTime +
        ", regSource=" + regSource +
        ", wxBindFlag=" + wxBindFlag +
        ", inviteCode=" + inviteCode +
        ", companyLoginFlag=" + companyLoginFlag +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", operatorType=" + operatorType +
        ", operatorId=" + operatorId +
        ", operatorName=" + operatorName +
        "}";
    }
}
