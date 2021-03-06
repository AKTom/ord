package rebue.ord.to;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ShipmentConfirmationTo {

	/**
	 * 订单ID
	 */
	private Long id;

	/**
	 * 订单编号
	 */
	private String orderCode;

	/**
	 * 订单标题
	 */
	private String orderTitle;

	/**
	 * 下单金额
	 */
	private BigDecimal orderMoney;

	/**
	 * 实际金额
	 */
	private BigDecimal realMoney;

	/**
	 * 订单状态（-1：作废 1：已下单（待支付） 2：已支付（待发货） 3：已发货（待签收） 4：已签收（待结算） 5：已结算 ）） -1：作废
	 * 1：已下单（待支付） 2：已支付（待发货） 3：已发货（待签收） 4：已签收（待结算） 5：已结算
	 */
	private Byte orderState;

	/**
	 * 用户编号
	 */
	private Long userId;

	/**
	 * 用户姓名
	 */
	private String userName;

	/**
	 * 下单时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date orderTime;

	/**
	 * 支付时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date payTime;

	/**
	 * 收件人名称
	 */
	private String receiverName;

	/**
	 * 收件人电话
	 */
	private String receiverTel;

	/**
	 * 收件人手机
	 */
	private String receiverMobile;

	/**
	 * 收件省
	 */
	private String receiverProvince;

	/**
	 * 收件市
	 */
	private String receiverCity;

	/**
	 * 收件区
	 */
	private String receiverExpArea;

	/**
	 * 收件人详细地址
	 */
	private String receiverAddress;

	/**
	 * 收件地邮编
	 */
	private String receiverPostCode;

	/**
	 * 订单留言
	 */
	private String orderMessages;

	/**
	 * 快递公司ID
	 */
	private Long shipperId;

	/**
	 * 发货操作人
	 */
	private Long sendOpId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderTitle() {
		return orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public BigDecimal getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}

	public BigDecimal getRealMoney() {
		return realMoney;
	}

	public void setRealMoney(BigDecimal realMoney) {
		this.realMoney = realMoney;
	}

	public Byte getOrderState() {
		return orderState;
	}

	public void setOrderState(Byte orderState) {
		this.orderState = orderState;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverTel() {
		return receiverTel;
	}

	public void setReceiverTel(String receiverTel) {
		this.receiverTel = receiverTel;
	}

	public String getReceiverMobile() {
		return receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverProvince() {
		return receiverProvince;
	}

	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverCity() {
		return receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverExpArea() {
		return receiverExpArea;
	}

	public void setReceiverExpArea(String receiverExpArea) {
		this.receiverExpArea = receiverExpArea;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverPostCode() {
		return receiverPostCode;
	}

	public void setReceiverPostCode(String receiverPostCode) {
		this.receiverPostCode = receiverPostCode;
	}

	public String getOrderMessages() {
		return orderMessages;
	}

	public void setOrderMessages(String orderMessages) {
		this.orderMessages = orderMessages;
	}

	public Long getShipperId() {
		return shipperId;
	}

	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}

	public Long getSendOpId() {
		return sendOpId;
	}

	public void setSendOpId(Long sendOpId) {
		this.sendOpId = sendOpId;
	}

	@Override
	public String toString() {
		return "ShipmentConfirmationTo [id=" + id + ", orderCode=" + orderCode + ", orderTitle=" + orderTitle
				+ ", orderMoney=" + orderMoney + ", realMoney=" + realMoney + ", orderState=" + orderState + ", userId="
				+ userId + ", userName=" + userName + ", orderTime=" + orderTime + ", payTime=" + payTime
				+ ", receiverName=" + receiverName + ", receiverTel=" + receiverTel + ", receiverMobile="
				+ receiverMobile + ", receiverProvince=" + receiverProvince + ", receiverCity=" + receiverCity
				+ ", receiverExpArea=" + receiverExpArea + ", receiverAddress=" + receiverAddress
				+ ", receiverPostCode=" + receiverPostCode + ", orderMessages=" + orderMessages + ", shipperId="
				+ shipperId + ", sendOpId=" + sendOpId + "]";
	}

}
