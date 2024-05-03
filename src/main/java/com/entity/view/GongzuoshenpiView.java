package com.entity.view;

import com.entity.GongzuoshenpiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 工作审批
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongzuoshenpi")
public class GongzuoshenpiView extends GongzuoshenpiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 工作类型的值
		*/
		private String gongzuoshenpiValue;
		/**
		* 工作审批状态的值
		*/
		private String gongzuoshenpiYesnoValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 部门
			*/
			private Integer bumenTypes;
				/**
				* 部门的值
				*/
				private String bumenValue;
			/**
			* 岗位
			*/
			private Integer gangweiTypes;
				/**
				* 岗位的值
				*/
				private String gangweiValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public GongzuoshenpiView() {

	}

	public GongzuoshenpiView(GongzuoshenpiEntity gongzuoshenpiEntity) {
		try {
			BeanUtils.copyProperties(this, gongzuoshenpiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 工作类型的值
			*/
			public String getGongzuoshenpiValue() {
				return gongzuoshenpiValue;
			}
			/**
			* 设置： 工作类型的值
			*/
			public void setGongzuoshenpiValue(String gongzuoshenpiValue) {
				this.gongzuoshenpiValue = gongzuoshenpiValue;
			}
			/**
			* 获取： 工作审批状态的值
			*/
			public String getGongzuoshenpiYesnoValue() {
				return gongzuoshenpiYesnoValue;
			}
			/**
			* 设置： 工作审批状态的值
			*/
			public void setGongzuoshenpiYesnoValue(String gongzuoshenpiYesnoValue) {
				this.gongzuoshenpiYesnoValue = gongzuoshenpiYesnoValue;
			}














				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 部门
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 部门
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 部门的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 部门的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}

					/**
					* 获取： 岗位
					*/
					public Integer getGangweiTypes() {
						return gangweiTypes;
					}
					/**
					* 设置： 岗位
					*/
					public void setGangweiTypes(Integer gangweiTypes) {
						this.gangweiTypes = gangweiTypes;
					}


						/**
						* 获取： 岗位的值
						*/
						public String getGangweiValue() {
							return gangweiValue;
						}
						/**
						* 设置： 岗位的值
						*/
						public void setGangweiValue(String gangweiValue) {
							this.gangweiValue = gangweiValue;
						}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


}
