package com.entity.model;

import com.entity.GongzuoshenpiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作审批
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuoshenpiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 工作标题
     */
    private String gongzuoshenpiName;


    /**
     * 工作类型
     */
    private Integer gongzuoshenpiTypes;


    /**
     * 工作文件
     */
    private String gongzuoshenpiFile;


    /**
     * 工作详情
     */
    private String gongzuoshenpiText;


    /**
     * 工作审批状态
     */
    private Integer gongzuoshenpiYesnoTypes;


    /**
     * 工作审批结果
     */
    private String gongzuoshenpiYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：工作标题
	 */
    public String getGongzuoshenpiName() {
        return gongzuoshenpiName;
    }


    /**
	 * 设置：工作标题
	 */
    public void setGongzuoshenpiName(String gongzuoshenpiName) {
        this.gongzuoshenpiName = gongzuoshenpiName;
    }
    /**
	 * 获取：工作类型
	 */
    public Integer getGongzuoshenpiTypes() {
        return gongzuoshenpiTypes;
    }


    /**
	 * 设置：工作类型
	 */
    public void setGongzuoshenpiTypes(Integer gongzuoshenpiTypes) {
        this.gongzuoshenpiTypes = gongzuoshenpiTypes;
    }
    /**
	 * 获取：工作文件
	 */
    public String getGongzuoshenpiFile() {
        return gongzuoshenpiFile;
    }


    /**
	 * 设置：工作文件
	 */
    public void setGongzuoshenpiFile(String gongzuoshenpiFile) {
        this.gongzuoshenpiFile = gongzuoshenpiFile;
    }
    /**
	 * 获取：工作详情
	 */
    public String getGongzuoshenpiText() {
        return gongzuoshenpiText;
    }


    /**
	 * 设置：工作详情
	 */
    public void setGongzuoshenpiText(String gongzuoshenpiText) {
        this.gongzuoshenpiText = gongzuoshenpiText;
    }
    /**
	 * 获取：工作审批状态
	 */
    public Integer getGongzuoshenpiYesnoTypes() {
        return gongzuoshenpiYesnoTypes;
    }


    /**
	 * 设置：工作审批状态
	 */
    public void setGongzuoshenpiYesnoTypes(Integer gongzuoshenpiYesnoTypes) {
        this.gongzuoshenpiYesnoTypes = gongzuoshenpiYesnoTypes;
    }
    /**
	 * 获取：工作审批结果
	 */
    public String getGongzuoshenpiYesnoText() {
        return gongzuoshenpiYesnoText;
    }


    /**
	 * 设置：工作审批结果
	 */
    public void setGongzuoshenpiYesnoText(String gongzuoshenpiYesnoText) {
        this.gongzuoshenpiYesnoText = gongzuoshenpiYesnoText;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
