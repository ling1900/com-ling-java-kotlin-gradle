package com.ling.mybatis.begin.bean.config

import com.ling.mybatis.begin.bean.common.EntityBase
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "系统配置")
class SysProperty : EntityBase() {
    @ApiModelProperty
    var seqId: Long? = null

    @ApiModelProperty(value = "配置组")
    var sysGroup: String? = null

    @ApiModelProperty(value = "配置项名")
    var sysKey: String? = null

    @ApiModelProperty(value = "配置值")
    var sysValue: String? = null

    @ApiModelProperty(value = "备注")
    var remark: String? = null

    @ApiModelProperty(value = "是否有效")
    var enable: Int? = null
}
