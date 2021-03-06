package rebue.ord.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Database Table Remarks:
 *   用户退货信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ORD_RETURN
 *
 * @mbg.generated do_not_delete_during_merge 2018-06-06 11:12:41
 */
@ApiModel(value = "OrdReturnMo", description = "用户退货信息")
@JsonInclude(Include.NON_NULL)
public class OrdReturnMo implements Serializable {
    /**
     * Database Column Remarks:
     *   退货ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退货ID")
    private Long id;

    /**
     * Database Column Remarks:
     *   退货编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RETURN_CODE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退货编号")
    private Long returnCode;

    /**
     * Database Column Remarks:
     *   订单ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.ORDER_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "订单ID")
    private Long orderId;

    /**
     * Database Column Remarks:
     *   订单详情ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.ORDER_DETAIL_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "订单详情ID")
    private Long orderDetailId;

    /**
     * Database Column Remarks:
     *   退货数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RETURN_COUNT
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退货数量")
    private Integer returnCount;

    /**
     * Database Column Remarks:
     *   退货总额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RETURN_RENTAL
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退货总额")
    private BigDecimal returnRental;

    /**
     * Database Column Remarks:
     *   退货金额（余额）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RETURN_AMOUNT1
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退货金额（余额）")
    private BigDecimal returnAmount1;

    /**
     * Database Column Remarks:
     *   退货金额（返现金）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RETURN_AMOUNT2
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退货金额（返现金）")
    private BigDecimal returnAmount2;

    /**
     * Database Column Remarks:
     *   扣减返现金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.SUBTRACT_CASHBACK
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "扣减返现金额")
    private BigDecimal subtractCashback;

    /**
     * Database Column Remarks:
     *   退款类型（1：仅退款  2：退货并退款）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RETURN_TYPE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退款类型（1：仅退款  2：退货并退款）")
    private Byte returnType;

    /**
     * Database Column Remarks:
     *   申请状态（-1：已取消  1：待审核  2：退货中  3：已退货   4：已拒绝）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.APPLICATION_STATE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "申请状态（-1：已取消  1：待审核  2：退货中  3：已退货   4：已拒绝）")
    private Byte applicationState;

    /**
     * Database Column Remarks:
     *   退款状态（1：未退款  2、已退款）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REFUND_STATE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退款状态（1：未退款  2、已退款）")
    private Byte refundState;

    /**
     * Database Column Remarks:
     *   退货原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RETURN_REASON
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退货原因")
    private String returnReason;

    /**
     * Database Column Remarks:
     *   申请操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.APPLICATION_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "申请操作人")
    private Long applicationOpId;

    /**
     * Database Column Remarks:
     *   申请时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.APPLICATION_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "申请时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applicationTime;

    /**
     * Database Column Remarks:
     *   取消操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.CANCEL_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "取消操作人")
    private Long cancelOpId;

    /**
     * Database Column Remarks:
     *   取消时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.CANCEL_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "取消时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cancelTime;

    /**
     * Database Column Remarks:
     *   审核操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REVIEW_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "审核操作人")
    private Long reviewOpId;

    /**
     * Database Column Remarks:
     *   审核时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REVIEW_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "审核时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date reviewTime;

    /**
     * Database Column Remarks:
     *   退款操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REFUND_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退款操作人")
    private Long refundOpId;

    /**
     * Database Column Remarks:
     *   退款时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REFUND_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "退款时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date refundTime;

    /**
     * Database Column Remarks:
     *   拒绝操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REJECT_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "拒绝操作人")
    private Long rejectOpId;

    /**
     * Database Column Remarks:
     *   拒绝原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REJECT_REASON
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "拒绝原因")
    private String rejectReason;

    /**
     * Database Column Remarks:
     *   拒绝时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.REJECT_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "拒绝时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date rejectTime;

    /**
     * Database Column Remarks:
     *   完成操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.FINISH_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "完成操作人")
    private Long finishOpId;

    /**
     * Database Column Remarks:
     *   完成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.FINISH_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "完成时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date finishTime;

    /**
     * Database Column Remarks:
     *   确认收到货操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RECEIVE_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "确认收到货操作人")
    private Long receiveOpId;

    /**
     * Database Column Remarks:
     *   确认收到货时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.RECEIVE_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "确认收到货时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date receiveTime;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN.USER_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ORD_RETURN
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.ID
     *
     * @return the value of ORD_RETURN.ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.ID
     *
     * @param id the value for ORD_RETURN.ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RETURN_CODE
     *
     * @return the value of ORD_RETURN.RETURN_CODE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getReturnCode() {
        return returnCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RETURN_CODE
     *
     * @param returnCode the value for ORD_RETURN.RETURN_CODE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReturnCode(Long returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.ORDER_ID
     *
     * @return the value of ORD_RETURN.ORDER_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.ORDER_ID
     *
     * @param orderId the value for ORD_RETURN.ORDER_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.ORDER_DETAIL_ID
     *
     * @return the value of ORD_RETURN.ORDER_DETAIL_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.ORDER_DETAIL_ID
     *
     * @param orderDetailId the value for ORD_RETURN.ORDER_DETAIL_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RETURN_COUNT
     *
     * @return the value of ORD_RETURN.RETURN_COUNT
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Integer getReturnCount() {
        return returnCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RETURN_COUNT
     *
     * @param returnCount the value for ORD_RETURN.RETURN_COUNT
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RETURN_RENTAL
     *
     * @return the value of ORD_RETURN.RETURN_RENTAL
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public BigDecimal getReturnRental() {
        return returnRental;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RETURN_RENTAL
     *
     * @param returnRental the value for ORD_RETURN.RETURN_RENTAL
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReturnRental(BigDecimal returnRental) {
        this.returnRental = returnRental;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RETURN_AMOUNT1
     *
     * @return the value of ORD_RETURN.RETURN_AMOUNT1
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public BigDecimal getReturnAmount1() {
        return returnAmount1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RETURN_AMOUNT1
     *
     * @param returnAmount1 the value for ORD_RETURN.RETURN_AMOUNT1
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReturnAmount1(BigDecimal returnAmount1) {
        this.returnAmount1 = returnAmount1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RETURN_AMOUNT2
     *
     * @return the value of ORD_RETURN.RETURN_AMOUNT2
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public BigDecimal getReturnAmount2() {
        return returnAmount2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RETURN_AMOUNT2
     *
     * @param returnAmount2 the value for ORD_RETURN.RETURN_AMOUNT2
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReturnAmount2(BigDecimal returnAmount2) {
        this.returnAmount2 = returnAmount2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.SUBTRACT_CASHBACK
     *
     * @return the value of ORD_RETURN.SUBTRACT_CASHBACK
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public BigDecimal getSubtractCashback() {
        return subtractCashback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.SUBTRACT_CASHBACK
     *
     * @param subtractCashback the value for ORD_RETURN.SUBTRACT_CASHBACK
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setSubtractCashback(BigDecimal subtractCashback) {
        this.subtractCashback = subtractCashback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RETURN_TYPE
     *
     * @return the value of ORD_RETURN.RETURN_TYPE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Byte getReturnType() {
        return returnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RETURN_TYPE
     *
     * @param returnType the value for ORD_RETURN.RETURN_TYPE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReturnType(Byte returnType) {
        this.returnType = returnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.APPLICATION_STATE
     *
     * @return the value of ORD_RETURN.APPLICATION_STATE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Byte getApplicationState() {
        return applicationState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.APPLICATION_STATE
     *
     * @param applicationState the value for ORD_RETURN.APPLICATION_STATE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setApplicationState(Byte applicationState) {
        this.applicationState = applicationState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REFUND_STATE
     *
     * @return the value of ORD_RETURN.REFUND_STATE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Byte getRefundState() {
        return refundState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REFUND_STATE
     *
     * @param refundState the value for ORD_RETURN.REFUND_STATE
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setRefundState(Byte refundState) {
        this.refundState = refundState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RETURN_REASON
     *
     * @return the value of ORD_RETURN.RETURN_REASON
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public String getReturnReason() {
        return returnReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RETURN_REASON
     *
     * @param returnReason the value for ORD_RETURN.RETURN_REASON
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.APPLICATION_OP_ID
     *
     * @return the value of ORD_RETURN.APPLICATION_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getApplicationOpId() {
        return applicationOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.APPLICATION_OP_ID
     *
     * @param applicationOpId the value for ORD_RETURN.APPLICATION_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setApplicationOpId(Long applicationOpId) {
        this.applicationOpId = applicationOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.APPLICATION_TIME
     *
     * @return the value of ORD_RETURN.APPLICATION_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Date getApplicationTime() {
        return applicationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.APPLICATION_TIME
     *
     * @param applicationTime the value for ORD_RETURN.APPLICATION_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.CANCEL_OP_ID
     *
     * @return the value of ORD_RETURN.CANCEL_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getCancelOpId() {
        return cancelOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.CANCEL_OP_ID
     *
     * @param cancelOpId the value for ORD_RETURN.CANCEL_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setCancelOpId(Long cancelOpId) {
        this.cancelOpId = cancelOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.CANCEL_TIME
     *
     * @return the value of ORD_RETURN.CANCEL_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.CANCEL_TIME
     *
     * @param cancelTime the value for ORD_RETURN.CANCEL_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REVIEW_OP_ID
     *
     * @return the value of ORD_RETURN.REVIEW_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getReviewOpId() {
        return reviewOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REVIEW_OP_ID
     *
     * @param reviewOpId the value for ORD_RETURN.REVIEW_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReviewOpId(Long reviewOpId) {
        this.reviewOpId = reviewOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REVIEW_TIME
     *
     * @return the value of ORD_RETURN.REVIEW_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Date getReviewTime() {
        return reviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REVIEW_TIME
     *
     * @param reviewTime the value for ORD_RETURN.REVIEW_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REFUND_OP_ID
     *
     * @return the value of ORD_RETURN.REFUND_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getRefundOpId() {
        return refundOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REFUND_OP_ID
     *
     * @param refundOpId the value for ORD_RETURN.REFUND_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setRefundOpId(Long refundOpId) {
        this.refundOpId = refundOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REFUND_TIME
     *
     * @return the value of ORD_RETURN.REFUND_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REFUND_TIME
     *
     * @param refundTime the value for ORD_RETURN.REFUND_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REJECT_OP_ID
     *
     * @return the value of ORD_RETURN.REJECT_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getRejectOpId() {
        return rejectOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REJECT_OP_ID
     *
     * @param rejectOpId the value for ORD_RETURN.REJECT_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setRejectOpId(Long rejectOpId) {
        this.rejectOpId = rejectOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REJECT_REASON
     *
     * @return the value of ORD_RETURN.REJECT_REASON
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REJECT_REASON
     *
     * @param rejectReason the value for ORD_RETURN.REJECT_REASON
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.REJECT_TIME
     *
     * @return the value of ORD_RETURN.REJECT_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Date getRejectTime() {
        return rejectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.REJECT_TIME
     *
     * @param rejectTime the value for ORD_RETURN.REJECT_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setRejectTime(Date rejectTime) {
        this.rejectTime = rejectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.FINISH_OP_ID
     *
     * @return the value of ORD_RETURN.FINISH_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getFinishOpId() {
        return finishOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.FINISH_OP_ID
     *
     * @param finishOpId the value for ORD_RETURN.FINISH_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setFinishOpId(Long finishOpId) {
        this.finishOpId = finishOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.FINISH_TIME
     *
     * @return the value of ORD_RETURN.FINISH_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.FINISH_TIME
     *
     * @param finishTime the value for ORD_RETURN.FINISH_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RECEIVE_OP_ID
     *
     * @return the value of ORD_RETURN.RECEIVE_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getReceiveOpId() {
        return receiveOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RECEIVE_OP_ID
     *
     * @param receiveOpId the value for ORD_RETURN.RECEIVE_OP_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReceiveOpId(Long receiveOpId) {
        this.receiveOpId = receiveOpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.RECEIVE_TIME
     *
     * @return the value of ORD_RETURN.RECEIVE_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.RECEIVE_TIME
     *
     * @param receiveTime the value for ORD_RETURN.RECEIVE_TIME
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN.USER_ID
     *
     * @return the value of ORD_RETURN.USER_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN.USER_ID
     *
     * @param userId the value for ORD_RETURN.USER_ID
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", returnCode=").append(returnCode);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderDetailId=").append(orderDetailId);
        sb.append(", returnCount=").append(returnCount);
        sb.append(", returnRental=").append(returnRental);
        sb.append(", returnAmount1=").append(returnAmount1);
        sb.append(", returnAmount2=").append(returnAmount2);
        sb.append(", subtractCashback=").append(subtractCashback);
        sb.append(", returnType=").append(returnType);
        sb.append(", applicationState=").append(applicationState);
        sb.append(", refundState=").append(refundState);
        sb.append(", returnReason=").append(returnReason);
        sb.append(", applicationOpId=").append(applicationOpId);
        sb.append(", applicationTime=").append(applicationTime);
        sb.append(", cancelOpId=").append(cancelOpId);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", reviewOpId=").append(reviewOpId);
        sb.append(", reviewTime=").append(reviewTime);
        sb.append(", refundOpId=").append(refundOpId);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", rejectOpId=").append(rejectOpId);
        sb.append(", rejectReason=").append(rejectReason);
        sb.append(", rejectTime=").append(rejectTime);
        sb.append(", finishOpId=").append(finishOpId);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", receiveOpId=").append(receiveOpId);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrdReturnMo other = (OrdReturnMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN
     *
     * @mbg.generated 2018-06-06 11:12:41
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}