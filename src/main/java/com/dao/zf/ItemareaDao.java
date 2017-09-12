package com.dao.zf;
import java.util.List;
import com.entity.Itemarea;
/**
 * 
* @author 作者 :zf
* @version 创建时间：2017年9月11日 上午9:46:35 
* 类说明 项目地区的dao层
 */
public interface ItemareaDao {
	/**
	 * 查询所有项目地区
	 * @return
	 */
	public List<Itemarea> queryItemarea();
}
