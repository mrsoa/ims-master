package com.yianju.ims.entity;

/**
 * 公共的返回码
 *    返回码code：
 *      成功：10000
 *      失败：10001
 *      未登录：10002
 *      未授权：10003
 *      抛出异常：99999
 */
public enum ResultCode {

    SUCCESS(true,10000,"操作成功！"),
    //---系统错误返回码-----
    FAIL(false,10001,"操作失败"),
    ILLEGAL_PROCESS_UNIT(false,10002,"非法处理单元"),


    UNAUTHENTICATED(false,10002,"您还未登录"),
    UNAUTHORISE(false,10003,"权限不足"),
    NOT_FOUND(false,10004,"接口信息不存在"),
    REQUIRED_FEILD(false,10005,"必填项缺失"),
    NO_TOKEN(false,10006,"token信息不存在"),
    INVALID_TOKEN(false,10007,"无效的token信息"),
    NULL(false,88888,"对象信息不存在"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！"),



    //---用户操作返回码  2xxxx----
    MOBILEORPASSWORDERROR(false,20001,"用户名或密码错误"),
    VALIFIELD_NULL(false,20002,"验证字段为NULL"),
    VALIDATA_BLANK(false,20003,"验证字段为空"),
    VALIBEAN_NULL(false,20004,"验证对象为空"),

    ORDER_DUPLICATE(false,20005,"单据重复接入"),


    // 对接操作错误返回
    ORDER_ITEM_LIST_NULL(false,80001,"订单商品数据不存在"),

    ;


    //---企业操作返回码  3xxxx----
    //---权限操作返回码----
    //---其他操作返回码----

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
