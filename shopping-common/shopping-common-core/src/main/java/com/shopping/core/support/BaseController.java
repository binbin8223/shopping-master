package  com.shopping.core.support;

import com.shopping.PublicUtil;
import com.shopping.ThreadLocalMap;
import com.shopping.base.constant.GlobalConstant;
import com.shopping.base.dto.LoginAuthDto;
import com.shopping.base.enums.ErrorCodeEnum;
import com.shopping.base.exception.BusinessException;
import  com.shopping.core.generator.IncrementIdGenerator;
import  com.shopping.core.generator.UniqueIdGenerator;
import com.shopping.wrapper.WrapMapper;
import com.shopping.wrapper.Wrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class Base controller.
 *
 * @author shopping.net@gmail.com
 */
public class BaseController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Gets login auth dto.
	 *
	 * @return the login auth dto
	 */
	protected LoginAuthDto getLoginAuthDto() {
		LoginAuthDto loginAuthDto = (LoginAuthDto) ThreadLocalMap.get(GlobalConstant.Sys.TOKEN_AUTH_DTO);
		if (PublicUtil.isEmpty(loginAuthDto)) {
			throw new BusinessException(ErrorCodeEnum.UAC10011041);
		}
		return loginAuthDto;
	}

	/**
	 * Handle result wrapper.
	 *
	 * @param <T>    the type parameter
	 * @param result the result
	 *
	 * @return the wrapper
	 */
	protected <T> Wrapper<T> handleResult(T result) {
		boolean flag = isFlag(result);

		if (flag) {
			return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "操作成功", result);
		} else {
			return WrapMapper.wrap(Wrapper.ERROR_CODE, "操作失败", result);
		}
	}

	/**
	 * Handle result wrapper.
	 *
	 * @param <E>      the type parameter
	 * @param result   the result
	 * @param errorMsg the error msg
	 *
	 * @return the wrapper
	 */
	protected <E> Wrapper<E> handleResult(E result, String errorMsg) {
		boolean flag = isFlag(result);

		if (flag) {
			return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "操作成功", result);
		} else {
			return WrapMapper.wrap(Wrapper.ERROR_CODE, errorMsg, result);
		}
	}

	private boolean isFlag(Object result) {
		boolean flag;
		if (result instanceof Integer) {
			flag = (Integer) result > 0;
		} else if (result instanceof Boolean) {
			flag = (Boolean) result;
		} else {
			flag = PublicUtil.isNotEmpty(result);
		}
		return flag;
	}

	protected long generateId() {
		return UniqueIdGenerator.getInstance(IncrementIdGenerator.getServiceId()).nextId();
	}

}
  