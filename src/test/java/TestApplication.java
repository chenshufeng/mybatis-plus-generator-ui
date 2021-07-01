import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;
import com.github.davidfantasy.mybatisplus.generatorui.mbp.NameConverter;

public class TestApplication {


    public static void main(String[] args) {
        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://47.100.203.50:3306/huomai-dev")
                .userName("root")
                .password("huomai2021xsw2")
                .port(8068)
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .basePackage("com.example")
                .nameConverter(new NameConverter() {
                    @Override
                    public String serviceNameConvert(String tableName) {
                        return this.entityNameConvert(tableName) + "Service";
                    }

                    @Override
                    public String controllerNameConvert(String tableName) {
                        return this.entityNameConvert(tableName) + "Action";
                    }
                })
                .build();
        MybatisPlusToolsApplication.run(config);
    }


}
