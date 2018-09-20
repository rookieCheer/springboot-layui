package com.lyf.springboot_layui.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 自动生成代码
 *
 * @author LYF
 * @date 2018/7/27 13:09
 */
@SuppressWarnings("all")
public class MybatisMerchantPlusGenerator {

    public static void main(String[] args) {
        //包名
        String packageName = "com.lyf.springboot_layui";
        //数据库表名
        generateByTables(packageName, "sys_shiro_permission","sys_shiro_role","sys_shiro_role_permission","sys_shiro_user","sys_shiro_user_role");
    }

    private static void generateByTables(String packageName, String... tableNames) {
        //生成文件地址 一般配置成项目地址
        String outputDir = "G:\\自己的东西\\git\\springboot_layui\\src\\main\\java\\";
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(outputDir);
        gc.setFileOverride(true);//覆盖
        gc.setActiveRecord(false);// 开启 activeRecord 模式
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("LYF");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("I%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        String dbUrl = "jdbc:mysql://127.0.0.1:3306/springboot_layui?autoReconnect=true&amp;useUnicode=true&amp;characterEncoding=UTF-8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("1234")
                .setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setTypeConvert(new MySqlTypeConvert() {
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                if (fieldType.contains("tinyint")) {
                    return DbColumnType.BASE_BOOLEAN;
                }
                return super.processTypeConvert(fieldType);
            }
        });
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames)//修改替换成你需要的表名，多个表名传数组
                .setSuperEntityClass("com.lyf.springboot_layui.superclass.SuperEntity")//实体类基类
                .setSuperMapperClass("com.lyf.springboot_layui.superclass.SuperMapper");//持久层基类

        new AutoGenerator().setGlobalConfig(gc)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("")
                                .setEntity("entiry")
                                .setMapper("dao")
                                .setXml("mapper").setService("service").setServiceImpl("service.impl")

                ).execute();
    }
}
