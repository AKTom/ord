package rebue.ord.ctrl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rebue.ord.mo.OrdReturnMo;
import rebue.ord.ro.OrdReturnRo;
import rebue.ord.svc.OrdReturnSvc;

import com.github.pagehelper.PageInfo;
import rebue.ord.to.OrdOrderReturnTo;

@RestController
public class OrdReturnCtrl {
	/**
	 * @mbg.generated
	 */
	private final static Logger _log = LoggerFactory.getLogger(OrdReturnCtrl.class);

	/**
	 * @mbg.generated
	 */
	@Resource
	private OrdReturnSvc svc;

	/**
	 * 修改用户退货信息
	 * 
	 * @mbg.generated
	 */
	@PutMapping("/ord/return")
	Map<String, Object> modify(OrdReturnMo vo) throws Exception {
		_log.info("modify OrdReturnMo:" + vo);
		svc.modify(vo);
		Map<String, Object> result = new HashMap<>();
		result.put("success", true);
		_log.info("modify OrdReturnMo success!");
		return result;
	}

	/**
	 * 获取单个用户退货信息
	 * 
	 * @mbg.generated
	 */
	@GetMapping("/ord/return/{id}")
	OrdReturnMo get(@PathVariable("id") java.lang.Long id) {
		_log.info("get OrdReturnMo by id: " + id);
		OrdReturnMo result = svc.getById(id);
		_log.info("get: " + result);
		return result;
	}

	/**
	 * 添加用户退货信息 Title: add Description:
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 * @date 2018年4月19日 下午2:53:39
	 */
	@SuppressWarnings("finally")
	@PostMapping("/ord/return")
	Map<String, Object> addEx(OrdOrderReturnTo vo) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap = svc.addEx(vo);
		} catch (RuntimeException e) {
			String msg = e.getMessage();
			if (msg.equals("添加退货信息失败")) {
				_log.info(msg);
				resultMap.put("result", -9);
				resultMap.put("msg", msg);
			} else if (msg.equals("添加退货图片失败")) {
				_log.info(msg);
				resultMap.put("result", -10);
				resultMap.put("msg", msg);
			} else if (msg.equals("修改订单详情状态失败")) {
				_log.info(msg);
				resultMap.put("result", -11);
				resultMap.put("msg", msg);
			} else {
				e.printStackTrace();
				resultMap.put("result", -12);
				resultMap.put("msg", "提交失败");
			}
		} finally {
			return resultMap;
		}
	}

	/**
	 * 查询退货信息 Title: selectReturnPageList Description:
	 * 
	 * @param mo
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @date 2018年4月21日 下午3:59:07
	 */
	@GetMapping("/ord/return")
	PageInfo<OrdReturnRo> selectReturnPageList(OrdReturnMo mo, @RequestParam("pageNum") int pageNum,
			@RequestParam("pageSize") int pageSize) {
		_log.info("list OrdReturnMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);

		if (pageSize > 50) {
			String msg = "pageSize不能大于50";
			_log.error(msg);
			throw new IllegalArgumentException(msg);
		}

		PageInfo<OrdReturnRo> result = svc.selectReturnPageList(mo, pageNum, pageSize);
		_log.info("result: " + result);
		return result;
	}

	/**
	 * 拒绝退货 Title: rejectReturn Description:
	 * 
	 * @param mo
	 * @return
	 * @date 2018年4月27日 下午3:31:38
	 */
	@PutMapping("/ord/return/reject")
	Map<String, Object> rejectReturn(OrdReturnMo mo) {
		_log.info("拒绝退货的参数为：{}", mo.toString());
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			return svc.rejectReturn(mo);
		} catch (Exception e) {
			String msg = e.getMessage();
			if (msg.equals("修改订单详情信息出错")) {
				resultMap.put("result", -8);
				resultMap.put("msg", msg);
			} else if (msg.equals("拒绝退货出错")) {
				resultMap.put("result", -9);
				resultMap.put("msg", msg);
			} else {
				resultMap.put("result", -10);
				resultMap.put("msg", "操作失败");
			}
			return resultMap;
		}
	}
}
