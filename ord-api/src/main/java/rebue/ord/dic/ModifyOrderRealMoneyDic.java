package rebue.ord.dic;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;

import rebue.wheel.baseintf.EnumBase;

/**
 * 创建时间：2018年5月16日 上午10:11:19 项目名称：ord-api
 * 
 * @author daniel
 * @version 1.0
 * @since JDK 1.8 文件名称：ModifyOrderRealMoneyDic.java 
 * 类说明：修改订单实际金额返回值字典
 */
public enum ModifyOrderRealMoneyDic implements EnumBase {

	/** 修改成功 **/
	SUCCESS(1),

	/** 修改失败 **/
	ERROR(-1);

	/**
	 * 枚举的所有项，注意这个变量是静态单例的
	 */
	private static Map<Integer, EnumBase> valueMap;
	// 初始化map，保存枚举的所有项到map中以方便通过code查找
	static {
		valueMap = new HashMap<>();
		for (EnumBase item : values()) {
			valueMap.put(item.getCode(), item);
		}
	}

	/**
	 * jackson反序列化时，通过code得到枚举的实例 注意：此方法必须是static的方法，且返回类型必须是本枚举类，而不能是接口EnumBase
	 * 否则jackson将调用默认的反序列化方法，而不会调用本方法
	 */
	@JsonCreator
	public static ModifyOrderRealMoneyDic getItem(int code) {
		EnumBase result = valueMap.get(code);
		if (result == null) {
			throw new IllegalArgumentException("输入的code" + code + "不在枚举的取值范围内");
		}
		return (ModifyOrderRealMoneyDic) result;
	}

	private int code;

	/**
	 * 构造器，传入code
	 */
	ModifyOrderRealMoneyDic(int code) {
		this.code = code;
	}

	/**
	 * @return jackson序列化时，输出枚举实例的code
	 */
	@Override
	public int getCode() {
		return code;
	}
}
