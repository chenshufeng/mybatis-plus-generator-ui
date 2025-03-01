package com.github.davidfantasy.mybatisplus.generatorui;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.config.ITypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.github.davidfantasy.mybatisplus.generatorui.mbp.NameConverter;
import com.github.davidfantasy.mybatisplus.generatorui.mbp.TemplateVaribleInjecter;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GeneratorConfig {

    /**
     * 服务启动的端口号
     */
    private Integer port = 8068;

    /**
     * 生成的文件所保存的包路径
     */
    private String basePackage = "generatorui.default";

    /**
     * 数据库地址
     */
    private String jdbcUrl;

    /**
     * 数据库schema,POSTGRE_SQL,ORACLE,DB2类型的数据库需要指定
     */
    private String schemaName;

    /**
     * 数据库用户名
     */
    private String userName;

    /**
     * 数据库密码
     */
    private String password;

    /**
     * 数据库驱动名
     */
    private String driverClassName = "com.mysql.cj.jdbc.Driver";

    /**
     * PostgreSQL的schema name
     */
    private String postgreSQLschema;

    /**
     * 数据库时间类型与java class的对应策略
     */
    private DateType dateType;

    /**
     * 开启 ActiveRecord 模式
     */
    private boolean activeRecord = false;

    /**
     * 忽略表前缀
     */
    private boolean ignoreTablePrev = false;

    //模块名在前面
    private boolean moduleInFront = true;

    /**
     * 注入自定义模板参数
     */
    private TemplateVaribleInjecter templateVaribleInjecter;


    /**
     * 自定义名称转换规则
     */
    private NameConverter nameConverter;

    /**
     * 自定义数据字段类型和实体类型映射
     */
    private ITypeConvert typeConvert;

    /**
     * 全局指定数据表中ID的生成模式，影响自动生成的Entity中ID字段的注解
     */
    private IdType idType;

    public NameConverter getAvailableNameConverter() {
        if (nameConverter == null) {
            nameConverter = new NameConverter() {
            };
        }
        return nameConverter;
    }

    public DateType getDateType() {
        if (this.dateType == null) {
            return DateType.ONLY_DATE;
        }
        return dateType;
    }


}
