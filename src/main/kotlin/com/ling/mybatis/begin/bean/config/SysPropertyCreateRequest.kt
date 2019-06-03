package com.ling.mybatis.begin.bean.config

import com.ling.mybatis.begin.bean.common.CreateRequestBase
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "创建系统配置")
class SysPropertyCreateRequest : CreateRequestBase() {
    @ApiModelProperty(value = "配置组")
    var sysGroup: String? = null

    @ApiModelProperty(value = "配置项名")
    var sysKey: String? = null

    @ApiModelProperty(value = "配置值")
    var sysValue: String? = null

    @ApiModelProperty(value = "备注")
    var remark: String? = null

    @ApiModelProperty(value = "是否有效。1，有效。0，无效。")
    var enable: Int? = null

    // =======================
    fun toSysProperty(): SysProperty {
        val sysProperty = SysProperty()
        sysProperty.sysGroup = sysGroup
        sysProperty.sysKey = sysKey
        sysProperty.sysValue = sysValue
        sysProperty.remark = remark
        sysProperty.enable = enable
        sysProperty.createBy = createBy
        return sysProperty
    }
}
