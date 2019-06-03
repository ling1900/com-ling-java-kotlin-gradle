package com.ling.mybatis.begin.bean.config

import com.ling.mybatis.begin.bean.common.QueryBase
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "查询系统配置")
class SysPropertyQuery : QueryBase() {
    @ApiModelProperty
    var seqIds: List<Long>? = null
    @ApiModelProperty(value = "配置组")
    var sysGroups: List<String>? = null
    @ApiModelProperty(value = "配置项名")
    var sysKeys: List<String>? = null

    // =======================
    override fun toColumnName(fieldName: String): String {
        when (fieldName) {
            "seqId" -> return "seq_id"
            "sysGroup" -> return "sys_group"
            "sysKey" -> return "sys_key"
            "sysValue" -> return "sys_value"
            "remark" -> return "remark"
            "enable" -> return "enable"
            else -> return super.toColumnName(fieldName)
        }
    }
}
