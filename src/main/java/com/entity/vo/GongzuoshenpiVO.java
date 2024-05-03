package com.entity.vo;

import com.entity.GongzuoshenpiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作审批
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuoshenpi")
public class GongzuoshenpiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 工作标题
     */

    @TableField(value = "gongzuoshenpi_name")
    private String gongzuoshenpiName;


    /**
     * 工作类型
     */

    @TableField(value = "gongzuoshenpi_types")
    private Integer gongzuoshenpiTypes;


    /**
     * 工作文件
     */

    @TableField(value = "gongzuoshenpi_file")
    private String gongzuoshenpiFile;


    /**
     * 工作详情
     */

    @TableField(value = "gongzuoshenpi_text")
    private String gongzuoshenpiText;


    /**
     * 工作审批状态
     */

    @TableField(value = "gongzuoshenpi_yesno_types")
    private Integer gongzuoshenpiYesnoTypes;


    /**
     * 工作审批结果
     */

    @TableField(value = "gongzuoshenpi_yesno_text")
    private String gongzuoshenpiYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：工作标题
	 */
    public String getGongzuoshenpiName() {
        return gongzuoshenpiName;
    }


    /**
	 * 获取：工作标题
	 */

    public void setGongzuoshenpiName(String gongzuoshenpiName) {
        this.gongzuoshenpiName = gongzuoshenpiName;
    }
    /**
	 * 设置：工作类型
	 */
    public Integer getGongzuoshenpiTypes() {
        return gongzuoshenpiTypes;
    }


    /**
	 * 获取：工作类型
	 */

    public void setGongzuoshenpiTypes(Integer gongzuoshenpiTypes) {
        this.gongzuoshenpiTypes = gongzuoshenpiTypes;
    }
    /**
	 * 设置：工作文件
	 */
    public String getGongzuoshenpiFile() {
        return gongzuoshenpiFile;
    }


    /**
	 * 获取：工作文件
	 */

    public void setGongzuoshenpiFile(String gongzuoshenpiFile) {
        this.gongzuoshenpiFile = gongzuoshenpiFile;
    }
    /**
	 * 设置：工作详情
	 */
    public String getGongzuoshenpiText() {
        return gongzuoshenpiText;
    }


    /**
	 * 获取：工作详情
	 */

    public void setGongzuoshenpiText(String gongzuoshenpiText) {
        this.gongzuoshenpiText = gongzuoshenpiText;
    }
    /**
	 * 设置：工作审批状态
	 */
    public Integer getGongzuoshenpiYesnoTypes() {
        return gongzuoshenpiYesnoTypes;
    }


    /**
	 * 获取：工作审批状态
	 */

    public void setGongzuoshenpiYesnoTypes(Integer gongzuoshenpiYesnoTypes) {
        this.gongzuoshenpiYesnoTypes = gongzuoshenpiYesnoTypes;
    }
    /**
	 * 设置：工作审批结果
	 */
    public String getGongzuoshenpiYesnoText() {
        return gongzuoshenpiYesnoText;
    }


    /**
	 * 获取：工作审批结果
	 */

    public void setGongzuoshenpiYesnoText(String gongzuoshenpiYesnoText) {
        this.gongzuoshenpiYesnoText = gongzuoshenpiYesnoText;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
